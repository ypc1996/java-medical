<template>
  <div class="activateAudit">
    <div class="activateAuditMain">
      <div class="topDiv">
        <div>
          <span>{{ $t('memberCard.realName') }}</span>
          <el-input
            v-model="userNameInput"
            :placeholder="$t('memberCard.pleaseInputUsername')"
            size="small"
          ></el-input>
        </div>
        <div>
          <span>{{ $t('memberCard.mobile') }}</span>
          <el-input
            v-model="phoneNumInput"
            :placeholder="$t('memberCard.pleaseInputMobile')"
            size="small"
          ></el-input>
        </div>
        <div>
          <span>{{ $t('memberCard.applyTime') }}</span>
          <date-time-picker
            :showPicker='3'
            @startTime="firstTime = $event"
            @endTime="secondTime = $event"
          />
        </div>
        <div style="margin-left:20px">
          <el-button
            type="primary"
            size="small"
            @click="search"
          >{{ $t('memberCard.search') }}</el-button>
          <el-button
            type="primary"
            size="small"
            @click="exportData"
          >导出</el-button>
        </div>
      </div>
    </div>
    <div class="activateAuditMain">
      <el-tabs v-model="activeName">
        <el-tab-pane
          :label="$t('memberCard.waitAudit')"
          name="first"
        >
        </el-tab-pane>
        <el-tab-pane
          :label="$t('memberCard.successAudit')"
          name="second"
        ></el-tab-pane>
        <el-tab-pane
          :label="$t('memberCard.failedAudit')"
          name="third"
        ></el-tab-pane>
      </el-tabs>
      <div
        class="member_info"
        v-for="(item,index) in tabData"
        :key="index"
      >
        <div class="member_title">
          <span>ID：<strong>{{item.id}}</strong></span>
          <span>{{ $t('memberCard.username') }}：<strong>{{item.username}}</strong></span>
          <span>{{ $t('memberCard.mobile') }}：<strong>{{item.mobile}}</strong></span>
          <span>{{ $t('memberCard.applyTime') }}：<strong>{{item.createTime}}</strong></span>
          <span v-if="item.examineTime">{{ $t('memberCard.examineTime') }}：<strong>{{item.examineTime}}</strong></span>
          <span class="operate">{{ $t('memberCard.options') }}</span>
        </div>
        <div class="member_content">
          <ul>
            <li v-if="item.realName"><span class="title">{{ $t('memberCard.realName') }}：</span><strong>{{item.realName}}</strong></li>
            <li v-if="item.cid"><span class="title">{{ $t('memberCard.cid') }}：</span><strong>{{item.cid}}</strong></li>
            <li v-if="item.sex !== null"><span class="title">{{ $t('memberCard.sex') }}: </span><strong>{{item.sex}}</strong></li>
            <li v-if="item.birthDayYear !== null"><span class="title">{{$t('memberCard.birthday')}}: </span><strong>{{item.birthDayYear}}-{{item.birthDayMonth}}-{{item.birthDayDay}}</strong></li>
            <li v-if="item.maritalStatus !== null"><span class="title">{{ $t('memberCard.maritalStatus') }}: </span><strong>{{item.maritalStatus}}</strong></li>
            <li v-if="item.education"><span class="title">{{ $t('memberCard.education') }}：</span><strong>{{item.education}}</strong></li>
            <li v-if="item.industry"><span class="title">{{ $t('memberCard.industry') }}：</span><strong>{{item.industry}}</strong></li>
            <li v-if="item.city"><span class="title">{{ $t('memberCard.address') }}:</span>{{item.province}} {{item.city}} {{item.district}}</li>
            <li
              v-for="(opt,key) in item.customOptions"
              :key="key"
            >
              <div v-if="opt.type !== 3">
                <span class="title">{{opt.title}}：</span>
                <strong>{{opt.content}}</strong>
              </div>
              <div v-else-if="opt.type === 3">
                <span class="title">{{opt.title}}：</span>
                <ul class="picture">
                  <li
                    v-for="(picture,index) in opt.pictureLinks"
                    :key="index"
                  >
                    <img
                      :src="picture"
                      width="65px"
                      height="65px"
                    >
                  </li>
                </ul>
              </div>
            </li>
          </ul>

          <div class="operate_box">
            <div
              class="content"
              v-if='item.status === 1'
            >
              <div style="margin-bottom:5px">
                <el-button
                  type="primary"
                  plain
                  size="small"
                  @click="handleToIsAdopt(0,item)"
                >{{ $t('memberCard.pass') }}</el-button>
              </div>
              <div>
                <el-button
                  type="info"
                  plain
                  size="small"
                  @click="handleToIsAdopt(1,item)"
                >{{ $t('memberCard.unpass') }}</el-button>
              </div>

            </div>
            <div
              class="content"
              v-if='item.status === 2'
            >
              <div>{{ $t('memberCard.successAudit') }}</div>
              <div style="margin-top: 10px;" v-if="item.accountName">审核人：{{item.accountName}}</div>
            </div>
            <div
              class="content"
              v-if='item.status === 3'
            >
              <div>{{ $t('memberCard.failedAuditT') }}</div>
              <div
                class="fail-detail"
                @click="showFailDetail(item)"
              >查看详情</div>
              <div style="margin-top: 10px;" v-if="item.accountName">审核人：{{item.accountName}}</div>
            </div>
          </div>
        </div>
      </div>

      <Pagination
        :page-params.sync="pageParams"
        @pagination="search"
      />

      <my-fail-dialog
        :visiable.sync="showAuditFailedDialog"
        :refuseDesc="currentDesc"
        :status="currentStatus"
        @handleDesc="handleFailAudit"
      >
      </my-fail-dialog>

      <export-dialog
        :visiable.sync="showExportDialog"
        :queryContent="queryContent"
        :maxNum="pageParams.totalRows"
        :cardId="cardId"
        :status="status"
      />
    </div>
  </div>
</template>
<script>
import { getActivateAuditListRequest, passActivateAuditRequest, rejectActivateAudit } from '@/api/admin/memberManage/memberCard.js'
import activateFailDialog from './subcomponents/cardAuditFailDialog.vue'
import cardExamineExportDialog from '@/components/admin/card/cardExamineExportDialog.vue'
import DateTimePicker from '@/components/admin/dateTimePicker/dateTimePicker'
export default {
  components: {
    Pagination: () => import('@/components/admin/pagination/pagination'),
    myFailDialog: activateFailDialog,
    exportDialog: cardExamineExportDialog,
    DateTimePicker
  },
  data () {
    return {
      pageParams: {
        totalRows: 0,
        currentPage: 1,
        pageRows: 20
      },
      cardId: null, // 会员卡id
      userNameInput: '',
      phoneNumInput: '',
      firstTime: null,
      secondTime: null,
      status: 1, //  默认是待审核
      activeName: 'first',
      tabData: [],
      tabOneData: [],
      tabTwoData: [],
      tabThreeData: [],
      ids: null,
      maritals: [],
      showAuditFailedDialog: false,
      showExportDialog: false,
      currentId: null,
      currentDesc: null,
      currentStatus: 1
    }
  },
  computed: {
    queryContent () {
      return [
        {
          title: this.$t('memberCard.realName'),
          value: this.userNameInput
        },
        {
          title: this.$t('memberCard.mobile'),
          value: this.phoneNumInput
        },
        {
          title: this.$t(`dateTimePicker.startTime`),
          value: this.firstTime
        },
        {
          title: this.$t(`dateTimePicker.endTime`),
          value: this.secondTime
        }
      ]
    }
  },
  watch: {
    lang () {
      this.maritals = this.$t('membershipIntroduction.maritalStatus')
      this.defaultData()
    },
    activeName (newData) {
      console.log(newData)
      this.handleStatus(newData)
    }
  },
  created () {
    this.cardId = this.$route.query.cardId
    this.ids = this.$route.query.ids
    // 初始化数据
    this.defaultData()
  },
  mounted () {
    // 加载语言
    this.langDefault()
  },
  methods: {
    // 1- 获取数据
    defaultData () {
      let obj = {
        'pageRows': this.pageParams.pageRows,
        'currentPage': this.pageParams.currentPage,
        'cardId': this.cardId,
        'status': this.status,
        'realName': this.userNameInput,
        'mobile': this.phoneNumInput,
        'firstTime': this.firstTime,
        'secondTime': this.secondTime,
        'ids': this.ids
      }

      getActivateAuditListRequest(obj).then(res => {
        if (res.error === 0) {
          // success
          this.tabData = res.content.dataList
          console.log(this.tabData)
          this.tabData.forEach(item => {
            // 婚姻状态
            if (item.maritalStatus) {
              item.maritalStatus = this.maritals[item.maritalStatus - 1]
            }
            if (item.sex) {
              let sexTmp = this.$t('membershipIntroduction.GenderValueOptions')
              for (let s of sexTmp) {
                if (s.value === item.sex) {
                  item.sex = s.label
                }
              }
            }

            // 自定义激活数据
            let opts = this.dealWithCustomOptions(item.customOptions)
            item.customOptions = opts
          })
          // pagination
          this.pageParams = res.content.page
        }
      })
    },

    // 清除输入框数据
    clearInputDate () {
      this.tabData = this.userNameInput = this.phoneNumInput = null
      this.firstTime = this.secondTime = null
    },

    // 2- 数据处理
    handleStatus (newData) {
      this.clearInputDate()
      console.log(newData)
      switch (newData) {
        case 'first':
          this.status = 1
          break
        case 'second':
          this.status = 2
          break
        case 'third':
          this.status = 3
          break
      }
      // 重新加载数据
      this.defaultData()
    },
    search (data) {
      console.log(data)
      this.defaultData()
    },
    // 自定义激活数据
    dealWithCustomOptions (opts) {
      let tmpContainer = []
      if (opts && opts.length > 0) {
        for (const opt of opts) {
          // 单选
          if (opt.custom_type === 0) {
            let content = null
            for (const op of opt.option_arr) {
              if (op.is_checked === 1) {
                content = op.option_title
                break
              }
            }
            tmpContainer.push(
              {
                title: opt.custom_title, content: content, type: opt.custom_type
              }
            )
          } else if (opt.custom_type === 1) {
            let content = ''
            // 多选
            for (const op of opt.option_arr) {
              content += op.option_title + ' '
            }
            tmpContainer.push(
              {
                title: opt.custom_title, content: content, type: opt.custom_type
              }
            )
          } else if (opt.custom_type === 2) {
            //  文本
            tmpContainer.push(
              {
                title: opt.custom_title, content: opt.text, type: opt.custom_type
              }
            )
          } else if (opt.custom_type === 3) {
            //  图片
            tmpContainer.push(
              {
                title: opt.custom_title,
                pictureLinks: opt.pictureLinks,
                type: opt.custom_type
              }
            )
          }
        }
      }

      return tmpContainer
    },
    // 是否通过点击
    handleToIsAdopt (flag, item) {
      console.log(flag, item.id, item.cardNo)
      if (flag === 0) {
        // pass
        let obj = {
          'id': item.id,
          'cardNo': item.cardNo
        }
        passActivateAuditRequest(obj).then(res => {
          if (res.error === 0) {
            // success message
            this.$message.success(this.$t('memberCard.auditOption'))
            this.defaultData()
          }
        })
      } else if (flag === 1) {
        this.showAuditFailedDialog = true
        this.currentStatus = item.status
        this.currentDesc = null
        this.currentId = item.id
      }
    },
    handleFailAudit (val) {
      // reject
      let obj = {
        'id': this.currentId,
        'refuseDesc': val
      }
      rejectActivateAudit(obj).then(res => {
        if (res.error === 0) {
          // success message
          this.$message.success(this.$t('memberCard.auditOption'))
          this.defaultData()
        }
      })
    },
    showFailDetail (item) {
      this.currentDesc = item.refuseDesc
      this.currentStatus = item.status
      this.showAuditFailedDialog = true
    },
    exportData () {
      this.showExportDialog = true
    }
  }
}
</script>
<style lang="scss" scoped>
.activateAudit {
  padding: 10px;
  padding-bottom: 68px;
  min-width: 100%;
  font-size: 14px;
  height: 100%;
  position: relative;
  overflow-y: auto;
  .activateAuditMain {
    position: relative;
    background-color: #fff;
    overflow: hidden;
    overflow-y: auto;
    padding: 15px 25px 10px;
    margin-bottom: 10px;
    .topDiv {
      display: flex;
      margin-bottom: 20px;
      div {
        /deep/ .el-input {
          width: 140px;
        }
        span {
          white-space: nowrap;
          display: inline-block;
          width: 80px;
          text-align: right;
          margin-right: 20px;
        }
        display: flex;
        align-items: center;
        /deep/ .el-button {
          width: 85px;
        }
      }
    }
    .member_info {
      border: 1px solid #eee;
      margin-bottom: 10px;
      .member_title {
        padding: 0 0 0 15px;
        background-color: #f5f5f5;
        span {
          margin-right: 50px;
          padding: 8px 0;
          display: inline-block;
        }
        .operate {
          float: right;
          width: 20%;
          margin-right: 0;
          text-align: center;
        }
      }
      .member_content {
        padding: 0 0 0 15px;
        display: flex;
        flex-direction: row;
        ul {
          padding: 10px 0 10px 0;
          width: 80%;
          display: flex;
          flex-direction: column;
          flex-wrap: wrap;
        }
        li {
          padding: 10px 0 0 0;
        }

        li .title {
          margin-right: 10px;
        }
        .picture {
          display: flex;
          flex-direction: row;
          li {
            margin-right: 10px;
          }
        }
      }

      .operate_box {
        width: 20%;
        border-left: 1px solid #eee;
        padding: 10px 0 10px 0;
        display: flex;
        justify-content: center;
        align-items: center;
        .content {
          display: flex;
          flex-direction: column;
          /deep/ .el-button {
            width: 100px;
          }
        }
      }
    }
  }
  .fail-detail {
    margin-top: 10px;
    color: blue;
    cursor: pointer;
  }
}
</style>

<!--
*** 多人拼团-列表页面
-->
<template>
  <div class="content">
    <div class="main">
      <el-tabs
        v-model="tabSwitch"
        @tab-click="initDataList"
        :lazy="true"
      >
        <el-tab-pane
          v-for="(item) in tabInfo"
          :key="item.name"
          :label="item.title"
          :name="item.name"
        >
          <el-button
            v-if="tableListView"
            size="small"
            type="primary"
            @click="addActivity()"
          >{{$t('groupBuy.addActivity')}}</el-button>
        </el-tab-pane>
      </el-tabs>

    </div>
    <addGroupBuy
      :editId="editId"
      :isEdite="isEdite"
      :isGoing="isGoing"
      @addGroupBuySubmit="addGroupBuySubmit"
      v-if="tableListView===false"
    />
    <div
      class="table_list"
      v-if="tableListView"
    >
      <el-table
        header-row-class-name="tableClss"
        :data="tableData"
        v-loading="loading"
        border
        style="width: 100%"
      >
        <el-table-column
          prop="name"
          :label="$t('groupBuy.activityName')"
          align="center"
        >
        </el-table-column>
        <el-table-column
          prop="activityTypeText"
          :label="$t('groupBuy.activityType')"
          align="center"
        >
        </el-table-column>
        <el-table-column
          prop="goodsNumber"
          :label="$t('groupBuy.goodsNumber')"
          align="center"
        ></el-table-column>
        <el-table-column
          prop="level"
          :label="$t('groupBuy.activtiyLevel')"
          align="center"
        >
        </el-table-column>
        <el-table-column
          prop="vaildDate"
          :label="$t('groupBuy.validDate')"
          align="center"
          width="160"
        >
          <template slot-scope="scope">
            {{scope.row.startTime}}<br>至<br>{{scope.row.endTime}}
          </template>
        </el-table-column>
        <el-table-column
          prop="statusText"
          :label="$t('groupBuy.activityStatus')"
          align="center"
        >
        </el-table-column>
        <el-table-column
          prop="limitAmount"
          :label="$t('groupBuy.limitAmount')"
          align="center"
        >
        </el-table-column>
        <el-table-column
          prop="groupOrderNum"
          :label="$t('groupBuy.grouponOrderNum')"
          align="center"
        >
        </el-table-column>
        <el-table-column
          prop=""
          :label="$t('groupBuy.option')"
          align="center"
        >
          <template slot-scope="scope">
            <div class="opt">
              <el-tooltip
                :content="$t('groupBuy.edit')"
                placement="top"
                v-if="scope.row.currentState === 1 || scope.row.currentState === 2"
              >
                <span
                  class="iconfont iconbianji"
                  @click="editActivity(scope.row.id, scope.row)"
                ></span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupBuy.share')"
                placement="top"
                v-if="scope.row.currentState === 1 || scope.row.currentState === 2"
              >
                <span
                  class="iconfont iconfenxiang1"
                  @click="shareActivity(scope.row.id)"
                ></span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupBuy.disable')"
                placement="top"
                v-if="scope.row.currentState === 1 || scope.row.currentState === 2"
              >
                <span
                  class="iconfont icontingyong"
                  @click="closeStatus(scope.row.id,0)"
                  v-if="scope.row.status==1"
                > </span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupBuy.enabled')"
                placement="top"
                v-if="scope.row.currentState === 4"
              >
                <span
                  class="iconfont iconqiyong"
                  @click="openStatus(scope.row.id,1)"
                  v-if="scope.row.status==0"
                > </span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupBuy.grouponDetailList')"
                placement="top"
                v-if="scope.row.currentState !== 2"
              >
                <span
                  class="iconfont iconmingxi1"
                  @click="groupBuyDetailList(scope.row.id)"
                ></span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupBuy.grouponOrderlist')"
                placement="top"
                v-if="scope.row.currentState !== 2"
              >
                <span
                  class="iconfont icondingdan"
                  @click="groupBuyOrderList(scope.row.id)"
                ></span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupBuy.newUserList')"
                placement="top"
                v-if="scope.row.currentState !== 2"
              >
                <span
                  class="iconfont iconxinyonghumingxi"
                  @click="newUserDetail(scope.row.id)"
                ></span>
              </el-tooltip>
              <el-tooltip
                :content=" $t('groupBuy.returnFailOrder')"
                placement="top"
                v-if="scope.row.currentState !== 2"
              >
                <span
                  class="iconfont iconshibaidingdan"
                  @click="refundFailureOrder(scope.row.id)"
                ></span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupBuy.delete')"
                placement="top"
                v-if="scope.row.currentState === 3 || scope.row.currentState === 4"
              >
                <span
                  class="iconfont iconshanchu2"
                  @click="deleteGroupBuy(scope.row.id)"
                ></span>
              </el-tooltip>
              <el-tooltip
                :content="$t('groupBuy.activityInfo')"
                placement="top"
              >
                <span
                  class="iconfont iconfankuitongji"
                  @click="activityEffectData(scope.row.id)"
                ></span>
              </el-tooltip>
            </div>
          </template>
        </el-table-column>
      </el-table>
      <div class="footer">
      </div>
      <pagination
        :page-params.sync="pageParams"
        @pagination="initDataList"
      />
    </div>

    <!-- 分享弹窗 -->
    <shareDialog
      :show="showShareDialog"
      :imgPath="shareImg"
      :pagePath="sharePath"
      @close="showShareDialog=false"
    />

  </div>

</template>
<script>

import addGroupBuy from './addGroupBuy.vue'
import pagination from '@/components/admin/pagination/pagination.vue'
import shareDialog from '@/components/admin/shareDialog'
import {
  changeStatusActivity,
  deleteGroupBuyActivity,
  groupBuyList,
  shareActivity
} from '@/api/admin/marketManage/spellGroup.js'

export default {
  components: {
    addGroupBuy,
    pagination,
    shareDialog
  },
  data () {
    return {
      pageParams: {},
      tableData: [],
      tabSwitch: '1',
      tabIndex: 3,
      currentPage: 0,
      pageRows: 1,
      totalRows: 0,
      pageCount: undefined,
      tableListView: true,
      tabInfo: this.$t('groupBuy.tabInfo'),
      activityTypeText: [],
      editData: {},
      editId: '', // 编辑的活动id
      isEdite: true,
      isGoing: false, // 是否是进行中的活动
      loading: false,
      showShareDialog: false, // 分享弹窗
      shareImg: '',
      sharePath: ''
    }
  },
  watch: {
    lang () {
      this.tabInfo = this.$t('groupBuy.tabInfo')
      this.activityTypeText = this.$t('groupBuy.grouponType')
    }
  },
  mounted () {
    console.log('groupBuy')
    if (this.$route.params.calenderAdd) {
      this.addActivity()
    } else if (this.$route.params.calenderEdit) {
      this.editActivity(this.$route.params.id)
    }
    // 初始化数据
    this.langDefault()
    this.initDataList()
  },
  methods: {
    initDataList () {
      let obj = {
        'type': this.tabSwitch,
        'currentPage': this.pageParams.currentPage,
        'pageRows': this.pageParams.pageRows
      }
      console.log(' this.tabSwitch', this.tabSwitch)
      this.closeTabAddGroup()
      this.loading = true
      groupBuyList(obj).then(res => {
        console.log(res.content.page)
        console.log(res.content.page.pageRows)
        this.pageParams = res.content.page
        this.currentPage = res.content.page.currentPage
        this.pageRows = res.content.page.pageRows
        this.pageCount = res.content.page.pageCount
        this.totalRows = res.content.page.totalRows
        this.handleData(res.content.dataList)
        this.loading = false
      }).catch(() => {
        this.$message.error('保存失败')
        this.loading = false
      })
    },
    handleData (tabData) {
      tabData.map((item, index) => {
        item.statusText = this.getActStatusString(item.currentState)
        this.activityTypeText.forEach(entity => {
          if (entity.value === item.activityType) {
            console.log('活动类型' + entity.label)
            item.activityTypeText = entity.label
          }
        })
      })
      this.tableData = tabData
      this.tableData.map(item => {
        item.goodsNumber = item.goodsViews.length
      })
    },
    closeStatus (id, status) {
      console.log(id, 'id---', status)
      this.$confirm(this.$t('groupBuy.closeStatusComment'), {
        confirmButtonText: this.$t('groupBuy.confirm'),
        cancelButtonText: this.$t('groupBuy.cancel'),
        type: 'warning'
      }).then(() => {
        let param = {
          'id': id,
          'status': status
        }
        changeStatusActivity(param).then(res => {
          console.log('change=>res = ' + res)
          if (res.error === 0) {
            this.$message.success(res.message)
          } else {
            this.$message.error(res.message)
          }
          this.initDataList()
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: this.$t('groupBuy.cancelMessage')
        })
      })
    },
    openStatus (id, status) {
      console.log(id, 'id---', status)
      this.$confirm(this.$t('groupBuy.changeStatusComment'), {
        confirmButtonText: this.$t('groupBuy.confirm'),
        cancelButtonText: this.$t('groupBuy.cancel'),
        type: 'warning'
      }).then(() => {
        let param = {
          'id': id,
          'status': status
        }
        changeStatusActivity(param).then(res => {
          console.log('change=>res = ' + res)
          if (res.error === 0) {
            this.$message.success(res.message)
          } else {
            this.$message.error(res.message)
          }
          this.initDataList()
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: this.$t('groupBuy.cancelMessage')
        })
      })
    },
    deleteGroupBuy (data) {
      this.$confirm(this.$t('groupBuy.deleteComment'), {
        confirmButtonText: this.$t('groupBuy.confirm'),
        cancelButtonText: this.$t('groupBuy.cancel'),
        type: 'warning'
      }).then(() => {
        deleteGroupBuyActivity({ 'id': data }).then(res => {
          console.log(res)
          if (res.error === 0) {
            this.$message.success(res.message)
          } else {
            this.$message.error(res.message)
          }
          this.initDataList()
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: this.$t('groupBuy.cancelMessage')
        })
      })
    },
    // 添加新活动
    addActivity () {
      console.log('添加拼团活动--------------' + this.tabInfo.length)
      this.isEdite = false
      this.isGoing = false

      this.showTabAddGroup(this.$t('groupBuy.addActivity'))
    },
    // 编辑
    editActivity (id, val) {
      if (val.currentState === 1) {
        this.isEdite = true
      }
      if (val.currentState === 2) {
        this.isEdite = false
      }
      this.isGoing = true
      this.editId = id
      this.showTabAddGroup(this.$t('groupBuy.editActivity'))
    },
    showTabAddGroup (title) {
      if (this.tabSwitch === '6' || this.tabInfo.length > 5) {
        this.closeTabAddGroup()
      }
      this.tabInfo.push({
        title: title,
        name: '6',
        content: 'edit tab content'
      })
      this.tabSwitch = '6'
      this.tableListView = false
    },
    closeTabAddGroup () {
      // 新增标签
      if (this.tabSwitch === '6') {
        return
      }
      // 不是新增
      if (this.tabInfo.length > 5) {
        this.tableListView = true
        this.tabInfo.pop({
          title: this.$t('seckill.editSeckill'),
          name: '6'
        })
      }
      return this.tabInfo
    },
    addGroupBuySubmit () {
      this.tabSwitch = '1'
      this.initDataList()
    },
    groupBuyDetailList (id) {
      console.log('跳转到详情列表页 id = ', id)
      this.$router.push({ path: `/admin/home/main/spellGroup/detailList`, query: { id: id } })
    },
    groupBuyOrderList (id) {
      console.log('跳转到拼团订单页 id = ', id)
      this.$router.push({ path: `/admin/home/main/spellGroup/orderList`, query: { id: id } })
    },
    newUserDetail (id) {
      console.log('跳转到获取新用户列表页面 id = ', id)
      this.$router.push({ path: '/admin/home/main/spellGroup/newUserDetail', query: { id: id } })
    },
    refundFailureOrder (id) {
      console.log('跳转到拼团退款失败订单 id = ', id)
      // this.$router.push({ path: `/admin/home/main/spellGroup/refundFailureOrder/2/${id}`, query: { id: id } })
      this.$router.push({ path: `/admin/home/main/orders/pinGroup/fail`, query: { id: id, pinStatus: 2 } })
    },
    activityEffectData (id) {
      console.log('跳转到活动效果数据页面 id = ', id)
      this.$router.push({ path: '/admin/home/main/spellGroup/activityEffectData', query: { id: id } })
    },

    // 分享弹窗
    shareActivity (shareId) {
      // this.showShareDialog = !this.showShareDialog
      let obj = {
        'id': shareId
      }
      shareActivity(obj).then(res => {
        if (res.error === 0) {
          this.shareImg = res.content.imageUrl
          this.sharePath = res.content.pagePath
          this.showShareDialog = !this.showShareDialog
        }
      })
    }

  }
}

</script>
<style lang="scss" scoped>
@import "@/assets/aliIcon/iconfont.scss";
.content {
  padding: 10px;
  min-width: 100%;
  font-size: 14px;
  height: 100%;

  .main {
    position: relative;
    background-color: #fff;
    padding: 10px 20px 10px 20px;
  }
}

.p_top_right {
  display: flex;

  span {
    white-space: nowrap;
    height: 32px;
    line-height: 32px;
    margin-right: 10px;
  }

  .topRightDiv {
    &:nth-of-type(2) {
      margin: 0 10px 0 30px;
    }
  }
}

/deep/ .tableClss th {
  background-color: #f5f5f5;
  border: none;
  height: 36px;
  font-weight: bold;
  color: #000;
  padding: 8px 10px;
}

.table_list {
  position: relative;
  margin-top: 10px;
  background-color: #fff;
  padding: 15px;
}

.opt {
  text-align: left;
  span {
    font-size: 22px;
    color: #5a8bff;
    cursor: pointer;
  }
}

.balanceDialo .el-dialog__body {
  padding-bottom: 0 !important;
}

.balanceDialo .el-dialog__footer {
  border-top: 1px solid #eee;
}

.setUpDialog .el-dialog__body {
  padding-top: 10px !important;
}

.add_coupon {
  float: left;
  margin-left: 65%;
}
.footer {
  display: flex;
  justify-content: flex-end;
  span {
    display: block;
    height: 32px;
    line-height: 32px;
  }
}
.shareBox {
  width: 100%;
  text-align: center;
  margin-bottom: 15px;
  border-bottom: 1px solid #ccc;
}
</style>

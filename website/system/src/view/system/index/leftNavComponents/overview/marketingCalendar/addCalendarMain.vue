<template>
  <div class="addCalendarMain">
    <div class="mainTop">
      <el-form
        :model="ruleForm"
        :rules="rules"
        ref="ruleForm"
        label-width="100px"
        class="demo-ruleForm"
      >
        <el-form-item
          label="事件名称："
          prop="eventName"
        >
          <el-input
            size="small"
            v-model="ruleForm.eventName"
          ></el-input>
        </el-form-item>
        <el-form-item
          label="活动时间："
          required
          prop="date"
        >
          <el-date-picker
            type="date"
            placeholder="选择日期"
            v-model="ruleForm.date"
            size="small"
            style="width:188px"
            value-format="yyyy-MM-dd"
          ></el-date-picker>
        </el-form-item>
      </el-form>
      <div class="explain">
        <div class="explainTop">
          <span>事件说明：</span>
          <div>
            <el-button
              size="small"
              type="primary"
              @click="handleToClickExplain()"
            >编辑</el-button>
            <div
              class="rich"
              v-html="richText"
            >
            </div>
          </div>
        </div>
      </div>
    </div>
    <div
      class="mainBottom"
      style="margin-top:10px"
    >
      <el-form
        :model="ruleFormBottom"
        :rules="rulesBottom"
        ref="ruleFormBottom"
        label-width="100px"
        class="demo-ruleForm"
      >
        <el-form-item
          label="营销活动"
          prop="haveChoiseData"
        >
          <div class="marketActivity">
            <div class="tips">温馨提示：删除营销事件中的活动，不会影响营销管理-对应活动列表中已创建的活动</div>
            <div class="activityMain">
              <ul>
                <li
                  v-for="(item,index) in ruleFormBottom.haveChoiseData"
                  :key="index"
                  :style="item.delFlag?'display:none':''"
                >
                  <div class="incident_info_item">
                    <img
                      :src="item.imgUrl"
                      class="info_left_img"
                    >
                    <div class="info_right_box">
                      <p class="act_name_status">{{item.title}}
                      </p>
                      <p class="act_info">活动状态：已有{{item.shopNum!== undefined?item.shopNum:0}}家店铺使用</p>

                    </div>
                    <div class="shadow_set">
                      <div class="shadow_setMain">
                        <a
                          @click="handleToAllHiddenIcon(index)"
                          href="javascript:;"
                        ><i class="iconfont iconshanchu2"></i></a>
                        <a
                          v-if="item.shopNum>0"
                          @click="handleToTurnShopList(item)"
                          href="javascript:;"
                          style="margin-left:20px"
                        ><i class="iconfont iconmingxi1"></i></a>
                      </div>
                    </div>

                    <div class="recommend"><span>推荐</span></div>
                  </div>

                  <div class="liBottom">
                    <span>推荐理由：</span>
                    <div class="reason">
                      <div class="reasonTop">
                        <el-radio
                          v-model="item.radio"
                          :label="0"
                        >站内文本</el-radio>
                        <div v-if="item.radio === 0">
                          <el-button
                            size="small"
                            type="primary"
                            v-if="!item.nTextLink"
                            @click="handleToClickText(item,index)"
                          >选择文本</el-button>
                          <el-input
                            v-if="item.nTextLink"
                            v-model="item.nTextLink"
                            size="small"
                          ></el-input>
                          <span
                            v-if="item.nTextLink"
                            class="delText"
                            @click="handleToDelText(index)"
                          >删除</span>
                        </div>

                      </div>
                      <div class="reasonBottom">
                        <el-radio
                          v-model="item.radio"
                          :label="1"
                        >外部链接</el-radio>
                        <el-input
                          v-if="item.radio === 1"
                          v-model="item.wTextLink"
                          size="small"
                        ></el-input>
                      </div>
                    </div>
                  </div>
                </li>
                <li
                  @click="handleToClick()"
                  class="incident_info_item add_new_list"
                >
                </li>
              </ul>
            </div>
          </div>
        </el-form-item>
      </el-form>
      <div class="footer">
        <div
          class="save"
          @click="handleToSave()"
        >{{$t('shopStyle.saveText')}}</div>
      </div>
    </div>
    <!--事件说明弹窗-->
    <EventExplainDialog
      :explainVisible.sync="explainVisible"
      :backText="backText"
      @input="handleToGetRich"
    />
    <!--二次删除确认弹窗-->
    <el-dialog
      title="提醒"
      :visible.sync="delDialogVisible"
      width="20%"
    >
      <div style="text-align:center;padding-top:20px;line-height:20px">
        是否删除本模块
      </div>
      <span
        slot="footer"
        class="dialog-footer"
      >
        <el-button @click="delDialogVisible = false">取 消</el-button>
        <el-button
          type="primary"
          @click="handleToDelSure()"
        >确 定</el-button>
      </span>
    </el-dialog>
    <!--选择营销活动弹窗-->
    <el-dialog
      title="选择营销活动"
      :visible.sync="choiseActivity"
      width="730px"
    >
      <div class="choiseActivityMain">
        <el-tabs
          v-model="activeName"
          @tab-click="handleClick"
          :stretch="true"
        >
          <el-tab-pane
            label="获客拉新"
            name="first"
          ></el-tab-pane>
          <el-tab-pane
            label="促单转化"
            name="second"
          ></el-tab-pane>
          <el-tab-pane
            label="提高客单价"
            name="third"
          ></el-tab-pane>
          <el-tab-pane
            label="留存复购"
            name="fourth"
          ></el-tab-pane>
          <div class="activityContent">
            <ul>
              <li
                class="act_item"
                v-for="(item,index) in nowShowActivityData"
                :key="index"
                @click="handleToClickActivity(item)"
              >
                <img
                  :src="item.imgUrl"
                  class="info_left_img"
                >
                <div class="act_right_box">
                  <p class="act_name_status">{{item.title}}</p>
                  <p class="act_introduce">{{item.tips}}</p>
                </div>
              </li>
            </ul>
          </div>
        </el-tabs>
      </div>
    </el-dialog>
    <!--选择文本弹窗-->
    <el-dialog
      title="选择营销活动"
      :visible.sync="detailActVisible"
      width="45%"
    >
      <div class="choiseDetail">
        <div class="textDialogTop">
          <span>文章分类：</span>
          <el-select
            v-model="classifyValue"
            placeholder="请选择"
            size="small"
          >
            <el-option
              v-for="item in classifyOptions"
              :key="item.value"
              :label="item.label"
              :value="item.value"
            >
            </el-option>
          </el-select>
          <el-button
            size="small"
            type="primary"
            @click="handLeToClickArtSearch()"
          >搜索</el-button>
        </div>
        <el-table
          class="version-manage-table"
          header-row-class-name="tableClss"
          :data="tableData"
          ref="singleTable"
          border
          highlight-current-row
          @current-change="handleCurrentChange"
          style="width: 100%;margin-top:10px"
        >
          <el-table-column
            prop="title"
            label="标题"
            align="center"
          >
          </el-table-column>
          <el-table-column
            prop="categoryName"
            label="分类"
            align="center"
          >
          </el-table-column>
          <el-table-column
            prop="headPic"
            label="头图"
            align="center"
            width="200"
          >
            <template slot-scope="scope">
              <img
                v-if="scope.row.headPic"
                :src="scope.row.headPic"
                style="width:200px;height:180px"
              >
              {{!scope.row.headPic?'无':''}}
            </template>
          </el-table-column>
          <el-table-column
            prop="updateTime"
            label="更新时间"
            align="center"
            width="130"
          >
          </el-table-column>
          <el-table-column
            prop="status"
            label="状态"
            align="center"
          >
            <template slot-scope="scope">
              <span class="statusStyle">{{scope.row.status?'已发布':'未发布'}}</span>
            </template>
          </el-table-column>
        </el-table>
        <pagination
          :page-params.sync="pageParams"
          @pagination="seacherGroupIntegrationList"
        />
      </div>

      <span
        slot="footer"
        class="dialog-footer"
      >
        <el-button
          type="primary"
          size="small"
          @click="handleToChoiseDetilSure()"
        >确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>
<script>
import { systemSaveEvent, articleDataList, articleclassifyList, systemEventDeatil } from '@/api/admin/firstWebManage/calender/calender.js'
export default {
  components: {
    pagination: () => import('@/components/admin/pagination/pagination.vue'), // 分页组件
    EventExplainDialog: () => import('./eventExplainDialog')
  },
  data () {
    var validatePass = (rule, value, callback) => {
      console.log(value)
      if (!this.$route.query.isAdd) {
        let length = 0
        value.forEach((item, index) => {
          if (!item.delFlag) {
            length++
          }
        })
        if (!length) {
          callback(new Error('请选择营销活动'))
        } else {
          callback()
        }
      } else {
        if (!value.length) {
          callback(new Error('请选择营销活动'))
        } else {
          callback()
        }
      }
    }
    return {
      pageParams: {
        currentPage: 1,
        pageRows: 20
      },
      ruleForm: {
        eventName: '',
        date: ''
      },
      rules: {
        eventName: [
          { required: true, message: '请输入活动名称', trigger: 'blur' }
        ],
        date: [
          { type: 'string', required: true, message: '请选择日期', trigger: 'change' }
        ]
      },
      ruleFormBottom: {
        haveChoiseData: []
      },
      rulesBottom: {
        haveChoiseData: [
          { required: true, validator: validatePass, trigger: 'blur' }
        ]
      },
      explainVisible: false,
      backText: '',
      richText: '',
      choiseActivity: false,
      activeName: 'first',
      activityData: {
        first: [
          {
            imgUrl: this.$imageHost + '/image/admin/new_market/drpt.png?v=1.0.0',
            title: '多人拼团',
            tips: '引导朋友邀请朋友拼团购买',
            activityType: 'pin_group'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/new_market/kj.png?v=1.0.0',
            title: '砍价',
            tips: '引导用户邀请朋友砍价',
            activityType: 'bargain'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/jfdh.png?v=1.0.0',
            title: '拼团抽奖',
            tips: '拼团参与抽奖,裂变式转化',
            activityType: 'group_draw'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/new_market/gfjf.png?v=1.0.0',
            title: '组团瓜分积分',
            tips: '提高用户活跃度,引导用户拼团得积分',
            activityType: 'pin_integration'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/new_market/xxdcj.png?v=1.0.0',
            title: '幸运大抽奖',
            tips: '九宫格式抽奖玩法',
            activityType: 'lottery'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/friend_promote_cion.png?v=1.0.0',
            title: '好友助力',
            tips: '好友帮忙获得奖励',
            activityType: 'promote'
          },

          {
            imgUrl: this.$imageHost + '/image/admin/new_market/wysl.png?v=11.0.0',
            title: '我要送礼',
            tips: '购买商品送好友',
            activityType: 'give_gift'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/new_market/fxyl.png?v=1.0.0',
            title: '分享有礼',
            tips: '分享商品获得优惠奖励，提升商品曝光度',
            activityType: 'share_award'
          }
        ],
        second: [
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/yhqlb.png?v=1.0.0',
            title: '优惠券礼包',
            tips: '用户一次获得多张优惠券',
            activityType: 'coupon_package'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/xsjj.png?v=1.0.0',
            title: '限时降价',
            tips: '设定商品在指定时间内降价促销',
            activityType: 'reduce_price'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/zfyl.png?v=1.0.0',
            title: '支付有礼',
            tips: '用户付款后引导参与营销互动',
            activityType: 'pay_reward'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/sdth.png?v=1.0.0',
            title: '首单特惠',
            tips: '用户首次下单享受降价优惠',
            activityType: 'first_special'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/djpz.png?v=1.0.0',
            title: '定金膨胀',
            tips: '预售定金翻倍，大促预热利器',
            activityType: 'pre_sale'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/ms.png?v=1.0.0',
            title: '秒杀',
            tips: '快速抢购引导用户更多购买',
            activityType: 'seckill_goods'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/zp.png?v=1.0.0',
            title: '赠品',
            tips: '通过丰富的赠品策略，向用户发放赠品',
            activityType: 'gift'
          }
        ],
        third: [
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/mzmj.png?v=1.0.0',
            title: '满折满减',
            tips: '购物满一定金额享受一定优惠',
            activityType: 'full_cut'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/dbykj.png?v=1.0.0',
            title: '打包一口价',
            tips: '多件商品一口价打包售卖',
            activityType: 'package_sale'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/jjg.png?v=1.0.0',
            title: '加价购',
            tips: '购买指定商品满一定金额加价换购',
            activityType: 'purchase_price'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/mby.png?v=1.0.0',
            title: '满包邮',
            tips: '购物包邮',
            activityType: 'free_ship'
          }
        ],
        fourth: [
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/jfdh.png?v=1.0.0',
            title: '积分兑换',
            tips: '使用积分兑换商品',
            activityType: 'integral_goods'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/kpyl.png?v=1.0.0',
            title: '开屏有礼（原活动有礼）',
            tips: '用户来到小程序引导参与营销互动',
            activityType: 'activity_reward'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/pjyl.png?v=1.0.0',
            title: '评价有礼',
            tips: '引导用户评价商品，参与营销活动',
            activityType: 'comment_gift'
          },
          {
            imgUrl: this.$imageHost + '/image/admin/market_calendar/cp.png?v=1.0.0',
            title: '测评',
            tips: '兴趣测评，让你更了解用户',
            activityType: 'assess'
          }
        ]
      },
      nowShowActivityData: [], // 当前选择营销活动弹窗展示的活动内容
      haveChoiseData: [], // 已经选出的活动数据
      delDialogVisible: false,
      detailActVisible: false, // 选择具体活动弹窗flag
      tableData: [],
      chioseDetailVal: '',
      clickChoiseIndex: '', // 记录点击得选择活动项index
      isClickIconDel: false, // 是否是点击的隐藏icon删除
      isClickIconChoiseAct: false, // 是否是点击的隐藏icon重新选择活动
      classifyValue: null,
      classifyOptions: [],
      calendarId: null,
      hasAct: null
    }
  },
  mounted () {
    this.nowShowActivityData = this.activityData[this.activeName]
    // 初始化数据查询
    this.handleToInit()
  },
  methods: {
    // 初始化数据查询
    handleToInit () {
      // 查询分类
      articleclassifyList().then(res => {
        console.log(res)
        if (res.error === 0) {
          let arr = []
          res.content.forEach((item, index) => {
            let obj = {
              value: item.categoryId,
              label: item.categoryName
            }
            arr.push(obj)
          })
          let obj = {
            value: null,
            label: '请选择分类'
          }
          arr.unshift(obj)
          this.classifyOptions = arr
        }
      })
      // 查询文章
      let params = {
        categoryId: this.classifyValue,
        status: 1,
        page: {
          currentPage: this.currentPage
        }
      }
      articleDataList(params).then(res => {
        console.log(res)
        if (res.error === 0) {
          this.tableData = res.content.dataList
          this.pageParams = res.content.page
        }
      })
      if (!this.$route.query.isAdd) {
        this.handleToQueryDetail(this.$route.query.id)
      }
    },
    // 编辑时查询详细事件信息
    handleToQueryDetail (id) {
      systemEventDeatil(id).then(res => {
        console.log(res)
        if (res.error === 0) {
          let { eventName, eventTime, eventDesc, calendarId, hasAct, actInfo } = res.content
          this.ruleForm.eventName = eventName
          this.ruleForm.date = eventTime
          this.richText = eventDesc
          this.backText = eventDesc
          this.calendarId = calendarId
          this.hasAct = hasAct
          // this.haveChoiseData = actInfo
          // 处理营销活动数据
          this.handleToActData(actInfo)
        }
      })
    },
    // 处理编辑时活动数据
    handleToActData (actInfo) {
      console.log(actInfo)
      let arr = []
      actInfo.forEach((itemP, indexP) => {
        Object.keys(this.activityData).forEach((item, index) => {
          this.activityData[item].forEach((itemC, indexC) => {
            if (itemC.activityType === itemP.activityType) {
              let obj = {
                imgUrl: itemC.imgUrl,
                title: itemC.title,
                activityType: itemC.activityType,
                delFlag: 0,
                radio: itemP.recommendType,
                shopNum: itemP.shopNum,
                id: itemP.id
              }
              if (itemP.recommendType === 0) {
                obj.nTextLink = itemP.recommendLink
              } else {
                obj.wTextLink = itemP.recommendLink
              }
              arr.push(obj)
            }
          })
        })
      })
      console.log(arr)

      this.ruleFormBottom.haveChoiseData = arr
    },
    // 点击事件说明编辑
    handleToClickExplain () {
      this.explainVisible = true
    },
    // 获取富文本输入内容
    handleToGetRich (res) {
      console.log(res)
      this.richText = res
    },
    // 点击添加营销活动
    handleToClick () {
      this.choiseActivity = true
    },
    // 选择营销活动弹窗切换
    handleClick (tab, event) {
      console.log(tab, event)
      this.nowShowActivityData = this.activityData[tab.name]
    },
    // 点击营销活动弹窗的项
    handleToClickActivity (item) {
      // haveChoiseData
      let { imgUrl, title, activityType } = item
      console.log(item)
      let obj = {
        imgUrl: imgUrl,
        title: title,
        activityType: activityType,
        delFlag: 0,
        radio: 0,
        nTextLink: '',
        wTextLink: ''
      }
      console.log(this.ruleFormBottom.haveChoiseData)
      this.ruleFormBottom.haveChoiseData.push(obj)
      this.choiseActivity = false
    },
    // 二次删除确定
    handleToDelSure () {
      // this.ruleFormBottom.haveChoiseData.splice(this.delIndex, 1)
      this.ruleFormBottom.haveChoiseData[this.delIndex].delFlag = 1
      this.delDialogVisible = false
    },
    // 选择文本弹窗
    handleToClickText (item, index) {
      this.clickChoiseIndex = index
      // this.isClickIconChoiseAct = false
      this.detailActVisible = true
      // this.$refs.singleTable.setCurrentRow()
    },
    // 选择文本弹窗确定事件
    handleToChoiseDetilSure () {
      // this.chioseDetailVal
      console.log(this.chioseDetailVal)
      let { articleId } = this.chioseDetailVal
      this.ruleFormBottom.haveChoiseData[this.clickChoiseIndex].nTextLink = articleId
      this.detailActVisible = false
    },
    // 文本表格选中
    handleCurrentChange (val) {
      console.log(val)
      this.chioseDetailVal = val
    },
    // 点击删除文字
    handleToDelText (index) {
      this.ruleFormBottom.haveChoiseData[index].nTextLink = ''
    },
    seacherGroupIntegrationList () {
      // 选择文本弹窗分页变化触发
      this.handleToInit()
    },
    // 点击保存
    handleToSave () {
      console.log('触发')
      console.log(this.ruleForm, this.ruleFormBottom)
      this.$refs['ruleForm'].validate((valid) => {
        console.log(valid)
        if (valid) {
          this.$refs['ruleFormBottom'].validate((valid2) => {
            console.log(valid2)
            if (valid2) {
              console.log(this.ruleForm, this.ruleFormBottom, this.richText)
              let { eventName, date } = this.ruleForm
              let { haveChoiseData } = this.ruleFormBottom
              let params = {}
              let calendarAct = []
              haveChoiseData.forEach((item, index) => {
                let recommendLink = ''
                if (item.radio) {
                  recommendLink = item.wTextLink
                } else {
                  recommendLink = item.nTextLink
                }
                console.log()
                let obj = {
                  activityType: item.activityType,
                  recommendType: item.radio,
                  recommendLink: recommendLink,
                  delFlag: item.delFlag
                }
                if (item.id) {
                  obj.id = item.id
                }
                calendarAct.push(obj)
              })
              if (this.$route.query.isAdd) {
                let paramDate = date + ' 00:00:00'
                params = {
                  eventName: eventName,
                  eventTime: paramDate,
                  eventDesc: this.richText,
                  act: 'add',
                  calendarAct: calendarAct
                }
              } else {
                let paramDate = date + ' 00:00:00'
                params = {
                  eventName: eventName,
                  eventTime: paramDate,
                  eventDesc: this.richText,
                  act: 'edit',
                  calendarAct: calendarAct,
                  calendarId: this.calendarId
                }
              }
              systemSaveEvent(params).then(res => {
                console.log(res)
                if (res.error === 0) {
                  this.$message.success({
                    message: '保存成功',
                    showClose: true
                  })
                  this.$router.push({
                    name: 'marketingCalendar'
                  })
                }
              })
            }
          })
        }
      })
      console.log(this.$refs)
    },
    // 选中活动四个icon综合处理
    handleToAllHiddenIcon (index) {
      this.delIndex = index
      this.isClickIconDel = true
      this.delDialogVisible = true
    },
    // 点击文章弹窗搜索按钮
    handLeToClickArtSearch () {
      this.handleToInit()
    },
    // 点击跳转店铺列表页面
    handleToTurnShopList (item) {
      console.log(item)
      this.$router.push({
        name: 'shopList',
        params: {
          id: item.id
        }
      })
    }
  }
}
</script>
<style lang="scss" scoped>
@import "@/assets/aliIcon/iconfont.scss";
.addCalendarMain {
  margin-top: 10px;
  min-width: 100%;
  font-size: 14px;
  height: 100%;
  /deep/ .el-dialog__body {
    padding-top: 0 !important;
  }
  .mainTop,
  .mainBottom {
    background-color: #fff;
    padding: 15px;
  }
  .mainTop {
    /deep/ .el-input {
      width: auto;
    }
    .explain {
      padding-left: 18px;
      .explainTop {
        display: flex;
        span {
          display: block;
          margin-right: 13px;
          height: 32px;
          line-height: 32px;
        }
      }
      .rich {
        display: flex;
        flex-wrap: wrap;
        margin-top: 10px;
      }
    }
  }
  .mainBottom {
    padding-left: 0;
    /deep/ .el-form-item {
      display: flex;
      flex-direction: column;
    }
    /deep/ .el-form-item__content {
      margin-left: 23px !important;
      line-height: normal !important;
    }
    .marketActivity {
      padding-left: 9px;
      .tips {
        color: #999;
        font-size: 14px;
      }
      .activityMain {
        ul {
          display: flex;
          flex-wrap: wrap;
          .incident_info_item {
            width: 358px;
            height: 96px;
            background-color: #f2f6ff;
            position: relative;
            min-width: 0;
            margin-bottom: 10px;
            margin-right: 16px;
            border: solid 1px #d9e4ff;
            box-sizing: border-box;
            display: flex;
            align-items: center;
            padding-left: 22px;

            .info_left_img {
              width: 50px;
              height: 50px;
              margin-right: 19px;
            }
            .info_right_box {
              flex: 1;
              display: flex;
              flex-flow: column;
              .act_info {
                font-size: 12px;
                color: #666;
                margin-top: 10px;
              }
            }
          }
        }
        .liBottom {
          display: flex;
          margin-bottom: 10px;
          .reason {
            display: flex;
            flex-direction: column;
            /deep/ .el-radio {
              margin-right: 5px;
            }
            .reasonTop,
            .reasonBottom {
              display: flex;
              align-items: center;
              height: 32px;
            }
            .reasonTop {
              margin-bottom: 10px;
              /deep/ .el-input {
                width: 156px;
              }
              .delText {
                cursor: pointer;
                color: #5a8bff;
              }
            }
            // .reasonBottom {
            // }
          }
        }
        .incident_info_item {
          width: 358px;
          height: 96px;
          background-color: #f2f6ff;
          position: relative;
          min-width: 0;
          margin-top: 12px;
          margin-bottom: 20px;
          border: solid 1px #d9e4ff;
          box-sizing: border-box;
          display: flex;
          align-items: center;
          padding-left: 22px;
          .shadow_set {
            display: none;
            position: absolute;
            left: 0;
            top: 0;
            right: 0;
            bottom: 0;
            .shadow_setMain {
              display: flex;
              align-items: center;
              height: 100%;
              background-color: rgba(0, 0, 0, 0);
              z-index: 3;
              align-items: center;
              justify-content: space-evenly;
              transition: all 1s ease;
              a {
                text-decoration: none;
                color: #fff;
                i {
                  font-size: 24px;
                }
              }
            }
          }

          &:hover {
            .shadow_set {
              display: block;
              .shadow_setMain {
                background-color: rgba(0, 0, 0, 0.5);
              }
            }
          }
        }
        .add_new_list {
          background-color: #f5f5f5;
          border-color: #eeeeee;
          cursor: pointer;
        }
        .add_new_list::before {
          content: "";
          position: absolute;
          width: 34px;
          height: 3px;
          background-color: #ddd;
          left: 50%;
          transform: translateX(-50%);
        }
        .add_new_list::after {
          content: "";
          position: absolute;
          width: 3px;
          height: 34px;
          background-color: #ddd;
          left: 50%;
          transform: translateX(-50%);
        }
      }
    }
  }
  .choiseActivityMain {
    .activityContent {
      min-height: 308px;
      ul {
        display: flex;
        flex-wrap: wrap;
        justify-content: space-between;
        .act_item {
          width: 333px;
          height: 61px;
          background-color: #f2f6ff;
          position: relative;
          min-width: 0;
          margin-bottom: 16px;
          border: solid 1px #d9e4ff;
          box-sizing: border-box;
          display: flex;
          align-items: center;
          padding-left: 18px;
          cursor: pointer;
          .info_left_img {
            width: 41px;
            height: 41px;
            margin-right: 17px;
          }
          .act_right_box {
            flex: 1;
            display: flex;
            flex-flow: column;
            justify-items: center;
            .act_name_status {
              font-size: 14px;
              margin-bottom: 10px;
            }
            .act_introduce {
              font-size: 12px;
              color: #666;
            }
          }
        }
      }
    }
  }
  .footer {
    background: #f8f8fa;
    border-top: 1px solid #f2f2f2;
    text-align: center;
    position: fixed;
    z-index: 2;
    bottom: 0;
    padding: 10px 0;
    left: 0;
    right: 0;
    margin-right: 10px;
  }
  .save {
    width: 70px;
    height: 30px;
    line-height: 30px;
    border: none;
    background: #5a8bff;
    color: #fff;
    margin: auto;
    cursor: pointer;
  }
  /deep/ .tableClss th {
    background-color: #f5f5f5;
    border: none;
    height: 36px;
    font-weight: bold;
    color: #000;
    padding: 8px 10px;
  }
  .dialog-footer {
    display: block;
    width: 100%;
    display: flex;
    justify-content: center;
  }
  .choiseDetail {
    height: 400px;
    overflow: auto;
    .textDialogTop {
      margin-top: 10px;
    }
  }
  .recommend {
    position: absolute;
    top: 0;
    right: 0;
    width: 0;
    height: 0;
    border-top: 40px solid #f66;
    border-left: 40px solid transparent;
    span {
      position: absolute;
      font-size: 12px;
      text-align: center;
      color: #fff;
      transform: rotate(45deg);
      -webkit-transform: rotate(45deg);
      top: -34px;
      left: -25px;
    }
  }
  .statusStyle {
    background-color: #739e73;
    line-height: 24px;
    padding: 0 8px;
    display: inline-block;
    color: #fff;
    border-radius: 3px;
  }
}
</style>

<template>
  <div class="receiveDetail">
    <div class="receiveDetailMain">
      <div class="filter">
        <div class="top" style="margin-bottom: 10px;">
          <div>
            <span>{{$t('membershipIntroduction.phoneNum')}}</span>
            <el-input
              v-model="phoneNum"
              :placeholder="$t('membershipIntroduction.placePhoneNum')"
              size="small"
            ></el-input>
          </div>
          <div>
            <span>{{$t('membershipIntroduction.nickname')}}</span>
            <el-input
              v-model="nameInput"
              :placeholder="$t('membershipIntroduction.placeNameNum')"
              size="small"
            ></el-input>
          </div>
          <div>
            <span>{{$t('membershipIntroduction.Collectiontime')}}</span>

            <el-date-picker
              v-model="dateInput"
              type="daterange"
              size="small"
              align="right"
              unlink-panels
              :range-separator="$t('membershipIntroduction.to')"
              :start-placeholder="$t('membershipIntroduction.startdata')"
              :end-placeholder="$t('membershipIntroduction.enddate')"
              value-format='yyyy-MM-dd'
              style="width:230px;"
            >
            </el-date-picker>
          </div>
        </div>

        <div class="top">
          <div>
            <span>{{$t('membershipIntroduction.membershipCard')}}</span>
            <el-select
              v-model="membershipCardValue"
              :placeholder="$t('membershipIntroduction.placeChoise')"
              size="small"
            >
              <el-option
                v-for="(item,index) in membershipCardOptins"
                :key="index"
                :label="item.cardName"
                :value="item.id"
              >
              </el-option>
            </el-select>
          </div>
          <div>
            <span>{{$t('membershipIntroduction.membershipcard')}}</span>
            <el-select
              v-model="CardTypeValue"
              :placeholder="$t('membershipIntroduction.placeChoise')"
              size="small"
            >
              <el-option
                v-for="item in CardTypeOptins"
                :key="item.value"
                :label="item.label"
                :value="item.value"
              >
              </el-option>
            </el-select>
          </div>
           <div>
            <span>{{$t('membershipIntroduction.cardStatus')}}</span>
            <el-select
              v-model="statusValue"
              :placeholder="$t('membershipIntroduction.placeChoise')"
              size="small"
            >
              <el-option
                v-for="item in $t('membershipIntroduction.cardStatusOpt')"
                :key="item.value"
                :label="item.label"
                :value="item.value"
              >
              </el-option>
            </el-select>
          </div>
          <div>
            <el-button
              type="primary"
              size="small"
              @click="loadUserCardData()"
            >{{$t('membershipIntroduction.screen')}}</el-button>
          </div>

        </div>
      </div>

      <!--底部表格-->
      <div
        class="content"
        v-if="page_one"
      >
        <table width='100%'>
          <thead>
            <tr>
              <td >{{$t('membershipIntroduction.Collectiontime')}}</td>
              <td >{{$t('membershipIntroduction.CardNumber')}}</td>
              <td >{{$t('membershipIntroduction.Member')}}</td>
              <td >{{$t('membershipIntroduction.membershipCard')}}|{{$t('membershipIntroduction.type')}}</td>
              <td >{{$t('membershipIntroduction.state')}}</td>
              <td >{{$t('membershipIntroduction.Balanceyuan')}}</td>
              <td >{{$t('membershipIntroduction.servicestimes')}}</td>
              <td >{{$t('membershipIntroduction.ExchangeFrequency')}}</td>
              <td >{{$t('membershipIntroduction.freeshiptimes')}}</td>
              <td >{{$t('membershipIntroduction.operation')}}</td>
            </tr>
          </thead>
          <tbody v-if="tbodyFlag">
            <tr
              v-for="(item,index) in trList"
              :key="index"
              :class="clickIindex===index?'clickClass':''"
              @click="handleClick(index)"
            >
              <td>{{item.createTime}}</td>
              <td>{{item.cardNo}}</td>
              <td>{{item.username}} </td>
              <td>{{item.cardName}}
                <div class="memberCard">
                  <div v-if="item.cardType==='0'">
                    {{$t('membershipIntroduction.normalCard')}}
                  </div>
                  <div v-else-if="item.cardType==='1'">
                    {{$t('membershipIntroduction.limiteCard')}}
                  </div>
                  <div v-else-if="item.cardType==='2'">
                    {{$t('membershipIntroduction.rankCard')}}
                  </div>
                </div>

              </td>
              <td>
                <span v-if="item.flag==0">
                  <!-- 已过期 -->
                  <span v-if="item.expireTime && Date.now()>Date.parse(item.expireTime)">
                    {{$t('membershipIntroduction.expired')}}
                  </span>
                  <span v-else>
                    <!-- 使用中 -->
                    {{$t('membershipIntroduction.using')}}
                  </span>
                </span>
                <span v-else-if="item.flag==2">
                    <!-- 使用中 -->
                    {{$t('membershipIntroduction.using')}}
                  </span>
                <span v-else-if="item.flag==1">
                  <!-- 已弃用 -->
                  {{$t('membershipIntroduction.abolished')}}
                </span>
                <span v-else-if="item.flag==3">
                  <!-- 已转赠 -->
                  {{$t('membershipIntroduction.cardGived')}}
                </span>
              </td>
              <td class="td-money"  style="margin: 0px;padding: 0px;">
                <div class="moneyModify" v-if="item.cardType==='0' ">
                  <span >{{item.money}}</span>
                  <img :src="plusImg" align="right" @click="modifyAccount(item,0)" v-if="!item.deleteShow && !item.expired">
                  <img v-else style="width: 10px;">
                </div>
              </td>
              <td>
                <div class="moneyModify" v-if="item.cardType==='1' ">
                  <span>{{item.surplus}}</span>
                  <img :src="plusImg" align="right" @click="modifyAccount(item,2)" v-if="!item.deleteShow && !item.expired">
                  <img v-else style="width: 10px;">
                </div>
              </td>
              <td>
                <div class="moneyModify" v-if="item.cardType==='1' ">
                  <span>{{item.exchang_surplus}}</span>
                  <img :src="plusImg" align="right" @click="modifyAccount(item,1)" v-if="!item.deleteShow && !item.expired">
                  <img v-else style="width: 10px;">
                </div>

              </td>
              <td>
                {{item.freeShip.desc}}
              </td>
              <td class="link">
                <div class="operateDiv">
                  <span v-if="Number(item.cardType)!==2" @click="jumpToChargeDetail(item,1)">{{ $t('membershipIntroduction.chargeDetail')  }}</span>
                  <span v-if="Number(item.cardType)!==2" @click="jumpToChargeDetail(item,2)">-{{ $t('membershipIntroduction.consumeDetail')  }}</span>
                  <span
                    v-if="!item.deleteShow"
                    @click="deleteUserCard(item)"
                  >
                    <span v-if="Number(item.cardType)!==2">-</span>
                    {{ $t('membershipIntroduction.deleteCard')  }}
                  </span>
                </div>
              </td>
            </tr>
          </tbody>

        </table>
        <div
          class="noData"
          v-if="!tbodyFlag"
        >
          <img :src="noImg">
          <span>{{$t('membershipIntroduction.noData')}}</span>
        </div>
      </div>
      <div
        class="content_two"
        v-else
      >
        <table width='100%'>
          <thead>
            <tr>
              <td>名称</td>

              <td>链接</td>
            </tr>
          </thead>
          <tbody v-if="tbodyFlag">
            <tr
              v-for="(item,index) in trList"
              :key="index"
              :class="clickIindex===index?'clickClass':''"
              @click="handleClick(index)"
            >
              <td>{{item.title}}</td>

              <td class="tb_decorate_a">
                {{item.path}}
              </td>
            </tr>
          </tbody>

        </table>
        <div
          class="noData"
          v-if="!tbodyFlag"
        >
          <img :src="noImg">
          <span>暂无相关数据</span>
        </div>
      </div>
    </div>
    <modify-data
    :model="modifyDialogData"
    @submitRes="updateModifyData">
    </modify-data>
  </div>
</template>
<script>
import { getAllMemberCardDetailRequest, deleteUserCardRequest } from '@/api/admin/memberManage/memberCard.js'
import { allUserCardRequest } from '@/api/admin/membershipList.js'
import modifyData from './modifyData'
export default {
  components: {
    modifyData: modifyData
  },
  data () {
    return {
      modifyDialogData: {
        title: null,
        presentText: null,
        addText: null,
        tips: null,
        bzText: null,
        persentMoney: '',
        index: 0, // 0 余额，1 积分，2卡余额
        visiable: false,
        cardNo: null,
        userId: null,
        cardId: null,
        cardType: null,
        type: null // 0卡余额，1 兑换商品次数，2 兑换门店次数
      },
      userId: '', // 用户id
      username: '', // 用户名
      phoneNum: '',
      nameInput: '',
      dateInput: '',
      membershipCardOptins: [],
      membershipCardValue: '',
      CardTypeOptins: [],
      CardTypeValue: null,
      statusValue: -1,
      page_one: true,
      tbodyFlag: false,
      trList: [], // 表格数据
      clickIindex: null,
      noImg: this.$imageHost + '/image/admin/no_data.png',
      mixinleftDiv: '',
      plusImg: this.$imageHost + '/image/admin/add_some.png'
    }
  },
  created () {
    // 从路由获取userId
    this.userId = this.$route.query.id
    this.username = this.$route.query.name
    this.nameInput = this.$route.query.name
    this.phoneNum = this.$route.query.phoneNum
    this.CardTypeValue = this.$route.query.cardType
    console.log(this.userId, this.username)

    // 加载数据
    this.loadAllPageDate()
  },
  mounted () {
    this.langDefault()
  },
  watch: {
    lang () {
      // 加载数据
      this.loadAllOptionsData()
    }
  },
  methods: {
    // 1- 行点击
    handleClick (index) {
      this.clickIindex = index
    },
    // 2- 初始化页面所有数据
    loadAllPageDate () {
      // 加载表格数据
      this.loadUserCardData()
      // 加载选项数据
      this.loadAllOptionsData()
    },
    // 3- 加载表格数据
    loadUserCardData () {
      console.log(this.dateInput, this.dateInput.length)
      console.log(typeof this.dateInput)
      if (this.dateInput) {
        this.dateInput[0] = this.dateInput[0] + ' 00:00:00'
        this.dateInput[1] = this.dateInput[1] + ' 23:59:59'
      }
      let obj = {
        'userId': this.userId,
        'mobile': this.phoneNum,
        'username': this.nameInput,
        'createTimeFirst': this.dateInput[0],
        'createTimeSecond': this.dateInput[1],
        'cardId': this.membershipCardValue,
        'cardType': this.CardTypeValue,
        'statusValue': this.statusValue
      }
      console.log(obj)
      getAllMemberCardDetailRequest(obj).then(res => {
        console.log(res)
        if (res.error === 0) {
          // 绑定数据
          if (res.content.length > 0) {
            this.trList = res.content
            this.trList.forEach(item => {
              item.deleteShow = false
              if (Number(item.flag) === 1) {
                item.deleteShow = true
              }
              item.expired = false
              if (item.expireTime && Date.now() > Date.parse(item.expireTime)) {
                item.expired = true
              }

              this.showFreeship(item)
            })
            console.log(this.trList)
            // 显示数据
            this.tbodyFlag = true
          } else {
            this.trList = []
            this.tbodyFlag = false
          }
        }
      })
    },

    // 3- 加载选项数据
    loadAllOptionsData () {
      this.getAllUserCard()
      this.getAllCardType()
    },
    // 3.1- 获取所有所有会员卡下拉框数据
    getAllUserCard () {
      allUserCardRequest().then(res => {
        console.log(this.membershipCardOptins)
        this.membershipCardOptins = []
        this.membershipCardOptins.push(this.$t('membershipIntroduction.allCard'))
        console.log(this.membershipCardOptins)
        if (res.error === 0) {
          this.membershipCardOptins.push(...res.content)
          console.log(this.membershipCardOptins)
        }
      })
    },
    // 3.2- 获取所有会员卡类型
    getAllCardType () {
      this.CardTypeOptins = this.$t('membershipIntroduction.cardTypeArray')
      // load 余额修改弹窗
    },
    // 4- 清空缓存
    clearCacheData () {

    },
    // 5- 成功消息弹框
    getSuccessMessagePrompt () {
      var message = this.$t('membershipIntroduction.success')
      this.$message.success({
        showClose: true,
        message: message,
        type: 'success'
      })
    },
    deleteUserCard (card) {
      console.log('delete card:', card)
      deleteUserCardRequest({ cardNo: card.cardNo }).then(res => {
        if (res.error === 0) {
          this.$message.success(this.$t('membershipIntroduction.deleteCardSuccess'))
          this.loadAllPageDate()
        }
      })
    },
    modifyAccount (row, type) {
      // 修改弹窗
      console.log('修改账户余额')
      let dialogData = this.$t('membershipIntroduction.balanceDialogData')[type]
      Object.keys(this.modifyDialogData).forEach(key => {
        this.modifyDialogData[key] = dialogData[key] || this.modifyDialogData[key]
      })

      this.modifyDialogData.cardNo = row.cardNo
      this.modifyDialogData.userId = row.userId
      this.modifyDialogData.cardId = row.cardId
      this.modifyDialogData.cardType = row.cardType
      if (type === 0) {
        this.modifyDialogData.persentMoney = row.money
      } else if (type === 1) {
        this.modifyDialogData.persentMoney = row.exchang_surplus
      } else if (type === 2) {
        this.modifyDialogData.persentMoney = row.surplus
      }
      // 代表卡余额,兑换次数，门店兑换次数
      this.modifyDialogData.index = 2
      this.modifyDialogData.type = type
      this.modifyDialogData.visiable = true
      console.log(this.modifyDialogData)
    },
    updateModifyData (flag) {
      if (flag) {
        this.loadAllPageDate()
      }
      this.modifyDialogData.visiable = false
    },

    jumpToChargeDetail (item, flag) {
      // 充值明细
      this.$router.push({
        name: 'refillDetailsItem',
        query: {
          cardNo: item.cardNo,
          cardType: item.cardType,
          cardId: item.cardId,
          userId: item.userId,
          username: item.username,
          activeName: flag
        }
      })
    },
    showFreeship (item) {
      if (Number(item.cardType) === 1 || item.freeShip.type === -1) {
        item.freeShip.desc = '-'
      } else if (item.freeShip.type === 0) {
        item.freeShip.desc = '不限制'
      } else {
        item.freeShip.desc = `${item.freeShip.num}/${item.freeShip.remainNum}`
      }
      console.log(item.freeShip.desc)
    }
  }
}

</script>
<style scoped lang="scss">
.noData {
  height: 100px;
  display: flex;
  justify-content: center;
  align-items: center;
  /* width: 650px; */
  flex-direction: column;
  border: 1px solid #eee;
  /* margin-top: 10px; */
}
.noData span {
  margin: 10px;
}
.receiveDetail {
  padding: 10px;
  padding-bottom: 68px;
  /* padding-right: 23px; */
  min-width: 100%;
  font-size: 14px;
  height: 100%;
  position: relative;
  overflow-y: auto;
}
.receiveDetailMain {
  /* padding: 15px 25px; */
  position: relative;
  /* height: 100%; */
  overflow: hidden;
  overflow-y: auto;
}
.filter {
  padding: 15px;
  margin-bottom: 10px;
  background: #fff;
}
.top {
  display: flex;
}
.top > div {
  min-width: 320px;
  width: 20%;
  display: flex;
}
.top > div > span{
  width: 80px;
  display: inline-block;
  text-overflow: nowrap;
  margin-right: 10px;
}
.top > div:nth-of-type(2) {
  margin: 0 100px;
}
.top > div > span {
  display: inline-block;
  line-height: 30px;
  line-height: 30px;
  text-align: right;
  /* margin-right: 25px; */
  color: #333;
}
.top > div > .el-input {
  flex: 1;
}
.receiveDetailDate {
  width: 480px !important;
}
.middle {
  margin-top: 20px;
}

.content {
  padding: 15px;
  background: #fff;
}
table {
  border: 1px solid #eff1f5;
  border-collapse: collapse;
  font-size: 14px;
  border-spacing: 0 0;
}
.clickClass {
  background-color: #eee !important;
}
thead {
  display: table-header-group;
  vertical-align: middle;
  border-color: inherit;
}
thead td {
  background: #faf9f8;
  text-align: center;
  color: #333;
  padding: 8px 10px;
  vertical-align: middle !important;
}

tbody td {
  text-align: center;
  border: 1px solid #eff1f5;
  color: #666;
}

.moneyModify{
  width: 90px;
  margin-right: 0px;
}

.moneyModify > span{
  width: 80px;
  margin-left: 0px;
}

td {
  padding: 8px 10px;
  vertical-align: middle !important;
  text-align: center;
}
.content_two td:nth-of-type(2) {
  width: 490px !important;
}

.operateDiv {
  color: #0e70ca;
}
.operateDiv span {
  cursor: pointer;
  margin-left: -3px;
}
/deep/ .el-input__inner{
  width: 140px;
}
/deep/ .el-select{
  width: 140px;
}
.memberCard{
  margin-top: 5px;
}
</style>

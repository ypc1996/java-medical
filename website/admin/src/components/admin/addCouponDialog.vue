<template>
  <div class="couponDialog">
    <el-dialog
      title="选择优惠券"
      :visible.sync="dialogVisible"
      :modal-append-to-body='false'
      center
    >
      <div class="couponDialogDIiv">
        <div class="couponTop">
          <div class="top_leftDiv">
            <el-input
              v-model="couponInput"
              placeholder="请输入优惠券名称"
              size="small"
              class="inputWidth"
            ></el-input>
            <el-select
              v-if="type === -1"
              v-model="couponType"
              size="small"
              class="inputWidth"
              @change="couponTypeChaneg"
            >
              <el-option
                v-for="item in couponTypes"
                :key="item.id"
                :label="item.label"
                :value="item.id"
              ></el-option>
            </el-select>
            <el-select
              v-model="couponStatus"
              size="small"
              class="inputWidth"
              @change="couponTypeChaneg"
            >
              <el-option
                v-for="item in statusList"
                :key="item.id"
                :label="item.label"
                :value="item.id"
              ></el-option>
            </el-select>
            <el-button
              @click="initCouponList (data)"
              type="info"
              plain
              size="small"
              icon="el-icon-search"
            >搜索</el-button>
          </div>
          <span @click="initCouponList (data)"><i class="el-icon-refresh-left"></i>刷新</span>
        </div>
        <div
          v-loading="loading"
          class="couponListDiv"
        >
          <div
            class="couponLi"
            v-for="(item,index) in dialogData"
            :key="index"
            @click="handleToClick(index)"
          >
            <div
              style="width:108px;margin-right:10px"
              v-if="!item.isHidden"
            >
              <img
                v-if="item.ischeck"
                :src="$imageHost +'/image/admin/shop_beautify/checked_card.png'"
              >
              <div class="coupon_list_top">
                <p v-if="item.actCode !== 'random'">{{item.actCode==='discount'?'':'¥'}}<span>{{item.denomination}}<i style="font-size:14px">{{item.actCode==='discount'?'折':''}}</i></span></p>
                <p v-else>￥<span>{{item.randomMax}}</span><span style="font-size:12px;">最高</span></p>
              </div>
              <div class="coupon_list_center">
                <div class="coupon_center_limit">{{item.useConsumeRestrict > 0 ?`满${item.leastConsume}使用`:'不限制'}}</div>
                <div class="coupon_center_number">
                  <span v-if="item.limitSurplusFlag === 0">剩余<span>{{item.surplus}}</span>张</span>
                  <span v-else>库存不限制</span>
                </div>
                <div
                  class="coupon_list_bottom"
                  :style="`backgroundImage:url('${$imageHost}/image/admin/coupon_border.png')`"
                >{{item.useScore===0?'领取':item.scoreNumber+'积分 兑换'}} </div>
                <div class="coupon_name">{{item.type===1?'[分裂]':''}}{{item.actName}}</div>
              </div>
            </div>

          </div>
          <div
            class="couponLi coupon-add"
            @click="addCouponHandle"
          >
            <img
              class="coupon-add-icon"
              :src="$imageHost+ '/image/admin/shop_beautify/add_decorete.png'"
              alt="+"
            >
            <span class="coupon-add-tip">添加优惠券</span>
          </div>
        </div>

      </div>
      <span
        slot="footer"
        class="dialog-footer"
      >
        <el-button
          size="small"
          @click="dialogVisible = false"
        >取 消</el-button>
        <el-button
          type="primary"
          size="small"
          @click="handleToSure()"
        >确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>
<script>
import { getCouponSelectComponentData } from '@/api/admin/marketManage/couponGive.js'
export default {
  data () {
    return {
      dialogVisible: false,
      couponInput: '',
      dialogData: [],
      data: '',
      loading: false,
      isSingleElection: false,
      couponTypes: [
        { id: -1, label: '全部' },
        { id: 0, label: '普通优惠券' },
        { id: 1, label: '分裂优惠券' }
      ],
      statusList: [
        { id: -1, label: '全部' },
        { id: 0, label: '进行中' },
        { id: 1, label: '未开始' }
      ],
      couponType: '',
      couponStatus: -1,
      invalidCoupon: [] // 失效的优惠券的id
    }
  },
  props: ['origin', 'singleElection', 'tuneUpCoupon', 'couponBack', 'type', 'formDecType'],
  mounted () {
    // 初始化
    this.defaultData()
  },
  watch: {
    tuneUpCoupon () {
      this.dialogVisible = true
    },
    couponBack: {
      handler (newData) {
        console.log(newData)
        this.data = newData
        if (this.type || this.type === 0) {
          this.couponType = this.type
        }
        if (newData) {
          this.initCouponList(newData)
        }
      },
      immediate: true
    }
  },
  methods: {

    defaultData () {
      console.log(this.singleElection)
      if (this.singleElection) {
        this.isSingleElection = this.singleElection
      }
    },
    initCouponList (data) {
      this.loading = true
      let param = {
        'actName': this.couponInput,
        'status': this.couponStatus
      }
      if (this.type !== undefined && this.type !== '') {
        param.type = this.couponType
      } else {
        param.type = -1
      }
      getCouponSelectComponentData(param).then((res) => {
        if (res.error === 0) {
          console.log('dialogData: ', res.content)
          this.dialogData = res.content

          this.dialogData.map((item, index) => {
            this.$set(item, 'ischeck', false)
          })
          console.log(data, this.formDecType)
          this.dialogData.forEach((item, index) => {
            item.ischeck = false
            item.isHidden = false
            data.forEach((itemC, indexC) => {
              if (item.id === itemC) {
                item.ischeck = true
                if (this.formDecType) { // 表单装修需要
                  item.isHidden = true
                }
              }
            })
          })
          this.invalidCoupon = []
          data.forEach((id, i) => {
            let n = 0
            this.dialogData.forEach((item, j) => {
              if (item.id !== id) {
                n++
                if (n >= this.dialogData.length) {
                  this.invalidCoupon.push(id)
                }
              }
            })
          })
        }
      })
      this.loading = false
    },
    // 优惠券选中
    handleToClick (index) {
      if (this.singleElection) {
        this.dialogData.forEach(item => {
          item.ischeck = false
        })
        this.dialogData[index].ischeck = !this.dialogData[index].ischeck
      } else {
        this.dialogData[index].ischeck = !this.dialogData[index].ischeck
      }
    },
    // 弹窗确定事件
    handleToSure () {
      let arr = []
      console.log(this.data)
      let invalidLen = this.invalidCoupon.length
      this.dialogData.forEach((item, index) => {
        if (item.ischeck) arr.push(item)
      })
      console.log(arr, this.couponBack)
      // if (this.formDecType) {
      //   let length = arr.length + this.couponBack.length
      //   console.log(length)
      //   if (length > 5) {
      //     this.$message.error('最多只能选择5张优惠券哦~')
      //     return
      //   }
      // }
      if (arr.length > (5 - invalidLen) && !this.origin) {
        this.$message.error('最多只能选择' + (5 - invalidLen) + '张优惠券哦~')
        return
      }
      if (arr.length > (10 - invalidLen) && this.origin === 'couponPackage') {
        this.$message.error('最多只能选择' + (10 - invalidLen) + '种优惠券哦~')
        return
      }
      if (arr.length > (6 - invalidLen) && this.origin === 'decCouponPackage') {
        this.$message.error('最多只能选择' + (6 - invalidLen) + '种优惠券哦~')
        return
      }
      this.$emit('handleToCheck', arr)
      this.$emit('checkReturnFormat', this.formatCoupon(arr))
      this.dialogVisible = false
    },

    // 数据格式化
    formatCoupon (data) {
      let couponArr = []
      let couponData = {
        immediatelyGrantAmount: 0,
        timingEvery: 0,
        timingAmount: 0,
        timingTime: '1',
        timingUnit: '0'
      }
      data.map(item => {
        couponArr.push(Object.assign({}, item, { send_num: '', coupon_set: couponData }))
      })
      return couponArr
    },
    couponTypeChaneg (val) {
      // this.couponType = val
      this.initCouponList(this.data)
    },
    addCouponHandle () {
      this.$router.push({
        name: 'add_coupon'
      })
    }
  }
}
</script>
<style lang="scss" scoped>
.couponDialog {
  /deep/ .el-dialog__header {
    text-align: center;
    background: #f3f3f3;
  }
  /deep/ .el-dialog__body {
    padding: 20px 20px;
  }
  .couponDialogDIiv {
    height: 300px;
    overflow-y: auto;
    .couponTop {
      display: flex;
      justify-content: space-between;
      .top_leftDiv {
        display: flex;
        .inputWidth {
          width: 170px;
          margin-right: 10px;
        }
      }
      span {
        width: 60px;
        height: 32px;
        line-height: 32px;
        display: block;
        color: #5a8bff;
        cursor: pointer;
        i {
          display: inline-block;
          width: 20px;
          height: 32px;
          line-height: 32px;
          font-size: 18px;
        }
      }
    }
    .couponListDiv {
      padding-top: 10px;
      .couponLi {
        float: left;
        // width: 108px;
        text-align: center;
        // margin-right: 10px;
        margin-bottom: 53px;
        cursor: pointer;
        position: relative;
        img {
          position: absolute;
          top: -5px;
          right: 4px;
        }
        img.coupon-add-icon {
          position: absolute;
          top: 25px;
          left: 50%;
          transform: translateX(-50%);
        }
        .coupon_list_top {
          padding-top: 10px;
          color: #f66;
          font-size: 14px;
          border: 1px solid #fbb;
          border-top-left-radius: 5px;
          border-top-right-radius: 5px;
          border-bottom: none;
          span {
            font-size: 20px;
            font-weight: bold;
            display: inline-block;
          }
        }
        .coupon_list_center {
          height: 40px;
          color: #f66;
          font-size: 12px;
          border-left: 1px solid #fbb;
          border-right: 1px solid #fbb;
          .coupon_center_limit {
            padding: 5px 0;
          }
          .coupon_center_number {
            color: #fbb;
            margin-bottom: 5px;
          }
        }
        .coupon_list_bottom {
          background-color: #f66;
          font-size: 12px;
          -webkit-background-size: 12px;
          background-size: 12px;
          height: 24px;
          line-height: 30px;
          color: #fff;
          border-left: 1px solid #fbb;
          border-right: 1px solid #fbb;
          border-bottom-left-radius: 5px;
          border-bottom-right-radius: 5px;
          background-repeat: repeat-x;
          margin-left: -1px;
          width: 102%;
        }
        .coupon_name {
          font-size: 14px;
          line-height: 30px;
          border: 1px solid #fff;
          margin: 0 -1px -1px -1px;
          text-overflow: ellipsis;
          white-space: nowrap;
          overflow: hidden;
          color: #333;
          width: 110px;
        }
      }
    }
  }
  .coupon-add {
    width: 108px;
    height: 100px;
    color: rgb(153, 153, 153);
    font-size: 12px;
    text-align: center;
    border-width: 1px;
    border-style: solid;
    border-color: rgb(204, 204, 204);
    border-image: initial;
    position: relative;
    cursor: pointer;
    .coupon-add-tip {
      display: inline-block;
      margin-top: 60px;
    }
  }
}
</style>

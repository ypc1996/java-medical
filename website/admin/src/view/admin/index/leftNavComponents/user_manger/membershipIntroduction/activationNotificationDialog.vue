<template>
  <!-- 激活通知 -->
  <div>
    <el-dialog
      :title="$t('activationNotificationDialog.setActivationNotify')"
      :visible.sync="dialogVisible"
      width="750"
      :center="true"
    >
      <div class="activation-notification-dialog">
        <div class="top">
          <p class="top-title">{{$t('activationNotificationDialog.explanation')}}</p>
          <ol>
            <li>{{$t('activationNotificationDialog.explanation1')}}</li>
            <li>{{$t('activationNotificationDialog.explanation2')}}</li>
            <li>{{$t('activationNotificationDialog.explanation3')}}</li>
          </ol>
        </div>
        <el-form
          class="an-form"
          ref="anForm"
          :model="form"
          :rules="formRules"
          label-width="100px"
          size="small"
        >
          <el-form-item
            :label="$t('activationNotificationDialog.activationInst')+'：'"
            prop="explain"
          >
            <el-input
              class="an-textarea"
              type="textarea"
              :placeholder="$t('activationNotificationDialog.activationInst')"
              :rows="3"
              v-model="form.explain"
            ></el-input>
            <el-popover
              placement="right"
              width="240px"
              trigger="hover"
            >
              <div class="popover-img">
                <el-image
                  :preview-src-list="srcList"
                  :src="$imageHost + '/image/admin/new_preview_image/user_vip.jpg'"
                ></el-image>
              </div>
              <el-button
                slot="reference"
                type="text"
                class="text-btn"
              >{{$t('activationNotificationDialog.viewExample')}}</el-button>
            </el-popover>
          </el-form-item>
          <el-form-item :label="$t('activationNotificationDialog.acivationReward')">
            <div>
              <el-checkbox
                v-model="scoreCheck"
                :checked="scoreCheck"
              >{{$t('activationNotificationDialog.integral')}}</el-checkbox>
              <el-input-number
                v-model="form.score"
                controls-position="right"
                :min="0"
              ></el-input-number>
            </div>
            <div>
              <el-checkbox v-model="form.coupon">{{$t('activationNotificationDialog.coupon')}}</el-checkbox>
              <div class="coupon-wrap">
                <div class="coupons">
                  <div
                    class="coupon"
                    v-for="(coupon,index) in coupons"
                    :class="{'coupon-invalid': coupon.status != 0}"
                    :key="index"
                  >
                    <div class="coupon-info">
                      <img
                        class="coupon-close"
                        @click="deleteCouponHandle(index)"
                        :src="$imageHost+ '/image/admin/sign_del.png'"
                        alt="x"
                      >
                      <div class="coupon-top">
                        <div
                          class="ca-value"
                          v-if="coupon.actCode=='discount'"
                        ><span>{{coupon.denomination}}</span>{{$t('openScreenAdd.fold')}}</div>
                        <div
                          class="ca-value"
                          v-else-if="coupon.actCode=='random'"
                        >
                          ￥<span>{{coupon.randomMax}}</span><span class="coupon-highest">{{$t('openScreenAdd.highest')}}</span>
                        </div>
                        <h3
                          class="ca-value"
                          v-else
                        >￥<span>{{coupon.denomination}}</span></h3>
                      </div>
                      <div class="coupon-center">
                        <!-- 是否限制使用方式 -->
                        <p v-if="coupon.useConsumeRestrict == 0">{{$t('openScreenAdd.noThreshold')}}</p>
                        <p v-else>{{$t('openScreenAdd.full')}}{{coupon.leastConsume}}{{$t('openScreenAdd.use')}}</p>
                        <!-- 是否限制库存 -->
                        <p
                          class="ca-stock-limit"
                          v-if="coupon.limitSurplusFlag == 0"
                        >{{$t('openScreenAdd.remaining')}}{{coupon.surplus}}{{$t('openScreenAdd.sheet')}}</p>
                        <p
                          v-else
                          class="ca-stock-limit"
                        >{{$t('openScreenAdd.unlimited')}}</p>
                      </div>
                      <div
                        class="coupon-bottom"
                        :style="'background-image:url('+$imageHost+'/image/admin/coupon_border.png)'"
                      >{{$t('activationNotificationDialog.reseive')}}</div>
                    </div>
                    <p class="coupon-name">{{coupon.actName}}</p>
                  </div>

                  <div
                    class="coupon-add"
                    @click="addCouponDialogVisible = !addCouponDialogVisible"
                  >
                    <img
                      :src="$imageHost + '/image/admin/shop_beautify/add_decorete.png'"
                      alt="+"
                    >
                    <p>{{$t('activationNotificationDialog.addCoupon')}}</p>
                  </div>
                </div>
                <p class="coupon-tips">{{$t('activationNotificationDialog.addUplimit')}}</p>
              </div>
            </div>
          </el-form-item>
        </el-form>
        <div
          slot="footer"
          class="dialog-footer"
        >
          <el-button
            type="primary"
            size="small"
            @click="saveActivationNotification"
          >{{$t('activationNotificationDialog.save')}}</el-button>
        </div>
      </div>
    </el-dialog>
    <addCouponDialog
      :type="-1"
      :tuneUpCoupon="!addCouponDialogVisible"
      :couponBack="form.couponIds"
      @handleToCheck="handleToCheck"
    ></addCouponDialog>
  </div>
</template>

<script>
import { getnoticeApi, setnoticeApi } from '@/api/admin/memberManage/membershipIntroduction.js'
export default {
  components: {
    addCouponDialog: () => import('@/components/admin/addCouponDialog')
  },
  props: {
    visible: {
      type: Boolean,
      default: false
    }
  },
  data () {
    let that = this
    return {
      form: {
        score: '',
        coupon: false,
        explain: that.$t('activationNotificationDialog.thank'),
        couponIds: []
      },
      srcList: [
        this.$imageHost + '/image/admin/new_preview_image/user_vip.jpg'
      ],
      coupons: [], // 选择的优惠券
      addCouponDialogVisible: false,
      formRules: {
        explain: { required: true, message: that.$t('activationNotificationDialog.pfActivationInst'), trigger: 'blur' }
      }
    }
  },
  computed: {
    dialogVisible: {
      get () {
        console.log('get', this.visible)
        if (this.visible) {
          this.initData()
        }
        return this.visible
      },
      set (val) {
        console.log('set', val)
        this.$emit('update:visible', val)
      }
    },
    scoreCheck: {
      get () {
        if (this.form.score !== '' && this.form.score > 0) {
          return true
        } else {
          return false
        }
      },
      set (val) {
        console.log(val)
        if (val === false) {
          this.$set(this.form, 'score', '')
        } else {
          this.$set(this.form, 'score', 1)
        }
      }
    }
  },
  methods: {
    initData () {
      getnoticeApi().then(res => {
        if (res.error === 0) {
          let mrkingVoucherId = res.content.mrkingVoucherId.split(',')
          if (mrkingVoucherId.length > 0 && mrkingVoucherId[0] !== '') {
            this.form.coupon = true
            this.form.couponIds = mrkingVoucherId.map(Number)
            this.coupons = res.content.mrkingVoucherList
          } else {
            this.form.coupon = false
            this.form.couponIds = []
            this.coupons = []
          }
          this.form = Object.assign({}, this.form, res.content)
        }
      })
    },
    handleToCheck (coupons) {
      if (coupons && coupons.length > 0) {
        this.coupons = coupons
        let couponBackList = coupons.map(item => item.id) || []
        this.$set(this.form, 'couponIds', couponBackList)
      }
    },
    deleteCouponHandle (index) {
      let coupons = this.coupons
      coupons.splice(index, 1)
      this.coupons = coupons
      let couponBackList = coupons.map(item => item.id) || []
      this.$set(this.form, 'couponIds', couponBackList)
    },
    // 设置激活通知
    saveActivationNotification () {
      let that = this
      if (!that.form.coupon) {
        that.form.couponIds = []
      }
      let params = Object.assign({}, that.form)
      setnoticeApi(params).then(res => {
        if (res.error === 0) {
          console.log(res.content)
          that.$message.success(that.$t('activationNotificationDialog.successSetting'))
          that.dialogVisible = false
        } else {
          that.$message.error(res.message)
        }
      })
    }
  }
}
</script>

<style lang="scss" scoped>
.activation-notification-dialog {
  .top {
    padding: 16px;
    background-color: #f5f5f5;
    display: flex;
    line-height: 20px;
    .top-title {
      width: 42px;
    }
    ol {
      flex: 1;
    }
  }
  .an-form {
    margin-top: 15px;
  }
  textarea {
    font-family: inherit;
  }
}
.popover-img {
  padding: 20px;
  cursor: pointer;
  .el-image {
    width: 200px;
  }
}
.text-btn {
  color: #5a8bff;
}
.coupon-wrap {
  background-color: #f5f5f5;
  margin-left: 16px;
  padding: 16px;
  margin-top: 10px;
  border-radius: 6px;
  .coupons {
    display: flex;
    flex-wrap: wrap;
    .coupon {
      margin-right: 20px;
      text-align: center;
      &.coupon-invalid {
        .coupon-info {
          color: #d5d7d9;
          border: 1px solid #d5d7d9;
          .ca-value {
            color: #d5d7d9;
          }
          .coupon-center p {
            color: #d5d7d9;
          }
          .coupon-bottom {
            background-color: #d5d7d9;
          }
        }
      }
      .coupon-info {
        position: relative;
        width: 100px;
        border: 1px solid #fbb;
        border-radius: 10px;
        line-height: 1;
        .coupon-close {
          position: absolute;
          top: -5px;
          right: -5px;
          width: 16px;
          height: 16px;
          cursor: pointer;
        }
        .coupon-top {
          margin-top: 10px;
          color: #f66;
          font-size: 14px;
        }
        .coupon-center {
          height: 40px;
          line-height: 16px;
          color: #f66;
          font-size: 12px;
        }
        .coupon-highest {
          font-weight: bold;
          font-size: 10px !important;
        }
        .ca-value {
          margin-top: 10px;
          font-size: 14px;
          span {
            font-size: 20px;
            font-weight: bold;
          }
        }
        .ca-stock-limit {
          height: 20px;
          color: #fbb;
        }
        .coupon-bottom {
          font-size: 12px;
          background-size: 12px;
          height: 24px;
          line-height: 30px;
          color: #fff;
          background-color: #f66;
          background-repeat: repeat-x;
          background-position: top;
          border-bottom-right-radius: 6px;
          border-bottom-left-radius: 6px;
        }
      }
      .coupon-name {
        width: 100px;
        overflow: hidden;
        white-space: nowrap;
        text-overflow: ellipsis;
      }
    }
    .coupon-add {
      background: #fff;
      border: 1px solid #e4e4e4;
      text-align: center;
      padding: 13px 0;
      cursor: pointer;
      float: none;
      width: 100px;
      height: 98px;
      img {
        margin-top: 14px;
        width: 20px;
        height: 20px;
      }
      p {
        color: #999;
        font-size: 12px;
        margin: 8px 0 0 0;
        line-height: 1;
      }
    }
    .coupon-tips {
      color: #bbb;
    }
  }
}
.dialog-footer {
  text-align: center;
}
</style>

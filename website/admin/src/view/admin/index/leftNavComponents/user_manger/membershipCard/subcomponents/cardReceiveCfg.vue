<template>
  <div class="card-receive-div">
    <el-form
      :model="ruleForm"
      ref="ruleForm"
      :rules="rules"
      label-width="100px"
      :inline-message="true"
    >

      <el-form-item
        :label="$t('memberCard.isNeedtoBuy')"
        class="receive-item"
        :rules="[{required: true}]"
      >
        <div class="receive-top">
          <el-radio
            v-model="ruleForm.isPay"
            label="0"
          >
            {{ $t('memberCard.receiveDirect') }}
          </el-radio>
          <el-radio
            v-model="ruleForm.isPay"
            label="1"
          >{{ $t('memberCard.needBuy') }}</el-radio>
          <el-radio
            v-model="ruleForm.isPay"
            label="2"
          >{{ $t('memberCard.needReceiveCode') }}</el-radio>
        </div>
        <div class="receive-bottom"  v-if="ruleForm.isPay!=='0'|| ruleForm.cardType===1">
          <div
            v-if="ruleForm.isPay==='1'"
            class="receive-buy"
          >
          <el-form
              :model="ruleForm"
              :rules="rules"
              ref="ruleFormm"
              label-width="100px"
            >
            <el-form-item style="margin-left: -100px;" prop="payMoney">
            <div>
              <el-radio
                v-model="ruleForm.payType"
                label='0'
              >
                {{ $t('memberCard.crashBuy') }}
              </el-radio>
              <el-input-number
                :controls="false"
                :precision="2"
                :min="0"
                :max="999999999"
                v-model="ruleForm.payMoney"
                :placeholder="$t('memberCard.pleaseInput')"
                size="small"
              >
              </el-input-number>
              <span>{{ $t('memberCard.yuan') }}</span>
              <span v-if="payMoneyError" class="valid-check">{{$t('memberCard.inputMoney')}}</span>
            </div>
            </el-form-item>
            <el-form-item style="margin-left: -100px;" prop="payScore">
            <div>
              <el-radio
                v-model="ruleForm.payType"
                label='1'
              >
                {{ $t('memberCard.scoreBuy') }}
              </el-radio>
              <el-input-number
                :controls="false"
                :min="0"
                :max="999999999"
                v-model="ruleForm.payScore"
                :placeholder="$t('memberCard.pleaseInput')"
                size="small"
              >
              </el-input-number>
              <span>{{ $t('memberCard.unitM') }}</span>
              <span v-if="payScoreError" class="valid-check">{{$t('memberCard.inputScore')}}</span>
            </div>
            </el-form-item>
          </el-form>
          </div>
          <div
            v-if="ruleForm.isPay==='2'"
            class="receive-code"
          >
          <span class="receiveCodeError" v-if="receiveCodeError">{{$t('memberCard.leastCodeTip')}}</span>
            <div class="receive-code-one">

              <el-radio
                v-model="ruleForm.receiveAction"
                label="1"
              >
                {{ $t('memberCard.receiveCodeSetting') }}
              </el-radio>

              <div v-if="ruleForm.receiveAction==='1'">
                <div
                  v-for="(item,index) in ruleForm.codeAddDivArr"
                  :key="index"
                >
                  <div>
                    <span>{{ $t('memberCard.batchOne') }} {{index+1}}</span>
                    <span>{{ $t('memberCard.batchName') }}</span>
                    <el-input
                      v-model="item.batchName"
                      size="small"
                      :disabled="item.disabled"
                    ></el-input>
                    <span
                      v-for="(codeItem,codeIndex) in codeArr"
                      :key="codeIndex"
                      @click="handleCallCodeDialog(index,codeIndex)"
                    >{{codeItem}}</span>
                  </div>
                </div>
              </div>
            </div>
            <div class="receive-code-two">

              <el-radio
                v-model="ruleForm.receiveAction"
                label="2"
              >
                {{ $t('memberCard.cardPassAndNo') }}
              </el-radio>
              <div v-if="ruleForm.receiveAction==='2'">
                <div
                  v-for="(item,index) in ruleForm.codeAddDivArrBottom"
                  :key="index"
                >
                  <div>
                    <span>{{ $t('memberCard.batchOne') }} {{index+1}} </span>
                    <span>{{ $t('memberCard.batchName') }}</span>
                    <el-input
                      v-model="item.pwdName"
                      size="small"
                      :disabled="item.disabled"
                    ></el-input>
                    <span
                      v-for="(codeItem,codeIndex) in codeArrTwo"
                      :key="codeIndex"
                      @click="handleCallCodeDialogBottom(index,codeIndex)"
                    >{{codeItem}}</span>
                  </div>
                </div>
              </div>
            </div>

          </div>

          <div
            v-if="ruleForm.cardType===1"
            class="limit-card-send"
          >
          <!-- 分割线 -->
            <div
              v-if="ruleForm.isPay !== '0'"
              class="split-line"
            ></div>
            <div class="send-limit">
              <el-form-item class="send-num" prop="stockValid">
                <span>{{$t('memberCard.sendCardTotal')}}</span>
                <el-input-number
                  v-model="ruleForm.stock"
                  :controls="false"
                  :min="0"
                  :max="999999999"
                  size="small"
                >
                </el-input-number>
                <span>{{$t('memberCard.unitZhang')}}</span>
                <span class="send-tip">{{$t('memberCard.limitCardSendCardTip')}}</span>
                <span>{{$t('memberCard.currentReceive')}} {{ruleForm.hasSend}}{{$t('memberCard.unitZhang')}}</span>
              </el-form-item>
              <el-form-item class="person-receive-num" prop="limitValid">
                <span>{{$t('memberCard.personReceive')}}</span>
                <el-input-number
                  v-model="ruleForm.limits"
                  :controls="false"
                  :min="0"
                  :max="999999999"
                  size="small"
                >
                </el-input-number>
                <span>{{$t('memberCard.unitZhang')}}</span>
                <span class="send-tip">{{$t('memberCard.limitCardSendCardTip')}}</span>
              </el-form-item>
            </div>
          </div>
        </div>

      </el-form-item>
    </el-form>
    <!--领取码弹窗-->
    <ReceivingCodeDialog
      :dialogVisible="receiveCodeDialogVisible"
      :batchName="currentBatchName"
      :batchId="currentBatchId"
      :receiveAction="currentReceiveAction"
      :batchIdStr="batchIdStr"
      @generateReceiveCodeId="dealWithReceiveCodeId"
    />
    <receivingCodeRecording
      :turnUp="turnUp"
      :batchId="currentBatchId"
    />
  </div>
</template>
<script>
export default {
  components: {
    ReceivingCodeDialog: () => import('../receivingCodeDialog'),
    receivingCodeRecording: () => import('../receivingCodeRecording')
  },
  props: {
    val: {
      type: Object,
      default: () => {
        return {
          cardType: 1,
          isPay: '2',
          payType: '0',
          payMoney: '',
          payScore: '',
          receiveAction: '2',
          codeAddDivArr: [
            {
              batchName: null,
              batchId: null,
              disabled: false
            }
          ],
          codeAddDivArrBottom: [
            {
              pwdName: null,
              pwdId: null,
              disabled: false
            }
          ]
        }
      }
    }

  },
  computed: {
    ruleForm: {
      get () {
        console.log(this.val)
        return this.val
      },
      set () {
        this.$emit('input', this.ruleForm)
      }
    }
  },
  mounted () {
    this.langDefault()
    this.$on('checkRule', () => {
      let flag = false
      if (this.ruleForm.cardType === 1) {
        this.$refs['ruleForm'].validate((valid) => {
          console.log(valid)

          if (!valid) {
            this.$message.warning(this.$t('memberCard.inputInfomation'))
            this.ruleForm.valid = false
          } else {
            flag = true
          }
        })
      } else {
        flag = true
        console.log(flag)
      }
      if (this.ruleForm.isPay === '1') {
        // check crash
        if (this.ruleForm.payType === '0') {
          if (typeof this.ruleForm.payMoney === 'undefined') {
            this.$message.warning(this.$t('memberCard.inputMoney'))
            this.payMoneyError = true
            this.payScoreError = false
          } else {
            this.payMoneyError = false
            this.payScoreError = false
            this.ruleForm.valid = flag
          }
        } else if (this.ruleForm.payType === '1') {
          if (typeof this.ruleForm.payScore === 'undefined') {
            this.$message.warning(this.$t('memberCard.inputScore'))
            this.payScoreError = true
            this.payMoneyError = false
          } else {
            this.payMoneyError = false
            this.payScoreError = false
            this.ruleForm.valid = flag
          }
        } else {
          this.payMoneyError = false
          this.payScoreError = false

          this.ruleForm.valid = flag
        }
        // check score
      } else if (this.ruleForm.isPay === '2') {
        // 领取码
        if (Number(this.ruleForm.receiveAction) === this.codeReceiveAction) {
          // 领取码
          if (this.ruleForm.codeAddDivArr[0].batchId) {
            this.ruleForm.valid = flag
            this.receiveCodeError = false
          } else {
            this.$message.warning(this.$t('memberCard.leastCodeTip'))
            this.ruleForm.valid = false
            this.receiveCodeError = true
          }
        } else if (Number(this.ruleForm.receiveAction) === this.pwdReceiveAction) {
          // 卡号+密码
          if (this.ruleForm.codeAddDivArrBottom[0].pwdId) {
            this.ruleForm.valid = flag
            this.receiveCodeError = false
          } else {
            this.$message.warning(this.$t('memberCard.leastCodeTip'))
            this.ruleForm.valid = false
            this.receiveCodeError = true
          }
        }
      } else {
        this.ruleForm.valid = flag
      }
    })
  },
  data () {
    let validatePayScore = (rule, value, callback) => {
      if (this.ruleForm.payType === '1') {
        if (this.ruleForm.payScore === undefined) {
          this.payScoreError = true
        } else {
          this.payScoreError = false
          callback()
        }
      }
    }
    let validatePayMoney = (rule, value, callback) => {
      if (this.ruleForm.payType === '0') {
        if (this.ruleForm.payMoney === undefined) {
          this.payMoneyError = true
        } else {
          this.payMoneyError = false
          callback()
        }
      }
    }
    let validateStock = (rule, value, callback) => {
      if (this.ruleForm.stock === 0) {
        callback()
      } else if (this.ruleForm.stock) {
        callback()
      } else {
        this.ruleForm.stock = undefined
        callback(new Error(this.$t('memberCard.sendTotalTip')))
      }
    }

    let validateLimit = (rule, value, callback) => {
      if (this.ruleForm.limits === 0) {
        callback()
      } else if (this.ruleForm.limits) {
        callback()
      } else {
        this.ruleForm.limits = undefined
        callback(new Error(this.$t('memberCard.receiveLimitTip')))
      }
    }
    return {
      receiveCodeDialogVisible: false,
      turnUp: false,
      codeReceiveAction: 1,
      pwdReceiveAction: 2,
      currentIndex: 0,
      currentBatchName: null,
      currentBatchId: null,
      currentReceiveAction: 1,
      codeArr: null,
      codeArrTwo: null,
      payScoreError: false,
      payMoneyError: false,
      receiveCodeError: false,
      batchIdStr: {
        batchIdStr1: [],
        batchIdStr2: []
      },
      rules: {
        payScore: [
          { validator: validatePayScore, trigger: 'blur' }
        ],
        payMoney: [
          { validator: validatePayMoney, trigger: 'blur' }
        ],
        stockValid: [
          { validator: validateStock, trigger: 'blur' }
        ],
        limitValid: [
          { validator: validateLimit, trigger: 'blur' }
        ]
      }
    }
  },
  created () {
    this.codeArr = this.$t('memberCard.codeArr')
    this.codeArrTwo = this.$t('memberCard.codeArrTwo')
  },
  watch: {
    lang () {
      this.codeArr = this.$t('memberCard.codeArr')
    },
    'ruleForm': {
      handler (newName, oldName) {
        this.val = newName
        this.ruleForm = this.val
      },
      deep: true
    },
    'ruleForm.payType': {
      handler (newName, oldName) {
        if (this.ruleForm.payType === '0') {
          this.payScoreError = false
        } else if (this.ruleForm.payType === '1') {
          this.payMoneyError = false
        }
      },
      immediate: true
    }
  },
  methods: {
    handleCallCodeDialogBottom (index, codeIndex) {
      this.currentReceiveAction = this.pwdReceiveAction
      switch (codeIndex) {
        case 0:
          // 卡号+密码
          this.showReceivePwdDiaglog(index)
          break
        case 1:
          this.addPwdBatchName()
          break
        case 2:
          this.deletePwdBatchItem(index)
          break
        case 3:
          // 生成/导入记录
          this.showDetail(index)
          break
      }
    },
    // 添加密码批次
    addPwdBatchName () {
      this.ruleForm.codeAddDivArrBottom.push(
        {
          pwdName: null,
          pwdId: null,
          disabled: false
        }
      )
    },
    // 删除密码批次
    deletePwdBatchItem (index) {
      if (this.ruleForm.codeAddDivArrBottom.length === 1) {
        this.$message.warning(this.$t('memberCard.leastBatch'))
      } else {
        this.ruleForm.codeAddDivArrBottom.splice(index, 1)
      }
    },
    showReceivePwdDiaglog (index) {
      if (!this.ruleForm.codeAddDivArrBottom[index].pwdName) {
        this.$message.warning(this.$t('memberCard.inputBatchName'))
        return
      }
      this.receiveCodeDialogVisible = !this.receiveCodeDialogVisible
      this.currentBatchName = this.ruleForm.codeAddDivArrBottom[index].pwdName
      console.log(this.ruleForm.codeAddDivArrBottom)
      this.currentBatchId = this.ruleForm.codeAddDivArrBottom[index].pwdId
      console.log(this.currentBatchId)
      this.currentReceiveAction = this.pwdReceiveAction
      this.currentIndex = index
    },
    handleCallCodeDialog (index, codeIndex) {
      this.currentReceiveAction = this.codeReceiveAction
      // 领取码
      switch (codeIndex) {
        case 0:
          // 领取码
          this.showReceiveCodeDiaglog(index)
          break
        case 1:
          // 添加批次
          this.addBatchItem()
          break
        case 2:
          // 删除批次
          this.deleteBatchItem(index)
          break
        case 3:
          // 生成/导入记录
          this.showDetail(index)
          break
      }
    },

    showReceiveCodeDiaglog (index) {
      if (!this.ruleForm.codeAddDivArr[index].batchName) {
        this.$message.warning(this.$t('memberCard.inputBatchName'))
        return
      }
      this.receiveCodeDialogVisible = !this.receiveCodeDialogVisible
      this.currentBatchName = this.ruleForm.codeAddDivArr[index].batchName
      this.currentBatchId = this.ruleForm.codeAddDivArr[index].batchId
      this.currentReceiveAction = this.codeReceiveAction
      this.currentIndex = index
    },
    // 添加批次
    addBatchItem () {
      this.ruleForm.codeAddDivArr.push(
        {
          batchName: null,
          batchId: null,
          disabled: false
        }
      )
    },
    // 删除批次
    deleteBatchItem (index) {
      if (this.ruleForm.codeAddDivArr.length === 1) {
        this.$message.warning(this.$t('memberCard.leastBatch'))
      } else {
        this.ruleForm.codeAddDivArr.splice(index, 1)
      }
    },
    dealWithReceiveCodeId (id) {
      console.log(id)
      if (this.currentReceiveAction === this.pwdReceiveAction) {
        // 卡号+密码
        this.batchIdStr.batchIdStr2.push(id)
        console.log('this.batchIdStr.batchIdStr2:' + this.batchIdStr.batchIdStr2)
        this.ruleForm.codeAddDivArrBottom[this.currentIndex].pwdId = id
        this.ruleForm.codeAddDivArrBottom[this.currentIndex].disabled = true
        this.receiveCodeError = false
      } else if (this.currentReceiveAction === this.codeReceiveAction) {
        this.batchIdStr.batchIdStr1.push(id)
        console.log('this.batchIdStr.batchIdStr1:' + this.batchIdStr.batchIdStr2)
        this.ruleForm.codeAddDivArr[this.currentIndex].batchId = id
        this.ruleForm.codeAddDivArr[this.currentIndex].disabled = true
        this.receiveCodeError = false
      }
      this.showDetail(this.currentIndex)
    },
    showDetail (index) {
      console.log('index:' + index)
      let currentBatchId = null
      console.log(this.currentReceiveAction)

      if (this.currentReceiveAction === this.pwdReceiveAction) {
        console.log(this.currentIndex)
        console.log(this.ruleForm.codeAddDivArrBottom)
        currentBatchId = this.ruleForm.codeAddDivArrBottom[this.currentIndex].pwdId
      } else if (this.currentReceiveAction === this.codeReceiveAction) {
        console.log(this.ruleForm.codeAddDivArr)
        currentBatchId = this.ruleForm.codeAddDivArr[index].batchId
      }
      if (currentBatchId !== null) {
        this.currentBatchId = currentBatchId
        this.turnUp = !this.turnUp
        console.log('currentBatchId:' + this.currentBatchId)
      } else {
        this.$message.warning(this.$t('memberCard.noData'))
      }
    }
  }
}
</script>
<style scoped lang="scss">
*,/deep/ .el-form-item__label,
/deep/ .el-radio__label,
/deep/ .el-checkbox__label{
  font-size: 13px;
}
.card-receive-div {
  .receive-item {
    padding-left: 80px;
    /deep/ .el-form-item__label {
      width: 122px !important;
    }
    .receive-top {
    }
    .receive-bottom {
      width: 100%;
      padding: 0px 20px;
      background-color: #fff;
      border: 1px solid #ddd;
      margin: 20px 0 0 -100px;
      border-radius: 4px;
      .receive-buy {
        padding: 5px 0px;
        .valid-check{
          color: #F56C6C;
          font-size: 12px;
        }
      }

      .receive-code {
        .receiveCodeError{
          padding: 5px 20px;
          color: #F56C6C;
          font-size: 12px;
        }
        .receive-code-one {
          padding: 5px 0px;
          display: flex;
          /deep/ .el-radio__label {
            height: 41px;
            line-height: 41px;
          }
          /deep/ .el-input {
            width: 60px;
            margin-right: 10px;
          }
          span {
            display: inline-block;
            margin-right: 8px;
            &:nth-of-type(3),
            &:nth-of-type(4),
            &:nth-of-type(5),
            &:nth-of-type(6) {
              color: #5a83f9;
              cursor: pointer;
            }
          }
        }
        .receive-code-two {
          padding: 5px 0px;
          display: flex;
          /deep/ .el-radio__label {
            height: 41px;
            line-height: 41px;
          }
          /deep/ .el-input {
            width: 60px;
            margin-right: 10px;
          }
          span {
            display: inline-block;
            margin-right: 8px;
            &:nth-of-type(3),
            &:nth-of-type(4),
            &:nth-of-type(5),
            &:nth-of-type(6) {
              color: #5a83f9;
              cursor: pointer;
            }
          }
        }
      }
      .limit-card-send {
        .split-line {
          border-bottom: 1px solid #e6e6e6;
        }
        .send-limit {
          margin-top: 10px;
          margin-left: 20px;
          .send-num {
            span {
              &:nth-of-type(1),
              &:nth-of-type(2),
              &:nth-of-type(3) {
                margin-right: 10px;
              }
              &:nth-of-type(3) {
                color: #999;
              }
              &:nth-of-type(4) {
                color: #ff6666;
                font-size: 13px;
              }
            }
            /deep/ .el-input {
              width: 90%;
            }
          }
          .person-receive-num {
            margin-bottom: 10px;
            span {
              &:nth-of-type(1),
              &:nth-of-type(2) {
                margin-right: 10px;
              }
              &:nth-of-type(3) {
                color: #999;
              }
            }
            /deep/ .el-input {
              width: 90%;
            }
          }
        }
      }
    }
  }
}
</style>

<template>
  <div class="card-store-div">
    <el-form
      :model="ruleForm"
      ref="ruleForm"
      label-width="100px"
      @submit.native.prevent
    >
      <el-form-item
        class="card-store-item"
        :label="$t('memberCard.usingStore')"
      >
        <div class="store-top">
          <el-radio
            v-model="ruleForm.storeListType"
            label="0"
          >
            {{ $t('memberCard.allStores') }}
          </el-radio>
          <el-radio
            v-model="ruleForm.storeListType"
            label="1"
          >{{ $t('memberCard.partStores') }}</el-radio>
          <el-radio
            v-model="ruleForm.storeListType"
            label="-1"
          >{{ $t('memberCard.banStore') }}</el-radio>
        </div>
        <div class="store-tip">
          {{ $t('memberCard.storeConfig') }}
        </div>
        <div class="store-bottom">
          <div v-if="ruleForm.storeListType === '1'">
            <div
              v-if="ruleForm.choosedStore.length"
              class="store-table"
            >
              <el-table
                class="version-manage-table"
                header-row-class-name="table-class"
                :data="ruleForm.choosedStore"
                border
                style="width: 40%"
              >
                <el-table-column
                  :label="$t('memberCard.storeName')"
                  prop="storeName"
                  align="center"
                >
                </el-table-column>
                <el-table-column
                  :label="$t('memberCard.options')"
                  align="center"
                >
                  <template slot-scope="scope">
                    <span
                      @click="deleteCurrentStore(scope)"
                      class="store-delete"
                    >
                      {{ $t('memberCard.delete') }}
                    </span>
                  </template>
                </el-table-column>
              </el-table>
            </div>
            <div
              class="store-add"
              @click="callChooseStoreDialog()"
            >
              <img :src="$imageHost+'/image/admin/icon_jia.png'">
              <span>{{ $t('memberCard.addStore') }}</span>
            </div>
          </div>
        </div>
        <div
          v-if="ruleForm.cardType===1 && ruleForm.storeListType !== '-1'"
          class="limit-card"
        >
          <div class="use-time">
            <span>{{$t('memberCard.allowUseTime')}}</span>
            <el-checkbox v-model="workdayChecked">{{$t('memberCard.workDay')}} </el-checkbox>
            <el-checkbox v-model="weekendChecked">{{$t('memberCard.breakDay')}} </el-checkbox>
            <span
              class="suite-times"
              v-if="timeValid"
            >{{$t('memberCard.timeTip')}}</span>
          </div>
          <div class="use-num">
            <span>{{$t('memberCard.allowUse')}}</span>
            <el-input-number
              v-model="ruleForm.count"
              size="small"
              :controls="false"
              :min="0"
              :max="999999999"
            >
            </el-input-number>
            <span>{{$t('memberCard.times')}}</span>
            <span
              class="suite-times"
              v-if="countValid"
            >{{$t('memberCard.storeUseTimes')}}</span>
          </div>
        </div>
      </el-form-item>
    </el-form>
    <!--添加门店弹窗-->
    <ChioseStoreDialog
      :tuneUpChooseStore="chooseStoreDialogVisiable"
      :storeBackData="ruleForm.choosedStore"
      @getChoosedStore="dealWithChooseStore"
    />
  </div>
</template>
<script>
export default {
  components: {
    ChioseStoreDialog: () => import('../chioseStoreDialog')
  },
  props: {
    val: {
      type: Object,
      require: true
    }
  },
  computed: {
    ruleForm: {
      get () {
        this.initUseTime(this.val.useTime)
        return this.val
      },
      set () {
        this.$emit('input', this.ruleForm)
      }
    }
  },
  watch: {
    'ruleForm': {
      handler (newName, oldName) {
        this.val = newName
        this.ruleForm = this.val
      },
      deep: true
    },
    'ruleForm.count': {
      handler (newName, oldName) {
        if (this.countValid) {
          if (typeof this.ruleForm.count === 'number') {
            this.countValid = false
          }
        }
      },
      immediate: true
    },
    weekendChecked () {
      if (this.weekendChecked) {
        this.timeValid = false
      }
      let useTime = this.calcUseTime()
      this.ruleForm.useTime = useTime
    },
    workdayChecked () {
      if (this.workdayChecked) {
        this.timeValid = false
      }
      let useTime = this.calcUseTime()
      this.ruleForm.useTime = useTime
    }
  },
  mounted () {
    this.langDefault()
    this.$on('checkRule', () => {
      console.log(typeof this.ruleForm.count)
      // 使用时间检测
      if (this.bothFalse) {
        this.$message.warning(this.$t('memberCard.timeTip'))
        this.ruleForm.valid = false
        this.timeValid = true
        return
      } else {
        this.ruleForm.valid = true
        this.timeValid = false
      }
      // 适用次数检测
      console.log(typeof this.ruleForm.storeListType, this.ruleForm.storeListType)
      if (this.ruleForm.storeListType !== '-1') {
        if (typeof this.ruleForm.count === 'number') {
          this.ruleForm.valid = true
          this.countValid = false
        } else {
          this.$message.warning(this.$t('memberCard.storeUseTimes'))
          this.ruleForm.valid = false
          this.countValid = true
        }
      } else {
        this.ruleForm.valid = true
      }
    })
  },
  data () {
    return {
      chooseStoreDialogVisiable: false,
      workdayChecked: true,
      weekendChecked: false,
      countValid: false,
      bothFalse: false,
      timeValid: false
    }
  },
  methods: {
    initUseTime (useTime) {
      if (useTime === '0') {
        if (this.bothFalse) {
          this.initWorkDayAndWeekend(false, false)
        } else {
          this.initWorkDayAndWeekend(true, true)
        }
      } else if (useTime === '1') {
        this.initWorkDayAndWeekend(true, false)
      } else if (useTime === '2') {
        this.initWorkDayAndWeekend(false, true)
      } else {
        this.initWorkDayAndWeekend(true, true)
      }
    },
    initWorkDayAndWeekend (workday, weekend) {
      this.workdayChecked = workday
      this.weekendChecked = weekend
    },
    calcUseTime () {
      if (this.workdayChecked && this.weekendChecked) {
        this.bothFalse = false
        return '0'
      } else if (this.workdayChecked) {
        this.bothFalse = false
        return '1'
      } else if (this.weekendChecked) {
        this.bothFalse = false
        return '2'
      } else {
        this.bothFalse = true
        return '0'
      }
    },
    callChooseStoreDialog () {
      this.chooseStoreDialogVisiable = !this.chooseStoreDialogVisiable
      console.log(this.ruleForm.choosedStore)
    },
    dealWithChooseStore (data) {
      this.ruleForm.choosedStore = data.map(({ storeId, storeName }) => {
        return { storeId, storeName }
      })
      console.log('门店id', this.ruleForm.choosedStore)
    },
    deleteCurrentStore (row) {
      console.log(row.$index)
      let { $index } = row
      this.ruleForm.choosedStore.splice($index, 1)
      console.log(this.ruleForm.choosedStore)
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
.card-store-div {
  .card-store-item {
    padding-left: 75px;
    .store-tip {
      color: #9d9d9d;
      font-size: 13px;
    }
    .store-bottom {
      .store-table {
        /deep/ .table-class {
          th {
            padding: 0 !important;
            background-color: #f8f8f8;
            color: #333;
          }
        }
        .store-delete {
          color: #5a8bff;
          cursor: pointer;
        }
      }
      .store-add {
        margin-top: 10px;
        color: #5a8bff;
        width: 120px;
        text-align: center;
        border: 1px solid #ccc;
        background: #fff;
        cursor: pointer;
        height: 30px;
        line-height: 30px;
        padding-left: 5px;
        display: inline-block;
      }
    }
    .limit-card {
      .use-time {
        span {
          margin-right: 20px;
        }
        .suite-times {
          color: #f56c6c;
          font-size: 12px;
        }
      }
      .use-num {
        span {
          margin-right: 20px;
        }
        /deep/ .el-input {
          width: 90%;
        }

        .suite-times {
          color: #f56c6c;
          font-size: 12px;
        }
      }
    }
  }
}
</style>

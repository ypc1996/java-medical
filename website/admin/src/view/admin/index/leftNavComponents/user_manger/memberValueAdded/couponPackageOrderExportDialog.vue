
<template>
  <el-dialog
    :title="$t('orderCommon.tip')"
    :visible.sync="showNodes"
    custom-class="custom"
    width="30%"
    v-loading="loading"
    center
  >
    <p>{{$t('order.orderExportConfirmTip_1')}}{{totalRows}}{{$t('order.orderExportConfirmTip_2')}}</p>
    <div style="margin-top: 10px;">
      {{$t('order.filterCondition')}}
    </div>
    <div
      v-for="(item,key,index) in param"
      :key="index"
      style="margin-top: 10px;"
    >
      <div v-if="ok(key,item)">
        <div style="margin-top: 10px;">{{$t('couponPackageOrder.'+key)}}:{{item==='wxpay'?'微信':item==='balance'?'余额':item==='score'?'积分':item}}</div>

      </div>
    </div>

    <span
      slot="footer"
      class="dialog-footer"
    >
      <el-button
        @click="showNodes = false"
        size="small"
      >{{$t('orderCommon.cancel')}}</el-button>
      <el-button
        type="primary"
        @click="confirm"
        size="small"
      >{{$t('orderCommon.ok')}}</el-button>
    </span>
  </el-dialog>
</template>

<script>
import { download } from '@/util/excelUtil.js'
import { getCouponPackageOrderExportTotalRows, exportCouponPackageOrder } from '@/api/admin/orderManage/virtualGoodsOrder.js'
export default {
  data () {
    return {
      totalRows: 0,
      showNodes: false,
      loading: false
    }
  },
  props: {
    show: Boolean,
    param: Object // 用于展示已经选择的条件
  },
  methods: {
    initData () {
      console.log(this.param, 'get params')
      getCouponPackageOrderExportTotalRows(this.param).then(res => {
        if (res.error === 0) {
          this.totalRows = res.content
        }
      }).catch(() => {
      })
    },
    closeDialog () {
      this.$emit('update:show', false)
    },
    // 导出数据
    confirm () {
      this.loading = true
      console.log(this.param, 'confirm param')
      exportCouponPackageOrder(this.param).then(res => {
        console.log(res, 'excle-data')
        let fileName = localStorage.getItem('V-content-disposition')
        fileName = fileName && fileName !== 'undefined' ? fileName.split(';')[1].split('=')[1] : '优惠券礼包订单导出.xlsx'
        this.loading = false
        this.showNodes = false
        download(res, decodeURIComponent(fileName))
      }).catch(() => {
        this.loading = false
        this.showNodes = false
      })
    },
    ok (key, item) {
      if (Array.isArray(item)) {
        if (item.length !== 0) return true
      } else {
        if (key === 'currentPage' || key === 'pageRows' || key === 'exportRowStart' || key === 'exportRowEnd' || key === 'orderStatus2' || key === 'activityId' || key === 'refundType') {
          return false
        }
        if (item) return true
      }
      return false
    }
  },
  watch: {
    showNodes (newval) {
      this.closeDialog()
    },
    show (newVal) {
      if (newVal === true) {
        this.showNodes = true
        this.initData()
      }
    }
  }
}
</script>

<style lang="scss" scoped>
/deep/ .custom {
  .el-dialog__header {
    background: #f3f3f3;
    padding-top: 10px;
    .el-dialog__title {
      font-size: 14px;
    }
    .el-dialog__headerbtn {
      top: 10px;
    }
  }
  .el-checkbox-button.is-disabled .el-checkbox-button__inner {
    background-color: #f5f7fa;
  }
}
</style>

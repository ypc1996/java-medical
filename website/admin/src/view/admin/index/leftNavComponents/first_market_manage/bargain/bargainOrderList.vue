<!--
***
*  砍价订单列表
***
-->
<template>
  <div class="content">
    <div class="search-condition">
      <marketOrderSearchTab
        :requestParams="requestParams"
        @filter="initDataList"
        @export="exportDataList"
      />
    </div>
    <div class="main">
      <div class="table_box">
        <el-table
          v-loading="loading"
          :data="tableData"
          style="width:100%;"
          border
          :header-cell-style="{
            'background-color':'#f5f5f5',
            'text-align':'center',
            'border':'none'
          }"
          :cell-style="{
            'text-align':'center'
          }"
          :cell-class-name="goodsInfo"
        >
          <el-table-column
            prop="orderSn"
            :label="$t('marketCommon.orderSn')"
            align="center"
          >
          </el-table-column>
          <el-table-column
            :label="$t('bargainList.bargainGoods')"
            align="center"
          >
            <template slot-scope="scope">
              <div
                v-for="goodsItem in scope.row.goods.slice(0, 1)"
                :key="goodsItem.goodsId"
                class="goods_info"
              >
                <img
                  :src="$imageHost+'/'+goodsItem.goodsImg"
                  alt=""
                  class="goods_img"
                  style="width:25px;height:25px"
                >
                <span class="goods_name">{{goodsItem.goodsName}}</span>
              </div>
            </template>
          </el-table-column>
          <el-table-column
            :label="$t('marketCommon.price')"
            align="center"
          >
            <template slot-scope="scope">
              <div
                v-for="goodsItem in scope.row.goods.slice(0, 1)"
                :key="goodsItem.goodsId"
                class="goods_info"
              >
                <span class="goods_price">{{goodsItem.goodsPrice}}</span>
              </div>
            </template>
          </el-table-column>
          <el-table-column
            prop="createTime"
            :label="$t('marketCommon.orderTime')"
            align="center"
          >
          </el-table-column>
          <el-table-column
            :label="$t('marketCommon.orderUserInfo')"
            align="center"
          >
            <template
              slot-scope="scope"
              @click="jumpUserInfo(scope.row.userId)"
            >
              <span>{{scope.row.username}}</span><br><span>{{scope.row.userMobile}}</span>
            </template>
          </el-table-column>
          <el-table-column
            :label="$t('marketCommon.consigneeInfo')"
            align="center"
          >
            <template slot-scope="scope">
              <span>{{scope.row.consignee}}</span><br><span>{{scope.row.mobile}}</span>
            </template>
          </el-table-column>
          <el-table-column
            prop="orderStatus"
            :label="$t('marketCommon.orderStatus')"
            align="center"
          >
          </el-table-column>
        </el-table>
        <pagination
          :page-params.sync="pageParams"
          @pagination="initDataList"
        />
      </div>
    </div>
    <!-- 导出数据确认弹窗 -->
    <exportForm
      :show.sync="showExportConfirm"
      :param="this.requestParams"
      :totalRows="totalRows"
      @export="exportHandler"
    />
  </div>
</template>

<script>
import { download } from '@/util/excelUtil.js'
import { getBargainOrderList, getBargainExportTotalRows, bargainOrderListExport } from '@/api/admin/marketManage/bargain.js'
export default {
  components: {
    pagination: () => import('@/components/admin/pagination/pagination'),
    marketOrderSearchTab: () => import('@/components/admin/marketManage/marketOrderSearchTab.vue'),
    exportForm: () => import('@/components/admin/marketManage/exportConfirmDialog.vue')
  },
  mounted () {
    this.langDefault()
    if (this.$route.query.id > 0) {
      this.actId = this.$route.query.id
      this.orderStatusMap = new Map(this.$t('order.orderStatusList'))
      this.initDataList()
    }
  },
  data () {
    return {
      loading: false,
      pageParams: {},
      requestParams: {
        goodsName: null,
        orderSn: null,
        selectedOrderStatus: null,
        consignee: null,
        mobile: null,
        createTimeStart: ''
      },
      tableData: [],
      orderStatusMap: {},
      actId: null,

      // 表格原始数据
      originalData: [],
      showExportConfirm: false, // 是否展示导出数据弹窗
      totalRows: 0 // 筛选个数
    }
  },
  methods: {
    initDataList () {
      if (this.requestParams.createTimeStart) {
        let end = this.requestParams.createTimeStart.split(' ', 1)
        let endTime = end[0] + ' 23:59:59'
        this.requestParams.createTimeEnd = endTime
      } else {
        this.requestParams.createTimeEnd = ''
      }
      // console.log(this.requestParams, 'get data')

      this.loading = true
      this.requestParams.activityId = this.actId
      this.requestParams.currentPage = this.pageParams.currentPage
      this.requestParams.pageRows = this.pageParams.pageRows

      let orderStatus = []
      if (this.requestParams.selectedOrderStatus != null) {
        orderStatus.push(this.requestParams.selectedOrderStatus)
      }
      this.requestParams.orderStatus = orderStatus
      getBargainOrderList(this.requestParams).then((res) => {
        if (res.error === 0) {
          console.log(res, 'list-data')
          this.originalData = res.content.dataList
          let originalData = JSON.parse(JSON.stringify(this.originalData))
          this.handleData(originalData)
          this.pageParams = res.content.page
          this.loading = false
        }
      })
    },
    // 表格数据处理
    handleData (data) {
      data.map((item, index) => {
        item.orderStatus = this.orderStatusMap.get(item.orderStatus)
      })
      this.tableData = data
    },
    goodsInfo (data) {
      if (data.columnIndex === 2) {
        return 'no_padding'
      } else {
        return ''
      }
    },
    // 导出数据弹窗
    exportDataList () {
      getBargainExportTotalRows(this.requestParams).then(res => {
        if (res.error === 0) {
          this.totalRows = res.content
        }
      })
      this.$nextTick(() => {
        this.showExportConfirm = true
      })
    },
    // 导出数据弹窗回调函数
    exportHandler (data) {
      bargainOrderListExport(data).then(res => {
        let fileName = localStorage.getItem('V-content-disposition')
        fileName = fileName && fileName !== 'undefined' ? fileName.split(';')[1].split('=')[1] : '砍价订单导出.xlsx'
        download(res, decodeURIComponent(fileName))
      })
    }
  },
  watch: {
    // data内变量国际化
    lang () {
      // 重新渲染表格数据
      let originalData = JSON.parse(JSON.stringify(this.originalData))
      this.handleData(originalData)
    }
  }
}
</script>

<style lang="scss" scoped>
.search-condition {
  padding: 10px 10px 0;
}
.main {
  padding: 10px;
  .table_box {
    background-color: #fff;
    padding: 15px;
    .goods_price {
      border-bottom: 1px solid #ebeef5;
      line-height: 62px;
      &:last-of-type {
        border-bottom: 0;
      }
    }
    .goods_info {
      display: flex;
      justify-content: center;
      border-bottom: 1px solid #ebeef5;
      padding: 8px;
      &:last-of-type {
        border-bottom: 0;
      }
      > img {
        width: 45px;
        height: 45px;
        margin-right: 5px;
      }
      > .goods_name {
        flex: 1;
        overflow: hidden;
        text-overflow: ellipsis;
        display: -webkit-box;
        -webkit-line-clamp: 2;
        overflow: hidden;
        /*! autoprefixer: off */
        -webkit-box-orient: vertical;
        text-align: left;
      }
    }
    .operation {
      display: flex;
      justify-content: space-around;
      > .item {
        font-size: 22px;
        color: #66b1ff;
        cursor: pointer;
      }
    }
  }
  .default_input {
    width: 175px;
  }
  .date_picker {
    width: 175px;
  }
  .address_choose {
    margin-left: 10px;
  }
  /deep/ .no_padding {
    padding: 0;
    .cell {
      padding: 0;
    }
  }
  /deep/ .areaLinkage {
    .el-select {
      margin-left: 10px;
      &:first-of-type {
        margin-left: 0;
      }
    }
  }
}
</style>

<template>
  <div>
    <div class="searchContent">
      <div class="headerTab">
        <div class="tabItem tabItemActive">{{$t('allGoods.allGoodsRouterHeader.saleOn')}}</div>
        <div
          class="tabItem"
          @click="tabItemClicked('goodsForInStock')"
        >{{$t('allGoods.allGoodsRouterHeader.inStock')}}
        </div>
        <div class="tabItem" @click="tabItemClicked('goodsForAudit')">商品审核</div>
      </div>
      <!-- 查询 -->
      <allGoodsHeader
        ref="allGoodsHeaderCmp"
        :initSortCatParams="initFilterData"
      />
      <!-- 按钮 -->
      <div class="btnWrap">
        <el-button
          type="primary"
          size="small"
          @click="searchGoodsData"
        >{{$t('allGoods.allGoodsRouterHeader.searchBtn')}}
        </el-button>
        <el-button
          type="primary"
          size="small"
          @click="resetFormData"
        >{{$t('allGoods.allGoodsRouterHeader.resetBtn')}}
        </el-button>
        <el-button
          type="primary"
          size="small"
          @click="exportGoodsData"
        >{{$t('allGoods.allGoodsRouterHeader.exportGoods')}}
        </el-button>
        <el-button
          type="primary"
          size="small"
          @click="addGoodsData"
        >{{$t('allGoods.allGoodsRouterHeader.addGoods')}}
        </el-button>
        <el-button
          type="primary"
          size="small"
          @click="pullMedicalGoods">
          拉取His商品数据
        </el-button>
        <el-button
          type="primary"
          size="small"
          @click="pullStoreGoods">
          拉取药房商品数据
        </el-button>
        <el-button
          type="primary"
          size="small"
          @click="batchUpOrDownGoods(1)"
        >批量下架his独有数据
        </el-button>
        <el-button
          type="primary"
          size="small"
          @click="batchUpOrDownGoods(2)"
        >批量下架store独有数据
        </el-button>
        <el-button
          type="primary"
          size="small"
          @click="batchUpOrDownGoods(3)"
        >批量下架已匹配数据
        </el-button>
      </div>
    </div>

    <!-- 表格 -->
    <saleOnAndInStockContent
      ref="saleOnAndInStockContentCmp"
      :initFilterData="initFilterData"
      @sortChange="sortChange"
    />
  </div>
</template>

<script>

/* 组件引入 */
import allGoodsHeader from '../allGoodsHeader'
import saleOnAndInStockContent from '../saleOnAndInStockContent'

/* 导入js api */
import {
  pullMedicalGoodsApi,
  pullStoreMedicalGoodsApi
} from '@/api/admin/goodsManage/addAndUpdateGoods/addAndUpdateGoods'
  // api导入
import { batchOperateGoods } from '@/api/admin/goodsManage/allGoods/allGoods'

export default {
  name: 'allGoodsSaleOn',
  components: {
    allGoodsHeader,
    saleOnAndInStockContent
  },
  data () {
    return {
      // 在售未售罄状态
      initFilterData: {
        // 分类信息是否需要展示商品数量信息
        needGoodsNum: true,
        // 是否在售 是
        isOnSale: 1,
        // 查询分类信息展示其商品数量是以商品为统计对象还是以规格为统计对象 1 以商品为对象
        selectType: 1
      },
      sortData: {
        orderField: null,
        orderDirection: null
      }
    }
  },
  methods: {
    tabItemClicked (routerName) {
      this.$router.push({ name: routerName })
    },
    /* 更新排序字段 */
    sortChange (prop, order) {
      console.log(prop)
      console.log(order)
      if (order === null) {
        this.sortData.orderField = null
        this.sortData.orderDirection = null
      } else {
        this.sortData.orderField = prop
        this.sortData.orderDirection = (order === 'ascending' ? 'asc' : 'desc')
      }
      this.searchGoodsData()
    },
    /* 触发商品分页查询 */
    searchGoodsData () {
      let formFilterData = this.$refs.allGoodsHeaderCmp.getFormData()
      let formFilterDataString = this.$refs.allGoodsHeaderCmp.getFormDataString()
      let params = {
        ...formFilterData,
        ...this.initFilterData,
        ...this.sortData
      }
      this.$refs.saleOnAndInStockContentCmp.fetchGoodsData(params, formFilterDataString)
    },
    /* 触发商品导出弹窗 */
    exportGoodsData () {
      let formFilterData = this.$refs.allGoodsHeaderCmp.getFormData()
      let formFilterDataString = this.$refs.allGoodsHeaderCmp.getFormDataString()
      let params = {
        ...formFilterData,
        ...this.initFilterData,
        ...this.sortData
      }
      this.$refs.saleOnAndInStockContentCmp.showExportDialog(params, formFilterDataString)
    },
    /* 重置过滤数据 */
    resetFormData () {
      this.$refs.allGoodsHeaderCmp.resetFormData()
    },
    /* 添加商品跳转 */
    addGoodsData () {
      this.$router.push({ name: 'goods_add' })
    },
    /* 拉取药品信息 */
    pullMedicalGoods () {
      pullMedicalGoodsApi()
    },
    /* 拉取药房药品信息 */
    pullStoreGoods () {
      pullStoreMedicalGoodsApi()
    },
    /* 批量上架双方已经匹配的数据 */
    batchUpOrDownGoods (type) {
      let param = {}
      switch (type) {
        case 1:
          param.batchUpOrDownHisGoods = 0
          break
        case 2:
          param.batchUpOrDownStoreGoods = 0
          break
        case 3:
          param.batchUpOrDownBothInGoods = 0
          break
        default:
          break
      }

      batchOperateGoods(param).then(res => {
        if (res.error !== 0) {
          this.$message.warning({ message: '操作失败' })
        } else {
          this.$message.success({ message: '操作成功' })
          this.searchGoodsData()
        }
      })
    }
  },
  mounted () {
    this.langDefault()
    if (!this.$route.params.brandTurnId) {
      this.searchGoodsData()
    }
    this.$http.$on('brandTurnEvent', () => {
      this.searchGoodsData()
    })
  }
}
</script>

<style scoped>
  .searchContent {
    width: 100%;
    padding: 10px;
    background: #fff;
    margin-bottom: 10px;
  }

  .headerTab {
    border-bottom: 1px solid #eeeeee;
    color: #666;
    display: flex;
  }

  .tabItem {
    font-size: 14px;
    min-width: 50px;
    line-height: 40px;
    /* margin: 0px 5px; */
    margin-right: 20px;
    cursor: pointer;
  }

  .tabItemActive {
    border-bottom: 1.5px solid #5a8bff;
  }

  .btnWrap {
    padding-left: 50px;
    margin-bottom: 15px;
  }
</style>

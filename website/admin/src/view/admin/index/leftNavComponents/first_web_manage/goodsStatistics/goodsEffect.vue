<template>
  <div class="label">
    <div class="labelItem">{{$t('goodsStaticties.goodsEffect')}}
      <el-tooltip
        effect="light"
        placement="top"
      >
        <div
          slot="content"
          style="width: 400px;line-height: 30px;font-size: 14px;"
        >
          <section style="display: flex">
            <div style="width: 30%;color:#999">{{$t('goodsStaticties.fangkeshu1')}}</div>
            <div style="width: 70%;color: #353535">{{$t('goodsStaticties.fangkeshu1_content')}}</div>
          </section>
          <section style="display: flex">
            <div style="width: 30%;color:#999">{{$t('goodsStaticties.liulan')}}</div>
            <div style="width: 70%;color: #353535">{{$t('goodsStaticties.liulan_content')}}</div>
          </section>
          <section style="display: flex">
            <div style="width: 30%;color:#999">{{$t('goodsStaticties.jiagouren')}}</div>
            <div style="width: 70%;color: #353535">{{$t('goodsStaticties.jiagouren_content')}}</div>
          </section>
          <section style="display: flex">
            <div style="width: 30%;color:#999">{{$t('goodsStaticties.fukuanren')}}</div>
            <div style="width: 70%;color: #353535">{{$t('goodsStaticties.fukuanren_content')}}</div>
          </section>
          <section style="display: flex">
            <div style="width: 30%;color:#999">{{$t('goodsStaticties.goodsrate')}}</div>
            <div style="width: 70%;color: #353535">{{$t('goodsStaticties.goodsrate_content')}}</div>
          </section>
          <section style="display: flex">
            <div style="width: 30%;color:#999">{{$t('goodsStaticties.fukuangoods')}}</div>
            <div style="width: 70%;color: #353535">{{$t('goodsStaticties.fukuangoods_content')}}</div>
          </section>
          <section style="display: flex">
            <div style="width: 30%;color:#999">{{$t('goodsStaticties.newdownuser')}}</div>
            <div style="width: 70%;color: #353535">{{$t('goodsStaticties.newdownuser_content')}}</div>
          </section>
          <section style="display: flex">
            <div style="width: 30%;color:#999">{{$t('goodsStaticties.newdownuserrate')}}</div>
            <div style="width: 70%;color: #353535">{{$t('goodsStaticties.newdownuserrate_content')}}</div>
          </section>
          <section style="display: flex">
            <div style="width: 30%;color:#999">{{$t('goodsStaticties.olddowmuser')}}</div>
            <div style="width: 70%;color: #353535">{{$t('goodsStaticties.olddowmuser_content')}}</div>
          </section>
          <section style="display: flex">
            <div style="width: 30%;color:#999">{{$t('goodsStaticties.olddowmuserrate')}}</div>
            <div style="width: 70%;color: #353535">{{$t('goodsStaticties.olddowmuserrate_content')}}</div>
          </section>
        </div>
        <i class="el-icon-warning-outline icons"></i>
      </el-tooltip>
    </div>
    <el-form
      label-width="100px"
      :inline="true"
    >
      <el-form-item>
        <el-select
          v-model="timeSelect"
          size="small"
          clearable
          @change="dateChangeHandler"
          class="timeSelect"
        >
          <el-option
            v-for="item in timeRange"
            :key="item.value"
            :label="item.label"
            :value="item.value"
          ></el-option>
        </el-select>
      </el-form-item>
      <el-form-item>
        <el-date-picker
          v-if="timeSelect===0"
          v-model="timeValue"
          type="daterange"
          size="small"
          @change="customDate"
          value-format="yyyyMMdd"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
          class="custom"
        >
        </el-date-picker>
      </el-form-item>
      <el-form-item>
        <span>{{this.startDate.year}}{{$t('userStatistics.year')}}{{this.startDate.month}}{{$t('userStatistics.month')}}{{this.startDate.day}}{{$t('userStatistics.day')}} - {{this.endDate.year}}{{$t('userStatistics.year')}}{{this.endDate.month}}{{$t('userStatistics.month')}}{{this.endDate.day}}{{$t('userStatistics.day')}}</span>
      </el-form-item>
      <!--商家分类树-->
      <sortCatTreeSelect
        ref="sortTree"
        :filterGoodsInfo="initSortCatParams"
        treeType="sort"
        :selectedId.sync="effectParam.sortId"
      />
      <el-form-item
        :label="$t('allGoods.allGoodsHeaderData.goodsLabel')+'：'"
        prop="labelId"
      >
        <!--商品标签-->
        <el-select
          v-model="effectParam.labelId"
          size="small"
        >
          <el-option
            :label="$t('allGoods.allGoodsHeaderData.chooseGoodsLabel')"
            :value="null"
          />
          <el-option
            v-for="(item,index) in goodsLabelOptions"
            :label="item.name"
            :value="item.id"
            :key="index"
          />
        </el-select>
      </el-form-item>
      <el-form-item
        :label="$t('allGoods.allGoodsHeaderData.goodsBrand')+'：'"
        prop="brandId"
      >
        <!--商品品牌-->
        <el-select
          v-model="effectParam.brandId"
          size="small"
        >
          <el-option
            :label="$t('allGoods.allGoodsHeaderData.chooseGoodsBrand')"
            :value="null"
          />
          <el-option
            v-for="(item, index) in goodsBrandOptions"
            :label="item.brandName"
            :value="item.id"
            :key="index"
          />
        </el-select>
      </el-form-item>
      <el-form-item>
        <el-button
          size="small"
          type="primary"
          @click="init"
        >{{$t('goodsStaticties.query')}}</el-button>
      </el-form-item>
      <el-form-item>
        <el-button
          size="small"
          type="primary"
          @click="dataExport"
        >{{$t('goodsStaticties.export')}}</el-button>
      </el-form-item>
    </el-form>
    <!-- 表格数据部分 -->
    <div style="width:95%">
      <el-table
        :data="tableData"
        border
        style="width: 100%"
        align="center"
      >
        <el-table-column
          :label="$t('goodsStaticties.goodsinfo')"
          width="200"
          align="center"
        >
          <template slot-scope="{ row }">
            <el-row :gutter="24">
              <el-col :span="8">
                <img
                  style="width: 60px; height: 60px"
                  :src="row.goodsImg"
                />
              </el-col>
              <el-col :span="16">
                <label style="font-size: 14px;">{{row.goodsName}}</label>
                <br>
                <label style="color: red;">{{row.shopPrice}}</label>
              </el-col>
            </el-row>
          </template>
        </el-table-column>
        <el-table-column
          prop="uv"
          :label="$t('goodsStaticties.fangkeshu1')"
          align="center"
          sortable
        >
        </el-table-column>
        <el-table-column
          prop="pv"
          :label="$t('goodsStaticties.liulan')"
          align="center"
          sortable
        >
        </el-table-column>
        <el-table-column
          prop="cartUv"
          :label="$t('goodsStaticties.jiagouren')"
          align="center"
          sortable
        >
        </el-table-column>
        <el-table-column
          prop="paidUv"
          :label="$t('goodsStaticties.fukuanren')"
          align="center"
          sortable
        >
        </el-table-column>
        <el-table-column
          prop="newUserNumber"
          :label="$t('goodsStaticties.newdownuser')"
          align="center"
          sortable
        >
        </el-table-column>
        <el-table-column
          prop="newUserPercentage"
          :label="$t('goodsStaticties.newdownuserrate')"
          align="center"
        >
        </el-table-column>
        <el-table-column
          prop="oldUserNumber"
          :label="$t('goodsStaticties.olddowmuser')"
          align="center"
          sortable
        >
        </el-table-column>
        <el-table-column
          prop="oldUserPercentage"
          :label="$t('goodsStaticties.olddowmuserrate')"
          align="center"
        >
        </el-table-column>
        <el-table-column
          prop="uv2paidGoods"
          :label="$t('goodsStaticties.goodsrate')"
          align="center"
        >
        </el-table-column>
        <el-table-column
          prop="paidGoodsNumber"
          :label="$t('goodsStaticties.fukuangoods')"
          align="center"
          sortable
        >
        </el-table-column>
        <el-table-column
          prop="goodsSales"
          :label="$t('goodsStaticties.sales')"
          align="center"
          sortable
        >
        </el-table-column>
        <el-table-column
          prop="recommendUserNum"
          :label="$t('goodsStaticties.recom')"
          align="center"
          sortable
        >
        </el-table-column>
        <el-table-column
          prop="collectUserNum"
          :label="$t('goodsStaticties.collec')"
          align="center"
          sortable
        >
        </el-table-column>
        <el-table-column
          :label="$t('goodsStaticties.shareuser')"
          align="center"
        >
          <template slot-scope="{ row }">
            <span>{{row.sharePv + '/' + row.shareUv}}</span>
          </template>
        </el-table-column>
      </el-table>
      <pagination
        :page-params.sync="pageParams"
        @pagination="init"
      ></pagination>
    </div>
  </div>
</template>

<script>
import sortCatTreeSelect from '@/components/admin/sortCatTreeSelect'
import { producteffect, getDate, export2Excel } from '@/api/admin/firstWebManage/goodsStatistics/goodsStatistics.js'
import { getGoodsFilterItem } from '@/api/admin/goodsManage/allGoods/allGoods'
import effectExportDialog from './effectExportDialog'
import { download } from '@/util/excelUtil.js'
import pagination from '@/components/admin/pagination/pagination'
export default {
  props: ['initSortCatParams'],
  components: { sortCatTreeSelect, pagination, effectExportDialog, download },
  mounted () {
    // 初始化form表单下拉框数据
    this.initFilterData()
    // 初始化国际语言
    this.langDefault()
    this.getDateValue(1)
    this.init()
  },
  data () {
    return {
      imgHost: `${this.$imageHost}`,
      tableData: [],
      search: '',
      timeSelect: 1,
      timeValue: [],
      timeRange: this.$t('tradesStatistics.timeRange'),
      startDate: {
        year: '',
        month: '',
        day: ''
      },
      endDate: {
        year: '',
        month: '',
        day: ''
      },
      // 商品相关下拉框
      goodsFilterFormData: {
        // 商家分类
        sortId: null,
        // 标签id
        labelId: null,
        // 品牌id
        brandId: null
      },
      goodsBrandOptions: [],
      goodsLabelOptions: [],
      effectParam: {
        dynamicDate: 1,
        startTime: '',
        endTime: '',
        sortId: null,
        brandId: null,
        labelId: null,
        orderByField: null,
        orderByType: null,
        currentPage: 0,
        pageRows: 20
      },
      pageParams: {}
    }
  },
  methods: {
    // 商品效果导出
    dataExport () {
      let params = Object.assign({}, this.effectParam)
      export2Excel(params).then(res => {
        let fileName = localStorage.getItem('V-content-disposition')
        fileName = fileName.split(';')[1].split('=')[1]
        download(res, decodeURIComponent(fileName))
      })
    },
    getDateValue (unit) {
      getDate(unit).then(res => {
        if (res.error === 0) {
          this.startDate.year = res.content.startTime.split('-')[0]
          this.startDate.month = res.content.startTime.split('-')[1]
          this.startDate.day = res.content.startTime.split('-')[2]
          this.endDate.year = res.content.endTime.split('-')[0]
          this.endDate.month = res.content.endTime.split('-')[1]
          this.endDate.day = res.content.endTime.split('-')[2]
        }
      }).catch(err => console.log(err))
    },
    /* 商品效果-初始化商品品牌/标签下拉框数据 */
    initFilterData () {
      getGoodsFilterItem({ needGoodsLabel: true, needGoodsBrand: true }).then(res => {
        let { content } = res
        this.goodsBrandOptions = content.goodsBrands
        this.goodsLabelOptions = content.goodsLabels
      })
    },
    // 商品效果-指定时间段
    dateChangeHandler (time) {
      if (time !== 0) {
        this.effectParam.dynamicDate = time
        this.getDateValue(time)
        this.init()
      }
    },
    // 商品效果-自定义时间
    customDate () {
      this.effectParam.dynamicDate = 0
      this.effectParam.startTime = this.timeValue[0].substring(0, 4) + '-' + this.timeValue[0].substring(4, 6) + '-' + this.timeValue[0].substring(6, 8) + ' 00:00:00'
      this.effectParam.endTime = this.timeValue[1].substring(0, 4) + '-' + this.timeValue[1].substring(4, 6) + '-' + this.timeValue[1].substring(6, 8) + ' 00:00:00'
      this.startDate.year = this.timeValue[0].substring(0, 4)
      this.startDate.month = this.timeValue[0].substring(4, 6)
      this.startDate.day = this.timeValue[0].substring(6, 8)

      this.endDate.year = this.timeValue[1].substring(0, 4)
      this.endDate.month = this.timeValue[1].substring(4, 6)
      this.endDate.day = this.timeValue[1].substring(6, 8)
      console.log('选择器的时间：', this.param)
      this.init()
    },
    // 商品效果
    init () {
      let params = Object.assign({}, this.effectParam, this.pageParams)
      producteffect(params).then(res => {
        if (res.error === 0) {
          this.tableData = res.content.dataList
          this.pageParams = Object.assign({}, res.content.page)
          this.tableData.map((item, index) => {
            item.goodsImg = this.imgHost + '/' + item.goodsImg
          })
        }
      }).catch(err => console.log(err))
    },
    handleEdit (index, row) {
      console.log(index, row)
    },
    handleDelete (index, row) {
      console.log(index, row)
    }
  }
}

</script>
<style lang="scss" scoped>
.label {
  padding: 10px;
  background: #fff;
  margin-top: 5px;
  .labelItem {
    height: 50px;
    line-height: 50px;
    color: #333;
    margin-left: 10px;
    .tc_left {
      flex: 1;
      display: flex;
      align-items: center;
    }
    .tc_right {
      flex: 1;
      text-align: right;
      margin-right: 15px;
    }
  }
  .timeSelect {
    width: 140px;
    margin: 0 10px 10px 10px;
  }
}
</style>

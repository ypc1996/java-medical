<template>
  <div class="saleOut">
    <div style="width: 100%; padding: 10px;background: #fff;">
      <el-table
        :data="goodsData"
        class="tableClass"
        border
        style="width: 100%"
        @sort-change="sortChange"
      >
        <el-table-column
          align="center"
          width="50"
          label=""
        >
          <template slot-scope="scope">
            <el-checkbox v-model="scope.row.check"></el-checkbox>
          </template>
        </el-table-column>
        <!-- 商品名称图片 -->
        <el-table-column
          align="center"
          prop="goodsName"
          :label="$t('allGoods.allGoodsData.goodsName')"
          width="220"
        >
          <template slot-scope="{row}">
            <div class="nameImgWrap">
              <img
                class="imgItem"
                :src="row.prdImg===''||row.prdImg===null?row.goodsImg:row.prdImg"
              >
              <div
                class="nameItem"
                :title="row.prdDesc === ''?row.goodsTitleName+$t('allGoods.allGoodsData.noPrdSn'):row.goodsTitleName+row.prdDesc"
              >
                <span
                  v-if="row.sourceName !== null"
                  class="goodsTypeSpanWrap"
                >{{row.sourceName}}</span>
                <span
                  v-if="row.goodsTypeName !== null"
                  class="goodsSourceSpanWrap"
                >{{row.goodsTypeName}}</span>
                <span v-html="row.goodsName"></span>
                <span v-if="row.prdDesc === ''">
                  ({{$t('allGoods.allGoodsData.noPrdSn')}})
                </span>
                <span v-else>
                  {{row.prdDesc}}
                </span>
              </div>
            </div>
          </template>
        </el-table-column>
        <!--店铺价格-->
        <el-table-column
          prop="shopPrice"
          sortable="custom"
          align="center"
          :label="$t('allGoods.allGoodsData.shopPrice')"
          width="130"
        >
          <template slot-scope="{row}">
            <span v-if="!row.prdPriceEdit">
              {{row.prdPrice}}
              <span
                class="iconfont iconbianji"
                style="margin-left: 10px; font-size: 20px;"
                @click="prdPriceAndPrdNumberEditClick(row,'price')"
              ></span>
            </span>
            <input
              :id="'prdPrice_'+row.prdId"
              v-else
              v-model.number="row.prdPriceOld"
              @change="prdPriceChange(row)"
              @blur="row.prdPriceEdit = false"
              class="editInput"
            />
          </template>
        </el-table-column>
        <!--规格编码-->
        <el-table-column
          align="center"
          :label="$t('allGoods.allGoodsData.prdSn')"
          width="140"
        >
          <template slot-scope="{row}">
            {{row.goodsSn}}
            <span v-if="row.prdSn!==null && row.prdSn.length > 0">
              ;{{row.prdSn}}
            </span>
          </template>
        </el-table-column>
        <!--商家分类-->
        <el-table-column
          align="center"
          prop="sortName"
          :label="$t('allGoods.allGoodsData.sort')"
          width="120"
        />
        <!--商品品牌-->
        <el-table-column
          align="center"
          prop="brandName"
          :label="$t('allGoods.allGoodsData.goodsBrand')"
          width="120"
        >
        </el-table-column>
        <!--商品库存-->
        <el-table-column
          prop="goodsNumber"
          sortable="custom"
          align="center"
          :label="$t('allGoods.allGoodsData.goodsNumber')"
          width="130"
        >
          <template slot-scope="{row}">
            <span v-if="!row.prdNumberEdit">
              {{row.prdNumber}}
              <span
                class="iconfont iconbianji"
                style="margin-left: 10px; font-size: 20px"
                @click="prdPriceAndPrdNumberEditClick(row,'number')"
              ></span>
            </span>
            <input
              v-else
              :id="'prdNumber_'+row.prdId"
              v-model.number="row.prdNumberOld"
              @change="goodsNumberChange(row)"
              @blur="row.prdNumberEdit = false"
              class="editInput"
            />
          </template>
        </el-table-column>
        <!--标签-->
        <el-table-column
          align="center"
          :label="$t('allGoods.allGoodsData.goodsLabel')"
          width="120"
        >
          <template slot-scope="{row}">
            <div
              v-if="row.goodsNormalLabels.length + row.goodsPointLabels.length > 0"
              class="goodsLabelSpanWrap"
            >
              <div v-if="row.goodsPointLabels.length > 0">
                {{row.goodsPointLabels[0].name}}
              </div>
              <div v-if="row.goodsPointLabels.length === 0 && row.goodsNormalLabels.length > 0">
                {{row.goodsNormalLabels[0].name}}
              </div>
              <div style="text-align: center;">
                共{{row.goodsNormalLabels.length + row.goodsPointLabels.length }}个
              </div>
            </div>
            <div
              style="cursor: pointer;text-align: center;margin-top: 2px;color: #5a8bff;"
              @click="tdLabelSetClick(row)"
            >
              {{$t('allGoods.allGoodsData.setting')}}
            </div>
          </template>
        </el-table-column>
        <el-table-column
          align="center"
          :label="$t('allGoods.allGoodsData.operate')"
        >
          <template slot-scope="{row}">
            <el-tooltip
              :content="$t('allGoods.allGoodsData.edit')"
              placement="top"
            >
              <span
                class="iconfont iconbianji"
                @click="editIconClick(row)"
              ></span>
            </el-tooltip>
            <el-tooltip
              :content="$t('allGoods.allGoodsData.share')"
              placement="top"
            >
              <span
                class="iconfont iconfenxiang1"
                @click="shareIconClick(row)"
              ></span>
            </el-tooltip>
          </template>
        </el-table-column>
      </el-table>
      <pagination
        :page-params.sync="pageParams"
        @pagination="paginationFetchGoodsData"
      />
    </div>

    <!--预览商品太阳码-->
    <el-dialog
      :visible.sync="qrCodeData.isShow"
      :title="$t('allGoods.allGoodsData.shareGoodsTitle')"
      width="350px"
    >
      <div style="text-align: center;">
        <el-image
          fit="scale-down"
          :src="qrCodeData.imgFullUrl"
          style="width: 250px; height: 230px;"
        />
        <el-input
          v-model="qrCodeData.pageUrl"
          disabled
        />
        <span>{{$t('allGoods.allGoodsData.copy')}}</span>
      </div>
    </el-dialog>

    <!--标签设置-->
    <el-dialog
      :visible.sync="goodsLabelData.isShow"
      :title="$t('allGoods.allGoodsData.setLabelTitle')"
      width="30%"
      @closed="goodsLabelDialogCancel"
    >
      <div style="background-color:#FFF7EB;border: 1px solid #FFD5A3;line-height: 30px;padding-left: 20px;margin-bottom: 10px;">
        {{$t('allGoods.allGoodsData.setLabelTip')}}</div>
      <div>
        <span>{{$t('allGoods.allGoodsData.goodsLabel')}}：</span>
        <el-select
          v-model="goodsLabelData.labelSelectedTempVal"
          :placeholder="$t('allGoods.allGoodsHeaderData.chooseGoodsLabel')"
          size="small"
          @change="tdLabelSelectChange"
          style="width:170px;"
        >
          <el-option
            v-for="item in goodsLabelData.labelSelectOptions"
            :key="item.id"
            :label="item.name"
            :value="item.id"
          />
        </el-select>
      </div>
      <!--通用标签-->
      <div
        v-if="goodsLabelData.goodsNormalLabels.length>0"
        style="display: flex;margin-top: 10px;"
      >
        <div style="width:75px;flex-shrink:0;">通用标签：</div>
        <div class="labelSelectedWrapPanel">
          <div
            class="labelSelectedWrap"
            v-for="(item,index) in goodsLabelData.goodsNormalLabels"
            :key="index"
          >
            {{item.name}}
          </div>
        </div>
      </div>
      <!--指定标签-->
      <div
        v-if="goodsLabelData.labelSelectedOptions.length>0"
        style="display: flex;margin-top: 10px;"
      >
        <div style="width:75px;flex-shrink:0;">{{this.$t('allGoods.allGoodsData.selected')}}：</div>
        <div class="labelSelectedWrapPanel">
          <div
            class="labelSelectedWrap"
            v-for="(item,index) in goodsLabelData.labelSelectedOptions"
            :key="index"
          >
            {{item.name}}
            <span
              @click="tdDeleteLabel(item,index)"
              class="deleteIcon"
            >×</span>
          </div>
        </div>
      </div>
      <div slot="footer">
        <el-button
          @click="goodsLabelDialogConfirm"
          type="primary"
          size="small"
        >{{$t('goodsAddEditInfo.confirmBtn')}}</el-button>
        <el-button
          @click="goodsLabelDialogCancel"
          type="primary"
          size="small"
        >{{$t('goodsAddEditInfo.cancelBtn')}}</el-button>
      </div>
    </el-dialog>
    <!-- 商品导出确认弹窗 -->
    <goodsExportConfirmDialog
      :show.sync="showExportConfirm"
      :param="this.filterData"
      :paramString="this.filterDataString"
    />
  </div>
</template>
<script>

import { getGoodsProductList, batchOperateSpecPrdPriceNumber, updateLabelByGoodsId, getGoodsFilterItem } from '@/api/admin/goodsManage/allGoods/allGoods'
import { getGoodsQrCode } from '@/api/admin/goodsManage/addAndUpdateGoods/addAndUpdateGoods'
// 组件导入
import pagination from '@/components/admin/pagination/pagination'
import goodsExportConfirmDialog from './goodsExportConfirmDialog'

export default {
  name: 'saleOut',
  components: { pagination, goodsExportConfirmDialog },
  data () {
    return {
      filterData: {},
      filterDataString: {}, // 用于导出时展示已选条件
      goodsData: [],
      pageParams: {
        currentPage: 1,
        pageRows: 20
      },
      qrCodeData: {
        imgFullUrl: null,
        pageUrl: null,
        isShow: false
      },
      goodsLabelData: {
        currentRow: null,
        labelSelectedTempVal: null,
        labelSelectOptions: [],
        labelSelectedOptions: [],
        goodsNormalLabels: [],
        isShow: false
      },
      showExportConfirm: false
    }
  },
  methods: {
    /* 商品价格和库存修改图标点击事件 */
    prdPriceAndPrdNumberEditClick (row, type) {
      if (type === 'price') {
        row.prdPriceEdit = true
        this.$nextTick(() => document.getElementById('prdPrice_' + row.prdId).focus())
      } else {
        row.prdNumberEdit = true
        this.$nextTick(() => document.getElementById('prdNumber_' + row.prdId).focus())
      }
    },
    /* 商品价格输入框处理函数 */
    prdPriceChange (row) {
      if (typeof row.prdPriceOld !== 'number' || row.prdPriceOld < 0) {
        row.prdPriceOld = row.prdPrice
        this.$message.warning({ type: 'warning', message: this.$t('allGoods.allGoodsData.shopPriceRequired') })
        row.prdPriceEdit = false
        return
      }
      // 规格修改之前的价格
      let originalPrice = row.prdPrice
      row.prdPrice = row.prdPriceOld
      let param = {
        prdId: row.prdId,
        shopPrice: row.prdPrice
      }

      batchOperateSpecPrdPriceNumber(param).then(res => {
        row.prdPriceEdit = false
        if (res.error === 0) {
          this.$message.success({ type: 'info', message: '设置成功!' })
        } else {
          row.prdPrice = originalPrice
        }
      })
    },
    /* 商品数量输入框处理函数 */
    goodsNumberChange (row) {
      if (typeof row.prdNumberOld !== 'number' || row.prdNumberOld < 0) {
        row.prdNumberOld = row.prdNumber
        this.$message.warning({ type: 'warning', message: this.$t('allGoods.allGoodsData.goodsNumberRequired') })
        row.prdNumberEdit = false
        return
      }
      let originalNum = row.prdNumber
      row.prdNumber = parseInt(row.prdNumberOld)

      let param = {
        prdId: row.prdId,
        goodsNumber: row.prdNumber
      }
      batchOperateSpecPrdPriceNumber(param).then(res => {
        row.prdNumberEdit = false
        if (res.error === 0) {
          this.$message.success({ type: 'info', message: '设置成功!' })
          this.fetchGoodsData()
        } else {
          row.prdNumber = originalNum
        }
      })
    },
    /** table表单内标签 **/
    /* table表单内标签设置按钮 */
    tdLabelSetClick (row) {
      getGoodsFilterItem({ needGoodsLabel: true }).then(res => {
        const { content: { goodsLabels } } = res
        this.goodsLabelData.currentRow = row
        this.goodsLabelData.goodsNormalLabels = row.goodsNormalLabels
        this.goodsLabelData.isShow = true
        goodsLabels.forEach(item => {
          if (this.goodsLabelData.currentRow.goodsPointLabels.some(goodsLabel => goodsLabel.id === item.id)) {
            this.goodsLabelData.labelSelectedOptions.push(item)
          } else {
            this.goodsLabelData.labelSelectOptions.push(item)
          }
        })
      })
    },
    /* talbe表单内标签下拉框交互 */
    tdLabelSelectChange () {
      this.goodsLabelData.labelSelectOptions = this.goodsLabelData.labelSelectOptions.filter(item => {
        if (item.id === this.goodsLabelData.labelSelectedTempVal) {
          this.goodsLabelData.labelSelectedOptions.push(item)
          return false
        }
        return true
      })
      this.goodsLabelData.labelSelectedTempVal = null
    },
    /* talbe表单内标签删除图标点击 */
    tdDeleteLabel (item, index) {
      this.goodsLabelData.labelSelectedOptions.splice(index, 1)
      this.goodsLabelData.labelSelectOptions.push(item)
    },
    /* table表单内标签dialog确认按钮 */
    goodsLabelDialogConfirm () {
      let param = {
        goodsId: this.goodsLabelData.currentRow.goodsId,
        labelIds: []
      }
      this.goodsLabelData.labelSelectedOptions.forEach(item => param.labelIds.push(item.id))
      updateLabelByGoodsId(param).then((res) => {
        if (res.error !== 0) {
          return
        }
        this.goodsLabelData.currentRow.goodsPointLabels = this.goodsLabelData.labelSelectedOptions
        this.goodsLabelData.labelSelectedOptions = []
        this.goodsLabelData.labelSelectOptions = []
        this.goodsLabelData.goodsNormalLabels = []
        this.goodsLabelData.currentRow = null
        this.$message.success({ type: 'info', message: this.$t('allGoods.allGoodsData.setSuccess') })
        this.goodsLabelData.isShow = false
        // 刷新数据
        this.fetchGoodsData()
      })
    },
    goodsLabelDialogCancel () {
      this.goodsLabelData.labelSelectedOptions = []
      this.goodsLabelData.labelSelectOptions = []
      this.goodsLabelData.goodsNormalLabels = []
      this.goodsLabelData.currentRow = null
      this.goodsLabelData.isShow = false
    },
    /* 修改图标按钮点击 */
    editIconClick (row) {
      this.$router.push({ name: 'goods_update', params: { goodsId: row.goodsId } })
    },
    shareIconClick (row) {
      getGoodsQrCode(row.goodsId).then(res => {
        this.qrCodeData.imgFullUrl = res.content.imgFullUrl
        this.qrCodeData.pageUrl = res.content.pageUrl
        this.qrCodeData.isShow = true
      })
    },
    /* 表头排序 */
    sortChange (data) {
      this.$emit('sortChange', data.prop, data.order)
    },
    /* 操作确认弹框 */
    _$confirm (questionMessage, confirmMesage, confirmCallback, cancelCallback) {
      this.$confirm(questionMessage, this.$t('allGoods.allGoodsData.tip'), {
        confirmButtonText: this.$t('allGoods.allGoodsData.confirm'),
        cancelButtonText: this.$t('allGoods.allGoodsData.cancel'),
        type: 'warning'
      }).then(() => {
        return confirmCallback()
      }).then(() => {
        this.$message.success({
          type: 'success',
          message: confirmMesage
        })
      }).catch(() => {
        if (cancelCallback !== undefined) {
          cancelCallback()
        }
      })
    },
    /* 分页组件使用的分页方法，为了传递filterData数据 */
    paginationFetchGoodsData () {
      this.fetchGoodsData(this.filterData)
    },
    /* 分页查询数据 */
    fetchGoodsData (filterData) {
      if (filterData !== undefined) {
        this.filterData = filterData
      }
      let params = {
        ...this.pageParams,
        ...this.filterData
      }
      getGoodsProductList(params).then(res => {
        let { content: { page, dataList } } = res

        this.pageParams = page

        dataList.forEach(item => {
          // item.sourceName = item.source === 0 ? '自营' : '非自营'
          item.sourceName = item.source === 0 ? this.$t('allGoods.allGoodsHeaderData.goodsSourceOptions')[1] : this.$t('allGoods.allGoodsHeaderData.goodsSourceOptions')[2]

          switch (item.goodsType) {
            // case 1: item.goodsTypeName = '拼团商品'
            case 1: item.goodsTypeName = this.$t('allGoods.allGoodsData.goodsType')[0]
              break
            // case 2: item.goodsTypeName = '分销'
            case 2: item.goodsTypeName = this.$t('allGoods.allGoodsData.goodsType')[1]
              break
            // case 3: item.goodsTypeName = '砍价商品'
            case 3: item.goodsTypeName = this.$t('allGoods.allGoodsData.goodsType')[2]
              break
            // case 4: item.goodsTypeName = '积分商品'
            case 4: item.goodsTypeName = this.$t('allGoods.allGoodsData.goodsType')[3]
              break
            // case 5: item.goodsTypeName = '秒杀商品'
            case 5: item.goodsTypeName = this.$t('allGoods.allGoodsData.goodsType')[4]
              break
            default:
              item.goodsTypeName = null
          }

          item.prdPriceEdit = false
          item.prdPriceOld = item.prdPrice
          item.prdNumberEdit = false
          item.prdNumberOld = item.prdNumber
        })

        // this.goodsData = dataList
        this.$set(this, 'goodsData', dataList)
      })
    },
    showExportDialog (filterData, filterDataString) {
      if (filterData !== undefined) {
        this.filterData = filterData
        this.filterDataString = filterDataString
      }
      this.showExportConfirm = true
    }
  }
}
</script>

<style lang="scss" scoped>
@import "@/assets/aliIcon/iconfont.scss";
/deep/.tableClass th {
  background-color: #f5f5f5;
  border: none;
  height: 36px;
  font-weight: bold;
  color: #000;
  padding: 8px 10px;
}
.nameImgWrap {
  display: flex;
  text-align: left;
}
.nameImgWrap::after {
  content: "";
  display: block;
  clear: both;
}
.imgItem {
  width: 60px;
  height: 60px;
  border-radius: 2px;
  border: 1px solid #ccc;
  margin: 2px 7px 0 0;
}
.nameItem {
  flex: 1;
  text-overflow: ellipsis;
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 3;
  overflow: hidden;
}
.goodsSourceSpanWrap {
  border: 1px solid #ef8115;
  color: #ef8115;
  border-radius: 3px;
  padding: 0px 2px;
}
.goodsTypeSpanWrap {
  border: 1px solid #ff3f3f;
  color: #ff3f3f;
  border-radius: 3px;
  padding: 0px 2px;
}
.goodsLabelSpanWrap {
  border: 1px solid #cccccc;
  color: #666;
  border-radius: 3px;
  padding: 0px 2px;
  margin-right: 2px;
  display: inline-block;
}
.labelSelectedWrapPanel {
  width: 80%;
  display: flex;
  justify-content: flex-start;
  flex-wrap: wrap;
  align-items: center;
}
.labelSelectedWrap {
  border: 1px solid #ccc;
  text-align: center;
  background-color: #fff;
  position: relative;
  padding: 5px 5px;
  margin-right: 10px;
  margin-bottom: 10px;
  flex-shrink: 0;
}
.labelSelectedWrap .deleteIcon {
  width: 13px;
  height: 13px;
  color: #fff;
  background: #ccc;
  border: 1px solid #ccc;
  border-radius: 50%;
  line-height: 10px;
  text-align: center;
  position: absolute;
  top: -8px;
  right: -8px;
  cursor: pointer;
  opacity: 0.8;
}
.iconSpan {
  font-size: 22px;
  color: #5a8bff;
  cursor: pointer !important;
}
.editInput {
  width: 80px;
  height: 25px;
  border: 1px solid #ccc;
  text-align: center;
}
.iconfont {
  font-size: 22px;
  color: #5a8bff;
}
</style>

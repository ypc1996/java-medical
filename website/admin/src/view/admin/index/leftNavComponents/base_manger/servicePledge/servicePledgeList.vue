<template>
  <div class="servicePledge">
    <div class="main">
      <!-- 标签 -->
      <el-tabs
        v-model="tabValue"
        @tab-click="clickTabs"
      >
        <!-- 标签页1 -->
        <el-tab-pane
          :label="$t('pledge.pledgeList')"
          name="first"
        >
          <!-- 文字及开关 -->
          <div class="top">
            <!-- 左边文字 -->
            <div class="left">
              <div class="top1">{{$t('pledge.pledge')}}</div>
              <div style="margin-bottom: 10px">1.{{$t('pledge.tipInfoOne')}}</div>
              <div style="padding-left: 15px">{{$t('pledge.tipInfoTwo')}}</div>
              <div style="margin-top: 10px;margin-bottom: 10px">2.{{$t('pledge.tipInfoThree')}}</div>
            </div>
            <!-- 右边开关 -->
            <div class="right">
              <el-switch
                v-model="switchValue"
                active-color="#F7931E"
                inactive-color="#ddd"
                @change="changeTotalSwitch"
              >
              </el-switch>
              <span style="color: rgb(153, 153, 153);">{{this.switchValue === true ? $t('pledge.on') : $t('pledge.off')}}</span>
            </div>
          </div>
          <!-- 按钮 -->
          <div class="mid">
            <el-button
              type="primary"
              @click="changeTabValue"
              size="small"
            >+{{$t('pledge.addButton')}}</el-button>
            <span class="mid-text">{{$t('pledge.addTip')}}</span>
          </div>
          <!-- 列表信息 -->
          <div class="table_list">
            <!-- 表格数据 -->
            <el-table
              class="table"
              :data="tableData"
              header-row-class-name="tableClss"
              border
              style="width:100%"
            >
              <el-table-column
                prop="pledgeName"
                :label="$t('pledge.name')+'：'"
                align="center"
              ></el-table-column>
              <el-table-column
                prop="pledgeLogo"
                :label="$t('pledge.icon')+'：'"
                align="center"
              >
                <template slot-scope="scope">
                  <img
                    :src="scope.row.pledgeLogo"
                    alt=""
                    style="width: 30px;height:30px"
                  >
                </template>
              </el-table-column>
              <el-table-column
                prop="pledgeContent"
                :label="$t('pledge.explanation')+'：'"
                align="center"
              ></el-table-column>
              <el-table-column
                prop="type"
                :label="$t('pledge.goods')+'：'"
                align="center"
              ></el-table-column>
              <el-table-column
                prop="level"
                :label="$t('pledge.priority')+'：'"
                align="center"
              ></el-table-column>
              <el-table-column
                :label="$t('pledge.option')+'：'"
                align="center"
              >
                <template slot-scope="scope">
                  <div style="display: flex">
                    <!-- 开关 -->
                    <div class="changeSwitch">
                      <el-switch
                        v-model="scope.row.state"
                        active-color="#F7931E"
                        inactive-color="#ddd"
                        @change="changeOneSwitch(scope.row)"
                      >
                      </el-switch>
                      <span style="color: rgb(153, 153, 153);">
                        {{scope.row.state === true ? $t('pledge.on') : $t('pledge.off')}}
                      </span>
                    </div>
                    <!-- 图标 -->
                    <div class="opt">
                      <!-- 编辑 -->
                      <el-tooltip
                        class="item edit-item"
                        effect="dark"
                        :content="$t('pledge.edit')"
                        placement="top"
                      >
                        <i
                          class="iconfont iconbianji"
                          @click="editAct(scope.row)"
                        ></i>
                      </el-tooltip>

                      <!-- 删除 -->
                      <el-tooltip
                        class="item"
                        effect="dark"
                        :content="$t('pledge.delete')"
                        placement="top"
                      >
                        <i
                          class="iconfont iconshanchu2"
                          @click="deleteAct(scope.row.id)"
                        ></i>
                      </el-tooltip>
                    </div>
                  </div>
                </template>
              </el-table-column>
            </el-table>
          </div>
        </el-tab-pane>
        <!-- 标签页2 -->
        <el-tab-pane
          :label="$t('pledge.addButton')"
          name="second"
          v-if="this.tabValue==='second'"
        >
          <!-- 添加标签页 -->
          <div class="add-page">
            <el-form
              ref="form"
              :model="form"
              :rules="rules"
              label-width="180px"
            >
              <!-- 服务名称 -->
              <el-form-item
                :label="$t('pledge.name')+'：'"
                prop="name"
              >
                <el-input
                  style="width:200px"
                  size="small"
                  v-model="form.name"
                  :placeholder="$t('pledge.nameCheck')"
                ></el-input>
                <span style="padding-left: 15px;color:#999">{{$t('pledge.nameTip')}}</span>
              </el-form-item>
              <!-- 优先级 -->
              <el-form-item
                :label="$t('pledge.priority')+'：'"
                prop="priority"
              >
                <el-input
                  style="width:200px"
                  size="small"
                  v-model="form.priority"
                  :placeholder="$t('pledge.priorityCheck')"
                ></el-input>
                <span style="padding-left: 15px;color:#999">{{$t('pledge.priorityTip')}}</span>
              </el-form-item>
              <!-- 图标 -->
              <el-form-item
                :label="$t('pledge.icon')+'：'"
                prop="icon"
              >

                <!-- 图片弹窗 -->
                <div style="display:flex;align-items:center;flex-wrap:wrap;">
                  <div
                    @click="addGoodsImg"
                    class="ImgWrap"
                  >
                    <el-image
                      style="width: 50px; height: 50px"
                      :src="srcList.src"
                      fit="scale-down"
                    ></el-image>
                  </div>
                  <span style="padding-left: 15px;color:#999">{{$t('pledge.iconTip')}}</span>
                </div>

              </el-form-item>
              <!-- 承诺说明 -->
              <el-form-item
                :label="$t('pledge.explanation')+'：'"
                prop="desc"
              >
                <el-input
                  :autosize="{ minRows: 5}"
                  style="width:400px"
                  size="small"
                  type="textarea"
                  v-model="form.desc"
                ></el-input>
                <span style="padding-left: 15px;color:#999">{{$t('pledge.explanationTip')}}</span>
              </el-form-item>
              <!-- 选择商品 -->
              <el-form-item :label="$t('pledge.chooseGoods')+'：'">
                <el-radio
                  v-model="form.type"
                  :label='1'
                >{{$t('pledge.allGoods')}}</el-radio>
                <el-radio
                  v-model="form.type"
                  :label='2'
                >{{$t('pledge.someGoods')}}</el-radio>

                <!-- 选择全部商品部分商品-->
                <div v-if="form.type === 2">
                  <div
                    v-for="(item,index) in storeArr"
                    :key="index"
                  >
                    <el-button
                      @click="hanldeToAddGoodS(index)"
                      style="margin: 10px 0;margin-right: 10px;"
                      size="small"
                    >
                      <i class="el-icon-plus"></i> {{ item.name }}
                    </el-button>
                    <span v-if="index === 0">{{ $t('pledge.goodsTip1') }} {{ goodsInfo.length > 0 ? goodsInfo.length : 0 }} {{ $t('pledge.goodsTip2') }}</span>
                    <span v-if="index === 1">{{ $t('pledge.goodsTip1') }} {{ busClass.length > 0 ? busClass.length : 0 }} {{ $t('pledge.goodsTip3') }}</span>
                    <span v-if="index === 2">{{ $t('pledge.goodsTip1') }} {{ brandsInfo.length > 0 ? brandsInfo.length : 0 }} {{ $t('pledge.goodsTip4') }}</span>
                  </div>
                </div>

              </el-form-item>

            </el-form>

          </div>
          <!-- 保存按钮 -->
          <div class="footer">
            <el-button
              type="primary"
              size="small"
              @click="addAct('form')"
            >{{$t('pledge.save')}}</el-button>
          </div>
        </el-tab-pane>
      </el-tabs>
    </div>
    <!-- 图片弹窗 -->
    <ImageDalog
      pageIndex='pictureSpace'
      :tuneUp="showImageDialog"
      @handleSelectImg='imgDialogSelectedCallback'
    />
    <!--选择商品弹窗-->
    <ChoosingGoods
      :tuneUpChooseGoods="tuneUpChooseGoods"
      @resultGoodsDatas="choosingGoodsResult"
      :chooseGoodsBack="goodsInfo"
    />
    <!-- 选择 1商家分类;2平台分类弹窗 -->
    <AddingBusClassDialog
      :dialogVisible.sync="tuneUpBusClassDialog"
      :classFlag="classFlag"
      @BusClassTrueDetailData="busClassDialogResult"
      @backDataArr="commInfo"
    />
    <!-- 选择商品品牌弹窗 -->
    <AddBrandDialog
      :callAddBrand.sync="tuneUpBrandDialog"
      :brandBackData="brandsInfo"
      @handleToGetBackData="returnGoodsBrandData"
    />
  </div>
</template>

<script>
import ImageDalog from '@/components/admin/imageDalog'
import AddBrandDialog from '@/components/admin/addBrandDialog'
import { pledgeList, addPledge, delPledge, editPledge, totalSwitch, oneSwitch } from '@/api/admin/basicConfiguration/servicePledge.js'
export default {
  components: {
    ChoosingGoods: () => import('@/components/admin/choosingGoods'),
    AddingBusClassDialog: () => import('@/components/admin/addingBusClassDialog'),
    ImageDalog,
    AddBrandDialog
  },
  data () {
    // var checkLevel = (rule, value, callback) => {
    //   if (!value) {
    //     return callback(new Error('优先级不能为空'))
    //   }
    //
    //   if (!Number.isInteger(value)) {
    //     callback(new Error('请输入数字值'))
    //   }
    // }
    return {
      // 选择商品品牌
      tuneUpBrandDialog: false,
      brandsInfoRow: [],
      brandsInfo: [],
      tabValue: 'first',
      switchValue: '',
      tableData: [],
      id: '',
      // 表单数据
      form: {
        name: '',
        priority: '',
        icon: '',
        desc: '',
        // logos: '',
        type: 1,
        goods: '1',
        goodsIds: [],
        goodsBrandIds: [],
        sortIds: []
      },
      // 数据校验
      rules: {
        name: [
          { required: true, message: this.$t('pledge.nameCheck'), trigger: 'blur' },
          { max: 5, message: this.$t('pledge.nameTip'), trigger: 'blur' }
        ],
        icon: [
          { required: true, message: this.$t('pledge.iconCheck'), trigger: 'blur' }
        ],
        desc: [
          { required: true, message: this.$t('pledge.explanationCheck'), trigger: 'blur' },
          { max: 300, message: this.$t('pledge.explanationTip'), trigger: 'blur' }
        ],
        priority: [
          { required: true, message: '优先级不能为空', trigger: 'blur' }
          // {validator: checkLevel, trigger: 'blur'}
        ]
        // logos: [
        //   { required: true, message: this.$t('pledge.iconCheck'), trigger: 'blur' }
        // ]
      },
      // 图片弹窗
      srcList: {
        src: `${this.$imageHost}/image/admin/add_img.png`
      },
      showImageDialog: false,
      imgHost: `${this.$imageHost}`,

      storeArr: [], // 添加商品数据
      tuneUpChooseGoods: false, // 商品弹窗
      tuneUpBusClassDialog: false, // 商家/平台弹窗
      classFlag: 0, // 商家/平台类型
      // 弹窗结果区分标识 1商家分类;2平台分类
      flag: 0,
      // 商品弹窗回调数据
      goodsInfo: [],
      goodsInfoRow: [],
      // 商家分类弹窗回调数据
      busClass: [],
      busClassRow: [],
      // 平台分类弹窗回调数据
      platClass: [],
      platClassRow: [],
      // 平台分类/商家分类共享变量
      commInfo: []
    }
  },
  watch: {
    lang () {
      this.storeArr = this.$t('pledge.storeArr')
    }
  },
  created () {
    this.loadData()
    this.langDefault()
  },
  methods: {
    // 点击指定商品出现的添加类弹窗汇总
    hanldeToAddGoodS (index) {
      switch (index) {
        case 0:
          this.tuneUpChooseGoods = !this.tuneUpChooseGoods
          break
        case 1:
          this.tuneUpBusClassDialog = !this.tuneUpBusClassDialog
          this.classFlag = 1
          this.flag = 1
          this.commInfo = this.busClass
          break
        case 2:
          this.tuneUpBrandDialog = !this.tuneUpBrandDialog
          break
      }
    },
    // 选择商品品牌
    returnGoodsBrandData (row) {
      this.brandsInfoRow = row
      this.brandsInfo = []
      this.brandsInfoRow.map((item, index) => {
        console.log('item is what ??? ', item)
        this.brandsInfo.push(item.id)
      })
      this.form.goodsBrandIds = this.brandsInfo
      console.log('this.brandsInfo', this.brandsInfo)
      console.log('this.brandsInfoRow', this.brandsInfoRow)
    },
    // 选择商品弹窗回调显示
    choosingGoodsResult (row) {
      this.goodsInfoRow = row
      this.goodsInfo = []
      this.goodsInfoRow.map((item, index) => {
        this.goodsInfo.push(item.goodsId)
      })
      this.form.goodsIds = this.goodsInfo
      console.log('this.goodsInfo', this.goodsInfo)
      console.log('this.goodsInfoRow', this.goodsInfoRow)
      // this.goodsInfoRow = []
      // this.goodsInfo = []
    },
    // 选择商家分类/平台分类弹窗回调显示
    busClassDialogResult (row) {
      if (this.flag === 1) {
        // 商家分类
        this.busClassRow = row
        this.busClass = []
        this.busClassRow.map((item, index) => {
          this.busClass.push(item.sortId)
        })
        this.form.sortIds = this.busClass
        // this.busClassRow = []
        // this.busClass = []
      } else {
        // 平台分类
        this.platClassRow = row
        this.platClass = []
        this.platClassRow.map((item, index) => {
          this.platClass.push(item.catId)
        })
        this.form.sortIds = this.platClass
        // this.platClassRow = []
        // this.platClass = []
      }
    },

    clickTabs (tab, event) {
      console.log(tab, event)
      this.loadData()
    },
    // 初始化加载页面
    loadData () {
      this.form = {
        name: '',
        icon: '',
        desc: '',
        goods: '1',
        priority: '',
        type: 1,
        goodsIds: '',
        goodsBrandIds: '',
        sortIds: ''
      }
      // this.storeArr = [] // 添加商品数据
      // this.tuneUpChooseGoods = false // 商品弹窗
      // this.tuneUpBusClassDialog = false // 商家/平台弹窗
      // this.classFlag = 0 // 商家/平台类型
      // // 弹窗结果区分标识 1商家分类;2平台分类
      // this.flag = 0
      // // 商品弹窗回调数据
      this.goodsInfo = []
      this.goodsInfoRow = []
      // // 商家分类弹窗回调数据
      this.busClass = []
      this.busClassRow = []
      // // 平台分类弹窗回调数据
      this.platClass = []
      this.platClassRow = []
      // // 平台分类/商家分类共享变量
      // this.commInfo = []
      this.id = null
      this.srcList.src = `${this.$imageHost}/image/admin/add_img.png`
      pledgeList().then(res => {
        console.log('listRes:', res)
        if (res.error === 0) {
          res.content.list.map((item, index) => {
            item.state = Boolean(item.state)
            item.pledgeLogo = `${this.$imageHost}` + `/` + item.pledgeLogo
          })
          this.tableData = res.content.list
          this.tableData.map((item, index) => {
            if (item.type === 1) {
              item.type = this.$t('pledge.allGoods')
            }
            if (item.type === 2) {
              item.type = this.$t('pledge.someGoods')
            }
          })
          console.log('state:', Boolean(res.content.state))
          this.switchValue = Boolean(res.content.state)
        }
      }).catch(() => {
        this.$message.error(this.$t('pledge.fail'))
      })
    },
    // 添加服务承诺
    addAct (form) {
      this.$refs[form].validate((valid) => {
        console.log('form:', this.form)
        if (valid) {
          // 校验通过后...
          let addParam = {
            'pledgeName': this.form.name,
            'pledgeLogo': this.form.icon,
            'pledgeContent': this.form.desc,
            'level': this.form.priority,
            'type': this.form.type,
            'goodsIds': this.form.goodsIds,
            'goodsBrandIds': this.form.goodsBrandIds,
            'sortIds': this.form.sortIds
          }
          let editParam = {
            'id': this.id,
            'pledgeName': this.form.name,
            'pledgeLogo': this.form.icon.substring(29),
            'pledgeContent': this.form.desc,
            'level': this.form.priority,
            'type': this.form.type,
            'goodsIds': this.form.goodsIds,
            'goodsBrandIds': this.form.goodsBrandIds,
            'sortIds': this.form.sortIds
          }
          if (this.id !== null) {
            editPledge(editParam).then(res => {
              console.log('editParam:', editParam)
              console.log('editRes:', res)
              if (res.error === 0) {
                alert(this.$t('pledge.success'))
                this.tabValue = 'first'
                this.loadData()
              }
            }).catch(() => {
              this.$message.error(this.$t('pledge.fail'))
            })
          } else {
            addPledge(addParam).then(res => {
              console.log('addRes:', res)
              if (res.error === 0) {
                alert(this.$t('pledge.success'))
                this.tabValue = 'first'
                this.loadData()
              }
            }).catch(() => {
              this.$message.error(this.$t('pledge.fail'))
            })
          }
          // 校验没通过后...
        } else {
          console.log('error submit!!')
          return false
        }
      })
    },
    // 删除服务承诺
    deleteAct (id) {
      this.$confirm(this.$t('pledge.isDelete'), this.$t('pledge.tip'), {
        confirmButtonText: this.$t('pledge.yes'),
        cancelButtonText: this.$t('pledge.no'),
        type: 'warning'
      }).then(() => {
        let delParam = {
          'id': id
        }
        delPledge(delParam).then(res => {
          if (res.error === 0) {
            this.$message.success(this.$t('pledge.success'))
            this.loadData()
          }
        })
      })
    },
    // 切换标签页
    changeTabValue () {
      this.tabValue = 'second'
      console.log('tabValue:', this.tabValue)
    },
    // 编辑服务承诺
    editAct (row) {
      console.log('row：', row)
      this.tabValue = 'second'
      this.form.name = row.pledgeName
      this.form.icon = row.pledgeLogo
      this.form.desc = row.pledgeContent
      this.form.priority = row.level
      this.form.goodsIds = row.goodsIds
      this.form.goodsBrandIds = row.goodsBrandIds
      this.form.sortIds = row.sortIds
      this.goodsInfo = row.goodsIds
      this.brandsInfo = row.goodsBrandIds
      this.busClass = row.sortIds
      if (row.type === this.$t('pledge.allGoods')) {
        this.form.type = 1
      }
      if (row.type === this.$t('pledge.someGoods')) {
        this.form.type = 2
      }
      this.id = row.id
      this.srcList.src = this.form.icon
    },
    // 总开关配置
    changeTotalSwitch () {
      console.log('this.switchValue:', this.switchValue)
      totalSwitch(Number(this.switchValue).toString()).then(res => {
        if (res.error === 0) {
          this.$message.success(this.$t('pledge.success'))
          this.loadData()
        }
      })
    },
    // 单个开关配置
    changeOneSwitch (row) {
      console.log(row)
      let switchParam = {
        'id': row.id,
        'state': Number(row.state)
      }
      oneSwitch(switchParam).then(res => {
        if (res.error === 0) {
          this.$message.success(this.$t('pledge.success'))
        }
      })
    },
    // 活动分享 -- 添加图片点击事件，弹出图片选择组件
    addGoodsImg () {
      this.showImageDialog = !this.showImageDialog
    },
    // 图片点击回调函数
    imgDialogSelectedCallback (src) {
      console.log('path:', src.imgPath)
      console.log('url:', src.imgUrl)
      this.form.icon = src.imgPath
      this.srcList.src = src.imgUrl
      console.log('icon:', this.form.icon)
    }
  }
}
</script>

<style scoped lang="scss">
@import "@/assets/aliIcon/iconfont.scss";
.servicePledge {
  padding: 10px;
  height: 100%;
  .main {
    background-color: #fff;
    padding: 10px;
    .top {
      background-color: #f2f2f2;
      height: 120px;
      padding: 10px;
      /*font-family: "微软雅黑";*/
      font-size: 14px;
      display: flex;
      justify-content: space-between;
      .left {
        .top1 {
          font-size: 20px;
          margin-bottom: 10px;
          font-weight: bold;
        }
      }
      .right {
        width: 110px;
      }
    }
    .mid {
      background-color: #fff;
      height: 70px;
      width: 100%;
      padding: 15px;
      .mid-text {
        padding-left: 15px;
        color: #999;
        font-size: 14px;
      }
    }
    /deep/ .tableClss th {
      background-color: #f5f5f5;
      border: none;
      height: 36px;
      color: #000;
      padding: 8px 10px;
    }
    .table_list {
      position: relative;
      background-color: #fff;
      padding: 0 0 10px;
      // /deep/.el-table__row {
      //   height: 45px;
      //   line-height: 45px;
      // }
    }
    .footer {
      position: fixed;
      bottom: -10px;
      right: 27px;
      left: 160px;
      height: 52px;
      padding: 10px 0;
      background: #fff;
      text-align: center;
    }
  }
}
.changeSwitch {
  margin-left: 30px;
}
.opt {
  .item {
    font-size: 22px;
    color: #5a8bff;
    cursor: pointer;
  }
  .edit-item {
    margin: 0 10px 0 20px;
  }
}
.ImgWrap {
  width: 50px;
  height: 50px;
  border: 1px solid #ccc;
}
</style>

<template>
  <div class="container">

    <!-- 表单 -->
    <div>
      <el-form
        ref="form"
        :model="form"
        :rules="fromRules"
        label-width="130px"
        :label-position="'right'"
      >
        <el-form-item
          :label="$t('shipping.name') + '：'"
          prop="name"
        >
          <el-input
            v-model="form.name"
            :placeholder="$t('shipping.nameTip')"
            size="small"
            style="width: 170px;"
          ></el-input>
        </el-form-item>
        <el-form-item
          :label="$t('shipping.activeTime') + '：'"
          prop="expireType"
        >
          <div>
            <el-radio
              v-model="form.expireType"
              :label='0'
            >{{ this.$t('shipping.expireTypeFixed') }}</el-radio>
            <el-date-picker
              v-model="form.validity"
              type="datetimerange"
              value-format="yyyy-MM-dd HH:mm:ss"
              format="yyyy-MM-dd HH:mm:ss"
              :range-separator="$t('shipping.to')"
              :start-placeholder="$t('ordinaryCoupon.startTime')"
              :end-placeholder="$t('ordinaryCoupon.endTime')"
              :default-time="['00:00:00','23:59:59']"
              size="small"
            >
            </el-date-picker>
          </div>
          <div>
            <el-radio
              v-model="form.expireType"
              :label='1'
            >{{ this.$t('shipping.expireTypeAll') }}</el-radio>
          </div>

        </el-form-item>
        <el-form-item
          :label="$t('shipping.level') + '：'"
          prop="level"
        >
          <el-input
            v-model="form.level"
            :placeholder="$t('shipping.levelTip1')"
            size="small"
            style="width: 170px;"
          ></el-input>
          <span style="margin-left: 10px;color: #ccc;">{{ $t('shipping.levelTip2') }}</span>
        </el-form-item>
        <el-form-item
          :label="$t('shipping.addCommodities') + '：'"
          prop="type"
        >
          <el-radio-group v-model="form.type">
            <el-radio :label="1">{{ $t('distribution.goodsRadio1') }}</el-radio>
            <el-radio :label="0">{{ $t('distribution.goodsRadio2') }}</el-radio>
          </el-radio-group>
          <div v-if="form.type === 0">
            <div
              v-for="(item,index) in storeArr"
              :key="index"
              class="storeContent"
            >
              <el-button
                @click="hanldeToAddGoodS(index)"
                size="small"
              >
                <i class="el-icon-plus"></i> {{ item.name }}
              </el-button>
              <span
                style="color: #e4393c; cursor: pointer;"
                v-if="index === 0"
                @click="onlyHanldeToAddGoodS(index)"
              >{{ $t('distribution.goodsTip1') }} {{ goodsInfo.length > 0 ? goodsInfo.length : 0 }} {{ $t('distribution.goodsTip2') }}</span>
              <span
                style="cursor: pointer;"
                v-if="index === 1"
                @click="hanldeToAddGoodS(index)"
              >
                <span v-if="busClass.length > 0">{{ $t('distribution.goodsTip1')}}{{ $t('distribution.goodsTip5') }}</span>
                <span v-else>{{ $t('distribution.goodsTip6') }}{{ $t('distribution.goodsTip5') }}</span>
              </span>
              <!-- {{ $t('distribution.goodsTip1') }} {{ busClass.length > 0 ? busClass.length : 0 }} {{ $t('distribution.goodsTip3') }} -->
              <!-- <span v-if="index === 2">{{ $t('distribution.goodsTip1') }} {{ platClass.length > 0 ? platClass.length : 0 }} {{ $t('distribution.goodsTip4') }}</span> -->
            </div>
          </div>
        </el-form-item>
        <el-form-item :label="$t('shipping.ruleText') + '：'">
          <!-- prop="ruleList" -->
          <div
            class="fullRule"
            v-for="(item, index) in form.ruleList"
            :key="index"
          >
            <div class="ruleName">
              <span class="ruleNum">{{ $t('shipping.rule') }} {{ index + 1 }}</span>
              <i
                class="el-icon-delete-solid ruleIcon"
                @click="deleteRule(index)"
              ></i>
            </div>
            <div class="ruleContent">
              <el-form-item
                :label="$t('shipping.shippingConditions') + '：'"
                :prop="`ruleList[${index}].conType`"
                :rules="[
                    { required: true, message: '包邮规则不能为空', trigger: 'blur' },
                    { validator: (rule, value, callback)=>{validatePostal(rule, value, callback, item.money, item.num)}, trigger: ['blur', 'change'] }
                  ]"
              >
                <el-radio-group v-model="item.conType">
                  <el-radio :label="0">{{ $t('shipping.ruleTip5') }}</el-radio>
                  <el-radio :label="1">{{ $t('shipping.ruleTip6') }}</el-radio>
                  <el-radio :label="2">{{ $t('shipping.ruleTip7') }}</el-radio>
                </el-radio-group>
                <div>
                  <span v-if="item.conType === 0">
                    {{ $t('shipping.ruleTip1') }} <el-input
                      v-model="item.money"
                      size="small"
                      style="width: 80px;"
                    ></el-input> {{ $t('shipping.ruleTip2') }}
                  </span>
                  <span v-if="item.conType === 1">
                    {{ $t('shipping.ruleTip1') }} <el-input
                      v-model="item.num"
                      size="small"
                      style="width: 80px;"
                    ></el-input> {{ $t('shipping.ruleTip3') }}
                  </span>
                  <span v-if="item.conType === 2">
                    {{ $t('shipping.ruleTip1') }} <el-input
                      v-model="item.money"
                      size="small"
                      style="width: 80px;"
                    ></el-input> {{ $t('shipping.ruleTip2') }}， <el-input
                      v-model="item.num"
                      size="small"
                      style="width: 80px;"
                    ></el-input> {{ $t('shipping.ruleTip3') }}
                  </span>
                </div>
              </el-form-item>
              <el-form-item
                :label="$t('shipping.shippingArea') + '：'"
                style="margin: 20px 0;"
                :prop="`ruleList[${index}].area`"
                :rules="[
                    { required: true, validator: (rule, value, callback)=>{validateArea(rule, value, callback, item.area)}, trigger: ['blur', 'change'] },
                  ]"
              >
                <el-button
                  size="small"
                  type="primary"
                  @click="areaHandler(index)"
                >{{ $t('shipping.areaTip') }}</el-button>
                <el-input
                  v-model="item.area"
                  style="display: none;"
                ></el-input>
                <div>{{ item.areaList }}</div>
              </el-form-item>
            </div>
          </div>
        </el-form-item>
        <el-form-item>
          <el-button
            type="primary"
            size="small"
            @click="addRule"
          ><i class="el-icon-plus"></i> {{ $t('shipping.addRule') }}</el-button>
        </el-form-item>
      </el-form>

    </div>

    <!-- 底部 -->
    <div class="footer">
      <el-button
        size="small"
        type="primary"
        :disabled="submitStatus"
        @click="saveClickHandler(form)"
      >{{ $t('seckill.save') }}</el-button>
    </div>

    <!-- 包邮区域弹窗 -->
    <LocatTP
      :location-list="locationList"
      :outer-visible="outerVisible"
      @close="outerVisible=false"
      :inner-obj-j="innerObjJ"
      :check-list-t="checkListT"
      @checkList="changeRegionList"
    />

    <!--选择商品弹窗-->
    <ChoosingGoods
      :tuneUpChooseGoods="tuneUpChooseGoods"
      @resultGoodsDatas="choosingGoodsResult"
      :onlyShowChooseGoods="isOnlyShowChooseGoods"
      :chooseGoodsBack="goodsInfo"
    />
    <!-- 选择 1商家分类;2平台分类弹窗 -->
    <AddingBusClassDialog
      :dialogVisible.sync="tuneUpBusClassDialog"
      :classFlag="classFlag"
      @BusClassTrueDetailData="busClassDialogResult"
      :backDataArr="commInfo"
    />

  </div>
</template>
<script>
// 引入组件
import chinaData from '@/assets/china-data'
import { deepCloneObj } from '@/util/deepCloneObj'
import { addShipping, getDetail, updateShipping } from '@/api/admin/marketManage/shipping.js'
export default {
  components: {
    ChoosingGoods: () => import('@/components/admin/choosingGoods'),
    AddingBusClassDialog: () => import('@/components/admin/addingBusClassDialog'),
    LocatTP: () => import('@/components/admin/areaLinkage/LocatTP')
  },
  props: ['isEdite', 'editId'],
  data () {
    // 自定义校验
    var validateExpireType = (rule, value, callback) => {
      if (value === 0 && (this.form.validity === null || this.form.validity.length === 0)) {
        callback(new Error('请选择活动固定时间'))
      } else {
        callback()
      }
    }
    var validateLevel = (rule, value, callback) => {
      var re = /^[1-9]\d*$/
      if (!re.test(value)) {
        callback(new Error('活动等级为正整数'))
      } else {
        callback()
      }
    }
    var validateType = (rule, value, callback) => {
      if (value === 0 && (this.goodsInfo.length === 0 && this.busClass.length === 0 && this.platClass.length === 0)) {
        callback(new Error('请选择商品信息'))
      } else {
        callback()
      }
    }
    // var validateRule = (rule, value, callback) => {
    //   if (value.length === 0) {
    //     callback(new Error('请添加包邮规则'))
    //   } else {
    //     callback()
    //   }
    // }
    return {
      // 表单
      form: {
        name: '', // 活动名称
        expireType: 0, // 活动时间类型
        validity: '', // 有效期
        startTime: '',
        endTime: '',
        level: 1, // 优先级
        type: 1, // 添加商品类型
        recommendGoodsId: '',
        recommendCatId: '',
        recommendSortId: '',
        ruleList: [{
          conType: 0,
          money: 0,
          num: 0,
          area: '',
          areaList: ''
        }]
      },
      // 校验表单
      fromRules: {
        name: { required: true, message: '请填写活动名称', trigger: 'blur' },
        expireType: { required: true, validator: validateExpireType, trigger: ['blur', 'change'] },
        level: { validator: validateLevel, trigger: 'blur' },
        type: { required: true, validator: validateType, trigger: 'change' }
        // ruleList: { required: true, validator: validateRule, trigger: ['blur', 'change'] }
      },
      storeArr: [], // 添加商品数据

      tuneUpChooseGoods: false, // 商品弹窗
      isOnlyShowChooseGoods: false,
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
      commInfo: [],

      areaIndex: null,

      // 用与location-list的省市县三级数据
      locationList: [],
      // 用于显示隐藏添加指定配送区域和运费（outer-visible）
      outerVisible: false,
      // 用于inner-obj-j传入选中城市城区的数字,(选中后组件返回，在value中)
      innerObjJ: {},
      // check-list-t调用组件时传入已选中的对象（Array）(选中后组件返回，在value中)
      checkListT: [],
      // 请求报文的goodsDeliverTemplateFeeConditionParam数组数据
      tableData: [],
      // (用于展示)的请求报文的goodsDeliverTemplateFeeConditionParam数组数据
      showTableData: [],

      // areaData: [{
      //   checkListT: [],
      //   innerObjJ: {}
      // }],
      areaData: [],

      submitStatus: false

    }
  },
  watch: {
    lang () {
      this.storeArr = this.$t('shipping.storeArr')
    },
    'form.expireType': function (value) {
      if (value) {
        this.$refs.form.validateField('expireType')
      }
    },
    'form.type': function (value) {
      if (value) {
        this.$refs.form.validateField('type')
      }
    }
  },
  mounted () {
    this.langDefault()
    this.initData()
    // 编辑初始化
    if (this.isEdite === true) {
      this.editShippingInit()
    }
  },
  methods: {
    initData () {
      this.locationList = deepCloneObj(chinaData)
    },

    // 编辑初始化
    editShippingInit () {
      getDetail({ id: this.editId }).then((res) => {
        if (res.error === 0) {
          var data = res.content
          this.form.name = data.name
          this.form.expireType = data.expireType
          if (this.form.expireType === 0) {
            this.form.validity = [data.startTime, data.endTime]
            this.form.startTime = data.startTime
            this.form.endTime = data.endTime
          }
          this.form.level = data.level
          this.form.type = data.type
          if (this.form.type === 0) {
            this.goodsInfo = data.recommendGoodsId !== '' ? data.recommendGoodsId.split(',') : []
            this.busClass = data.recommendCatId !== '' ? data.recommendCatId.split(',') : []
            // this.platClass = data.recommendSortId !== '' ? data.recommendSortId.split(',') : []
          }
          this.form.ruleList = data.ruleList

          // 包邮区域数据回显
          data.ruleList.forEach((item, index) => {
            item.areaList = []
            // item.area = item.area.split(',')
            // item.area = item.area.map(Number)
            item.areaCode = item.area
            item.areaCode = item.areaCode.split(',')
            item.areaCode = item.areaCode.map(Number)

            console.log(this.locationList)
            item.areaCode.forEach((val, key) => {
              this.locationList.forEach(ele => {
                // 省
                if (ele.provinceId === val) {
                  item.areaList.push(ele.provinceName)
                } else {
                  // 市
                  if (ele.areaCity) {
                    ele.areaCity.forEach(ele2 => {
                      if (ele2.cityId === val) {
                        item.areaList.push(ele2.cityName)
                      } else {
                        // 区
                        if (ele2.areaDistrict) {
                          ele2.areaDistrict.forEach(ele3 => {
                            if (ele3.districtId === val) {
                              item.areaList.push(ele3.districtName)
                            }
                          })
                        }
                      }
                    })
                  }
                }
              })
            })
            item.areaList = item.areaList.join(',')

            // 弹框数据回显
            this.updateData(item.areaCode)
            // this.updateData(item.area)
            this.areaData.push({
              checkListT: this.checkListT,
              innerObjJ: this.innerObjJ
            })
            console.log(this.areaData)
          })
        }
      })
    },

    updateData (ruleList) {
      // this.locationList，innerObjJ，checkListT
      // 通过this.locationList 和 editLocation 获取到真正的checkListT,innerObjJ 然后显示
      // 选取出 选中的 id
      const checkListT = this.selectCheckList(ruleList)
      if (checkListT.length === 3647) {
        // this.locationList[0].state = true
        // 全部省市区选中
        checkListT.push(1)
      }
      this.checkListT = checkListT
    },

    // 筛选出checkList
    selectCheckList (ruleList) {
      const checkList = []
      ruleList.forEach((item, index) => {
        checkList.push(item)
      })

      return this.getIdList(checkList)
    },

    // 通过this.locationList拉取id , 选中this.locationList,以及...
    getIdList (checkList) {
      const idList = [] // 存储id
      const strIdList = checkList.toString() // 获取选中的list
      const innerObj = {} // 存储id对象
      this.locationList.forEach(item => {
        if (strIdList.includes(item.provinceId) && item.provinceId !== 1) {
          // 完全相等,表示自身和以下的省，区都遍历进idList
          idList.push(item.provinceId)
          // item.state = true
          item.areaCity &&
            item.areaCity.forEach(city => {
              this.addCheckData(innerObj, city, idList)
            })
        } else if (item.areaCity) {
          // 当和省级不想等的情况下
          item.areaCity.forEach(city => {
            if (strIdList.includes(city.cityId)) {
              this.addCheckData(innerObj, city, idList)
            } else if (city.areaDistrict) {
              // 当和市不想等的情况下
              city.areaDistrict.forEach(district => {
                innerObj[city.cityId] = 0
                if (strIdList.includes(district.districtId)) {
                  idList.push(district.districtId)
                  innerObj[city.cityId]++
                  // district.state = true
                }
              })
            }
          })
        }
      })
      this.innerObjJ = innerObj
      // this.areaData.push({
      //   checkListT: checkList,
      //   innerObjJ: this.innerObjJ
      // })
      // console.log(this.areaData)
      return idList
    },

    // 添加选中的各种
    addCheckData (innerObj, city, idList) {
      innerObj[city.cityId] = 0
      // city.state = true
      idList.push(city.cityId)
      city.areaDistrict &&
        city.areaDistrict.forEach(district => {
          // district.state = true
          innerObj[city.cityId]++
          idList.push(district.districtId)
        })
    },

    // 保存活动
    saveClickHandler () {
      if (this.form.ruleList.length === 0) {
        this.$message.warning('请添加包邮规则')
        return false
      }
      this.$refs['form'].validate((valid) => {
        if (valid) {
          if (this.form.expireType === 0 && this.form.validity) {
            this.form.startTime = this.form.validity[0]
            this.form.endTime = this.form.validity[1]
          }
          this.form.ruleList.forEach((item, index) => {
            this.form.ruleList[index].area = this.form.ruleList[index].area.toString()
          })
          this.form.recommendGoodsId = this.goodsInfo.toString()
          this.form.recommendCatId = this.busClass.toString()
          this.form.recommendSortId = this.platClass.toString()
          console.log(this.form)
          if (this.isEdite === false) {
            // 添加满包邮
            addShipping(this.form).then((res) => {
              if (res.error === 0) {
                this.$message.success({ message: this.$t('shipping.addSuccess') })
                this.$emit('addShippingSubmit')
              }
            })
          } else {
            // 编辑满包邮
            var obj = {}
            obj = this.form
            obj.id = this.editId
            updateShipping(obj).then((res) => {
              if (res.error === 0) {
                this.$message.success({ message: this.$t('shipping.editSuccess') })
                this.$emit('addShippingSubmit')
              }
            })
          }
        }
      })
      this.submitStatus = false
    },

    // 点击指定商品出现的添加类弹窗汇总
    hanldeToAddGoodS (index) {
      switch (index) {
        case 0:
          this.isOnlyShowChooseGoods = false
          this.tuneUpChooseGoods = !this.tuneUpChooseGoods
          break
        case 1:
          this.tuneUpBusClassDialog = !this.tuneUpBusClassDialog
          this.classFlag = 1
          this.flag = 1
          this.commInfo = this.busClass
          break
        case 2:
          this.tuneUpBusClassDialog = !this.tuneUpBusClassDialog
          this.classFlag = 2
          this.flag = 2
          this.commInfo = this.platClass
          break
      }
    },

    // 点击指定商品出现的添加类弹窗汇总--部分
    onlyHanldeToAddGoodS (index) {
      console.log(index)
      switch (index) {
        case 0:
          this.isOnlyShowChooseGoods = true
          this.tuneUpChooseGoods = !this.tuneUpChooseGoods
          break
        case 1:
          this.tuneUpBusClassDialog = true
          this.classFlag = 1
          this.flag = 1
          this.commInfo = this.busClass
          break
        case 2:
          this.tuneUpBusClassDialog = true
          this.classFlag = 2
          this.flag = 2
          this.commInfo = this.platClass
          break
      }
    },

    // 选择商品弹窗回调显示
    choosingGoodsResult (row) {
      this.goodsInfoRow = row
      this.goodsInfo = []
      this.goodsInfoRow.map((item, index) => {
        this.goodsInfo.push(item.goodsId)
      })
      this.$refs['form'].validateField('type')
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
      } else {
        // 平台分类
        this.platClassRow = row
        this.platClass = []
        this.platClassRow.map((item, index) => {
          this.platClass.push(item.catId)
        })
      }
      this.$refs['form'].validateField('type')
    },

    // 添加包邮规则
    addRule () {
      this.form.ruleList.push({
        conType: 0,
        money: 0,
        num: 0,
        area: ''
      })
      this.areaData.push({
        checkListT: [],
        innerObjJ: {}
      })
    },

    // 删除包邮规则
    deleteRule (index) {
      this.form.ruleList.splice(index, 1)
      this.areaData.splice(index, 1)
    },

    // 区域弹窗
    areaHandler (index) {
      this.outerVisible = !this.outerVisible
      this.areaIndex = index
      this.areaData.forEach((item, key) => {
        if (index === key) {
          this.checkListT = this.areaData[index].checkListT
          this.innerObjJ = this.areaData[index].innerObjJ
        }
      })
    },

    // 获取返回的数据
    changeRegionList (value) {
      console.log(value)
      // this.$message.success('添加区域成功!')
      this.form.ruleList.forEach((item, index) => {
        if (index === this.areaIndex) {
          item.area = value.idList.join(',')
          item.areaList = value.areaList.join(',')
        }
      })
      this.areaData.forEach((item, index) => {
        if (index === this.areaIndex) {
          item.checkListT = value.checkList
          item.innerObjJ = value.innerObj

          this.checkListT.push(...value.checkList)
          this.innerObjJ = value.innerObj
        }
      })
    },

    // 校验包邮规则
    validatePostal (rule, value, callback, money, num) {
      var reMoney = /^\d+(\.\d{1,2})?$/
      var reNum = /^(0|\+?[1-9][0-9]*)$/
      if (value === 0 && (!money || !reMoney.test(money))) {
        callback(new Error('请正确填写金额'))
      } else if (value === 1 && (!num || !reNum.test(num))) {
        callback(new Error('请正确填写件数'))
      } else if (value === 2 && (!money || !reMoney.test(money) || !num || !reNum.test(num))) {
        callback(new Error('请正确填写金额和件数'))
      } else {
        callback()
      }
    },

    // 校验包邮区域
    validateArea (rule, value, callback, area) {
      if (!area || area.length === 0) {
        callback(new Error('包邮区域不能为空'))
      } else {
        callback()
      }
    }
  }
}
</script>
<style scoped>
.container {
  margin-top: 10px;
  padding: 10px;
  margin-bottom: 100px;
  background: #fff;
}
.footer {
  position: absolute;
  bottom: 0;
  right: 27px;
  left: 160px;
  height: 52px;
  padding: 10px 0;
  background-color: #fff;
  text-align: center;
  border-top: 1px solid #eee;
  z-index: 9;
}
.shareContent a {
  text-decoration: none;
  color: #409eff;
}
.shareContent a:first-child {
  margin-right: 10px;
}
.imgContent {
  width: 80px;
  height: 80px;
  text-align: center;
  line-height: 65px;
  margin-left: 60px;
  border: 1px solid #ccc;
  cursor: pointer;
  box-sizing: border-box;
}
.imgContent .shareImg {
  width: 100%;
  height: 100%;
}
.member {
  color: #409eff;
  margin: 0 5px;
  cursor: pointer;
}
.picSizeTips {
  display: block;
  line-height: 80px;
  margin-left: 20px;
  color: rgb(153, 153, 153);
}
.storeContent .el-button {
  margin: 10px 0;
  min-width: 150px;
  margin-right: 10px;
}

.fullRule {
  border: 1px solid #eee;
  padding: 0px;
  border-radius: 4px;
  margin-bottom: 10px;
}
.ruleName {
  background: #f5f5f5;
  color: #333;
  font-size: 14px;
  font-weight: 600;
  height: 40px;
  line-height: 40px;
  padding-left: 20px;
}
.ruleIcon {
  float: right;
  margin-top: 10px;
  margin-right: 10px;
  color: #5a8bff;
  font-size: 22px;
  cursor: pointer;
}
.ruleContent {
  padding-bottom: 10px;
}
</style>

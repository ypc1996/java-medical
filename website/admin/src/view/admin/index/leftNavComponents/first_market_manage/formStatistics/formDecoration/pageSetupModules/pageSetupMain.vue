<template>
  <div class="pageSetupMain">
    <div class="listContainer">
      <span>{{$t('formDecorationHome.title')}}：</span>
      <el-input
        size="small"
        v-model="ruleForm.page_name"
        :disabled="isProhibit"
      ></el-input>
    </div>
    <div class="listContainer">
      <span>{{$t('formDecorationHome.termOfValidity')}}：</span>
      <el-radio
        :disabled="isProhibit"
        v-model="ruleForm.is_forever_valid"
        label="1"
      >{{$t('formDecorationHome.permanentValidity')}}</el-radio>
      <el-radio
        :disabled="isProhibit"
        v-model="ruleForm.is_forever_valid"
        label="0"
      >{{$t('formDecorationHome.fixedDate')}}</el-radio>
    </div>
    <!--选中固定日期显示的隐藏模块-->
    <div
      class="listContainer"
      v-if="ruleForm.is_forever_valid==='0'"
    >
      <span></span>
      <div class="fixedDate">
        <div class="timeContainer">
          <div class="timeTitle">{{$t('formDecorationHome.startTime')}}</div>
          <el-date-picker
            size="small"
            v-model="ruleForm.start_time"
            type="datetime"
            default-time="00:00:00"
            format="yyyy-MM-dd HH:mm:ss"
            value-format="yyyy-MM-dd HH:mm:ss"
            :disabled="isProhibit"
          >
          </el-date-picker>
        </div>
        <div
          class="timeContainer"
          style="margin-top:10px"
        >
          <div class="timeTitle">{{$t('formDecorationHome.endTime')}}</div>
          <el-date-picker
            size="small"
            v-model="ruleForm.end_time"
            type="datetime"
            default-time="23:59:59"
            format="yyyy-MM-dd HH:mm:ss"
            value-format="yyyy-MM-dd HH:mm:ss"
            :disabled="isProhibit"
          >
          </el-date-picker>
        </div>
      </div>
    </div>
    <div class="listContainer">
      <span>{{$t('formDecorationHome.submissionLimit')}}</span>
      <el-radio
        :disabled="isProhibit"
        v-model="ruleForm.post_times"
        label="1"
      >{{$t('formDecorationHome.unlimitedNumber')}}</el-radio>
      <el-radio
        :disabled="isProhibit"
        v-model="ruleForm.post_times"
        label="0"
      >{{$t('formDecorationHome.restrictionTimes')}}</el-radio>
    </div>
    <!--选中限制次数显示的隐藏模块-->
    <div
      class="listContainer"
      v-if="ruleForm.post_times==='0'"
    >
      <span></span>
      <div
        class="fixedDate"
        style="width:308px"
      >
        <div class="top">
          <div class="leftName">{{$t('formDecorationHome.daily')}}</div>
          <el-input
            :disabled="isProhibit"
            v-model="ruleForm.day_times"
            size="small"
          ></el-input>
          <div class="leftName">,{{$t('formDecorationHome.cumulative')}}</div>
          <el-input
            :disabled="isProhibit"
            v-model="ruleForm.total_times"
            size="small"
          ></el-input>
        </div>
        <div class="tips">
          {{$t('formDecorationHome.cumulativeTip')}}
        </div>
      </div>
    </div>
    <div class="listContainer">
      <span>{{$t('formDecorationHome.feedbacLimit')}}</span>
      <div class="totleNume">{{$t('formDecorationHome.reach')}}<el-input
          size="small"
          :disabled="isProhibit"
          v-model="ruleForm.get_times"
        ></el-input>{{$t('formDecorationHome.cannotSubmitAfter')}}</div>
    </div>
    <div class="listContainer">
      <span></span>
      <div style="color:#999">{{$t('formDecorationHome.cannotSubmitAfterTip')}}</div>
    </div>
    <div class="listContainer">
      <span>{{$t('formDecorationHome.bottomNavigation')}}</span>
      <el-radio
        :disabled="isProhibit"
        v-model="ruleForm.has_bottom"
        label="1"
      >{{$t('formDecorationHome.addTo')}}</el-radio>
      <el-radio
        :disabled="isProhibit"
        v-model="ruleForm.has_bottom"
        label="0"
      >{{$t('formDecorationHome.notAdd')}}</el-radio>
    </div>
    <div class="listContainer">
      <span>{{$t('formDecorationHome.submitText')}}</span>
      <el-input
        :disabled="isProhibit"
        size="small"
        v-model="ruleForm.notice_name"
        :placeholder="$t('formDecorationHome.submitTextPlaceHolder')"
      ></el-input>
    </div>
    <div class="listContainer">
      <span>{{$t('formDecorationHome.submitTextColor')}}</span>
      <el-color-picker
        :disabled="isProhibit"
        v-model="ruleForm.font_color"
        show-alpha
        :predefine="predefineColors"
      >
      </el-color-picker>
    </div>
    <div class="listContainer">
      <span>{{$t('formDecorationHome.submitBackgroundColor')}}</span>
      <el-color-picker
        :disabled="isProhibit"
        v-model="ruleForm.bg_color"
        show-alpha
        :predefine="predefineColors"
      >
      </el-color-picker>
    </div>
    <div class="listContainer">
      <span>{{$t('formDecorationHome.posterBackground')}}</span>
      <div class="bottomDiv">
        <div class="bgBottom">

          <img
            v-if="!ruleForm.bg_img"
            :src="$imageHost+'/image/admin/add_img_bg.png'"
            class="bgImgDiv"
            @click="handleToAddImg(1)"
          />
          <img
            v-else
            style="width:100%;"
            :src="ruleForm.bg_img"
            @click="handleToAddImg(1)"
          >
        </div>
        <span class="sharePic">{{$t('pageSetUp.recommendedDimensions')}}:800*800{{$t('formDecorationHome.pixel')}}</span>
      </div>
    </div>
    <div class="listContainer">
      <span>{{$t('formDecorationHome.submitCustomJump')}}</span>
      <span style="color:#999;width:210px">{{$t('formDecorationHome.submitCustomJumpTip')}}</span>
    </div>
    <div class="listContainer">
      <span></span>
      <el-checkbox
        :disabled="isProhibit"
        v-model="ruleForm.set_own_link"
      >{{$t('formDecorationHome.customJump')}}</el-checkbox>
      <div class="toCheck">{{$t('formDecorationHome.viewExamples')}}
        <div class="examHidden">
          <img :src="$imageHost+'/image/admin/share/form_success_exapmle.jpg'">
        </div>
      </div>
    </div>
    <div
      class="listContainer"
      v-if="ruleForm.set_own_link"
    >
      <span></span>
      <div class="customLinks">
        <div class="customLinksList">
          <div>{{$t('formDecorationHome.buttonName')}}</div>
          <el-input
            size="small"
            :disabled="isProhibit"
            v-model="ruleForm.custom_btn_name"
          ></el-input>
        </div>
        <div class="customLinksList">
          <div>{{$t('formDecorationHome.jumpLink')}}</div>
          <div
            class="toChoiseLink"
            @click="handleToClickLick()"
          >{{ruleForm.custom_link_path?$t('formDecorationHome.reSelection'):$t('formDecorationHome.selectJumpLink')}}</div>
        </div>
        <!--当跳转链接有值时显示模块-->
        <div>
          <div>{{ruleForm.custom_link_path}}</div>
          <div
            style="margin-top:10px"
            v-if="ruleForm.custom_link_name"
          >({{ruleForm.custom_link_name}})</div>
        </div>
      </div>
    </div>
    <div class="listContainer">
      <span>{{$t('formDecorationHome.userAuthorization')}}</span>
      <el-checkbox
        :disabled="isProhibit"
        v-model="ruleForm.authorized_name"
      >{{$t('formDecorationHome.mobileNumber')}}</el-checkbox>
      <el-checkbox
        :disabled="isProhibit"
        v-model="ruleForm.authorized_mobile"
      >{{$t('formDecorationHome.userInformation')}}</el-checkbox>
    </div>
    <div class="listContainer">
      <span></span>
      <div style="color:#999;width:275px">{{$t('formDecorationHome.userInformationTip')}}</div>
    </div>
    <div class="listContainer linContainer">
      <div class="line"></div>
      <div class="content">{{$t('formDecorationHome.participationAward')}}</div>
      <div class="line"></div>
    </div>
    <div class="listContainer">
      <el-checkbox
        :disabled="isProhibit"
        v-model="ruleForm.send_coupon"
      >{{$t('formDecorationHome.discountVolume')}}</el-checkbox>
    </div>
    <!--选中参与优惠卷显示的隐藏模块-->
    <div
      class="couponListContainer"
      v-if="ruleForm.send_coupon"
    >
      <div class="sendCouponHidden">
        <div
          v-for="(item,index) in ruleForm.send_coupon_list"
          :key="index"
          class="coupon_list"
          :style="'border-color:'+backgroundColorTransparent"
        >
          <img
            class="couponDel"
            :src="$imageHost+'/image/admin/sign_del.png'"
            @click="handleToDelCoupon(index)"
          >
          <div
            class="coupon_list_top"
            :style="'color:'+backgroundColor"
          >
            {{item.act_code==='discount'?'':'¥'}}<span>{{item.type===1&&item.act_code==='random'?item.randomMax:item.denomination}}<i style="font-size:14px">{{item.act_code==='discount'?$t('coupon.fracture'):item.type===1&&item.act_code==='random'?'最高':''}}</i></span>
          </div>
          <div class="coupon_list_center">
            <div
              class="coupon_center_limit"
              :style="'color:'+backgroundColor"
            >
              {{item.consume_text}}
            </div>
            <div
              class="coupon_center_number"
              :style="'color:'+backgroundColorTransparent+';margin-top:3px;word-break: break-all'"
            >{{item.receive_text}}</div>
          </div>
          <div
            class="coupon_list_bottom new_back"
            :style="'background-color:'+backgroundColor"
          >
            {{item.use_score===0?$t('coupon.receive'):item.score_number+$t('coupon.integral')}}
          </div>
        </div>
        <div
          class="bgCoupon"
          v-if="ruleForm.send_coupon_list.length<5"
          @click="handleToClickAddCoupon()"
        >
          <img
            :src="$imageHost+'/image/admin/shop_beautify/add_decorete.png'"
            class="bgImgDiv"
            @click="handleToAddImg()"
          />
          <p>{{$t('formDecorationHome.addDdiscountVolume')}}</p>
        </div>
      </div>
    </div>
    <div class="listContainer">
      <div style="color:#999;width:400px;font-size:12px;padding-left:25px">{{$t('formDecorationHome.addDdiscountVolumeTip')}}</div>
    </div>
    <div class="listContainer sendScore">
      <el-checkbox
        :disabled="isProhibit"
        v-model="ruleForm.send_score"
      >{{$t('formDecorationHome.sendingPoints')}}</el-checkbox>
      &nbsp;&nbsp;
      <el-input
        size="small"
        v-model="ruleForm.send_score_number"
        :disabled="isProhibit"
      ></el-input>&nbsp;&nbsp;{{$t('formDecorationHome.branch')}}
    </div>
    <div class="sure">
      <el-button
        type="primary"
        size="small"
        @click="handleToAddSure()"
      >{{$t('formDecorationHome.Determine')}}</el-button>
    </div>
    <!--选择图片弹窗-->
    <ImageDialog
      pageIndex='pictureSpace'
      :imageSize="[800,800]"
      :tuneUp="imageFlag"
      @handleSelectImg="handleSelectImg"
    />
    <!--选择链接弹窗-->
    <SelectLinks
      :tuneUpSelectLink="tuneUpLinkFlag"
      @handleToGetData="handleToGetLinkData"
    />
    <!--选择优惠卷弹窗-->
    <AddCouponDialog
      :type='-1'
      :tuneUpCoupon="tuneUpCouponFlag"
      @handleToCheck="handleToCheck"
      :formDecType="true"
      :couponBack="couponBackData"
      :origin="false"
    />
  </div>
</template>
<script>
import decMixins from '@/mixins/decorationModulesMixins/formdecorationModulesMixins' // 装修方法混入
export default {
  mixins: [decMixins],
  components: {
    ImageDialog: () => import('@/components/admin/imageDalog'), // 选择图片弹窗
    SelectLinks: () => import('@/components/admin/selectLinks'), // 选择链接弹窗
    AddCouponDialog: () => import('@/components/admin/addCouponDialog') // 选择优惠卷弹窗
  },
  props: {
    pageSet: Object
  },
  data () {
    return {
      isProhibit: false, // 是否全部禁用
      predefineColors: [ // 颜色选择器预定义颜色池
        '#ff4500',
        '#ff8c00',
        '#ffd700',
        '#90ee90',
        '#00ced1',
        '#1e90ff',
        '#c71585',
        'rgba(255, 69, 0, 0.68)',
        'rgb(255, 120, 0)',
        'hsv(51, 100, 98)',
        'hsva(120, 40, 94, 0.5)',
        'hsl(181, 100%, 37%)',
        'hsla(209, 100%, 56%, 0.73)',
        '#FF0000'
      ],
      ruleForm: {
        'page_name': '', // 标题input值
        'is_forever_valid': '1', // 有效期radio
        'has_bottom': '0', // 底部导航radio
        'start_time': '', // 开始时间
        'end_time': '', // 结束时间
        'post_times': '1', // 提交次数限制radio
        'day_times': '1', // 每天input值
        'total_times': '1', // 累计input值
        'get_times': '0', // 总反馈数量限制input值
        'notice_name': '', // 提交按钮文字
        'font_color': '#ffffff', // 提交按钮文字颜色
        'bg_color': '#ff6666', // 提交按钮背景颜色
        'bg_img': '', // 表单海报背景图片
        'set_own_link': 0, // 自定义跳转checked
        'custom_btn_name': '', // 自定义按钮名称
        'custom_link_path': '', // 跳转链接
        'custom_link_name': '', // 跳转链接名称
        'send_coupon': 0, // 参与送优惠卷checkbox
        'send_coupon_list': [
          // {
          //   "act_code":"voucher",
          //   "coupon_id":"517",
          //   "use_score":"0",
          //   "score_number":"",
          //   "denomination":"10",
          //   "random_min":"0",
          //   "random_max":"0",
          //   "consume_text":"无门槛",
          //   "receive_text":"库存不限制",
          //   "coupon_name":"测试标签"
          // }
        ], // 选择的优惠卷数据列表
        'send_score': 0, // 参与送积分选中checkbox
        'send_score_number': null, // 输入的送积分input值
        'authorized_name': 0, // 授权手机号
        'authorized_mobile': 0 // 授权用户信息
      },
      imageFlag: false, // 图片弹窗调起
      tuneUpLinkFlag: false, // 选择链接弹窗调起
      tuneUpCouponFlag: false, // 选择优惠卷弹窗调起
      couponBackData: [], // 选择优惠卷回显数据
      backgroundColorTransparent: '',
      backgroundColor: '',
      noThreshold: '不限制', // 优惠卷相关
      full: '', // 优惠卷相关
      available: '', // 优惠卷相关
      surplus: '', // 优惠卷相关
      zhang: '', // 优惠卷相关
      unlimitedInventory: ''// 优惠卷相关
    }
  },
  watch: {
    lang () {
      // this.noThreshold = this.$t('coupon.noThreshold')
      this.full = this.$t('coupon.full')
      this.available = this.$t('coupon.available')
      this.surplus = this.$t('coupon.surplus')
      this.zhang = this.$t('coupon.zhang')
      this.unlimitedInventory = this.$t('coupon.unlimitedInventory')
    },
    pageSet: {
      handler (newData) {
        console.log(newData)
        // 中部传递过来的初始表单配置数据初始回显
        // push进couponBackData
        let turnArr = ['set_own_link', 'authorized_name', 'authorized_mobile', 'send_coupon', 'send_score']
        if (newData) {
          // let data = JSON.parse(JSON.stringify(newData))
          Object.keys(newData).forEach((item, index) => {
            console.log(turnArr.indexOf(item))
            if (turnArr.indexOf(item) !== -1) {
              console.log(typeof newData[item])
              if (typeof newData[item] === 'number') {
                newData[item] = this.handleToTurnBoolean(newData[item])
              }

              console.log(newData[item])
            }
          })
          let arr = []
          newData.send_coupon_list.forEach((item, index) => {
            arr.push(item.coupon_id)
          })
          console.log(newData)
          this.couponBackData = arr
          this.ruleForm = newData
        }
      },
      immediate: true,
      deep: true
    },
    ruleForm: {
      handler (newData) {
        console.log(newData)
        // let arr = ['set_own_link', 'authorized_name', 'authorized_mobile', 'send_coupon', 'send_score']
        // let data = JSON.parse(JSON.stringify(newData))
        // Object.keys(data).forEach((item, index) => {
        //   console.log(arr.indexOf(item))
        //   if (arr.indexOf(item) !== -1) {
        //     data[item] = this.handleToTurnBoolean(data[item])
        //     console.log(data[item])
        //   }
        // })
        // console.log(data)
        this.$emit('hanelToPageSet', newData)
      },
      deep: true
    }
  },
  mounted () {
    this.$nextTick(() => {
      console.log(localStorage.getItem('isProhibitForm'))
      this.isProhibit = JSON.parse(localStorage.getItem('isProhibitForm'))
    })

    // 初始化语言
    this.langDefault()
    this.backgroundColor = 'rgb(255, 102, 102)'
    this.backgroundColorTransparent = this.backgroundColor.split(')')[0] + ',0.4)'
  },
  methods: {
    // 表单海报背景图点击添加图片
    handleToAddImg (flag) {
      console.log(flag)
      if (this.isProhibit) return
      if (flag === 1) {
        this.imageFlag = !this.imageFlag
      }
    },
    // 选择图片弹窗选中回传
    handleSelectImg (res) {
      console.log(res)
      this.ruleForm.bg_img = res.imgUrl
    },
    handleToClickLick () {
      if (this.isProhibit) return
      this.tuneUpLinkFlag = !this.tuneUpLinkFlag
      console.log(this.tuneUpLinkFlag)
    },
    // 选择链接弹窗选中回传
    handleToGetLinkData (res) {
      console.log(res)
      this.ruleForm.custom_link_path = res.path
      this.ruleForm.custom_link_name = res.title
    },
    // 点击添加优惠卷
    handleToClickAddCoupon () {
      if (this.isProhibit) return
      this.tuneUpCouponFlag = !this.tuneUpCouponFlag
    },
    // 选中优惠卷回传
    handleToCheck (res) {
      console.log(res)
      res.forEach((item, index) => {
        let useConsumeRestrict = ''
        // 判断优惠券是否已被选过
        let isExistence = this.ruleForm.send_coupon_list.filter((itemC, indexC) => {
          return itemC.coupon_id === item.id
        })
        if (item.useConsumeRestrict === 0) {
          useConsumeRestrict = this.noThreshold
        } else {
          useConsumeRestrict = `${this.full}${item.leastConsume}${this.available}`
        }
        let obj = {
          'act_code': item.actCode, // 是否是打折卷  discount：打折卷   voucher不是打折卷
          'denomination': item.denomination, // 面额
          'consume_text': useConsumeRestrict, // 使用门槛
          'receive_text': item.limitSurplusFlag === 0 ? `${this.surplus}${item.surplus}${this.zhang}` : this.unlimitedInventory, // 卡卷剩余数
          'coupon_id': item.id, // 优惠券id
          'use_score': item.useScore, // 是否可以积分兑换
          'score_number': item.scoreNumber, // 需要积分数
          'limitSurplusFlag': item.limitSurplusFlag,
          'type': item.type,
          'randomMax': item.randomMax
        }
        console.log(isExistence, obj, item)
        if (isExistence.length === 0) {
          this.ruleForm.send_coupon_list.push(obj)
          let arrBack = []
          this.ruleForm.send_coupon_list.forEach((item, index) => {
            arrBack.push(item.coupon_id)
          })
          console.log(arrBack)
          this.couponBackData = arrBack
        }
      })
    },
    // 点击优惠券右上角删除icon
    handleToDelCoupon (index) {
      if (this.isProhibit) return
      this.ruleForm.send_coupon_list.splice(index, 1)
      this.couponBackData.splice(index, 1)
    },
    // 点击确定
    handleToAddSure () {
      if (this.isProhibit) return
      if (this.ruleForm.page_name === '') {
        this.$message.error({
          message: '表单标题不能为空',
          showClose: true
        })
      } else {
        this.$emit('clickSure', true)
      }
    }
  }
}
</script>
<style lang="scss" scoped>
.pageSetupMain {
  font-size: 14px;
  .listContainer {
    display: flex;
    margin-bottom: 20px;
    span {
      display: flex;
      width: 140px;
      justify-content: flex-end;
      align-items: center;
    }
    /deep/ .el-input {
      width: 150px;
    }
    .fixedDate {
      width: 310px;
      background: #fff;
      padding: 10px;
      border: 1px solid #ddd;
      font-size: 13px;
      .timeContainer {
        display: flex;
        /deep/ .el-input {
          width: 200px !important;
        }
        .timeTitle {
          display: flex;
          align-items: center;
          margin-right: 10px;
        }
      }
      .top {
        display: flex;
        /deep/ .el-input {
          width: 80px;
        }
        .leftName {
          display: flex;
          align-items: center;
          margin-right: 5px;
        }
      }
      .tips {
        font-size: 12px;
        color: #999;
        margin-top: 10px;
      }
    }
    .totleNume {
      /deep/ .el-input {
        width: 80px;
        margin: 0 5px;
      }
    }
    .bottomDiv {
      display: flex;
      .bgBottom {
        width: 70px;
        height: 70px;
        display: flex !important;
        justify-content: center;
        align-items: center;
        border: 1px solid #ccc;
        .bgImgDiv {
          width: 47px;
          height: 44px;

          cursor: pointer;
        }
      }
      .sharePic {
        color: #999;
        width: 180px;
        padding-left: 10px;
        justify-content: flex-start !important;
      }
      /deep/ .el-button {
        margin-top: 10px;
      }
    }

    .toCheck {
      color: #5a8bff;
      cursor: pointer;
      display: flex;
      align-items: center;
      margin-left: 5px;
      position: relative;
      .examHidden {
        display: none;
        position: absolute;
        left: -254px;
        top: -50px;
        padding: 20px;
        background-color: #fff;
        border-radius: 5px;
        z-index: 100;
        img {
          width: 200px;
          height: 355.74px;
          border: 1px solid #eee;
        }
        &::before {
          content: " ";
          position: absolute;
          top: 48px;
          right: -8px;
          width: 14px;
          height: 14px;
          background-color: #fff;
          transform: rotate(-45deg);
          z-index: 4;
          box-shadow: 3px 3px 4px #e5e5e5;
        }
      }
      &:hover {
        .examHidden {
          display: block !important;
        }
      }
    }
    .customLinks {
      .customLinksList {
        margin-bottom: 20px;
        display: flex;
        align-items: center;
        .toChoiseLink {
          cursor: pointer;
          color: #5a8bff;
        }
      }
    }
    .line {
      width: 35%;
      height: 1px;
      background: #eee;
    }
    .content {
      width: 20%;
      text-align: center;
    }
  }
  .sendScore {
    align-items: center;
  }
  .linContainer {
    display: flex;
    align-items: center;
  }
  .sure {
    display: flex;
    justify-content: center;
  }
  .couponListContainer {
    margin-bottom: 20px;
    .sendCouponHidden {
      border: 1px solid #eee;
      background: #fff;
      width: 390px;
      padding: 10px;
      margin-left: 15px;
      display: flex;
      flex-wrap: wrap;
      .coupon_list {
        width: 100px;
        margin-right: 20px;
        margin-bottom: 10px;
        border: 1px solid #fbb;
        -webkit-border-radius: 110px;
        -moz-border-radius: 10px;
        border-radius: 10px;
        text-align: center;
        position: relative;
        .couponDel {
          position: absolute;
          top: -5px;
          right: -5px;
          cursor: pointer;
        }
        .coupon_list_top {
          margin-top: 10px;
          color: #f66;
          font-size: 14px;
          height: 34px;
          span {
            font-size: 20px;
            font-weight: bold;
            display: inline-block;
          }
        }
        .coupon_list_center {
          height: 40px;
          color: #f66;
          font-size: 12px;
        }
        .coupon_list_bottom {
          font-size: 12px;
          background: #f66
            url(../../../../../../../../assets/adminImg/coupon_border.png)
            repeat-x top;
          -webkit-background-size: 12px;
          background-size: 12px;
          height: 24px;
          line-height: 30px;
          color: #fff;
          border-radius: 0 0 7px 7px;
          margin-left: -1px;
        }
      }
      .bgCoupon {
        background: #fff;
        border: 1px solid #e4e4e4;
        text-align: center;
        width: 100px;
        height: 82px;
        border-radius: 3px;
        padding: 13px 0;
        cursor: pointer;
        p {
          color: #999;
          font-size: 12px;
          margin: 8px 0 0 0;
        }
      }
    }
  }
}
</style>

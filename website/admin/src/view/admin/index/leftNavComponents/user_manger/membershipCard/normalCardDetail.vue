<template>
  <div class="membershipCardDetail">
    <div class="membershipCardDetailMain">
      <div class="leftContainer">
        <showSampleCard :sampleData="sampleCardData" :allData="$data"></showSampleCard>
      </div>
      <div class="rightContainer">
        <div class="rightContainerTop">
          <div class="rightTitle">{{ $t('memberCard.basicSetting') }}</div>
          <cardNameAndBg
            :val="cardNameAndBg"
            @input="initCardNameAndBg"
            ref="cardNameAndBg"
          ></cardNameAndBg>

          <cardEffectTime
            :val="cardEffectTime"
            @input="initCardEffectTimeData"
            ref="cardEffectTime"
          ></cardEffectTime>
          <!-- 续费开发 -->
          <div v-show="Number(cardEffectTime.expiredType) !== 2">
            <cardRenewCfg
              v-bind.sync="cardRenew"
              ref="cardRenew"
            />
          </div>

          <cardStoreCfg
            :val="cardStoreCfgData"
            @input="initCardStoreCfgData"
          ></cardStoreCfg>
          <cardUsageCfg
            :val="cardUsageCfgData"
            @input="initCardUsageCfgData"
          ></cardUsageCfg>
        </div>
        <div class="member-rights">
          <div class="rightTitle">会员权益</div>
          <scoreDiscount
            :val="disCountData"
            :marketActivities="marketActivities"
            @input="initDiscountData"
            ref="disCountData"
          ></scoreDiscount>
          <ownGoods
            :val="ownGoodsData"
            @input="initOwnGoodsData"
          ></ownGoods>
          <cardScoreCfg
            :val="cardScoreCfgData"
            @input="initCardScoreCfgData"
            ref="cardScoreCfgData"
          ></cardScoreCfg>
          <cardChargeCfg
            :val="cardChargeCfgData"
            @input="initCardChargeCfgData"
            ref="cardChargeCfgData"
          ></cardChargeCfg>
          <cardCouponCfg
            :val="cardCouponCfgData"
            @input="initCardCouponCfgData"
            ref="cardCouponCfgData"
          ></cardCouponCfg>
          <!-- 包邮 -->
          <cardFreeshipCfg
            v-bind.sync="freeship"
            ref="freeship"
          >
          </cardFreeshipCfg>
          <!-- 自定义权益 -->
          <cardCustomRights v-bind.sync="customRights" />
        </div>
        <div class="rightContainerBottom">
          <div class="rightTitle">{{ $t('memberCard.getSetting') }}</div>
          <cardReceiveCfg
            :val="cardReceiveCfgData"
            @input="initCardReceiveCfgData"
            ref="cardReceiveCfgData"
          ></cardReceiveCfg>
          <cardActiveCfg
            :val="cardActiveCfgData"
            @input="initCardActiveCfgData"
            ref="cardActiveCfgData"
          ></cardActiveCfg>
        </div>
        <div class="advance-setting">
          <div class="rightTitle">高级设置</div>
          <card-advance-cfg
            :cardTag="cardTag"
            :cardType="cardType"
          />
        </div>
      </div>
    </div>
    <div class="footer">
      <el-button type="primary" size="small" @click="handleToSave">{{$t('memberCard.save')}}</el-button>
    </div>
  </div>
</template>
<script>
import { createMemberCardRequest, getCardDetailInfoRequest, updateCardRequest } from '@/api/admin/memberManage/memberCard.js'
export default {
  components: {
    showSampleCard: () => import(
      './subcomponents/showSampleCard'
    ),
    cardNameAndBg: () => import(
      './subcomponents/cardNameAndBg'
    ),
    scoreDiscount: () => import(
      './subcomponents/scoreDiscount'
    ),
    ownGoods: () => import(
      './subcomponents/ownGoods'
    ),
    cardScoreCfg: () => import(
      './subcomponents/cardScoreCfg'
    ),
    cardChargeCfg: () => import(
      './subcomponents/cardChargeCfg'
    ),
    cardEffectTime: () => import(
      './subcomponents/cardEffectTime'
    ),
    cardCouponCfg: () => import(
      './subcomponents/cardCouponCfg'
    ),
    cardStoreCfg: () => import(
      './subcomponents/cardStoreCfg'
    ),
    cardUsageCfg: () => import(
      './subcomponents/cardUsageCfg'
    ),
    cardReceiveCfg: () => import(
      './subcomponents/cardReceiveCfg'
    ),
    cardActiveCfg: () => import(
      './subcomponents/cardActiveCfg'
    ),
    cardFreeshipCfg: () => import(
      './subcomponents/cardFreeshipCfg'
    ),
    cardRenewCfg: () => import(
      './subcomponents/cardRenewCfg'
    ),
    cardCustomRights: () => import(
      './subcomponents/cardCustomRights'
    ),
    cardAdvanceCfg: () => import(
      './subcomponents/cardAdvanceCfg'
    )
  },
  computed: {

  },
  data () {
    let cardScoreCfgDataTmp = {
      powerScore: true,
      score: undefined,
      offSet: '0',
      shopingInputLeft: 100,
      shopingInputRight: 100,
      shopingInputLeftM: 100,
      shopingInputRightM: 100,
      addIntegralArr: [
      ],
      valid: false
    }
    let cardChargeCfgDataTmp = {
      powerCard: null,
      sendMoney: undefined,
      offset: '2',
      chargeInputLeft: 100,
      chargeInputRight: 100,
      chargeInputLeftM: 100,
      chargeInputRightM: 100,
      addChargeArr: [],
      money: [],
      getMoney: [],
      valid: false
    }
    let cardEffectTimeTmp = {
      expiredType: '0',
      fixedDate: null,
      receiveDay: undefined,
      dateType: '0',
      valid: false
    }
    let cardStoreCfgDataTmp = {
      storeListType: '0',
      choosedStore: [
      ]
    }
    let cardUsageCfgDataTmp = {
      desc: null,
      mobile: null
    }
    return {
      cardId: null,
      cardType: null,
      cardNameAndBg: {
        cardName: null,
        bgType: '0',
        bgColor: '',
        bgImg: '',
        valid: false
      },
      disCountData: {
        powerDiscount: true,
        discount: undefined,
        discountGoodsType: '1',
        choosedGoodsId: [],
        choosedStoreId: [],
        choosedPlatformId: [],
        choosedBrandId: [],
        valid: false
      },
      ownGoodsData: {
        powerOwnGoods: false,
        choosedGoodsId: [],
        choosedStoreId: [],
        choosedPlatformId: [],
        choosedBrandId: []
      },
      cardScoreCfgData: cardScoreCfgDataTmp,
      cardChargeCfgData: cardChargeCfgDataTmp,
      cardCouponCfgData: {
        powerCoupon: false,
        couponType: '1',
        couponIdList: [],
        couponList: [],
        couponPack: null,
        valid: false
      },
      cardEffectTime: cardEffectTimeTmp,
      cardStoreCfgData: cardStoreCfgDataTmp,
      cardUsageCfgData: cardUsageCfgDataTmp,
      cardReceiveCfgData: {
        cardType: 0,
        isPay: '0',
        payType: '0',
        payMoney: undefined,
        payScore: undefined,
        receiveAction: '1',
        stock: 0,
        limits: 0,
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
        ],
        valid: false
      },
      cardActiveCfgData: {
        activation: '0',
        activationCfgBox: [],
        examine: '0',
        customAction: [],
        valid: false
      },
      sampleCardData: {
        cardName: '',
        bgColor: '',
        bgImg: '',
        bgType: '',
        powerDiscount: true,
        discount: '',
        discountGoodsType: '0',
        cardScoreCfgData: cardScoreCfgDataTmp,
        cardChargeCfgData: cardChargeCfgDataTmp,
        cardEffectTime: cardEffectTimeTmp,
        cardStoreCfgData: cardStoreCfgDataTmp,
        cardUsageCfgData: cardUsageCfgDataTmp
      },
      // 包邮信息
      freeship: {
        num: 0,
        type: -1,
        valid: false
      },
      cardRenew: {
        renewMemberCard: 0,
        renewType: 0,
        renewNum: null,
        renewTime: null,
        renewDateType: null
      },
      // 自定义权益
      customRights: {
        customRightsFlag: 'off',
        customRightsAll: []
      },
      cardTag: {
        cardTag: 'off',
        cardTagId: []
      },
      marketActivities: [],
      isCanSave: true
    }
  },
  mounted () {
    this.dataDefault()
  },
  methods: {
    dataDefault () {
      this.cardType = Number(this.$route.query.cardType)
      this.cardId = Number(this.$route.query.cardId)
      console.log(this.cardId)
      if (this.cardId) {
        // 单张会员卡信息
        this.getCardDetailInfoById(this.cardId)
      }
    },
    getCardDetailInfoById (id) {
      console.log(id, this.cardId)
      getCardDetailInfoRequest({ id }).then(res => {
        console.log(res)
        if (res.error === 0) {
          // success
          // bind data from backend to frontend
          this.bindBackAndFrontEndData(res.content)
        }
      })
    },
    bindBackAndFrontEndData (data) {
      this.cardId = data.id
      this.cardNameAndBg.cardName = data.cardName
      this.cardNameAndBg.bgType = String(data.bgType)
      this.cardNameAndBg.bgColor = data.bgColor
      this.cardNameAndBg.bgImg = data.bgImg

      // 折扣
      this.disCountData.powerDiscount = data.powerCount === 1
      if (data.disCount !== null) {
        this.disCountData.discount = data.disCount
      } else {
        this.disCountData.discount = void 0
      }
      if (this.isValidValue(data.discountIsAll)) {
        this.disCountData.discountGoodsType = String(data.discountIsAll)
      }
      this.disCountData.choosedGoodsId = []
      if (data.goodsId !== null && data.goodsId.length > 0) {
        this.disCountData.choosedGoodsId.push(...data.goodsId.map(x => Number(x)))
      }
      this.disCountData.choosedStoreId = data.shopCategoryIds
      this.disCountData.choosedPlatformId = data.platformCategoryIds
      this.disCountData.choosedBrandId = data.brandId.map(item => Number(item))

      // 专享
      this.ownGoodsData.powerOwnGoods = data.powerPayOwnGood === 'on'
      this.ownGoodsData.choosedGoodsId = data.ownGoodsId
      this.ownGoodsData.choosedStoreId = data.ownStoreCategoryIds
      this.ownGoodsData.choosedPlatformId = data.ownPlatFormCategoryIds
      this.ownGoodsData.choosedBrandId = data.ownBrandId

      // 积分
      this.cardScoreCfgData.powerScore = data.powerScore ? true : data.powerScore === 1
      this.cardScoreCfgData.score = data.score
      this.cardScoreCfgData.offSet = data.scoreJson ? String(data.scoreJson.offset) : '0'

      // 购物满
      if (data.scoreJson !== null) {
        if (data.scoreJson.goodsMoney.length > 0) {
          this.cardScoreCfgData.shopingInputLeft = data.scoreJson.goodsMoney[0]
          this.cardScoreCfgData.shopingInputRight = data.scoreJson.getScores[0]
          data.scoreJson.goodsMoney.splice(0, 1)
          data.scoreJson.getScores.splice(0, 1)
          for (let index in data.scoreJson.goodsMoney) {
            this.cardScoreCfgData.addIntegralArr.push({
              leftInput: data.scoreJson.goodsMoney[index],
              rightInput: data.scoreJson.getScores[index]
            })
          }
        }
        // 购物每满
        this.cardScoreCfgData.shopingInputLeftM = data.scoreJson.perGoodsMoney
        this.cardScoreCfgData.shopingInputRightM = data.scoreJson.perGetScores
      }
      // 充值
      this.cardChargeCfgData.powerCard = data.powerCard ? data.powerCard === 1 : false
      this.cardChargeCfgData.sendMoney = data.sendMoney ? data.sendMoney : undefined
      this.cardChargeCfgData.offset = data.powerCardJson ? String(data.powerCardJson.offsetMoney) : '2'
      this.cardChargeCfgData.chargeInputLeftM = data.powerCardJson ? data.powerCardJson.perMoney : 100
      this.cardChargeCfgData.chargeInputRightM = data.powerCardJson ? data.powerCardJson.perGetMoney : 100
      if (data.powerCardJson && data.powerCardJson.money && data.powerCardJson.money.length > 0) {
        this.cardChargeCfgData.chargeInputLeft = data.powerCardJson.money[0]
        this.cardChargeCfgData.chargeInputRight = data.powerCardJson.getMoney[0]
        data.powerCardJson.money.splice(0, 1)
        data.powerCardJson.getMoney.splice(0, 1)
        for (let index in data.powerCardJson.money) {
          this.cardChargeCfgData.addChargeArr.push({
            leftInput: data.powerCardJson.money[index],
            rightInput: data.powerCardJson.getMoney[index]
          })
        }
      }

      // 优惠券
      this.cardCouponCfgData.powerCoupon = data.sendCouponSwitch === 1
      this.cardCouponCfgData.couponType = String(data.sendCouponType + 1)
      this.cardCouponCfgData.couponIdList = data.couponIds ? data.couponIds : []
      this.cardCouponCfgData.couponList = data.couponList ? data.couponList : []
      this.cardCouponCfgData.couponPack = data.couponPack

      // 门店
      this.cardStoreCfgData.storeListType = String(data.storeListType)
      let storeListTmp = []
      if (data.storeList && data.storeList.length > 0) {
        data.storeList.forEach(item => {
          storeListTmp.push({
            storeId: item.value,
            storeName: item.label
          })
        })
      }
      this.cardStoreCfgData.choosedStore = storeListTmp

      // 日期
      this.cardEffectTime.expiredType = String(data.expireType)
      this.cardEffectTime.fixedDate = [data.startTime, data.endTime]
      if (data.startTime === null) { this.cardEffectTime.fixedDate = '' }
      console.log(this.cardEffectTime.fixedDate)
      if (data.receiveDay !== null) {
        this.cardEffectTime.receiveDay = data.receiveDay
      } else {
        this.cardEffectTime.receiveDay = void 0
      }
      this.cardEffectTime.dateType = data.dateType ? String(data.dateType) : '0'
      // 包邮信息
      if (data.freeship) {
        this.freeship = data.freeship
      }

      this.freeship.valid = false

      // 续费信息
      if (data.cardRenew) {
        this.cardRenew = data.cardRenew
      }
      // 自定义权益
      if (data.customRights) {
        this.customRights = data.customRights
      }

      // 使用须知
      this.cardUsageCfgData.desc = data.desc
      this.cardUsageCfgData.mobile = data.mobile
      // 领取设置
      this.cardReceiveCfgData.isPay = String(data.isPay)
      this.cardReceiveCfgData.payType = String(data.payType)
      this.cardReceiveCfgData.payMoney = data.payMoney
      this.cardReceiveCfgData.payScore = data.payScore
      this.cardReceiveCfgData.receiveAction = data.receiveAction === 0 ? '1' : String(data.receiveAction)
      if (data.batchList && this.cardReceiveCfgData.receiveAction === '1') {
        if (data.batchList.length > 0) {
          this.cardReceiveCfgData.codeAddDivArr = []
          data.batchList.forEach(item => {
            if (!item.pwdBatch) {
              this.cardReceiveCfgData.codeAddDivArr.push(
                {
                  batchName: item.name,
                  batchId: item.batchId,
                  action: item.action,
                  disabled: true
                }
              )
            }
          })
        }
      } else {
        this.cardReceiveCfgData.codeAddDivArr = [{ batchName: null, batchId: null, action: null, disabled: false }]
      }

      if (data.batchList && this.cardReceiveCfgData.receiveAction === '2') {
        if (data.batchList.length > 0) {
          this.cardReceiveCfgData.codeAddDivArrBottom = []
          data.batchList.forEach(item => {
            if (item.pwdBatch) {
              this.cardReceiveCfgData.codeAddDivArrBottom.push(
                {
                  pwdName: item.name,
                  pwdId: item.batchId,
                  action: item.action,
                  disabled: true
                }
              )
            }
          })
        }
      } else {
        this.cardReceiveCfgData.codeAddDivArrBottom = [{ pwdName: null, pwdId: null, action: null, disabled: false }]
      }

      // 激活条件
      this.cardActiveCfgData.activation = String(data.activation)
      this.cardActiveCfgData.activationCfgBox = data.activationCfgBox ? data.activationCfgBox : []
      this.cardActiveCfgData.examine = String(data.examine)
      // 自定义激活数据
      let action = data.customAction.map(item => {
        return {
          type: item.custom_type,
          title: item.custom_title,
          content: item.option_arr,
          conditionChecked: Boolean(item.option_ver),
          checked: Boolean(item.is_checked),
          pictureNumber: item.pictureNumber
        }
      })
      this.cardActiveCfgData.customAction = action

      // 同步用户标签
      if (data.cardTag) {
        this.cardTag = {
          cardTag: data.cardTag.cardTag,
          cardTagId: data.cardTag.cardTags
        }
      }

      // 不折扣公用营销活动
      if (data.marketActivities) {
        this.marketActivities = data.marketActivities
      }
      console.log(this.marketActivities)
    },

    isValidValue (data) {
      return data !== null && data !== undefined
    },
    getMiniLog (item) {
      return 'backgroundImage: url(' + item.backGroundImgUrl + ')'
    },
    initCardNameAndBg (val) {
      this.initSampleCardData(val)
      this.cardNameAndBg = val
    },
    initDiscountData (val) {
      this.initSampleCardDiscountData(val)
      this.disCountData = val
    },
    initOwnGoodsData (val) {
      this.ownGoodsData = val
    },

    initCardScoreCfgData (val) {
      this.cardScoreCfgData = val
    },
    initCardChargeCfgData (val) {
      this.cardChargeCfgData = val
    },
    initCardEffectTimeData (val) {
      this.cardEffectTime = val
    },
    initCardCouponCfgData (val) {
      this.cardCouponCfgData = val
    },
    initCardStoreCfgData (val) {
      this.cardStoreCfgData = val
    },
    initCardUsageCfgData (val) {
      this.cardUsageCfgData = val
    },
    initCardReceiveCfgData (val) {
      this.cardReceiveCfgData = val
    },
    initCardActiveCfgData (val) {
      this.cardActiveCfgData = val
    },
    initSampleCardData (val) {
      this.sampleCardData.bgColor = val.bgColor
      this.sampleCardData.cardName = val.cardName
      this.sampleCardData.bgImg = val.bgImg
      this.sampleCardData.bgType = val.bgType
    },
    initSampleCardDiscountData (val) {
      this.sampleCardData.powerDiscount = val.powerDiscount
      this.sampleCardData.discount = val.discount
      this.sampleCardData.discountGoodsType = val.discountGoodsType
    },
    handleToSave () {
      // 检验通过
      let checkComponents = ['cardNameAndBg', 'disCountData', 'cardScoreCfgData', 'cardChargeCfgData',
        'cardCouponCfgData', 'cardEffectTime', 'cardReceiveCfgData', 'cardActiveCfgData',
        'freeship']

      for (let i = 0; i < checkComponents.length; i++) {
        this.$refs[checkComponents[i]].$emit('checkRule')
      }

      // 至少选择一项会员权益
      if (this.disCountData.powerDiscount || this.ownGoodsData.powerOwnGoods ||
        this.cardScoreCfgData.powerScore || this.cardChargeCfgData.powerCard || this.cardCouponCfgData.powerCoupon ||
        this.customRights.customRightsFlag === 'on' || this.freeship.type !== -1) {
        // 检验都通过
        console.log(this.cardChargeCfgData.valid)
        if (this.cardNameAndBg.valid && this.disCountData.valid && this.cardScoreCfgData.valid &&
          this.cardChargeCfgData.valid && this.cardCouponCfgData.valid && this.cardEffectTime.valid &&
          this.cardReceiveCfgData.valid && this.cardActiveCfgData.valid && this.freeship.valid) {
          // 保存数据
          if (this.isCanSave) {
            this.isCanSave = false // 禁用保存
            this.prepareCardData()
          } else {
            this.$message.warning(this.$t('memberCard.repeatSubmit'))
          }
        } else {
          this.$message.error('保存失败')
        }
      } else {
        this.$message.warning('至少选择一项会员权益')
      }
    },
    prepareCardData () {
      this.dealWithDynamicArrayData()
      let pullPath = this.$imageHost + '/'
      if (this.cardNameAndBg.bgImg !== null) {
        if (this.cardNameAndBg.bgImg.includes('https:')) {
          pullPath = 'https:' + pullPath
        } else if (this.cardNameAndBg.bgImg.includes('http:')) {
          pullPath = 'http:' + pullPath
        }
      }
      if (this.cardNameAndBg.bgImg) {
        this.cardNameAndBg.bgImg = this.cardNameAndBg.bgImg.replace(pullPath, '')
      }
      // 处理领取码
      let batchIds = null
      if (Number(this.cardReceiveCfgData.receiveAction) === 1) {
        // 领取码
        batchIds = this.cardReceiveCfgData.codeAddDivArr.map(({ batchId }) => batchId)
      } else {
        // 卡号+密码
        batchIds = this.cardReceiveCfgData.codeAddDivArrBottom.map(({ pwdId }) => pwdId)
      }
      this.dealWithCustomAction()
      this.dealWithCardTag()
      let obj = {
        'id': this.cardId,
        'cardType': this.cardType,
        'cardName': this.cardNameAndBg.cardName,
        'bgType': this.cardNameAndBg.bgType,
        'bgColor': this.cardNameAndBg.bgColor,
        'bgImg': this.cardNameAndBg.bgImg,
        'powerCount': this.disCountData.powerDiscount ? 1 : 0,
        'disCount': this.disCountData.discount,
        'discountIsAll': this.disCountData.discountGoodsType,
        'goodsId': this.disCountData.choosedGoodsId,
        'shopCategoryIds': this.disCountData.choosedStoreId,
        'platformCategoryIds': this.disCountData.choosedPlatformId,
        'discountBrandId': this.disCountData.choosedBrandId,
        'powerPayOwnGood': this.ownGoodsData.powerOwnGoods ? 'on' : '',
        'ownGoodsId': this.ownGoodsData.choosedGoodsId,
        'ownStoreCategoryIds': this.ownGoodsData.choosedStoreId,
        'ownPlatFormCategoryIds': this.ownGoodsData.choosedPlatformId,
        'ownBrandId': this.ownGoodsData.choosedBrandId,
        'powerScore': this.cardScoreCfgData.powerScore ? 1 : 0,
        'score': this.cardScoreCfgData.score,
        'scoreJson': {
          'offset': this.cardScoreCfgData.offSet,
          'goodsMoney': this.cardScoreCfgData.goodsMoney,
          'getScores': this.cardScoreCfgData.getScores,
          'perGoodsMoney': this.cardScoreCfgData.shopingInputLeftM,
          'perGetScores': this.cardScoreCfgData.shopingInputRightM
        },
        'powerCard': this.cardChargeCfgData.powerCard ? 1 : 0,
        'sendMoney': this.cardChargeCfgData.sendMoney,
        'powerCardJson': {
          'offsetMoney': this.cardChargeCfgData.offset,
          'money': this.cardChargeCfgData.money,
          'getMoney': this.cardChargeCfgData.getMoney,
          'perMoney': this.cardChargeCfgData.chargeInputLeftM,
          'perGetMoney': this.cardChargeCfgData.chargeInputRightM
        },
        'sendCoupon': this.cardCouponCfgData.powerCoupon ? 'on' : '',
        'couponType': Number(this.cardCouponCfgData.couponType) - 1,
        'couponIds': this.cardCouponCfgData.couponIdList,
        'couponPackage': this.cardCouponCfgData.couponPack ? this.cardCouponCfgData.couponPack.id : null,
        'expiredType': this.cardEffectTime.expiredType,
        'startTime': this.cardEffectTime.fixedDate ? this.cardEffectTime.fixedDate[0] : null,
        'endTime': this.cardEffectTime.fixedDate ? this.cardEffectTime.fixedDate[1] : null,
        'storeListType': this.cardStoreCfgData.storeListType,
        'storeList': this.cardStoreCfgData.choosedStore.map(({ storeId }) => storeId),
        'receiveDay': this.cardEffectTime.receiveDay,
        'dateType': this.cardEffectTime.dateType,
        'desc': this.cardUsageCfgData.desc,
        'mobile': this.cardUsageCfgData.mobile,
        'isPay': this.cardReceiveCfgData.isPay,
        'payType': this.cardReceiveCfgData.payType,
        'payMoney': this.cardReceiveCfgData.payMoney,
        'payScore': this.cardReceiveCfgData.payScore,
        'receiveAction': this.cardReceiveCfgData.receiveAction,
        'batchIdList': batchIds,
        'activation': this.cardActiveCfgData.activation,
        'activationCfgBox': this.cardActiveCfgData.activationCfgBox,
        'examine': this.cardActiveCfgData.examine,
        'customAction': this.cardActiveCfgData.customAction,
        'freeship': this.freeship,
        'cardRenew': this.cardRenew,
        'customRights': this.customRights,
        'cardTag': this.cardTag,
        'marketActivities': this.marketActivities
      }
      if (this.cardId) {
        // 更新会员卡
        console.log('更新会员卡')
        this.updateCardInfo(obj)
      } else {
        // 创建会员卡
        console.log('创建会员卡')
        this.createMemberCard(obj)
      }
    },
    dealWithDynamicArrayData () {
      // 积分
      let goodsMoney = []
      let getScores = []
      if (this.cardScoreCfgData.offSet === '0') {
        goodsMoney.push(this.cardScoreCfgData.shopingInputLeft)
        getScores.push(this.cardScoreCfgData.shopingInputRight)
        for (let item of this.cardScoreCfgData.addIntegralArr) {
          goodsMoney.push(item.leftInput)
          getScores.push(item.rightInput)
        }
      }
      this.cardScoreCfgData.goodsMoney = goodsMoney
      this.cardScoreCfgData.getScores = getScores
      console.log(this.cardScoreCfgData)

      // 充值
      let money = []
      let getMoney = []
      if (this.cardChargeCfgData.offset === '0') {
        money.push(this.cardChargeCfgData.chargeInputLeft)
        getMoney.push(this.cardChargeCfgData.chargeInputRight)
        for (let item of this.cardChargeCfgData.addChargeArr) {
          money.push(item.leftInput)
          getMoney.push(item.rightInput)
        }
        this.cardChargeCfgData.money = money
        this.cardChargeCfgData.getMoney = getMoney
      }
    },
    // 2- 创建会员卡接口
    createMemberCard (data) {
      createMemberCardRequest(data).then(res => {
        console.log(res)
        this.isCanSave = true
        if (res.error === 0) {
          // success
          // 清除数据，并进行跳转
          this.successOptions()
        } else {
          this.$message.warning(this.$t('memberCard.cardCreateFailed'))
        }
      })
    },
    updateCardInfo (data) {
      updateCardRequest(data).then(res => {
        console.log(res)
        this.isCanSave = true
        if (res.error === 0) {
          // success
          this.successOptions()
        } else {
          this.$message.warning(this.$t('memberCard.cardCreateFailed'))
        }
      })
    },
    // 操作成功后的提示，清除数据，路由跳转
    successOptions () {
      this.$message.success(this.$t('memberCard.cardCreatedSuccess'))
      // this.clearInputData()
      let urlCard = this.getCardPageUrl()
      console.log(urlCard)
      // 页面跳转
      this.$router.push({
        name: urlCard
      })
    },
    // 根据会员卡类型获取相应url
    getCardPageUrl () {
      console.log(this.cardType, typeof this.cardType)
      switch (Number(this.cardType)) {
        case 0:
          return 'user_card'
        case 1:
          return 'limitTimes'
        case 2:
          return 'GradeCard'
        default:
          break
      }
    },
    dealWithCardTag () {
      this.cardTag.cardTagId = this.cardTag.cardTagId.map(({ id }) => id)
    },
    dealWithCustomAction () {
      // true/false 转换1/0
      if (this.cardActiveCfgData.customAction) {
        let tmp = this.cardActiveCfgData.customAction
        this.cardActiveCfgData.customAction = tmp.map(item => {
          item.checked = Number(item.checked)
          item.conditionChecked = Number(item.conditionChecked)
          return item
        })
      }
    }

  }

}
</script>
<style scoped lang="scss">
.membershipCardDetail {
  padding: 10px;
  font-size: 14px;
  position: relative;
  overflow-x: hidden;

  .membershipCardDetailMain {
    position: relative;
    background-color: #fff;
    overflow-x: hidden;
    padding: 15px 25px;
    display: flex;
    padding-bottom: 57px;
  }
  .leftContainer {
    overflow: auto;
    width: 300px;
    margin-right: 20px;
    height: 594px;
    border: 1px solid #ccc;
    background: #fff;
  }
  .rightContainer {
    width: 70%;
    font-size: 13px;
    margin-bottom: 10px;

    .rightContainerTop,
    .member-rights,
    .rightContainerBottom,
    .advance-setting {
      padding: 10px 1%;
      background: #f8f8f8;
      border: 1px solid #e4e4e4;
      margin-bottom: 20px;
      .rightTitle {
        padding-bottom: 10px;
        border-bottom: 1px solid #ddd;
        margin-bottom: 10px;
      }
    }

    .advance-setting {
      margin-bottom: 0px;
    }
  }
  .footer {
    z-index: 100;
    background: #f8f8fa;
    border-top: 1px solid #f2f2f2;
    text-align: center;
    position: fixed;
    bottom: 0;
    padding: 10px 0;
    left: 0;
    right: 0;
    .save {
      color: #fff;
      width: 70px;
      height: 30px;
      line-height: 30px;
      border: none;
      background: #5a8bff;
      margin: auto;
      cursor: pointer;
    }
  }
}
</style>

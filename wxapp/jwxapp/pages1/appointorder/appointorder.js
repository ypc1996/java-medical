// pages1/appointorder/appointorder.js
const util = require('../../utils/util.js')
let app = getApp()
let imageUrl = app.globalData.imageUrl;

global.wxPage({

  /**
   * 页面的初始数据
   */
  data: {
    userId: '',
    userName: '',
    mobile: '',
    reserveInfo: {},

    imageUrl: imageUrl,
    img_close: imageUrl + '/image/wxapp/close_icon.png',
    img_addr: imageUrl + '/image/wxapp/store_address.png',
    img_arrow: imageUrl + '/image/wxapp/backward_right.png',
    img_right: imageUrl + 'image/wxapp/right_into.png',
    img_success: imageUrl + '/image/wxapp/con_btn_success.png',
    img_iconsel: imageUrl + '/image/wxapp/selected.png',
    prd_img: imageUrl + "image/wxapp/address.png",
    img_store: imageUrl + "image/wxapp/address.png",
    img_person: imageUrl + "image/wxapp/appoint_man.png",
    img_cancel: imageUrl + "image/wxapp/cancel.png",
    img_phone: imageUrl + "image/wxapp/card_phone.png",
    img_time: imageUrl + "image/wxapp/appoint_time.png",
    img_man: imageUrl + "image/wxapp/tech_man.png",
    img_service: imageUrl + 'image/wxapp/icon_service.png',
    icon: app.globalData.imageUrl + 'image/wxapp/icon_rectangle.png',
    checkbox_no: imageUrl + '/image/admin/select.png',
    main_goods_notice: imageUrl + '/image/wxapp/main_goods_notice.png',

    // 接口请求回来的数据
    account: 0, // 余额
    shopAvatar: '', // 店铺logo
    serviceInfo: {}, // 接口返回的服务信息
    storeInfo: {}, // 接口返回的门店信息
    recentOrderInfo: {}, // 用户上一次预约填写的信息
    technicianTitle: '', //职称
    paymentVoList: [], // 支持的支付方式
    cardList: [], // 会员卡列表
    cardFirst: false, // 默认选择会员卡支付开关
    balanceFirst: false, // 默认选择余额支付开关

    useCard: {}, // 选中的会员卡信息
    canClick: true, // 是否可点击确认使用余额按钮
    create_order: {
      service_deposit: '', // 服务订金
      member_card_balance: '', // 会员卡余额支付金额
      account_discount: '', // 余额支付金额
      money_paid: '' // 应付金额
    },
    add_message: '', // 备注

    showCardDialog: false,
    showCardBalanceDialog: false,
    showBalanceDialog: false
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    if (!util.check_setting(options)) return;
    wx.hideShareMenu();
    let reserveInfo = JSON.parse(options.data)
    let userId = util.getCache('user_id')
    let userName = util.getCache('nickName')
    let mobile = util.getCache('mobile')
    this.setData({
      userId: userId,
      userName: userName,
      mobile: mobile,
      reserveInfo: reserveInfo
    })
    this.initData()
  },
  initData () {
    let _this = this
    let params = {
      serviceId: this.data.reserveInfo.serviceId,
      userId: this.data.userId
    }
    util.api('/api/wxapp/store/service/confirmReservation', function (res) {
      if (res.error === 0) {
        let content = res.content
        content.service.serviceImg = JSON.parse(content.service.serviceImg)
        content.storePojo.storeImgs = JSON.parse(content.storePojo.storeImgs)
        // 会员卡列表
        let cardList = content.cardList.map(function (card) {
          card.card_src = _this.data.imageUrl + 'image/wxapp/icon_rectangle.png'
          if (!content.shopAvatar) {
            content.shopAvatar = _this.data.imageUrl + 'image/wxapp/shop_logo_default.png'
          } else {
            content.shopAvatar = _this.data.imageUrl + content.shopAvatar
          }
          if (card.bgType == 1) {
            card.bg = 'url(' + _this.data.imageUrl + card.bgImg + ') no-repeat'
          } else if (card.bgType == 0) {
            card.bg = card.bgColor
          }
          if (card.expireTime) {
            card.expireTime = card.expireTime.substring(0, 10)
          }
          return card
        })

        // 初始化应付金额
        _this.setData({
          serviceInfo: content.service,
          storeInfo: content.storePojo,
          recentOrderInfo: content.recentOrderInfo,
          technicianTitle: content.technicianTitle,
          paymentVoList: content.paymentVoList,
          cardList: cardList,
          useCard: cardList[0] || {}, // 默认选中第一张会员卡
          account: content.account,
          balanceFirst: content.balanceFirst,
          shopAvatar: content.shopAvatar,
          create_order: {
            service_deposit: content.service.serviceSubsist,
            money_paid: parseFloat(content.service.serviceSubsist).toFixed(2),
            account_discount: 0,
            member_card_balance: 0
          }
        })

        // 默认使用会员卡余额支付
        if (content.cardFirst) {
          if (_this.data.useCard.money) {
            if (_this.data.useCard.money > _this.data.create_order.money_paid) {
              _this.setData({
                'create_order.member_card_balance': parseFloat(_this.data.create_order.money_paid).toFixed(2)
              })
            } else {
              _this.setData({
                'create_order.member_card_balance': parseFloat(_this.data.useCard.money).toFixed(2)
              })
            }
            _this.calculateBalance()
          }
        }
        // 默认使用余额支付
        if (content.balanceFirst) {
          if (_this.data.account) {
            if (_this.data.account > _this.data.create_order.money_paid) {
              _this.setData({
                'create_order.account_discount': parseFloat(_this.data.create_order.money_paid).toFixed(2)
              })
            } else {
              _this.setData({
                'create_order.account_discount': parseFloat(_this.data.account).toFixed(2)
              })
            }
            _this.calculateBalance()
          }
        }
      }
    }, params)
  },
  nameChange (e) {
    let value = e.detail.value
    this.setData({
      'recentOrderInfo.subscriber': value,
    })
  },
  // 预约人
  nameBlur (e) {
    let value = e.detail.value
    if (value === "") {
      util.showModal('提示', '请输入预约人姓名')
      return false
    }
  },
  cancelName () {
    this.setData({
      'recentOrderInfo.subscriber': "",
    })
  },
  mobileChange (e) {
    let value = e.detail.value
    this.setData({
      'recentOrderInfo.mobile': value,
    })
  },
  // 手机号
  mobileBlur (e) {
    let value = e.detail.value
    if (value === "") {
      util.showModal('提示', '请输入手机号')
      return false
    }
  },

  cancelMobile () {
    this.setData({
      'recentOrderInfo.mobile': "",
    })
  },
  // 服务列表
  toStore (e) {
    let storeId = e.currentTarget.dataset.id
    util.navigateTo({
      url: '/pages/storeinfo/storeinfo?id=' + storeId,
    })
  },
  toService (e) {
    let serviceId = e.currentTarget.dataset.id
    util.navigateTo({
      url: '/pages/appointment/appointment?service_id=' + serviceId,
    })
  },
  // 会员卡选择
  cardClick: function (e) { //会员卡弹框显示
    this.setData({
      // cardMode: true,
      showCardDialog: true
    })
  },
  cardCancel: function (e) { //关闭会员卡弹框
    this.setData({
      cardMode: false
    })
  },
  // 取消会员卡余额支付
  checkCancelCard (e) {
    this.setData({
      'create_order.member_card_balance': 0
    })
    this.calculateBalance()
  },
  // 取消余额支付
  checkCancelYue (e) {
    this.setData({
      'create_order.account_discount': 0
    })
    this.calculateBalance()
  },
  // 备注
  msgInput (e) {
    let value = e.detail.value
    this.setData({
      addMessage: value
    })
  },
  // 提交预约
  OneClickBuy (e) {
    var that = this
    let params = {
      serviceId: this.data.reserveInfo.serviceId,
      userId: that.data.userId,
      storeId: that.data.storeInfo.storeId,
      technicianId: that.data.reserveInfo.tech_id,
      technicianName: that.data.reserveInfo.tech_name,
      subscriber: that.data.recentOrderInfo.subscriber,
      mobile: that.data.recentOrderInfo.mobile,
      addMessage: that.data.addMessage,
      serviceDate: that.data.reserveInfo.date,
      servicePeriod: that.data.reserveInfo.startTime + '-' + that.data.reserveInfo.endTime,
      useAccount: that.data.create_order.account_discount,
      memberCardNo: that.data.useCard.cardNo,
      memberCardBalance: that.data.create_order.member_card_balance
    }
    console.log(params)
    if (!params.subscriber) {
      util.showModal('提示', '请输入预约人姓名')
      return false
    }
    if (!params.mobile) {
      util.showModal('提示', '请输入预约人手机号')
      return false
    }
    util.api('/api/wxapp/store/service/submitReservation', function (res) {
      if (res.error === 0) {
        console.log(res.content)
        if (typeof (res.content.timeStamp) != 'undefined') {

        } else {
          util.redirectTo({
            url: '/pages/appointinfo/appointinfo?order_sn=' + res.content.orderSn,
          })
        }
      } else if (res.error == 400002) {
        util.showModal('提示', res.content, function () {
          util.redirectTo({
            url: 'pages/appointment/appointment?service_id=' + params.serviceId,
          })
        });
      }
    }, params)
  },
  confirmServ (e) {
    let params = {
      serviceId: this.data.reserveInfo.serviceId,
      userId: that.data.userId,
      storeId: that.data.storeInfo.storeId,
      technicianId: that.data.reserveInfo.tech_id,
      technicianName: that.data.reserveInfo.tech_name,
      subscriber: that.data.recentOrderInfo.subscriber,
      mobile: that.data.recentOrderInfo.mobile,
      addMessage: that.data.addMessage,
      serviceDate: that.data.reserveInfo.date,
      servicePeriod: that.data.reserveInfo.startTime + '-' + that.data.reserveInfo.endTime
    }
    console.log(params)
    if (!params.subscriber) {
      util.showModal('提示', '请输入预约人姓名')
      return false
    }
    if (!params.mobile) {
      util.showModal('提示', '请输入预约人手机号')
      return false
    }
    util.api('/api/wxapp/store/service/submitReservation', function (res) {
      if (res.error === 0) {
        console.log(res.content)
        util.redirectTo({
          url: '/pages/appointinfo/appointinfo?order_sn=' + e.content.orderSn
        })
      } else if (res.error === 400002) {
        util.redirectTo({
          url: 'pages/appointment/appointment?service_id=' + params.serviceId,
        })
      }
    }, params)
  },
  // 会员卡组件回调
  getSelectCard (e) {
    let no = e.detail;
    let useCard = this.data.cardList.find(item => item.cardNo === no)
    this.setData({
      useCard: useCard,
      'create_order.member_card_balance': 0
    })
    this.calculateBalance()
  },
  // 弹出会员卡余额弹窗
  payCardBalanceClick () {
    this.setData({
      showCardBalanceDialog: true
    })
  },
  // 弹出余额弹窗
  payBalanceClick () {
    this.setData({
      showBalanceDialog: true
    })
  },
  // 弹窗关闭回调
  closeDialog (e) {
    console.log(e)
    switch (e.detail) {
      case 'balance':
        this.setData({
          showBalanceDialog: false
        })
        break;
      default:
        this.setData({
          showCardBalanceDialog: false
        })
        break;
    }
  },
  // 应付计算
  calculateBalance () {
    let { service_deposit, member_card_balance, account_discount, money_paid } = this.data.create_order
    money_paid = service_deposit - member_card_balance - account_discount
    this.setData({
      'create_order.money_paid': parseFloat(money_paid).toFixed(2)
    })
  },
  // 会员卡余额支付组件回调
  getInputCardBalance (e) {
    console.log(e.detail)
    this.setData({
      'create_order.member_card_balance': e.detail ? parseFloat(e.detail).toFixed(2) : 0
    })
    this.calculateBalance()
  },
  // 余额支付组件回调
  getInputBalance (e) {
    console.log(e.detail)
    this.setData({
      'create_order.account_discount': e.detail ? parseFloat(e.detail).toFixed(2) : 0
    })
    this.calculateBalance()
  }
})
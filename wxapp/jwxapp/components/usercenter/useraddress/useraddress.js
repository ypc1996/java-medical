// components/usercenter/useraddress/useraddress.js
import util from '../../../utils/util'

global.wxComponent({
  /**
   * 组件的属性列表
   */
  properties: {
    data: {
      type: Array,
      value: []
    },
    comColor: String,
    options: Object
  },

  /**
   * 组件的初始数据
   */
  data: {

  },

  /**
   * 观察者
   */
  observers: {
    data: function (val) {
      console.log(val)
    }
  },

  ready () {
    console.log(this.data.data)
  },

  /**
   * 组件的方法列表
   */
  methods: {
    getWechatAdress () {
      let that = this
      wx.chooseAddress({
        success (op) {
          console.log('微dizhi:',op)
          util.api('/api/wxapp/address/wxadd', res => {
            console.log(res)
            if (res.error === 0) {
              that.triggerEvent('addaddress')
            }
          }, {
            wxAddress:op
          })
        },
        fail (err) {
          console.log(err)
        }
      })
    },
    // 微信导入后新增到数据库
    newAdressHandle () {
      wx.navigateTo({
        url: '/pages1/addressedit/addressedit',
      })
    }
  }
})

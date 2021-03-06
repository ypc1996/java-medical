const util = require('../../utils/util')
global.wxPage({

  /**
   * 页面的初始数据
   */
  data: {
    isFirstLoad:true,
    showQrCode:false
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.checkClerk()
  },
  checkClerk(){
    util.api('/api/wxapp/store/storeClerk/auth/check',res => {
      if(res.error === 0){
        if(res.content.user_type === 3){
          this.setData({
            user_avatar:res.content.user_avatar
          })
          this.requestClerkIndexData()
        } else {
          util.showModal('提示','未认证信息，请重新认证', () => {
            util.jumpLink('/pages/index/index', 'redirectTo')
          })
        }
      }else {
        util.showModal('提示',res.message)
      }
    })
  },
  requestClerkIndexData(){
    util.api('/api/wxapp/store/storeClerk/main',res=>{
      if(res.error === 0){
        this.setData({
          userData:res.content.storeAccount,
          storeList:res.content.statisticList,
          panelData:res.content.monthVo,
          hasNum:res.content.statisticList.some(item=>item.waitHandleOrderNum > 0)
        })
        this.data.isFirstLoad = false
      } else {
        util.showModal('提示',res.message)
      }
    })
  },
  viewWaitHandleOrder({currentTarget:{dataset:{storeId,orderStatus}}}){
    util.jumpLink(`pages3/clerkOrderList/clerkOrderList${util.getUrlParams({
      storeId,
      orderStatus
    })}`)
  },
  viewQrCodeInfo(){
    util.api('/api/wxapp/public/service/bind/getOfficialQrCode',res=>{
      if(res.error === 0){
        this.setData({
          showQrCode:true,
          QrCodeImage:res.content
        })
      } else {
        util.showModal('提示','获取二维码失败')
      }
    },{})
  },
  bindClose(){
    this.setData({
      showQrCode:false
    })
  },
  viewImage(){
    wx.previewImage({
      urls:[this.data.QrCodeImage]
    })
  },
  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
    if(!this.data.isFirstLoad) this.requestClerkIndexData()
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})
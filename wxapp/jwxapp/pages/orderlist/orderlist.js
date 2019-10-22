var util = require('../../utils/util.js');
var orderEvent = require('../common/order.js');
global.wxPage({
  /**
   * 页面的初始数据
   */
  data: {
    searchInput: null,
    scrollIntoId : 'ALL',
    currentPage:1,
    pageParams:null,
    navType:{
      'ALL':0,
      'WAIT_PAY':1,
      'WAIT_DELIVERY':2,
      'SHIPPED':3,
      'RETURNING':4
    },
    dataList:[],
    operateList:{
      isShowPay:'立即支付',
      isCancel:'取消订单',
      isDelete:'删除订单',
      isExtendReceive:'延长收货',
      isRemindShip:'提醒发货',
      isShowAgainBuy:'再次购买',
      isPayEndPayment:'去付尾款',
      'isShowCommentType-1': '查看评价',
      'isShowCommentType-2': '评价有礼',
      'isShowCommentType-3': '商品评价'
    }
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    this.setData({
      scrollIntoId: options.scrollIntoId ? options.scrollIntoId : 'ALL'
    })
    this.requestList();
  },
  requestList() {
    let currentPage = this.data.pageParams ? this.data.pageParams.currentPage : 1;
    console.log(parseInt(currentPage) - 1)
    util.api('/api/wxapp/order/list', (res) => {
      if(res.error === 0){
        let dataList = this.formatData(res.content.dataList);
        this.setData({
          pageParams: res.content.page,
          ['dataList[' + (parseInt(currentPage) - 1) + ']']: dataList
        })
      }
    }, {
        currentPage: currentPage,
        pageRows: 2,
        type: this.data.navType[this.data.scrollIntoId],
        search: this.data.searchInput
    });
  },
  // 获取搜索栏input值
  handleSearchInput(e) {
    this.setData({
      searchInput: e.detail.value
    });
  },
  formatData(order){
    let formatOrderItem = order.map(item=>{
      const filterArr = ['isShowPay', 'isPayEndPayment', 'isExtendReceive', 'isShowAgainBuy', 'isRemindShip', 'isShowCommentType', 'isDelete','isCancel']
      item.operate = orderEvent.filterObj(item, filterArr);
      return item
    })
    console.log(formatOrderItem)
    return formatOrderItem
  },
  // 清空搜索栏
  clearSearchInput(){
    this.setData({
      searchInput:null
    })
  },
  handleSearch() {
    this.setData({
      currentPage: 1,
      dataList: [],
      scrollIntoId:'ALL'
    })
    this.requestList()
  },
  // 切换导航
  handleChangeNav(e){
    this.setData({
      scrollIntoId:e.currentTarget.id,
      currentPage:1,
      dataList:[]
    })
    this.requestList()
  },
  // 订单下按钮事件集合
  handleOperate(e) {
    orderEvent.handleBtnEvent(e)
  },
  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function() {},

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function() {},

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function() {},

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function() {},

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function() {},

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function() {
    if (this.data.pageParams && this.data.pageParams.currentPage === this.data.pageParams.lastPage) return;
    this.setData({
      'pageParams.currentPage': this.data.pageParams.currentPage + 1
    })
    this.requestList()
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function() {}
});

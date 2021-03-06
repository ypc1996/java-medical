var util = require('../../utils/util.js')
var spec_mixin = require("../goodscommon/spec.js")
var app = getApp()
var imageUrl = app.globalData.imageUrl;
var baseUrl = app.globalData.baseUrl;
var mobile = util.getCache('mobile');
var searchText = "";
var full_info = [];
var full_goods_info = [];
var full_change_info = [];
var is_load = 0;
var spec_list = {};
var prd_list = {};
var spec_view = 0;
var spec_check = 0;
var spec_name;
var speclist = [];
var buy_number = 1;
var limit_num = 1;
var is_prd_good = 0;
var prd_infs = [];
var is_max = 0;
var is_min = 0;
var choose_list = {};
var al_goods_prices;
var all_goods_doc;
var this_cheks;
var this_chek;
var inp_check;
var gift_id;
var store_id;
var zk;
function contains(arr, obj) {
  var i = arr.length;
  while (i--) {
    if (arr[i] === obj) {
      return true;
    }
  }
  return false;
}
global.wxPage({
  mixins: [spec_mixin],
  /**
   * 页面的初始数据
   */
  data: {
    imageUrl: app.globalData.imageUrl,
    img_close: imageUrl + '/image/wxapp/close_icon.png',
    checkMode: true,
    searchText: "",
    page: 1,
    last_page: 1,
    full_info: [],
    full_goods_info: [],
    full_change_info: [],
    is_load: 0,
    specMove: true,
    spec_view: 0,
    speclist: [],
    prd_infs: [],
    al_goods_prices: '',
    all_goods_doc: "",
    zk:false,
    can_del:0,
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    if (!util.check_setting(options)) return;
    var that = this;
    gift_id = options.gift_id;
    store_id = options.store_id;
    searchText = "";
    full_request(that);
  },
  // 去购物车
  go_to_cart: function () {
    if (store_id > 0) {
      util.navigateTo({
        url: '/pages/cart/cart?store_id=' + store_id,
      })
    } else {
      util.navigateTo({
        url: '/pages/cart/cart',
      })
    }
  },
  // 删除已选商品
  to_del_goods: function () {
    var that = this;
    if (that.data.can_del == 0) {
      that.data.can_del = 1;
    } else {
      that.data.can_del = 0;
    }
    that.setData({
      can_del: that.data.can_del
    })
  },
  to_del_geted: function (e) {
    var goods_num = e.currentTarget.dataset.goods_number;
    var record_id = e.currentTarget.dataset.record_id;
    var that = this;
    wx.showLoading({
      title: '删除中...',
    })
    util.api("/api/wxapp/common/removegoods", function (res) {
      if (res.error == 0) {
        util.api('/api/wxapp/gift/checkedlist', function (res) {
          if (res.error == 0) {
            wx.hideLoading();
            full_change_info = res.content;
            full_change_info.count = 0;
            for (var i = 0; i < full_change_info.list.length; i++) {
              full_change_info.list[i].is_zuida = 0;
              if (full_change_info.list[i].goods_number == 1) {
                full_change_info.list[i].is_zuixiao = 1;
              } else {
                full_change_info.list[i].is_zuixiao = 0;
              }
              full_change_info.count += parseInt(full_change_info.list[i].goods_number);
            }
            that.setData({
              full_change_info: full_change_info,

            })
          } else {
            util.showModal("提示", res.message, function () { }, false);
            return false;
          }
        }, { gift_id: gift_id, store_id: store_id });
      } else {
        util.showModal("提示", res.message, function () {
          util.jumpLink("pages/index/index", 'redirectTo')
        }, false);
        return false;
      }
    }, {
        identity_id: '',
        param_id: record_id,
        action: "gift"
      })
  },
  // 去开通会员
  to_member: function () {
    if (full_info.card_tip != "") {
      util.showModal("提示", card_tip, function () { }, false);
      return false
    }
    util.navigateTo({
      url: '/pages/buycardlist/buycardlist?gift_id=' + gift_id + "&is_fullprice=" + gift_id,
    })
  },
  // 搜索
  searchGoods: function (e) {
    searchText = e.detail.value;
    var that = this;
    that.setData({
      searchText: searchText
    })
    full_request(that);
  },
  // 已选商品列表
  showCheck: function (e) {
    var that = this;
    var form_id = e.detail.formId;
    var open_id = util.getCache("openid");
    that.setData({
      checkMode: false
    });
    util.api('/api/wxapp/gift/checkedlist', function (res) {
      if (res.error == 0) {
        full_change_info = res.content;
        full_change_info.count = 0;
        for (var i = 0; i < full_change_info.list.length; i++) {
          full_change_info.list[i].is_zuida = 0;
          if (full_change_info.list[i].goods_number == 1) {
            full_change_info.list[i].is_zuixiao = 1;
          } else {
            full_change_info.list[i].is_zuixiao = 0;
          }
          full_change_info.count += parseInt(full_change_info.list[i].goods_number);
        }
        that.setData({
          full_change_info: full_change_info,

        })
      } else {
        util.showModal("提示", res.message, function () { }, false);
        return false;
      }
    }, { gift_id: gift_id, store_id: store_id, form_id: form_id, open_id: open_id });
  },
  closeCheck: function () {
    var that = this;
    that.setData({
      checkMode: true
    });
  },
  //减号
  btn_del_al: function (e) {
    var that = this;
    this_cheks = e.currentTarget.dataset.idnes;
    if (full_change_info.list[this_cheks].goods_number < 1) {
      full_change_info.list[this_cheks].is_zuixiao = 1;
      full_change_info.list[this_cheks].goods_number = 1;
      that.setData({
        full_change_info: full_change_info
      })
      return false;
    }
    full_change_info.list[this_cheks].goods_number = parseInt(full_change_info.list[this_cheks].goods_number) - 1;
    if (full_change_info.list[this_cheks].goods_number < 1) {
      full_change_info.list[this_cheks].goods_number = 1;
      full_change_info.list[this_cheks].is_zuixiao = 1;
      that.setData({
        full_change_info: full_change_info
      });
      return false;
    }
    // if (full_change_info.list[this_cheks].goods_number < 1) {
    //   full_change_info.list[this_cheks].goods_number = 1
    //   full_change_info.list[this_cheks].is_zuixiao = 1;
    //   return false;
    // }

    util.api('/api/wxapp/cart/giftadd', function (res) {
      if (res.error == 0) {
        full_change_info.count -= 1;
        that.setData({
          full_change_info: full_change_info,
          al_goods_prices: res.content.check_goods_price,
          all_goods_doc: res.content.change_doc,
        });
      } else {
        util.showModal("提示", res.message, function () { }, false);
        return false;
      }
    }, { gift_id: gift_id, change_goods_number: 1, product_id: full_change_info.list[this_cheks].prd_id, prd_number: full_change_info.list[this_cheks].goods_number, store_id: store_id, goods_id: full_change_info.list[this_chek].goods_id })
  },
  btn_add_al: function (e) {
    var that = this;
    this_chek = e.currentTarget.dataset.indexs;
    full_change_info.list[this_chek].goods_number = parseInt(full_change_info.list[this_chek].goods_number) + 1;
    if (full_change_info.list[this_chek].goods_number > 1) {
      full_change_info.list[this_chek].is_zuixiao = 0;
    }
    util.api('/api/wxapp/cart/giftadd', function (res) {
      if (res.error == 0) {
        full_change_info.count += 1;
        that.setData({
          full_change_info: full_change_info,
          al_goods_prices: res.content.check_goods_price,
          all_goods_doc: res.content.change_doc,
        });
      } else if (res.error == 10) {
        util.showModal("提示", res.message, function () {
          full_change_info.list[this_chek].is_zuida = 1;
          that.setData({
            full_change_info: full_change_info,
            al_goods_prices: res.content.check_goods_price,
            all_goods_doc: res.content.change_doc,
          });
        }, false);
        return false;
      } else {
        util.showModal("提示", res.message, function () { }, false);
        return false;
      }
    }, { gift_id: gift_id, change_goods_number: 1, product_id: full_change_info.list[this_chek].prd_id, prd_number: full_change_info.list[this_chek].goods_number, store_id: store_id, goods_id:full_change_info.list[this_chek].goods_id })
  },
  get_al_num: function (e) {
    var that = this;
    var this_goods_number = e.detail.value;
    inp_check = e.currentTarget.dataset.idnes;
    full_change_info.list[inp_check].goods_number = this_goods_number;
    util.api('/api/wxapp/cart/giftadd', function (res) {
      if (res.error == 0) {
        full_change_info.count = 0;
        for (var i = 0; i < full_change_info.list.length; i++) {
          full_change_info.count += parseInt(full_change_info.list[i].goods_number);
        }
        that.setData({
          full_change_info: full_change_info,
          al_goods_prices: res.content.check_goods_price,
          all_goods_doc: res.content.change_doc,
        });
      } else if (res.error == 10) {
        util.showModal("提示", res.message, function () {
          full_change_info.list[inp_check].is_zuida = 1;
          that.setData({
            full_change_info: full_change_info,
            al_goods_prices: res.content.check_goods_price,
            all_goods_doc: res.content.change_doc,
          });
        }, false);
        return false;
      } else {
        util.showModal("提示", res.message, function () { }, false);
        return false;
      }
    }, { gift_id: gift_id, change_goods_number: 1, product_id: full_change_info.list[inp_check].prd_id, prd_number: full_change_info.list[inp_check].goods_number, store_id: store_id, goods_id: full_change_info.list[inp_check].goods_id })
  },
  // 加入购物车
  add_to_cart: function (e) {
    var that = this;
    var send_data = {};
    var this_goods_id = e.currentTarget.dataset.goods_id;
    send_data.goods_id = this_goods_id;
    send_data.action = 2;
    send_data.gift_id = gift_id;
    send_data.user_id = util.getCache('user_id');
    send_data.store_id = store_id;
    util.api('/api/wxapp/cart/giftadd', function (res) {
      if (res.error == 0) {
        //规格
        if (res.content.is_show_spec) {
          res.content.goods.specs = res.content.goods.spec;
          that.setData({ goodsData: res.content.goods })
          that.bindAddCart()
        }
        else {
          util.toast_success('已加入购物车');
          that.setData({
            al_goods_prices: res.content.check_goods_price,
            all_goods_doc: res.content.change_doc,
          })
        }
      } else {
        util.showModal("提示", res.message, function () { }, false);
        return false;
      }
    }, send_data);
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
    var that = this;
    if (that.data.page == that.data.last_page) {
      that.setData({
        is_load: 0
      })
      return;
    } else {
      that.setData({
        is_load: 1
      })
    }

    that.data.page = that.data.page + 1;
    util.api('/api/wxapp/gift/goodslist', function (res) {
      if (res.error == 0) {
        full_info = res.content;
        var full_goods_info = [];
        var full_goods_r = [];
        full_goods_r = full_info.goods.data;
        al_goods_prices = full_info.checked_goods_price;
        all_goods_doc = full_info.change_doc;
        if (full_goods_r.length > 0) {
          full_goods_info = full_goods_r;
          that.setData({
            full_goods_info: that.data.full_goods_info.concat(full_goods_info),
            full_info: full_info,
            al_goods_prices: al_goods_prices,
            all_goods_doc: all_goods_doc
          })

        }
      } else {
        util.showModal("提示", res.message, function () {
          wx.navigateBack({

          })
        }, false);
        return false;
      }
    }, { gift_id: gift_id, page: that.data.page, search: searchText, page_rows: 10 });
  },

  proActionChange: function () {
    this.setData({
      checkMode: true
    })
  },
 
  to_items: function (e) {
    var goods_id = e.currentTarget.dataset.goods_id;
    util.navigateTo({
      url: '/pages/item/item?goods_id=' + goods_id,
    })
  },
  isZK:function(e){
    var that = this;
    that.setData({
      zk: !that.data.zk,
    });
  },

  checkSelBuy() {
    if (this._sel_buy.has_spec && !this._sel_buy.select_prd) {
      if (this.data.show_spec) util.alert("请选择规格！")
      this.showSpec();
      return false;
    }

    if (!this._sel_buy.is_stock_enough) {
      util.alert("库存不足")
      this.showSpec();
      return false;
    }
    return true;
  },
  bindAddCart() {
    if (!this.checkSelBuy()) return;
    this.addCart(this.getChooseList());
  },
  getChooseList() {
    var s = this._sel_buy;
    var gd = this.data.goodsData;
    return {
      goods_id: gd.goods_id,
      gift_id: gift_id,
      action: 2,
      product_id: s.has_spec ? s.select_prd.prd_id : gd.prd_id,
      prd_number: s.goods_number,
      store_id: store_id
    };
  },
  addCart(choose_list) {
    var that = this;
    util.api('/api/wxapp/cart/giftadd', function (res) {
      if (res.error == 0) {
        util.toast_success('已加入购物车');
        that.setData({
          al_goods_prices: res.content.full_price,
          all_goods_doc: res.content.change_doc,
        })
        that.bindCloseSpec();
      } else {
        util.showModal("提示", res.message);
        return false;
      }
    }, choose_list)
  },
})
function full_request(that) {
  util.api('/api/wxapp/gift/goodslist', function (res) {
    if (res.error == 0) {
      full_info = res.content;
      that.data.last_page = full_info.goods.last_page;
      var full_goods_info = [];
      var full_goods_r = [];
      full_goods_r = full_info.goods.data;
      al_goods_prices = full_info.checked_goods_price;
      all_goods_doc = full_info.change_doc;
      if (full_goods_r.length > 0) {``
        full_goods_info = full_goods_r;
        that.setData({
          full_goods_info: full_goods_info,
          full_info: full_info,
          al_goods_prices: al_goods_prices,
          all_goods_doc: all_goods_doc
        })

      }
    } else {
      util.showModal("提示", res.message, function () {
        wx.navigateBack({

        })
      }, false);
      return false;
    }
  }, { gift_id: gift_id, page: that.data.page, search: searchText, store_id: store_id, page_rows: 10 });
}

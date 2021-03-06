/**
 * 优惠券详情
 * user：常乐
 */
let util = require("../../utils/util.js")
let config = require("../../utils/config.js")
var app = getApp();
var couponSn;

var couponId;
var vali;
var input_vali;
var goods_ids;
var total_micro_second;
var set_time_out;
global.wxPage({

  /**
   * 页面的初始数据
   */
  data: {
    imageUrl: app.globalData.imageUrl,
    act_info: {},
    detailType: 1, // 详情类型(个人中心详情: 0, 装修详情: 1)
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    clearTimeout(set_time_out);
    var _this = this;
    goods_ids = options.goods_id;

    if (options.couponId) {
      couponId = options.couponId
      // 装修界面查看详情
      util.api("api/wxapp/coupon/detail/byScore", function (res) {
        if (res.error == 0) {
          _this.initHandler(res, 1)
        } else {
          util.toast_fail('操作失败');
          setTimeout(function () {
            util.reLaunch({
              url: '/pages/index/index',
            })
          }, 2000);
        }
      }, { couponId: options.couponId })
    }
  },

  // 优化数据
  initHandler: function (res, type) {
    var _this = this;
    // 是否过期
    var time_now = util.formatTime(new Date);
    if (time_now > res.content.endTime) {
      res.content.is_expire = 1;
    } else if (time_now < res.content.endTime) {
      if (res.content.isUsed == 1) {
        res.content.is_expire = 1;
      } else {
        res.content.is_expire = 0;
      }
    }
    // 倒计时
    if (res.content.remainDays == 0) {
      // total_micro_second = res.content.remain_seconds_all;
      total_micro_second = res.content.remainHours * 3600 + res.content.remainMinutes * 60 + res.content.remainSeconds;
      if (total_micro_second > 0) {
        _this.countdown(_this);
      } else {
        _this.setData({
          clock: ""
        });
      }
    }
    _this.setData({
      act_info: res.content,
      detailType: type
    })
  },

  // 倒计时
  countdown: function (that) {
    that.setData({
      clock: util.dateformat(total_micro_second)
    });
    if (total_micro_second <= 0) {
      that.setData({
        clock: ""
      });
      // timeout则跳出递归
      return;
    }
    set_time_out = setTimeout(function () {
      // 放在最后--
      total_micro_second -= 1;
      that.countdown(that);
    }, 1000)
  },

  // 领取码
  bindBlur: function (e) {
    input_vali = e.detail.value;
  },

  //立即领取
  fetch_coupon: function (e) {
    // 领取码
    vali = this.data.act_info.validationCode;
    // form_id = e.detail.formId;
    // open_id = util.getCache("openid");
    if (vali != null) {
      if (input_vali != vali) {
        util.toast_fail('领取码错误');
      } else {
        var that = this;
        that.setData({
          disableds: true
        })
        util.api("/api/wxapp/coupon/get", function (res) {
          if (res.error == 0) {
            if (res.content == 0) {
              util.toast_success('领取成功', function () {
                setTimeout(function () {
                  if (goods_ids) {
                    util.navigateTo({
                      url: '/pages/item/item?gid=' + goods_ids,
                    })
                  } else {
                    wx.navigateBack({
                      url: '/pages/index/index',
                    })
                  }
                }, 2000);
              });
            } else if (res.content == 1) {
              util.toast_fail('优惠券不存在');
            } else if (res.content == 2) {
              util.toast_fail('优惠券已过期');
            } else if (res.content == 3) {
              util.toast_fail('优惠券已停用');
            } else if (res.content == 4) {
              util.toast_fail('优惠券库存为0');
            } else if (res.content == 5) {
              util.toast_fail('可用积分不足');
            } else if (res.content == 6) {
              util.toast_fail('积分更新失败');
            } else if (res.content == 7) {
              util.toast_fail('领取次数达上限');
            }
          } else {
            util.toast_fail('领取失败');
          }
        }, {
            couponId: couponId
          })
      }
    } else {
      var that = this;
      if (this.data.act_info.useScore == 1) {
        let showTitle = '是否使用' + this.data.act_info.scoreNumber + '积分兑换此优惠券';
        util.showModal(showTitle, '', function () {
          that.getUserCoupon();
        }, true);
      } else {
        that.getUserCoupon();
      }
    }
  },

  getUserCoupon: function () {
    util.api("/api/wxapp/coupon/get", function (res) {
      if (res.error == 0) {
        if (res.content == 0) {
          util.toast_success('领取成功', function () {
            setTimeout(function () {
              if (goods_ids) {
                util.navigateTo({
                  url: '/pages/item/item?gid=' + goods_ids,
                })
              } else {
                util.navigateTo({
                  url: '/pages/index/index',
                })
              }
            }, 2000);
          });
        } else if (res.content == 1) {
          util.toast_fail('优惠券不存在');
        } else if (res.content == 2) {
          util.toast_fail('优惠券已过期');
        } else if (res.content == 3) {
          util.toast_fail('优惠券已停用');
        } else if (res.content == 4) {
          util.toast_fail('优惠券库存为0');
        } else if (res.content == 5) {
          util.toast_fail('可用积分不足');
        } else if (res.content == 6) {
          util.toast_fail('积分更新失败');
        } else if (res.content == 7) {
          util.toast_fail('领取次数达上限');
        }
      } else {
        util.toast_fail('领取失败');
      }
    }, { couponId: couponId }, '', true)
  },

  // 我的优惠券
  myCoupon: function () {
    util.navigateTo({
      url: '/pages/coupon/coupon',
    })
  },

  // 进店看看
  visitshop: function () {
    util.navigateTo({
      url: '/pages/index/index',
    })
  },

  // 开通会员卡
  top_more: function (e) {
    var coupon_id = this.data.act_info.id;
    util.navigateTo({
      url: '/pages/buycardlist/buycardlist?coupon_id=' + coupon_id + '&code=' + code,
    })
  }

})
var base = require("../mixins/base.js");
var util = require("../../../utils/util.js")
var activity_goods = require("../common/activity_goods.js");

global.wxComponent({
  mixins: [base, activity_goods],
  methods: {
    onPropChange (newVal, oldVal, changedPath) {
      var _this = this;
      var m = this.data.m = newVal;
      console.log(m, '积分兑换++++++++++++++++++++++++++++')
      m.integral_goods.forEach((item, index) => {
        switch (item.tip) {
          case 1:
            item.tip = '商品已删除'
            break
          case 2:
            item.tip = '活动已删除'
            break
          case 3:
            item.tip = '活动已停用'
            break
          case 4:
            item.tip = '活动未开始'
            break
          case 5:
            item.tip = '活动已过期'
            break
        }
      })
      this.formatActivityBeginTime(m.integral_goods);
    },
    bindToInegral (e) {
      var d = this.eventData(e);
      console.log(d)
      if (d.tips) {
        if (d.tips == this.$t("components.decorate.goodsDeleted")) {
          util.showModal(this.$t("components.decorate.tips"), this.$t("components.decorate.goodsDeleted"));
        } else {
          this.navigateToItem(d.goods_id);
        }
        return false;
      }
      util.jumpLink(`/pages/item/item?aid=${d.in_goods_id}&atp=4&gid=${d.goods_id}`);
    },
  }
});
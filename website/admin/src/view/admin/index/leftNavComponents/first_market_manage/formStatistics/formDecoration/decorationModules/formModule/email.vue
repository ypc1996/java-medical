<template>
  <div
    class="membershipCard modules"
    @mouseover="mouseOver"
  >
    <!--列表模块-->
    <div
      class="showModule"
      :class="activeBorder?'activeBorder':'noBoderColor'"
    >
      <!--模块编辑区-->
      <div class="name">
        <div class="nameMain">
          <b
            class="moduleStar"
            v-if="modulesShowData.confirm"
          >*</b>
          <img
            :src="modulesShowData.name_url?modulesShowData.name_url:($imageHost+'/image/admin/shop_deco/email_change.png')"
            class="image"
            v-if="modulesShowData.image_type"
          >
          <span class="name_title">{{modulesShowData.form_title}}</span>
          <input
            class="name_title_place"
            placeholder="请输入邮箱"
            type="text"
            readonly="readonly"
          >
        </div>

      </div>
      <!--模块编辑区结束-->
      <div
        class="item_operation"
        v-if="activeBorder&&!isProhibit"
      >
        <img
          class="up_img"
          style="cursor:pointer;z-index:1000"
          :src="$imageHost+'/image/admin/shop_beautify/add_up_use.png'"
          @click.stop="handleToClickIcon(0)"
        >
        <img
          class="down_img"
          style="cursor:pointer;z-index:1000"
          :src="$imageHost+'/image/admin/shop_beautify/add_down.png'"
          @click.stop="handleToClickIcon(1)"
        >
        <img
          class="del_img"
          style="cursor:pointer;z-index:1000"
          :src="$imageHost+'/image/admin/shop_beautify/add_close.png'"
          @click.stop="handleToClickIcon(2)"
        >
      </div>
    </div>
    <!--中间部分拖动占位-->
    <div
      class="setHere activeSetHere"
      :class="activeSetHere?'middleModulesActive':''"
    >
    </div>
  </div>
</template>
<script>
export default {
  props: {
    flag: Number, // 模块公共
    nowRightShowIndex: Number, // 模块公共
    middleHereFlag: Boolean, // 模块公共
    backData: Object // 模块公共
  },
  data () {
    return {
      isProhibit: false,
      activeBorder: false, // 模块公共
      activeSetHere: false, // 模块公共
      hoverTips: 'hoverTips', // 英文适配  模块公共
      // 模块私有
      modulesShowData: {

      }
    }
  },
  watch: {
    nowRightShowIndex (newData) { // 模块公共
      console.log(this.flag, newData)
      if (this.flag === newData) {
        this.activeBorder = true
      } else {
        this.activeBorder = false
      }
    },
    activeSetHere (newData) { // 模块公共
      console.log(newData)
      if (newData) {
        this.$emit('middleDragData', this.flag)
      }
    },
    activeBorder (newData) { // 模块公共
      console.log(newData)
      if (newData) {
        this.$http.$emit('nowHightLightModules', this.flag)
      }
    },
    middleHereFlag (newData) { // 模块公共
      console.log(newData)
      if (newData) {
        this.activeSetHere = true
      } else {
        this.activeSetHere = false
      }
    },
    // 右侧模块点击传回中间当前高亮模块的数据
    backData: { // 模块公共
      handler (newData) {
        console.log(newData)
        if (newData) {
          this.modulesShowData = newData
        }
        console.log(newData)
      },
      immediate: true,
      deep: true
    }
  },
  mounted () {
    this.$nextTick(() => {
      console.log(localStorage.getItem('isProhibitForm'))
      this.isProhibit = JSON.parse(localStorage.getItem('isProhibitForm'))
    })
    // 初始化语言
    this.langDefault() // 模块公共
    // 初始化数据
    this.defaultData() // 模块公共
  },
  methods: {
    defaultData () { // 模块公共
      // 点击各模块触发事件
      this.$http.$on('modulesClick', res => {
        console.log(this.flag, res)
        if (this.flag === res) {
          this.activeBorder = true
        } else {
          this.activeBorder = false
        }
        console.log(res)
      })
    },
    // 移上、移下、删除统一处理事件
    handleToClickIcon (flag) { // 模块公共
      console.log(flag)
      let obj = {
        direction: '',
        flag: this.flag
      }
      switch (flag) {
        case 0:
          obj.direction = 'up'
          break
        case 1:
          obj.direction = 'down'
          break
        case 2:
          obj.direction = 'delete'
          break
      }
      this.$emit('handleToClickIcon', obj)
    },
    // 模块划过
    mouseOver () { // 模块公共
      this.$emit('middleDragData', this.flag)
    }
  }
}
</script>
<style lang="scss" scoped>
@import "@/style/admin/formdecorationModules.scss"; // 模块公共

.name {
  background-color: #ffffff;
  .nameMain {
    display: flex;
    justify-content: flex-start;
    position: relative;
    height: 30px;
    padding-left: 10px;
    .Search {
      flex: 1;
      // line-height: 24px;
      padding: 0 5px;
      margin: 5px 10px;
      border-color: #ccc;
      border: 1px solid transparent;
      display: flex;
      align-items: center;
      span {
        color: #b4b4b4;
      }
    }
    .icon {
      display: flex;
      flex-direction: column;
      justify-content: space-around;
      margin-right: 10px;
      span:nth-of-type(1) {
        font-size: 30px;
        display: inline-block;
      }
      span:nth-of-type(2) {
        display: inline-block;
        text-align: right;
      }
    }
    .moduleStar {
      color: red;
      height: 30px;
      line-height: 30px;
    }
    .name_title {
      width: 85px;
      height: 30px;
      line-height: 30px;
      color: #333;
      font-size: 14px;
      display: inline-block;
      text-align: left;
      overflow: hidden;
      text-overflow: ellipsis;
      white-space: nowrap;
    }
    img {
      width: 20px;
      height: 20px;
      margin-right: 5px;
      position: relative;
      top: 5px;
    }
    input {
      height: 30px;
      line-height: 30px;
      border: none;
      padding-left: 12px;
      background: #ebebe4;
    }
  }
}
</style>

<template>
  <!-- 幸运大抽奖下拉组件 -->
  <div>
    <el-select
      v-model="selectValue"
      @change="changeHandle"
      style="width:170px;"
      size="small"
      :disabled="disabled"
    >
      <el-option
        v-for="item in selects"
        :key="item.id"
        :label="item.type==1?'['+$t('openScreenAdd.split')+']'+item.actName:item.actName"
        :value="item.id"
      ></el-option>
    </el-select>
    <el-button
      type="text"
      @click="initSelectData"
    >{{$t('luckyDraw.refreshs')}}</el-button>
    <el-divider direction="vertical"></el-divider>
    <el-button
      type="text"
      @click="toAdd"
    >{{$t('luckyDraw.make')}}</el-button>
    <el-divider direction="vertical"></el-divider>
    <el-button
      type="text"
      @click="toList"
    >{{$t('openScreenAdd.manage')}}</el-button>
  </div>
</template>

<script>
import { getAllCoupon } from '@/api/admin/marketManage/evaluationGift.js'
export default {
  props: {
    value: [Number, String],
    isHasStock: { // 是否限制库存 默认true限制
      type: Boolean,
      default: true
    },
    disabled: Boolean
  },
  model: {
    prop: 'value',
    event: 'change'
  },
  data () {
    return {
      selects: []
    }
  },
  computed: {
    selectValue: {
      get () {
        if (this.value === '') {
          return this.value
        } else {
          let val = Number(this.value)
          let item = this.selects.find(item => item.id === val)
          this.$emit('initItem', item)
          return Number(this.value)
        }
      },
      set (val) {
        this.$emit('change', val)
      }
    }
  },
  mounted () {
    this.initSelectData()
  },
  methods: {
    initSelectData () {
      let params = {
        isHasStock: this.isHasStock
      }
      getAllCoupon(params).then(res => {
        if (res.error === 0) {
          this.selects = res.content
          this.$emit('initData', res.content)
        }
      })
    },
    changeHandle (val) {
      this.$emit('change', val)
    },
    toAdd () {
      this.$router.push({
        name: 'add_coupon'
      })
    },
    toList () {
      this.$router.push({
        name: 'ordinary_coupon'
      })
    }
  }
}
</script>

<style lang="scss" scoped>
.el-divider--vertical {
  margin: 0 1px;
}
</style>

<template>
  <div class="admin_top_swiper">
    <el-carousel
      arrow="never"
      height="494px"
    >
      <el-carousel-item
        v-for="(item,index) in imgUrl"
        :key="index"
      >
        <h3 style="cursor: pointer;"><img
            :src="item.src"
            @click="to_apply()"
          ></h3>
      </el-carousel-item>
    </el-carousel>
  </div>
</template>
<script>
export default {
  data () {
    return {
      imgUrl: [
        { src: this.$imageHost + '/image/admin/official/banner1.jpg?v=1.1' },
        { src: this.$imageHost + '/image/admin/official/banner3.jpg?v=1.1' }
      ]
    }
  },
  mounted () {
    console.log(this.$imageHost)
  },
  methods: {
    // 跳转到申请试用页面
    to_apply () {
      this.$router.push({
        name: 'indexHomeOntrial'
      })
    }
  }
}
</script>
<style>
.el-carousel__item h3 {
  color: #475669;
  font-size: 18px;
  opacity: 0.75;
  line-height: 300px;
  margin: 0;
  height: 100%;
}
.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n + 1) {
  background-color: #d3dce6;
}
.el-carousel__button {
  width: 10px;
  height: 10px;
  border: 1px solid #fff;
  border-radius: 10px;
  cursor: pointer;
  background-color: rgba(0, 0, 0, 0);
}
.el-carousel__indicator--horizontal {
  padding: 0;
  border-radius: 10px;
  margin-right: 4px;
  margin-bottom: 20px;
}
.is-active {
  background-color: #fff;
}

.admin_top_swiper .el-carousel--horizontal {
  /* overflow-x: visible !important; */
  overflow-y: hidden !important;
}
</style>

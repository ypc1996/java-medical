<template>
  <div class="riName">
    <div class="riNameMain">
      <!--模块私有区域-->
      <div class="main">
        <div class="list">
          <span>{{$t('formDecorationModel.titleText')}}</span>
          <el-input
            :disabled="isProhibit"
            v-model="modulesSaveData.form_title"
            size="small"
            :maxlength="20"
          ></el-input>
        </div>
        <div class="list">
          <span></span>
          <div class="tips">{{$t('formDecorationModel.titleTextTip')}}</div>
        </div>
        <div class="list select">
          <span>{{$t('formDecorationModel.uploadQuantity')}}</span>
          <i>{{$t('formDecorationModel.most')}}</i>
          <el-select
            :disabled="isProhibit"
            v-model="modulesSaveData.max_number"
            size="small"
          >
            <el-option
              v-for="item in options"
              :key="item.value"
              :label="item.label"
              :value="item.value"
            >
            </el-option>
          </el-select>
        </div>
        <div class="list">
          <span>{{$t('formDecorationModel.pictureSize')}}</span>
          <el-radio
            :disabled="isProhibit"
            v-model="modulesSaveData.size_types"
            :label="0"
          >{{$t('formDecorationModel.noRestriction')}}</el-radio>
          <el-radio
            :disabled="isProhibit"
            v-model="modulesSaveData.size_types"
            :label="1"
          >{{$t('formDecorationModel.limit')}}</el-radio>
        </div>
        <!--图片尺寸选择限制的时候显示的隐藏模块-->
        <div
          class="list"
          v-if="modulesSaveData.size_types===1"
        >
          <span></span>
          <div class="sizeTypes">
            <el-input
              v-model="modulesSaveData.width_size"
              size="small"
              :disabled="isProhibit"
            ></el-input>
            *
            <el-input
              v-model="modulesSaveData.height_size"
              size="small"
              :disabled="isProhibit"
            ></el-input>
          </div>

        </div>
        <div class="list">
          <span>{{$t('formDecorationModel.conditionValidation')}}</span>
          <el-checkbox
            :disabled="isProhibit"
            v-model="modulesSaveData.confirm"
          >{{$t('formDecorationModel.mustFill')}}</el-checkbox>
        </div>
        <!--模块私有end-->
        <div class="sure">
          <el-button
            type="primary"
            size="small"
            @click="handleToClickSure()"
          >{{$t('formDecorationModel.determine')}}</el-button>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import decMixins from '@/mixins/decorationModulesMixins/decorationModulesMixins'
export default {
  mixins: [decMixins],
  props: {
    modulesData: Object, // 模块公共
    sortIndex: Number // 模块公共
  },
  data () {
    return {
      isProhibit: false, // 是否全部禁用
      imageTuneUp: false, // 图片选择弹窗调起
      modulesSaveData: {
        'form_title': '图片上传',
        'max_number': '6',
        'size_types': 0,
        'width_size': '',
        'height_size': '',
        'confirm': 0,
        'ok_ajax': 1
      }, // 模块保存数据
      options: [{
        value: '6',
        label: '6'
      }, {
        value: '5',
        label: '5'
      }, {
        value: '4',
        label: '4'
      }, {
        value: '3',
        label: '3'
      }, {
        value: '2',
        label: '2'
      },
      {
        value: '1',
        label: '1'
      }
      ]
    }
  },
  watch: {
    // 中间模块当前高亮index
    sortIndex: { // 模块公共
      handler (newData) {
        console.log(newData, this.modulesData)
        if (this.modulesData !== -1) {
          if (this.modulesData.confirm === 1) {
            this.modulesData.confirm = true
          } else {
            this.modulesData.confirm = false
          }
          this.modulesSaveData = this.modulesData
        }
      },
      immediate: true
    },
    // 监听数据变换
    modulesSaveData: { // 模块公共
      handler (newData) {
        console.log(newData)
        this.$emit('handleToBackData', newData)
      },
      deep: true
    }
  },
  mounted () {
    this.$nextTick(() => {
      console.log(localStorage.getItem('isProhibitForm'))
      this.isProhibit = JSON.parse(localStorage.getItem('isProhibitForm'))
    })
  },
  methods: {
    // 点击确定按钮
    handleToClickSure () {
      if (this.isProhibit) return
      this.modulesSaveData.ok_ajax = 1
      this.$message.success({
        message: this.$t('formDecorationModel.savedSuccessfully'),
        showClose: true
      })
    }
  }
}
</script>
<style lang="scss" scoped>
.riName {
  .riNameMain {
    background: #f8f8f8;
    border: 1px solid #e5e5e5;
    height: 550px;
    overflow-y: auto;
    padding: 20px 2%;
    .list {
      margin-bottom: 20px;
      span {
        display: inline-block;
        width: 100px;
        display: flex;
        justify-content: flex-end;
        align-items: center;
      }
      display: flex;
      /deep/ .el-input {
        width: 220px;
      }
      .tips {
        color: #a7a7a7;
        font-size: 12px;
      }
      .sizeTypes {
        display: flex;
        align-items: center;
        /deep/ .el-input {
          width: 90px;
        }
      }
    }
    .select {
      /deep/ .el-input {
        width: 100px;
      }
      i {
        display: flex;
        align-items: center;
        margin-right: 5px;
      }
    }
    .sure {
      display: flex;
      justify-content: center;
    }
    //end
  }
}
</style>

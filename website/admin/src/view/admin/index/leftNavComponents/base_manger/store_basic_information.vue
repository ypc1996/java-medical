<template>
  <!-- 店铺基础信息 -->
  <el-container>
    <el-main class="shop_config">
      <ul class="program_details">
        <li class="details_item">
          <span class="item_label"
            >{{ $t('storeBasicInformation.storeName') }}：</span
          >
          <div class="item_content" v-if="!changeNameFlag">
            <span>{{ form.shopName }}</span>
            <el-button
              type="text"
              class="iconSpan"
              size="small"
              @click="changeNameFlagHandle"
              >{{ $t('storeBasicInformation.change') }}</el-button
            >
          </div>
          <div class="item_content" v-else>
            <el-input
              v-model="form.shopName"
              @blur="changeNameHandle"
              style="width: 182px"
              size="small"
            ></el-input>
          </div>
        </li>
        <li class="details_item">
          <span class="item_label"
            >{{ $t('storeBasicInformation.storeStatus') }}：</span
          >
          <div class="item_content">
            <el-radio-group v-model="form.businessState">
              <el-radio :label="1">{{
                $t('storeBasicInformation.opened')
              }}</el-radio>
              <el-radio :label="0">{{
                $t('storeBasicInformation.notOpen')
              }}</el-radio>
            </el-radio-group>
          </div>
        </li>
        <li class="details_item">
          <span class="item_label"
            >{{ $t('storeBasicInformation.createTime') }}：</span
          >
          <div class="item_content">
            <span>{{ form.created }}</span>
          </div>
        </li>
        <li class="details_item">
          <span class="item_label"
            >{{ $t('storeBasicInformation.validUntil') }}：</span
          >
          <div class="item_content">
            <span>{{ form.expireTime }}</span>
          </div>
        </li>
        <li class="details_item">
          <span class="item_label"
            >{{ $t('storeBasicInformation.backendShopLogo') }}：</span
          >
          <div class="item_content">
            <div class="logo_wrap" @click="selectAvatarHandle">
              <el-image
                :src="$imageHost + '/' + form.shopAvatar"
                fit="contain"
                style="padding: 4px; width: 100%; height: 100%"
              ></el-image>
              <span class="logo_span">{{
                $t('storeBasicInformation.change')
              }}</span>
            </div>
            <p>
              {{
                $t('storeBasicInformation.imageFormat')
              }}：png,bmp,jpeg,jpg,gif；{{
                $t('storeBasicInformation.cannotGreater')
              }}5M；
            </p>
            <p>{{ $t('storeBasicInformation.usePng') }}</p>
          </div>
        </li>
        <li class="details_item">
          <span class="item_label"
            >{{ $t('storeBasicInformation.frontEndShopLogo') }}:</span
          >
          <div class="item_content">
            <el-radio-group v-model="form.showLogo">
              <el-radio :label="0">{{
                $t('storeBasicInformation.donotShow')
              }}</el-radio>
              <el-radio :label="1">{{
                $t('storeBasicInformation.customize')
              }}</el-radio>
            </el-radio-group>
            <div v-if="form.showLogo === 1">
              <div class="applet_logo">
                <div class="logo_wrap" @click="selectAppletLogoHandle">
                  <el-image
                    :src="$imageHost + '/' + form.logo"
                    fit="contain"
                    style="padding: 4px; width: 100%; height: 100%"
                  ></el-image>
                  <span class="logo_span">{{
                    $t('storeBasicInformation.change')
                  }}</span>
                </div>
                <div class="logo_info">
                  <p>{{ $t('storeBasicInformation.showBottom') }}</p>
                  <el-tooltip placement="right" effect="light">
                    <div slot="content">
                      <el-image
                        :src="
                          $imageHost +
                          '/image/admin/new_preview_image/bottom_logo.jpg'
                        "
                        style="width: 200px; height: 355.74px"
                      ></el-image>
                    </div>
                    <el-button type="text">{{
                      $t('storeBasicInformation.viewExample')
                    }}</el-button>
                  </el-tooltip>
                  <p>{{ $t('storeBasicInformation.recommendedPng') }}</p>
                </div>
              </div>
              <div>
                <span>{{ $t('storeBasicInformation.link') }}：</span>
                <el-input
                  v-model="form.logoLink"
                  size="small"
                  style="width: 182px"
                ></el-input>
                <el-button size="small" @click="selectLinkHandle">{{
                  $t('storeBasicInformation.selectLink')
                }}</el-button>
              </div>
            </div>
          </div>
        </li>
        <li class="details_item" style="margin-top: 15px">
          <span class="item_label">医院公章：</span>
          <div class="item_content">
            <div class="applet_logo" style="margin-top: 0">
              <div class="logo_wrap" @click="selectSealHandle">
                <el-image
                  :src="$imageHost + '/' + form.cachet"
                  fit="contain"
                  style="padding: 4px; width: 100%; height: 100%"
                ></el-image>
                <span class="logo_span">{{
                  $t('storeBasicInformation.change')
                }}</span>
              </div>
              <div class="logo_info">
                <p>
                  建议使用png格式图片，以保持最佳效果；建议图片尺寸为144px*144px
                </p>
              </div>
            </div>
          </div>
        </li>
      </ul>
    </el-main>
    <div class="basic-page-footer">
      <el-button type="primary" size="small" @click="saveBasicInfoHandle">{{
        $t('storeBasicInformation.save')
      }}</el-button>
    </div>

    <!-- 选择后端logo -->
    <ImageDalog
      :tuneUp="avatarDialogVisible"
      pageIndex="pictureSpace"
      :imageSize="[144, 144]"
      @handleSelectImg="avatarSelectHandle"
    ></ImageDalog>

    <!-- 选择小程序logo -->
    <ImageDalog
      :tuneUp="appletDialogVisible"
      pageIndex="pictureSpace"
      :imageSize="[300, 80]"
      @handleSelectImg="appletSelectHandle"
    ></ImageDalog>

    <!-- 选择医院公章 -->
    <ImageDalog
      :tuneUp="hospitalSealVisible"
      pageIndex="pictureSpace"
      :imageSize="[144, 144]"
      @handleSelectImg="sealSelectHandle"
    ></ImageDalog>

    <!-- 选择链接 -->
    <selectLinks
      @selectLinkPath="getLinkPath"
      :tuneUpSelectLink="tuneUpSelectLink"
    ></selectLinks>
  </el-container>
</template>

<script>
import { getBaseInfo, updateBasicInfoApi } from '@/api/admin/basicConfiguration/shopConfig'
export default {
  components: {
    ImageDalog: () => import('@/components/admin/imageDalog'),
    selectLinks: () => import('@/components/admin/selectLinks')
  },
  data () {
    return {
      form: {
        shopName: '',
        businessState: 0, // 0营业 1未营业
        created: '',
        expireTime: '', // 店铺到期时间
        shopAvatar: 'image/admin/shop_def_y.png', // 店铺logo
        showLogo: 0, // 是否显示小程序店铺logo
        logo: 'image/admin/shop_def_y.png', // 小程序端底部logo
        logoLink: '', // 小程序端店铺链接
        cachet: 'image/admin/shop_def_y.png'
      },
      changeNameFlag: false, // 更改店铺名称
      avatarDialogVisible: false, // 选择店铺Logo
      appletDialogVisible: false, // 选择小程序店铺Logo
      tuneUpSelectLink: false, // 选择链接弹窗
      hospitalSealVisible: false
    }
  },
  created () {
    this.langDefault()
    this.initData()
  },
  methods: {
    initData () {
      getBaseInfo().then(res => {
        if (res.error === 0) {
          for (const key in res.content) {
            if (res.content.hasOwnProperty(key) && res.content[key] !== null && res.content[key] !== '') {
              const element = res.content[key]
              this.form[key] = element
            }
          }
        }
      })
    },
    changeNameFlagHandle () {
      this.changeNameFlag = true
    },
    changeNameHandle () {
      this.changeNameFlag = false
    },
    selectAvatarHandle () {
      this.avatarDialogVisible = !this.avatarDialogVisible
    },
    selectAppletLogoHandle () {
      this.appletDialogVisible = !this.appletDialogVisible
    },
    selectSealHandle () {
      this.hospitalSealVisible = !this.hospitalSealVisible
    },
    sealSelectHandle (img) {
      this.$set(this.form, 'cachet', img.imgPath)
    },
    avatarSelectHandle (img) {
      this.$set(this.form, 'shopAvatar', img.imgPath)
    },
    appletSelectHandle (img) {
      this.$set(this.form, 'logo', img.imgPath)
    },
    selectLinkHandle () {
      this.tuneUpSelectLink = !this.tuneUpSelectLink
    },
    getLinkPath (link) {
      this.$set(this.form, 'logoLink', link)
    },
    // 保存
    saveBasicInfoHandle () {
      let that = this
      let params = Object.assign({}, this.form)
      updateBasicInfoApi(params).then(res => {
        if (res.error === 0) {
          that.$message.success(that.$t('storeBasicInformation.updated'))

          // 存储店铺logo和名称
          localStorage.setItem('V-shopAvatar', this.$imageHost + '/' + params.shopAvatar)
          localStorage.setItem('V-shopName', params.shopName)
        }
      })
    }
  }
}
</script>

<style lang="scss" scoped>
.shop_config {
  padding: 10px 25px;
  background: #fff;
  margin-bottom: 50px;
}
.details_item {
  display: flex;
  line-height: 32px;
  font-size: 13px;
  .item_label {
    height: 32px;
    width: 110px;
  }
  .item_content {
    flex: 1;
  }
  .applet_logo {
    display: flex;
    margin: 15px 0;
  }
  .logo_wrap {
    width: 80px;
    height: 90px;
    position: relative;
    border: 1px solid #ccc;
    .logo_span {
      display: inline-block;
      width: 100%;
      height: 20px;
      line-height: 20px;
      position: absolute;
      bottom: 0;
      left: 0;
      color: #fff;
      background: rgba(0, 0, 0, 0.5);
      text-align: center;
      font-size: 12px;
    }
  }
  .logo_info {
    margin-left: 20px;
    line-height: 24px;
  }
}
.basic-page-footer {
  position: fixed;
  bottom: 0;
  left: 150px;
  z-index: 10;
  width: calc(100% - 150px);
  height: 50px;
  border-top: 1px solid #eee;
  line-height: 50px;
  background: #fdfdfd;
  text-align: center;
}
</style>

<template>
  <div>
    <div class="small_container">
      <div class="top_one">
        <div class="top_name">{{ $t('selectLinks.smallProgramName') }}：</div>
        <el-select
          v-model="selectValue"
          :placeholder="$t('selectLinks.linkPlaceHoder')"
          size="mini"
        >
          <el-option
            v-for="item in options"
            :key="item.appName"
            :label="item.appName"
            :value="item.appName"
          >
          </el-option>
        </el-select>
      </div>
      <div class="top_one top_two">
        <div>{{ $t('selectLinks.smallProgramPageName') }}：</div>
        <el-input
          v-model="pageName"
          :placeholder="$t('selectLinks.namePlaceHolder')"
          size="mini"
        ></el-input>
      </div>
      <div class="top_one top_three">
        <div>{{ $t('selectLinks.smallProgramAdress') }}：</div>
        <el-input
          v-model="pagePath"
          :placeholder="$t('selectLinks.adressPlaceholder')"
          size="mini"
        ></el-input>
        <el-button type="primary" size="mini" @click="pageSave()">{{
          $t('selectLinks.save')
        }}</el-button>
      </div>
    </div>
    <div class="content">
      <table width="100%">
        <thead>
          <tr>
            <td>{{ $t('selectLinks.smallProgramName') }}</td>
            <td>{{ $t('selectLinks.pageName') }}</td>
            <td>{{ $t('selectLinks.route') }}</td>
            <td>{{ $t('selectLinks.status') }}</td>
            <td>{{ $t('selectLinks.operation') }}</td>
          </tr>
        </thead>
        <tbody v-if="tbodyFlag">
          <tr
            v-for="(item, index) in trList"
            :key="index"
            :class="clickIindex === index ? 'clickClass' : ''"
            @click="handleClick(index)"
          >
            <td>{{ item.title }}</td>
            <td class="link">{{ item.pathName }}</td>
            <td>{{ item.linkPath }}</td>
            <td>{{ item.status }}</td>
            <td class="tb_decorate_a" @click="deleRr(index)">
              {{ $t('selectLinks.del') }}
            </td>
          </tr>
        </tbody>
      </table>
      <div class="noData" v-if="!tbodyFlag">
        <img :src="noImg" />
        <span>{{ $t('selectLinks.noDataAvailable') }}</span>
      </div>
    </div>
  </div>
</template>
<script>
import { xcxApi, linkSaveApi, linkListApi, delListApi } from '@/api/admin/selectLinksApi/selectLinksApi'
import { mapActions } from 'vuex'
export default {
  data () {
    return {
      selectValue: '',
      options: [],
      pageName: '',
      pagePath: '',
      tbodyFlag: true,
      noImg: this.$imageHost + '/image/admin/no_data.png',
      trList: [],
      clickIindex: null
    }
  },
  mounted () {
    // 初始化数据
    this.defaultData(true)
    // 初始化语言
    this.langDefault()
  },
  methods: {
    ...mapActions(['choisePagePath']),
    defaultData (flag) {
      linkListApi().then(res => {
        console.log(res)
        if (!res.content.length) {
          this.tbodyFlag = false
        } else {
          this.tbodyFlag = true
        }
        if (res.error === 0) {
          this.trList = res.content
        }
      })
      if (!flag) return
      xcxApi().then(res => {
        console.log(res)
        if (res.error === 0) {
          this.options = res.content
          if (res.content.length) {
            this.selectValue = this.options[0].appName
          }
        }
      })
    },
    // 保存
    pageSave () {
      let params = {
        title: this.selectValue,
        pathName: this.pageName,
        linkPath: this.pagePath
      }
      linkSaveApi(params).then(res => {
        console.log(res)
        if (res.error === 0) {
          this.$message.success({
            message: '添加成功',
            showClose: true
          })
          this.defaultData(true)
        }
      })
    },
    // 行选中高亮
    handleClick (index) {
      this.clickIindex = index
      this.choisePagePath(this.trList[index].linkPath)
      this.$emit('handleToGetDetailData', this.trList[index])
    },
    // 删除
    deleRr (index) {
      console.log(index)
      let query = this.trList[index].id
      delListApi(query).then(res => {
        console.log(res)
        if (res.error === 0) {
          this.$message.success({
            message: '删除成功',
            showClose: true
          })
          this.defaultData(false)
        }
      })
    }
  }
}
</script>
<style scoped>
.small_container {
  padding-bottom: 10px;
  margin: 10px 0 0 10px;
}
.top_one {
  display: flex;
  align-items: center;
}
.top_two {
  margin-top: 10px;
}
.top_name {
  margin-right: 28px;
}
</style>
<style scoped>
.small_container .el-input {
  width: 155px !important;
}
.top_two .el-input {
  width: 300px !important;
}
.top_three .el-input {
  width: 300px !important;
  margin-right: 10px;
  margin-top: 10px;
}
.tb_decorate_a {
  color: #0000ee;
  cursor: pointer;
}
.noData {
  height: 100px;
  display: flex;
  justify-content: center;
  align-items: center;
  /* width: 650px; */
  flex-direction: column;
  border: 1px solid #eee;
  margin-top: 10px;
}
.noData span {
  margin: 10px;
}
.clickClass {
  background-color: #eee !important;
}
.pageJump_container {
  display: flex;
  justify-content: space-around;
  padding-bottom: 10px;
  margin: 10px 0 0 10px;
}
table {
  border: 1px solid #eff1f5;
  border-collapse: collapse;
  font-size: 14px;
  border-spacing: 0 0;
}
thead {
  display: table-header-group;
  vertical-align: middle;
  border-color: inherit;
}
thead td {
  background: #faf9f8;
  text-align: center;
  color: #333;
  padding: 8px 10px;
  vertical-align: middle !important;
}
thead td:nth-of-type(1) {
  width: 108px;
}
thead td:nth-of-type(2) {
  width: 116px;
}
thead td:nth-of-type(3) {
  width: 247px;
}
thead td:nth-of-type(4) {
  width: 82px;
}
tbody td {
  text-align: center;
  border: 1px solid #eff1f5;
  color: #666;
}
td {
  padding: 8px 10px;
  vertical-align: middle !important;
  text-align: center;
}
.top_left {
  display: flex;
  align-items: center;
  /* margin-left: 7px; */
}
.top_middle {
  display: flex;
  align-items: center;
}
.noData {
  height: 100px;
  display: flex;
  justify-content: center;
  align-items: center;
  /* width: 650px; */
  flex-direction: column;
  border: 1px solid #eee;
  margin-top: 10px;
}
.alerm {
  margin-bottom: 10px;
  padding-left: 28px;
  margin-top: 10px;
  font-size: 14px;
  color: red;
}
</style>

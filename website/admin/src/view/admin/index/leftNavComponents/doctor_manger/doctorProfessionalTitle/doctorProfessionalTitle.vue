<template>
  <div class="pageClassification">
    <div class="pageClassificationContent">
      <el-button type="primary" size="small" @click="fetch">同步</el-button>
      <!-- <div class="main">
        <el-row>
          <el-col :span='24'>
            <el-form label-width="100px">
              <el-row style="line-height:40px;">
                <el-col :span="6">
                  <div class="grid-content ">
                    <el-form-item
                      label="医师职称:"
                      style="margin:0;"
                    >
                      <el-input
                        v-model="requestParams.keywords"
                        placeholder="请输入医师职称名称"
                        size="small"
                        clearable
                      ></el-input>
                    </el-form-item>
                  </div>
                </el-col>
                <el-col :span="6">
                  <div
                    class="grid-content "
                    style="margin-left:20px;"
                  >
                    <div class="grid-content ">
                      <el-button
                        class="btn"
                        type="primary"
                        size="small"
                        @click="handleQuery"
                      >查询
                      </el-button>
                    </div>
                  </div>
                </el-col>
                <el-col
                  :span="6"
                  :offset="6"
                >
                  <div
                    class="grid-content "
                    style="text-align: right;"
                  >
                    <el-button
                      class="btn"
                      type="primary"
                      size="small"
                      @click="dialogVisible = true"
                    >添加医师职称
                    </el-button>
                  </div>
                </el-col>
              </el-row>
            </el-form>
          </el-col>
        </el-row>
      </div> -->
      <div class="table_list">
        <el-table
          class="version-manage-table"
          header-row-class-name="tableClss"
          :data="tableData"
          v-loading="loading"
          border
          style="width: 100%"
        >
          <el-table-column prop="name" label="医师职称" align="center">
          </el-table-column>
          <el-table-column prop="code" label="职称代码" align="center">
          </el-table-column>
          <el-table-column prop="doctorNum" label="医师数量" align="center">
          </el-table-column>
          <el-table-column
            prop="createTime"
            :label="$t('pageClassification.createTime')"
            align="center"
          >
          </el-table-column>
          <!-- <el-table-column
            prop="receiveNum"
            :label="$t('pageClassification.operate')"
            align="center"
          > -->
          <!-- <template slot-scope="scope"> -->
          <!-- <a
                style="color: #5A8BFF;margin-right:10px;cursor: pointer;"
                @click="handleEdit(scope.row)"
              >编辑</a> -->
          <!-- <a
                style="color: #5A8BFF;margin-right:10px;cursor: pointer;"
                @click="removeCatergory(scope.row)"
              >删除</a> -->
          <!-- <a
                style="color: #5A8BFF;cursor: pointer;"
                @click="jumpCatergory(scope.row, $event)"
              >查看详情</a> -->
          <!-- </template> -->
          <!-- </el-table-column> -->
        </el-table>
        <div class="footer"></div>
        <pagination :page-params.sync="pageParams" @pagination="handleQuery" />
      </div>
      <div>
        <el-dialog
          title="请输入医师职称名称"
          :visible.sync="dialogVisible"
          width="30%"
          center
        >
          <el-form label-width="140px">
            <el-form-item label="请输入医师职称名称">
              <el-input
                v-model="requestFrom.pageName"
                size="small"
                clearable
              ></el-input>
            </el-form-item>
          </el-form>
          <span slot="footer" class="dialog-footer">
            <el-button size="small" @click="dialogVisible = false">{{
              $t('pageClassification.cancel')
            }}</el-button>
            <!-- <el-button
              type="primary"
              size="small"
              @click="addCatergory"
            >{{$t('pageClassification.confirm')}}</el-button> -->
          </span>
        </el-dialog>
      </div>
    </div>
  </div>
</template>
<script>
import {
  getProfessionTitle, fetchDoctorTitle
} from '@//api/admin/doctorManage/doctorInfo/doctor'
import pagination from '@/components/admin/pagination/pagination.vue'

export default {
  name: 'pageClassification',
  components: {
    pagination
  },
  data () {
    return {
      requestParams: {
        keywords: null,
        pageRows: 20,
        currentPage: 1
      },
      pageParams: {
        pageRows: 20,
        currentPage: 1
      },
      requestFrom: {
        pageName: null
      },
      tableData: [],
      loading: false,
      dialogVisible: false,
      editVisible: false

    }
  },
  mounted () {
    // 初始化语言
    this.langDefault()
    this.handleQuery()
  },
  methods: {
    // 查询
    handleQuery () {
      this.loading = true
      let params = Object.assign({}, this.requestParams, this.pageParams)
      getProfessionTitle(params).then(res => {
        this.loading = false
        console.log(res)
        this.pageParams = res.content.page
        this.requestParams.pageRows = res.content.page.pageRows
        this.requestParams.currentPage = res.content.page.currentPage
        this.tableData = res.content.dataList
      }).catch(err => {
        this.loading = false
        console.log(err)
      })
    },
    // addCatergory () {
    //   addPageclassification(this.requestFrom).then(res => {
    //     console.log(res)
    //     this.handleQuery()
    //     this.requestParams.keywords = null
    //   }).catch(err => console.log(err))
    //   this.dialogVisible = false
    // },
    // editCatergory (row) {
    //   console.log('editCatergory', row)
    //   updateCategoryName({ pageId: row.id, pageName: row.name }).then(res => {
    //     console.log(res)
    //     this.handleQuery()
    //     row.popover = false
    //   }).catch(err => console.log(err))
    // },
    // removeCatergory (row) {
    //   this.$confirm(this.$t('pageClassification.deleteConfirm'), {
    //     confirmButtonText: this.$t('pageClassification.confirm'),
    //     cancelButtonText: this.$t('pageClassification.cancel'),
    //     type: 'warning'
    //   }).then(() => {
    //     deleteCategoryById({ pageId: row.id }).then(res => {
    //       console.log(res)
    //       this.handleQuery()
    //     }).catch(err => console.log(err))
    //   }).catch(() => {
    //   })
    // },
    jumpCatergory (row, e) {
      e.preventDefault()
      console.log(row)
      this.$router.push({
        path: '/admin/home/main/pictureSetting',
        query: { cartId: row.id }
      })
    },
    handleEdit (row) {
      this.$prompt('请输入医师职称名称', {
        confirmButtonText: this.$t('pageClassification.confirm'),
        cancelButtonText: this.$t('pageClassification.cancel')
      }).then(({ value }) => {
        row.name = value
        this.editCatergory(row)
        this.handleQuery()
      }).catch(() => {
      })
    },
    fetch () {
      fetchDoctorTitle().then(res => {
        console.log(res)
      })
    }
  }
}
</script>
<style lang="css" scoped>
.pageClassificationContent {
  padding: 10px;
  /* padding-right: 23px; */
  min-width: 100%;
  font-size: 14px;
  height: 100%;
  position: relative;
}
.main {
  background-color: #fff;
  padding: 15px;
}
.table_list {
  background-color: white;
  margin-top: 10px;
  padding: 15px;
}
</style>

<template>
  <div class="actDetails">
    <!-- 筛选条件部分 -->
    <div class="mainContent">
      <section style="display:flex;">
        <div
          class="item"
          style="display: flex;"
        >
          <span>{{$t('payReward.getTime')+"："}}</span>
          <div style="display: flex">
            <el-date-picker
              v-model="params.receiveTimeBegin"
              type="datetime"
              value-format="yyyy-MM-dd HH:mm:ss"
              size="small"
              :placeholder="$t('payReward.selectStartTime')"
              style="width:185px"
            >
            </el-date-picker>
            <span class="to">{{$t('payReward.to')}}</span>
            <el-date-picker
              v-model="params.receiveTimeEnd"
              type="datetime"
              value-format="yyyy-MM-dd HH:mm:ss"
              size="small"
              :placeholder="$t('payReward.selectEndTime')"
              default-time="23:59:59"
              style="width:185px"
            >
            </el-date-picker>
          </div>
        </div>

        <div>
          <span>{{$t('payReward.mobilePhone')+"："}}</span>
          <el-input
            v-model="params.mobile"
            class="inputBox"
            size="small"
            :placeholder="$t('payReward.mobilePlaceholder')"
          ></el-input>
        </div>

        <div>
          <span>{{$t('payReward.nickName')+"："}}</span>
          <el-input
            v-model="params.userName"
            class="inputBox"
            size="small"
            :placeholder="$t('payReward.inputNickName')"
          ></el-input>
        </div>

      </section>

      <section style="margin-top:20px;display: flex">

        <div style="margin-right:15px">
          <span>{{$t('payReward.activityReward')+"："}}</span>
          <el-select
            v-model="params.awardType"
            :placeholder="$t('payReward.pleaceSelect')"
            size="small"
            class="inputBox"
            clearable
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

        <div class="item btn">
          <el-button
            size="small"
            type="primary"
            @click="handleSearch"
          >{{$t('payReward.query')}}</el-button>
        </div>
      </section>
    </div>

    <!-- tab表格内容部分 -->
    <div class="table_list">
      <el-table
        header-row-class-name="tableClss"
        border
        :data="tableData"
        style="width: 100%"
      >
        <el-table-column
          prop="userId"
          :label='$t("payReward.userId")'
          align="center"
        >
        </el-table-column>

        <el-table-column
          prop="username"
          :label="$t('payReward.nickName')"
          align="center"
        >
        </el-table-column>

        <el-table-column
          prop="mobile"
          :label="$t('payReward.mobilePhone')"
          align="center"
        >
        </el-table-column>

        <el-table-column
          prop="orderSn"
          :label="$t('payReward.order')"
          align="center"
        >
        </el-table-column>

        <el-table-column
          prop="giftText"
          :label="$t('payReward.activityReward')"
          align="center"
        >
        </el-table-column>

        <el-table-column
          prop="status"
          :label="$t('payReward.getTime')"
          align="center"
        >
          <template slot-scope="scope">
            {{ scope.row.status === 0? '待领取' : (scope.row.status  === 1? scope.row.createTime : ' 领取失败(奖品已发完或领取达到上限)')}}
          </template>
        </el-table-column>
      </el-table>
      <div class="footer">
        <pagination
          :page-params.sync="params"
          @pagination="initData()"
        />
      </div>
    </div>

  </div>
</template>

<script>
import { payRewardDetails } from '@/api/admin/marketManage/payReward.js'
import pagination from '@/components/admin/pagination/pagination.vue'

export default {
  components: { pagination },
  mounted () {
    if (this.$route.query.id > 0) {
      this.params.id = this.$route.query.id
      console.log(this.params.id)
      this.initData()
    }
  },
  data () {
    return {
      options: [{
        value: '0',
        label: '无奖品'
      }, {
        value: '1',
        label: '普通优惠券'
      }, {
        value: '2',
        label: '分裂优惠券'
      }, {
        value: '3',
        label: '幸运大抽奖'
      }, {
        value: '4',
        label: '余额'
      }, {
        value: '5',
        label: '商品'
      }, {
        value: '6',
        label: '积分 '
      }, {
        value: '7',
        label: '自定义'
      }],
      tableData: [],
      pageParams: {},
      params: {
        'id': null,
        'mobile': '',
        'receiveTimeBegin': '',
        'receiveTimeEnd': '',
        'userName': '',
        'awardType': '',
        'currentPage': 1,
        'pageRows': 20
      }

    }
  },
  methods: {
    // 页面进来初始化获取获取
    initData () {
      payRewardDetails(this.params).then(res => {
        console.log(res)
        if (res.error === 0) {
          this.params = Object.assign(this.params, res.content.page)
          this.tableData = res.content.dataList
          this.handleData(res.content.dataList)
        }
      }).catch(err => console.log(err))
    },
    // 查询按钮点击事件
    handleSearch () {
      this.initData()
    },
    handleData (data) {
      console.log(data)
      data.map(item => {
        item.giftText = this.getActGift(item.giftType)
      })
    },
    getActGift (gift) {
      switch (gift) {
        case 0: gift = '无奖品'
          break
        case 1: gift = '普通优惠券'
          break
        case 2: gift = '分裂优惠券'
          break
        case 3: gift = '幸运大抽奖'
          break
        case 4: gift = '余额'
          break
        case 5: gift = '商品'
          break
        case 6: gift = '积分'
          break
        case 7: gift = '自定义'
          break
      }
      return gift
    }
  }

}

</script>
<style lang="scss" scoped>
.actDetails {
  padding: 10px;
  min-height: 100%;
  height: 100%;
  font-size: 14px;
  .mainContent {
    background: #fff;
    padding: 25px 30px;
    .item {
      margin-right: 30px;
      span {
        margin-right: 5px;
      }
    }
    .btn {
      margin-left: -5px;
    }
    :nth-of-type(1) {
      span {
        line-height: 28px;
      }
      .to {
        margin: 0 5px;
      }
    }
    .inputBox {
      width: 170px;
      margin: 0 30px 0 0px;
    }
  }
  /deep/ .tableClss th {
    background-color: #f5f5f5;
    border: none;
    height: 36px;
    color: #000;
    padding: 8px 10px;
  }
  .table_list {
    position: relative;
    margin-top: 10px;
    background-color: #fff;
    padding: 10px 20px 20px;
  }
}
</style>

package com.vpu.mp.service.pojo.shop.market.lottery;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vpu.mp.db.shop.tables.records.LotteryPrizeRecord;
import com.vpu.mp.db.shop.tables.records.LotteryRecord;

import com.vpu.mp.service.pojo.shop.base.ResultMessage;
import com.vpu.mp.service.pojo.shop.market.lottery.prize.LotteryPrizeVo;
import lombok.Data;

/**
 * 参加抽奖活动vo
 *
 * @author 孔德成
 * @date 2019/8/6 15:40
 */
@Data
public class JoinLottery {

    /**
     * 是否可抽奖
     */
    private Boolean flag=false;
    /**
     * 免费抽奖分享抽奖,积分抽奖
     */
    private Byte chanceSource;
    /**
     * 中奖等级
     */
    private Byte lotteryGrade;
    /**
     * 抽奖结果
     */
    private Byte resultsType;
    /**
     * 奖品文字
     */
    private String prizeText;
    /**
     * 奖品图片
     */
    private String prizeImage;

    /**
     * 可用抽奖次数
     */
    private Integer canUseTime;

    /**
     * 信息
     */
    private String msg;

    /**
     * 来源,支付,登陆,扫码
     */
    private Byte source=0;
    /**
     * 抽奖信息
     */
    private String lotteryAward;
    /**
     * 奖品id
     */
    private Integer prizeId;
    /**
     * 商品图片
     */
    private String goodsImage;


    /**
     * 错误信息
     */
    @JsonIgnore
    private ResultMessage resultMessage;
    /**
     * 抽奖规则
     */
    @JsonIgnore
    private LotteryRecord lottery;

    /**
     * 中奖奖品规则
     */
    @JsonIgnore
    private LotteryPrizeRecord lotteryPrize;

}

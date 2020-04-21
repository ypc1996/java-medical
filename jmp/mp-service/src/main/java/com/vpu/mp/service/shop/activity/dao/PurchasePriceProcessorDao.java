package com.vpu.mp.service.shop.activity.dao;

import com.vpu.mp.db.shop.tables.records.PurchasePriceDefineRecord;
import com.vpu.mp.service.foundation.data.DelFlag;
import com.vpu.mp.service.foundation.database.DslPlus;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.pojo.wxapp.goods.goods.detail.promotion.PurchasePricePromotion;
import org.jooq.Record4;
import org.jooq.Result;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.vpu.mp.db.shop.Tables.PURCHASE_PRICE_RULE;
import static com.vpu.mp.db.shop.tables.PurchasePriceDefine.PURCHASE_PRICE_DEFINE;

/**
 * 加价购processor dao
 * @author 李晓冰
 * @date 2020年01月14日
 */
@Service
public class PurchasePriceProcessorDao extends ShopBaseService {

    private static final Byte STATUS_NORMAL = 0;

    /**
     * 加价购促销信息
     * @param goodsId 商品ID
     * @return 加价购促销信息
     */
    public List<PurchasePricePromotion> getPurchasePriceInfoForDetail(Integer goodsId, Timestamp now){

        Map<Integer, List<PurchasePricePromotion.PurchasePriceRule>> purchaseRulesMap = db().select(PURCHASE_PRICE_RULE.PURCHASE_PRICE_ID,PURCHASE_PRICE_RULE.FULL_PRICE,PURCHASE_PRICE_RULE.PURCHASE_PRICE)
            .from(PURCHASE_PRICE_DEFINE).innerJoin(PURCHASE_PRICE_RULE).on(PURCHASE_PRICE_DEFINE.ID.eq(PURCHASE_PRICE_RULE.PURCHASE_PRICE_ID))
            .where(PURCHASE_PRICE_DEFINE.STATUS.eq(STATUS_NORMAL).and(PURCHASE_PRICE_DEFINE.DEL_FLAG.eq(DelFlag.NORMAL_VALUE).and(PURCHASE_PRICE_RULE.DEL_FLAG.eq(DelFlag.NORMAL_VALUE))
                .and(DslPlus.findInSet(goodsId,PURCHASE_PRICE_DEFINE.GOODS_ID)))
                .and(PURCHASE_PRICE_DEFINE.START_TIME.le(now)).and(PURCHASE_PRICE_DEFINE.END_TIME.ge(now))).orderBy(PURCHASE_PRICE_DEFINE.LEVEL.desc(), PURCHASE_PRICE_DEFINE.CREATE_TIME.desc())
            .fetchGroups(PURCHASE_PRICE_RULE.PURCHASE_PRICE_ID, PurchasePricePromotion.PurchasePriceRule.class);


        if (purchaseRulesMap == null || purchaseRulesMap.size() == 0) {
            return null;
        }

        List<PurchasePricePromotion> promotions =new ArrayList<>(purchaseRulesMap.size());
        for (Map.Entry<Integer, List<PurchasePricePromotion.PurchasePriceRule>> entry : purchaseRulesMap.entrySet()) {
            PurchasePricePromotion promotion = new PurchasePricePromotion();
            promotion.setPromotionId(entry.getKey());
            promotion.setPurchasePriceRules(entry.getValue());
            promotions.add(promotion);
        }

        return promotions;
    }

    /**
     *加价购
     * @param goodsId 商品id
     * @param date 日期
     * @return 加价购数据
     */
    public Map<Integer, Result<Record4<Integer, Integer, BigDecimal, BigDecimal>>> getPurchasePriceInfo(Integer goodsId, Timestamp date){
        return db().select(PURCHASE_PRICE_DEFINE.ID,PURCHASE_PRICE_RULE.ID, PURCHASE_PRICE_RULE.FULL_PRICE, PURCHASE_PRICE_RULE.PURCHASE_PRICE)
                .from(PURCHASE_PRICE_DEFINE)
                .innerJoin(PURCHASE_PRICE_RULE).on(PURCHASE_PRICE_DEFINE.ID.eq(PURCHASE_PRICE_RULE.PURCHASE_PRICE_ID))
                .where(PURCHASE_PRICE_DEFINE.STATUS.eq(STATUS_NORMAL))
                .and(PURCHASE_PRICE_DEFINE.DEL_FLAG.eq(DelFlag.NORMAL_VALUE))
                .and(PURCHASE_PRICE_RULE.DEL_FLAG.eq(DelFlag.NORMAL_VALUE))
                .and(DslPlus.findInSet(goodsId, PURCHASE_PRICE_DEFINE.GOODS_ID))
                .and(PURCHASE_PRICE_DEFINE.START_TIME.le(date))
                .and(PURCHASE_PRICE_DEFINE.END_TIME.ge(date))
                .orderBy(PURCHASE_PRICE_DEFINE.LEVEL.desc(), PURCHASE_PRICE_DEFINE.CREATE_TIME.desc())
                .fetch().intoGroups(PURCHASE_PRICE_DEFINE.ID);
    }

    /**
     * 加价购
     * @param activityId activityId
     * @return 加价购记录
     */
    public PurchasePriceDefineRecord  getPurchaseInfo(Integer activityId){
      return  db().selectFrom(PURCHASE_PRICE_DEFINE).where(PURCHASE_PRICE_DEFINE.ID.eq(activityId)).fetchAny();
    }

    /**
     * 校验活动是否进行中
     * @param actIds
     * @return
     */
    public boolean checkActStatus(List<Integer> actIds) {
        Integer count = db().selectCount().from(PURCHASE_PRICE_DEFINE).where(PURCHASE_PRICE_DEFINE.ID.in(actIds)
            .and(PURCHASE_PRICE_DEFINE.START_TIME.lessThan(Timestamp.valueOf(LocalDateTime.now())))
            .and(PURCHASE_PRICE_DEFINE.END_TIME.greaterThan(Timestamp.valueOf(LocalDateTime.now()))))
            .fetchOneInto(int.class);
        return actIds.size() == count;
    }
}

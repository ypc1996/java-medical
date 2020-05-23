package com.vpu.mp.service.shop.coupon;

import com.mysql.cj.util.StringUtils;
import com.vpu.mp.db.shop.tables.CustomerAvailCoupons;
import com.vpu.mp.db.shop.tables.DivisionReceiveRecord;
import com.vpu.mp.db.shop.tables.MrkingVoucher;
import com.vpu.mp.db.shop.tables.User;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.foundation.util.PageResult;
import com.vpu.mp.service.pojo.shop.coupon.hold.CouponHoldListParam;
import com.vpu.mp.service.pojo.shop.coupon.hold.CouponHoldListVo;
import org.jooq.Record;
import org.jooq.SelectJoinStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

import static com.vpu.mp.db.shop.Tables.*;

/**
 * 用户持有的优惠券
 *
 * @author 孔德成
 * @date 2019/8/13 16:14
 */
@Service
public class CouponHoldService extends ShopBaseService {
    @Autowired
    private CouponService  couponService;


    /**
     * 查询用户收到的优惠券信息（领取明细）
     * @return
     */
    public PageResult<CouponHoldListVo> getCouponHoldList(CouponHoldListParam param) {
        User u = USER;
        /* 优惠券*/
        MrkingVoucher m = MRKING_VOUCHER;
        /* 用户持有的优惠券 */
        CustomerAvailCoupons h = CUSTOMER_AVAIL_COUPONS;

        SelectJoinStep<? extends Record> select =
            db().select(u.USERNAME, u.MOBILE,
                        m.ACT_NAME.as("coupon_name"),m.USE_SCORE,m.SCORE_NUMBER,h.ACT_ID,h.TYPE,h.COUPON_SN,m.DENOMINATION,m.ACT_CODE,m.USE_CONSUME_RESTRICT,
                        m.LEAST_CONSUME, h.ID,h.ACCESS_MODE, h.IS_USED,h.ORDER_SN, h.START_TIME, h.END_TIME, h.CREATE_TIME, h.USED_TIME,h.DEL_FLAG,h.USER_ID)
                .from(h)
                .leftJoin(m).on(h.ACT_ID.eq(m.ID))
                .leftJoin(u).on(h.USER_ID.eq(u.USER_ID));
        buildOptions(select,param);
        select.orderBy(h.CREATE_TIME.desc());
        PageResult<CouponHoldListVo> detailList = this.getPageResult(select,param.getCurrentPage(),param.getPageRows(), CouponHoldListVo.class);
        detailList.dataList.forEach(v->{
            if (v.getIsUsed()==null){
                v.setIsUsed(0);
            }
            Timestamp nowTime =new Timestamp(System.currentTimeMillis());
            if (v.getDelFlag()==0&&v.getIsUsed()==0&&v.getEndTime().after(nowTime)){
                v.setStatus(0);
            }else if (v.getDelFlag()==0&&v.getIsUsed()==1){
                v.setStatus(1);
            }else if (v.getDelFlag()==0&&v.getIsUsed()==0&&v.getEndTime().before(nowTime)){
                v.setStatus(2);
            }else if (v.getDelFlag()==1){
                v.setStatus(3);
            }
            //如果是分裂优惠券,展示领取人数;
            if(v.getType() == 1){
                Record record = db().select(DIVISION_RECEIVE_RECORD.IS_SHARE).from(DIVISION_RECEIVE_RECORD).where(DIVISION_RECEIVE_RECORD.COUPON_SN.eq(v.getCouponSn())).fetchOne();
                if(record != null){
                    v.setIsShare(record.into(Integer.class));
                }else{
                    v.setIsShare(0);
                }
                int hasReceive = couponService.hasReceive(v.getCouponSn());
                v.setHasReceive(hasReceive);
            }
        });
        return detailList ;
    }


    /**
     * 按条件查询领取明细
     * @param select
     * @param param
     * @return
     */
    private SelectJoinStep<? extends Record> buildOptions(SelectJoinStep<? extends Record> select, CouponHoldListParam param) {
        if (param.getActId()!=null){
            select.where(CUSTOMER_AVAIL_COUPONS.ACT_ID .eq(param.getActId()));
        }
        if(!StringUtils.isNullOrEmpty(param.getMobile())) {
            select.where(USER.MOBILE.like(this.likeValue(param.getMobile())));
        }
        if(!StringUtils.isNullOrEmpty(param.getUsername())) {
            select.where(USER.USERNAME.like(this.likeValue(param.getUsername())));
        }
        if (param.getUserId()!=null){
            select.where(CUSTOMER_AVAIL_COUPONS.USER_ID.eq(param.getUserId()));
        }
        if(param.getStatus() != null) {
            Timestamp nowTime =new Timestamp(System.currentTimeMillis());
            if (param.getStatus()==1){
                select.where(CUSTOMER_AVAIL_COUPONS.IS_USED.eq((byte) 0))
                        .and(CUSTOMER_AVAIL_COUPONS.END_TIME.ge(nowTime))
                        .and(CUSTOMER_AVAIL_COUPONS.DEL_FLAG.eq((byte) 0));
            }else if (param.getStatus()==2){
                select.where(CUSTOMER_AVAIL_COUPONS.IS_USED.eq((byte) 1))
                    .and(CUSTOMER_AVAIL_COUPONS.DEL_FLAG.eq((byte) 0));
            }else if (param.getStatus()==3){
                select.where(CUSTOMER_AVAIL_COUPONS.IS_USED.eq((byte) 0))
                        .and(CUSTOMER_AVAIL_COUPONS.END_TIME.lt(nowTime))
                    .and(CUSTOMER_AVAIL_COUPONS.DEL_FLAG.eq((byte) 0));
            }else if (param.getStatus()==4){
                select.where(CUSTOMER_AVAIL_COUPONS.DEL_FLAG.eq((byte) 1));
            }
        }
        if (param.getAccessId()!=null && param.getGetSource()!=null){
            select.where(CUSTOMER_AVAIL_COUPONS.ACCESS_ID.eq(param.getAccessId()))
            .and(CUSTOMER_AVAIL_COUPONS.GET_SOURCE.eq(param.getGetSource()));
        }
        else if (param.getGetSource()!=null){
            select.where(CUSTOMER_AVAIL_COUPONS.GET_SOURCE.eq(param.getGetSource()));
        }
        return select;

    }

    public void getReceiveInfo(String couponSn, Integer userId) {
    }
}

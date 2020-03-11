package com.vpu.mp.service.shop.decoration;

import com.vpu.mp.db.shop.tables.records.DecorateLinkRecord;
import com.vpu.mp.service.foundation.data.DelFlag;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.foundation.util.PageResult;
import com.vpu.mp.service.pojo.shop.decoration.*;
import com.vpu.mp.service.pojo.shop.sort.SortVo;
import com.vpu.mp.service.pojo.shop.store.store.StoreListQueryParam;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

import static com.vpu.mp.db.shop.Tables.*;

/**
 * 
 * @author 常乐
 * 2019年7月9日
 */
@Service
public class ChooseLinkService extends ShopBaseService {
	
	@Autowired
	public AdminDecorationService adminDecoration;
	
//	常用链接
	public Boolean commonLink() {
		return false;
	}
	
	/**
	 * 商品链接列表
	 * @param param
	 * @return
	 */
	public PageResult<GoodsLinkVo> getGoodsLink(GoodsLinkVo param) {
		SelectJoinStep<? extends Record> select = db()
				.select(GOODS.GOODS_ID,GOODS.GOODS_NAME,GOODS.GOODS_SN,GOODS.GOODS_IMG)
				.from(GOODS);
		select = buildOptions(select, param);
		select.orderBy(GOODS.GOODS_ID.desc());
		return this.getPageResult(select, param.currentPage,param.pageRows,GoodsLinkVo.class);
	}
	
	/**
	 * 商品链接条件查询
	 * @param select
	 * @param param
	 * @return
	 */
	public SelectJoinStep<? extends Record> buildOptions(SelectJoinStep<? extends Record> select, GoodsLinkVo param) {
        select.where(GOODS.DEL_FLAG.eq((byte)0));
		if(param.getKeyWords() != null) {
			select.where(GOODS.GOODS_NAME.contains(param.getKeyWords()).or(GOODS.GOODS_SN.contains(param.getKeyWords())));
		}
		return select;
	}
		
	/**
	 * 自定义页面
	 * @param param
	 * @return
	 */
	public PageResult<XcxCustomerPageVo> customPage(ChooseLinkParam param) {
		XcxCustomerPageVo xcx = new XcxCustomerPageVo();
		xcx.setCurrentPage(param.getCurrentPage());
		xcx.setPageRows(param.getPageRows());
		xcx.setPageName(param.getPageName());
		xcx.setCatId(param.getCatId());
		PageResult<XcxCustomerPageVo> list = adminDecoration.getPageList(xcx);
		return list;
	}
	
	/**
	 * 拼团抽奖链接
	 * @return
	 */
	public List<ActivityVo> getGroupDrawList() {
		List<ActivityVo> list = db().select(GROUP_DRAW.ID,GROUP_DRAW.NAME.as("actName"),GROUP_DRAW.START_TIME,GROUP_DRAW.END_TIME)
				.from(GROUP_DRAW)
				.where(GROUP_DRAW.END_TIME.ge(new Timestamp(System.currentTimeMillis())))
				.and(GROUP_DRAW.DEL_FLAG.eq(DelFlag.NORMAL.getCode()))
				.fetch().into(ActivityVo.class);
		return list;
	}
	
	/**
	 * 瓜分积分链接
	 * @return
	 */
	public List<ActivityVo> getIntegrationList() {
		List<ActivityVo> list = db().select(GROUP_INTEGRATION_DEFINE.ID,GROUP_INTEGRATION_DEFINE.NAME.as("actName"),GROUP_INTEGRATION_DEFINE.START_TIME,GROUP_INTEGRATION_DEFINE.END_TIME)
				.from(GROUP_INTEGRATION_DEFINE)
				.where(GROUP_INTEGRATION_DEFINE.END_TIME.ge(new Timestamp(System.currentTimeMillis())))
				.fetch().into(ActivityVo.class);
		return list;
	}
	
	/**
	 * 好友助力链接
	 * @return
	 */
	public List<ActivityVo> getPromoteList() {
		List<ActivityVo> list = db().select(FRIEND_PROMOTE_ACTIVITY.ID,FRIEND_PROMOTE_ACTIVITY.ACT_NAME,FRIEND_PROMOTE_ACTIVITY.START_TIME,FRIEND_PROMOTE_ACTIVITY.END_TIME)
				.from(FRIEND_PROMOTE_ACTIVITY)
				.where(FRIEND_PROMOTE_ACTIVITY.END_TIME.ge(new Timestamp(System.currentTimeMillis())))
				.and(FRIEND_PROMOTE_ACTIVITY.DEL_FLAG.eq(DelFlag.NORMAL.getCode()))
				.fetch().into(ActivityVo.class);
		return list;
	}
	
	/**
	 * 加价购活动链接
	 * @return
	 */
	public List<ActivityVo> getPriceList() {
		List<ActivityVo> list = db().select(PURCHASE_PRICE_DEFINE.NAME.as("actName"),PURCHASE_PRICE_DEFINE.END_TIME,PURCHASE_PRICE_DEFINE.START_TIME)
				.from(PURCHASE_PRICE_DEFINE)
				.where(PURCHASE_PRICE_DEFINE.END_TIME.ge(new Timestamp(System.currentTimeMillis())))
				.and(PURCHASE_PRICE_DEFINE.DEL_FLAG.eq(DelFlag.NORMAL.getCode()))
				.and(PURCHASE_PRICE_DEFINE.STATUS.eq((byte) 1))
				.fetch().into(ActivityVo.class);
		return list;
	}
	
	/**
	 * 幸运大抽奖
	 * @return
	 */
	public List<ActivityVo> getLotteryList() {
		 List<ActivityVo> list = db().select(LOTTERY.LOTTERY_NAME.as("actName"),LOTTERY.START_TIME,LOTTERY.END_TIME,LOTTERY.ID)
				 .from(LOTTERY)
				.where(LOTTERY.END_TIME.ge(new Timestamp(System.currentTimeMillis())))
				.and(LOTTERY.DEL_FLAG.eq(DelFlag.NORMAL.getCode()))
				.and(LOTTERY.STATUS.eq((byte) 1))
				.fetch().into(ActivityVo.class);
		return list;
	}
	
	/**
	 * 优惠券链接
	 * @return
	 */
	public List<ActivityVo> getVoucherList() {
        Result<? extends Record> record = db().select().from(MRKING_VOUCHER)
            .where(MRKING_VOUCHER.END_TIME.ge(new Timestamp(System.currentTimeMillis())).or((MRKING_VOUCHER.VALIDITY_TYPE.eq((byte)1))))
            .and(MRKING_VOUCHER.DEL_FLAG.eq((byte) 0))
            .and(MRKING_VOUCHER.SURPLUS.gt(0))
            .fetch();
        if(record != null){
            return record.into(ActivityVo.class);
        }else{
            return null;
        }
	}
	
	/**
	 * 会员卡链接
	 * @return
	 */
	public List<ActivityVo> getCardList() {
		 List<ActivityVo> list = db().select(MEMBER_CARD.ID,MEMBER_CARD.CARD_NAME,MEMBER_CARD.START_TIME,MEMBER_CARD.END_TIME)
				.from(MEMBER_CARD)
				.where(MEMBER_CARD.END_TIME.ge(new Timestamp(System.currentTimeMillis())))
				.and(MEMBER_CARD.DEL_FLAG.eq(DelFlag.NORMAL.getCode()))
				.fetch().into(ActivityVo.class);
		return list;
	}
	
	/**
	 * 一口价链接
	 * @return
	 */
	public List<ActivityVo> getPackageList() {
		 List<ActivityVo> list = db().select(PACKAGE_SALE.ID,PACKAGE_SALE.PACKAGE_NAME,PACKAGE_SALE.START_TIME,PACKAGE_SALE.END_TIME)
				.from(PACKAGE_SALE)
				.where(PACKAGE_SALE.END_TIME.ge(new Timestamp(System.currentTimeMillis())))
				.and(PACKAGE_SALE.DEL_FLAG.eq(DelFlag.NORMAL.getCode()))
				.fetch().into(ActivityVo.class);
		return list;
	}
	
	/**
	 * 满折满减活动链接
	 * @return
	 */
	public List<ActivityVo> getMrkingList() {
		List<ActivityVo>list = db().select(MRKING_STRATEGY.ID,MRKING_STRATEGY.ACT_NAME,MRKING_STRATEGY.START_TIME,MRKING_STRATEGY.END_TIME)
				.from(MRKING_STRATEGY)
				.where(MRKING_STRATEGY.END_TIME.ge(new Timestamp(System.currentTimeMillis())))
				.and(MRKING_STRATEGY.DEL_FLAG.eq(DelFlag.NORMAL.getCode()))
				.fetch().into(ActivityVo.class);
		return list;
	}
	
	/**
	 * 测评活动链接
	 * @return
	 */
	public List<ActivityVo> getAssessList() {
		 List<ActivityVo> assessList = db().select(ASSESS_ACTIVITY.ACT_NAME,ASSESS_ACTIVITY.ID,ASSESS_ACTIVITY.START_TIME,ASSESS_ACTIVITY.END_TIME)
				.from(ASSESS_ACTIVITY)
				.where(ASSESS_ACTIVITY.END_TIME.ge(new Timestamp(System.currentTimeMillis())))
				.and(ASSESS_ACTIVITY.DEL_FLAG.eq(DelFlag.NORMAL.getCode()))
				.fetch().into(ActivityVo.class);
		return assessList;
	}
	
	/**
	 * 优惠券礼包活动链接
	 * @return
	 */
	public List<ActivityVo> getPackList() {
		List<ActivityVo>packList = db().select(COUPON_PACK.ID,COUPON_PACK.ACT_NAME,COUPON_PACK.START_TIME,COUPON_PACK.END_TIME)
				.from(COUPON_PACK)
				.where(COUPON_PACK.DEL_FLAG.eq(DelFlag.NORMAL.getCode()))
				.and(COUPON_PACK.END_TIME.ge(new Timestamp(System.currentTimeMillis())))
				.fetch().into(ActivityVo.class);
		return packList;
	}
	
	/**
	 * 创建跳转网页内容
	 * @param info
	 * @return
	 */
	public int saveWebLink(XcxLinkListVo info) {
		DecorateLinkRecord record = db().newRecord(DECORATE_LINK,info);
		record.setShopId(getShopId());
		record.setLinkAction((byte) 1);
		int res = db().executeInsert(record);
		return res;
	}
	
	/**
	 * 网页跳转列表
	 * @return
	 */
	public List<XcxLinkListVo> getWebLink() {
		List<XcxLinkListVo> list = db().select().from(DECORATE_LINK)
				.where(DECORATE_LINK.LINK_ACTION.eq((byte) 1))
				.fetch().into(XcxLinkListVo.class);
		return list;
	}

	/**
	 * 删除网页跳转
	 * @param id
	 * @return
	 */
	public int delWebLink(Integer id){
		int res = db().delete(DECORATE_LINK).where(DECORATE_LINK.ID.eq(id)).execute();
		return res;
	}
	
	/**
	 * 表单页面链接
	 * @return
	 */
	public List<PageFormVo> getFromPage() {
		List<PageFormVo> list = db().select(FORM_PAGE.PAGE_ID,FORM_PAGE.PAGE_NAME)
				.from(FORM_PAGE)
				.where(FORM_PAGE.STATE.eq((byte) 1))
				.fetch().into(PageFormVo.class);
		return list;
	}
	
	/**
	 * 门店列表
	 * @param param
	 * @return
	 */
	public PageResult<StoreVo> store(StoreListQueryParam param) {
        SelectConditionStep<Record3<String, Byte, Integer>> select = db()
            .select(STORE.STORE_NAME, STORE.BUSINESS_STATE, STORE.STORE_ID)
            .from(STORE).where(STORE.DEL_FLAG.eq((byte) 0));
		select.orderBy(STORE.STORE_ID.desc());
		PageResult<StoreVo> pageResult = this.getPageResult(select, param.getCurrentPage(), param.getPageRows(), StoreVo.class);
		return pageResult;
	}
	                        
	/**
	 * 获取小程序名称
	 * @return
	 */
	public List<XcxNameListVo> getXcxNameList() {
		List<XcxNameListVo> list = db().select(MP_JUMP.APP_NAME)
				.from(MP_JUMP .leftJoin(MP_JUMP_USABLE) .on(MP_JUMP.APP_ID.eq(MP_JUMP_USABLE.APP_ID)))
				.where(MP_JUMP.DEL_FLAG.eq(DelFlag.NORMAL.getCode()))
				.fetch().into(XcxNameListVo.class);
		return list;
	}
	
	/**
	 * 获得装修跳转链接列表
	 * @return
	 */
	public  List<XcxLinkListVo> getXcxLinkList() {
		 List<XcxLinkListVo> linkList = db().select()
				 .from(DECORATE_LINK)
				.where(DECORATE_LINK.DEL_FLAG.eq(DelFlag.NORMAL.getCode()))
				.and(DECORATE_LINK.LINK_ACTION.eq((byte) 2))
				.orderBy(DECORATE_LINK.ID.desc())
				.fetch().into(XcxLinkListVo.class);
		return linkList;
	}
	
	/**
	 * 保存小程序跳转链接
	 * @param info
	 * @return
	 */
	public Boolean saveXcxLink(XcxLinkListVo info) {
		DecorateLinkRecord record = db().newRecord(DECORATE_LINK,info);
		record.setShopId(getShopId());
		record.setLinkAction((byte) 2);
		int res = db().executeInsert(record);
		if(res > 0) {
			return true;
		}else {
			return false;
		}
	}

	/**
	 * 删除小程序跳转连接
	 * @param id
	 * @return
	 */
	public Integer delXcxLink(Integer id){
		int res = db().update(DECORATE_LINK).set(DECORATE_LINK.DEL_FLAG,(byte) 1).where(DECORATE_LINK.ID.eq(id)).execute();
		return res;
	}
	

	
	
	/**
	 * 选择商家分类
	 * @return
	 */
	public List<SortVo> getSortList() {
		//一级分类信息
		List<SortVo> levelList = db().select(SORT.SORT_ID,SORT.SORT_NAME)
				.from(SORT)
				.where(SORT.LEVEL.eq((short) 0))
				.fetch().into(SortVo.class);
		
		//遍历每级分类下子分类
		for(SortVo level1 : levelList) {
			List<SortVo> level2List = db().select(SORT.SORT_ID,SORT.SORT_NAME)
				.from(SORT)
				.where(SORT.PARENT_ID.eq((int) level1.getSortId()))
				.fetch().into(SortVo.class);
			
			level1.setLevelList2(level2List);
		}
		return levelList;
	}
}

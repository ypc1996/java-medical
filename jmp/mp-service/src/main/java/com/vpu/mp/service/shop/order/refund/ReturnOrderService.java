package com.vpu.mp.service.shop.order.refund;

import static com.vpu.mp.db.shop.tables.ReturnOrder.RETURN_ORDER;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Result;
import org.jooq.SelectJoinStep;
import org.jooq.SelectWhereStep;
import org.jooq.impl.DSL;
import org.jooq.tools.StringUtils;
import org.springframework.stereotype.Service;

import com.vpu.mp.db.shop.tables.ReturnOrder;
import com.vpu.mp.db.shop.tables.records.ReturnOrderRecord;
import com.vpu.mp.service.foundation.data.JsonResultCode;
import com.vpu.mp.service.foundation.exception.MpException;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.foundation.util.BigDecimalUtil;
import com.vpu.mp.service.foundation.util.BigDecimalUtil.BigDecimalPlus;
import com.vpu.mp.service.foundation.util.BigDecimalUtil.Operator;
import com.vpu.mp.service.foundation.util.DateUtil;
import com.vpu.mp.service.foundation.util.PageResult;
import com.vpu.mp.service.foundation.util.RandomUtil;
import com.vpu.mp.service.pojo.shop.order.OrderConstant;
import com.vpu.mp.service.pojo.shop.order.OrderInfoVo;
import com.vpu.mp.service.pojo.shop.order.OrderPageListQueryParam;
import com.vpu.mp.service.pojo.shop.order.refund.OrderReturnListVo;
import com.vpu.mp.service.pojo.shop.order.write.operate.refund.RefundParam;
import com.vpu.mp.service.pojo.shop.order.write.operate.refund.RefundParam.ReturnGoods;
import com.vpu.mp.service.pojo.shop.order.write.operate.refund.RefundVo;
import com.vpu.mp.service.pojo.shop.order.write.operate.refund.RefundVo.RefundVoGoods;

/**
 * Table:return_order
 * @author 王帅
 *
 */
@Service
public class ReturnOrderService extends ShopBaseService{
	
	public final ReturnOrder TABLE = RETURN_ORDER;
	
	/**
	 * 	通过订单[]查询其下退货订单信息
	 * @param arrayToSearch
	 * @return Result<?>
	 */
	public Result<?> getRefundByOrderSn(String... arrayToSearch) {
		Result<?> goods = db().select(TABLE.asterisk()).from(TABLE)
				.where(TABLE.ORDER_SN.in(arrayToSearch))
				.orderBy(TABLE.RET_ID.desc())
				.fetch();
		return goods;
	}
	
	/**
	 * 	通过订单[]查询其下退货订单信息
	 * @param arrayToSearch
	 * @return Result<?>
	 */
	public ReturnOrderRecord getByRetId(Integer retId) {
		 return db().selectFrom(TABLE).where(TABLE.RET_ID.eq(retId)).fetchOne();
	}
	
	/**
	 * 	综合查询退订单
	 * @param param
	 * @return
	 */
	public PageResult<OrderReturnListVo> getPageList(OrderPageListQueryParam param) {
		SelectJoinStep<Record> select = db().select().from(TABLE);
		buildOptionsReturn(select,param);	
		PageResult<OrderReturnListVo> result = getPageResult(select,param.getCurrentPage(),param.getPageRows(),OrderReturnListVo.class);
		return result;
	}
	
	/**
	 * 构造退货、款查询条件
	 * 
	 * @param select
	 * @param param
	 * @return
	 */
	public SelectWhereStep<?> buildOptionsReturn(SelectJoinStep<?> select, OrderPageListQueryParam param) {
		// 自增id排序
		select.orderBy(TABLE.RET_ID);

		if (!StringUtils.isEmpty(param.getOrderSn())) {
			select.where(TABLE.ORDER_SN.eq(param.getOrderSn()));
		}
		if (!StringUtils.isEmpty(param.getReturnOrderSn())) {
			select.where(TABLE.RETURN_ORDER_SN.eq(param.getReturnOrderSn()));
		}
		if (param.getRefundStatus() != null && param.getRefundStatus().length != 0) {
			select.where(TABLE.REFUND_STATUS.in(param.getRefundStatus()));
		}
		if (param.getReturnType() != null && param.getReturnType().length != 0) {
			select.where(TABLE.RETURN_TYPE.in(param.getReturnType()));
		}
		if (param.getReturnStart() != null) {
			select.where(TABLE.APPLY_TIME.ge(param.getReturnStart()));
		}
		if (param.getReturnEnd() != null) {
			select.where(TABLE.APPLY_TIME.le(param.getReturnStart()));
		}
		return select;
	}
	
	/**
	 * 	获取该订单的退成功运费记录（送礼订单无运费）
	 * @param orderSn 订单号
	 * @return 存在退运费成功则返回金额，否则为0
	 */
	public BigDecimal getReturnShipingFee(String orderSn) {
		Record1<BigDecimal> fetchOne = db().select(DSL.sum(TABLE.SHIPPING_FEE)).from(TABLE).where(TABLE.ORDER_SN.eq(orderSn).and(TABLE.REFUND_STATUS.eq(OrderConstant.REFUND_STATUS_FINISH))).fetchOne();
		return fetchOne.value1() == null ? BigDecimal.ZERO : fetchOne.value1();
	}
	
	/**
	 * 	获取该订单的退成功商品金额
	 * @param orderSn 订单号
	 * @return 存在则返回金额，否则为0
	 */
	public BigDecimal getReturnMoney(String orderSn) {
		Record1<BigDecimal> fetchOne = db().select(DSL.sum(TABLE.MONEY)).from(TABLE).where(TABLE.ORDER_SN.eq(orderSn).and(TABLE.REFUND_STATUS.eq(OrderConstant.REFUND_STATUS_FINISH))).fetchOne();
		return fetchOne.value1() == null ? BigDecimal.ZERO : fetchOne.value1();
	}
	/**
	 * 	增加退货/退款申请记录->形成退款/退货订单
	 * 	status：退货 1；else 4
	 * @param param
	 * @param order
	 * @param defaultMoney 申请时计算默认金额,为null取param里的金额
	 * @return returnOrder
	 */
	public ReturnOrderRecord addRecord(RefundParam param , OrderInfoVo order , BigDecimal defaultMoney) {
		ReturnOrderRecord returnOrder = db().newRecord(TABLE);
		if(defaultMoney == null) {
			returnOrder.setMoney(param.getReturnMoney() == null ? BigDecimal.ZERO : param.getReturnMoney());
		}else {
			returnOrder.setMoney(defaultMoney == null ? BigDecimal.ZERO : defaultMoney);
		}
		returnOrder.setOrderId(order.getOrderId());
		returnOrder.setOrderSn(order.getOrderSn());
		returnOrder.setReturnOrderSn(generateReturnOrderSn());
		returnOrder.setReturnType(param.getReturnType());
		returnOrder.setReasonType(param.getReasonType() == null ? 0 :param.getReasonType());
		returnOrder.setReasonDesc(param.getReasonDesc());
		returnOrder.setGoodsImages(param.getGoodsImages());
		returnOrder.setVoucherImages(param.getVoucherImages());
		returnOrder.setUserId(order.getUserId());
		returnOrder.setShopId(getShopId());
		returnOrder.setCurrency(order.getCurrency());
		//除退货外,refund_status为4
		returnOrder.setRefundStatus(param.getReturnType() == OrderConstant.RT_GOODS ? OrderConstant.REFUND_STATUS_AUDITING : OrderConstant.REFUND_STATUS_APPLY_REFUND_OR_SHIPPING);
		if(param.getReturnType() == OrderConstant.RT_GOODS) {
			//退货->申请时间
			returnOrder.setApplyTime(DateUtil.getSqlTimestamp());
		}else {
			//非退货->申请时间
			returnOrder.setShippingOrRefundTime(DateUtil.getSqlTimestamp());
		}
		//TODO 同步退款单到CRM
		returnOrder.insert();
		logger().info("新增退款/退货订单:"+returnOrder.toString());
		return returnOrder;
	}
	
	/**
	 * 生成退款订单号
	 * @return
	 */
	public String generateReturnOrderSn() {
		while(true) {
			String returnOrderSn = "R" + DateUtil.dateFormat(DateUtil.DATE_FORMAT_FULL_NO_UNDERLINE) + RandomUtil.getIntRandom();
			if(db().fetchCount(TABLE,TABLE.RETURN_ORDER_SN.eq(returnOrderSn)) < 1){
				return returnOrderSn;
			}
		}
	}
	
	public void finishReturn(ReturnOrderRecord returnOrder) throws MpException {
		if(OrderConstant.REFUND_STATUS_APPLY_REFUND_OR_SHIPPING != returnOrder.getRefundStatus()) {
			throw new MpException(JsonResultCode.CODE_ORDER_FINISH_RETURN_STATUS_ERROR);
		}
		returnOrder.setRefundSuccessTime(DateUtil.getSqlTimestamp());
		returnOrder.setRefundStatus(OrderConstant.REFUND_STATUS_FINISH);
		//TODO 如果存在拆单需要修改一些状态
		returnOrder.update();
	}
	/**
	 * 非仅退运费校验及生成退款订单
	 * @param param
	 * @param order
	 * @param check
	 * @throws MpException
	 */
	public ReturnOrderRecord checkAndCreateOrder(RefundParam param , OrderInfoVo order , RefundVo check) throws MpException{
		//获取调用退款退货查询接口里的可退商品信息
		List<RefundVoGoods> canRefundGoods = check.getRefundGoods();
		//可退商品信息转map方便获取
		Map<Integer, RefundVoGoods> cbsMap = canRefundGoods.stream().collect(Collectors.toMap(RefundVoGoods::getRecId, Function.identity()));
		//当前退款金额默认值计算（不计运费，为了计算一个最大值后续比较后可以直接退款）
		BigDecimal currentMaxReturnMoney = BigDecimal.ZERO;
		//校验
		for (ReturnGoods paramGoods : param.getReturnGoods()) {
			RefundVoGoods checkGoods = cbsMap.get(paramGoods.getRecId());
			if(checkGoods == null) {
				logger().error(
						"退款时订单sn：{},退款类型为：{},商品id：{}商品已退完或者不存在",order.getOrderSn(),param.getReturnType(),paramGoods.getRecId());
				//商品已退完
				throw new MpException(JsonResultCode.CODE_ORDER_RETURN_GOODS_RETURN_COMPLETED);
			}
			//买家校验商家是否配置可退
			if(param.getIsMp()) {
				if(checkGoods.getIsCanReturn() == OrderConstant.IS_CAN_RETURN_N) {
					logger().error("退款时订单sn:{},退款类型为:{},商品id:{}，商品配置不可退",order.getOrderSn(),param.getReturnType(),paramGoods.getRecId());
					//商品配置不可退
					throw new MpException(JsonResultCode.CODE_ORDER_RETURN_GOODS_NO_CAN_RETURN);
				}
			}
			//if退款类型为手动退款 else退款类型为退款、退货
			if(param.getReturnType() == OrderConstant.RT_MANUAL) {
				//退款类型为手动退款设置退款数量为0
				paramGoods.setReturnNumber(0);
				//当前商品退款最大金额=已退*折后单价
				BigDecimal maxMoney = BigDecimalUtil.multiplyOrDivide(
						BigDecimalPlus.create(new BigDecimal(checkGoods.getReturnNumber()), Operator.multiply),
						BigDecimalPlus.create(checkGoods.getDiscountedGoodsPrice(), null));
				//当前可退=当前商品退款最大金额maxMoney-已退
				BigDecimal canReturnMoney = maxMoney.subtract(checkGoods.getReturnMoney());
				//申请退款金额<=0 || canReturnMoney < 申请退款金额
				if(BigDecimalUtil.compareTo(paramGoods.getMoney() , null) < 1 || BigDecimalUtil.compareTo(canReturnMoney , paramGoods.getMoney()) < 0) {
					logger().error("退款时订单sn:{},退款类型为:{},商品id:{}，申请退款金额不满足条件",order.getOrderSn(),param.getReturnType(),paramGoods.getRecId());
					throw new MpException(JsonResultCode.CODE_ORDER_RETURN_MANUAL_MONEY_ERROR);
				}
				
				/**
				 * 此次退款金额默认值计算（不计运费）
				 * 规则：已退完：总价-退完成
				 * 	         没退完：单价*已退完数量-退完成
				 */
				if(checkGoods.getReturnable() > 0) {
					//没退完
					currentMaxReturnMoney = BigDecimalUtil.add(currentMaxReturnMoney,
							BigDecimalUtil.subtrac(
									BigDecimalUtil.multiplyOrDivide(
											BigDecimalPlus.create(new BigDecimal(checkGoods.getReturnNumber()), Operator.multiply),
											BigDecimalPlus.create(checkGoods.getDiscountedGoodsPrice(), null)
											),
									checkGoods.getReturnMoney()
									)
							);
				}else {
					//已退完
					currentMaxReturnMoney = BigDecimalUtil.add(currentMaxReturnMoney,
							BigDecimalUtil.subtrac(checkGoods.getDiscountedTotalPrice(),checkGoods.getReturnMoney()));
				}
			}else {
				//申请退货商品数量>可退商品数量 || 退货数量<1 时抛异常 
				if(paramGoods.getReturnNumber() < 1 || paramGoods.getReturnNumber() > checkGoods.getReturnable()) {
					//商品退货数量大于可退数量
					throw new MpException(JsonResultCode.CODE_ORDER_RETURN_GOODS_RETURN_NUMBER_ERROR);
				}
				/**
				 * 此次退款金额默认值计算（不计运费）
				 * 规则：最后一次：总价-单价*已退数量(包含退款中)
				 * 	         非最后一次：单价*要退数量
				 */
				if(checkGoods.getReturnable() > paramGoods.getReturnNumber()) {
					//非最后一次
					currentMaxReturnMoney = BigDecimalUtil.add(currentMaxReturnMoney,
							BigDecimalUtil.multiplyOrDivide(
									BigDecimalPlus.create(new BigDecimal(paramGoods.getReturnNumber()), Operator.multiply),
									BigDecimalPlus.create(checkGoods.getDiscountedGoodsPrice(), null)
									)
							);
				}else {
					//最后一次
					currentMaxReturnMoney = BigDecimalUtil.add(currentMaxReturnMoney,
							BigDecimalUtil.subtrac(checkGoods.getDiscountedTotalPrice(),
									BigDecimalUtil.multiplyOrDivide(
											BigDecimalPlus.create(new BigDecimal(checkGoods.getSubmitted()), Operator.multiply),
											BigDecimalPlus.create(checkGoods.getDiscountedGoodsPrice(), null)
											)
									)
							);
				}
			}
		}
		//当前退款金额默认值计算（不计运费）
		return addRecord(param ,order ,currentMaxReturnMoney);
	}
	
	public void responseReturnOperate(RefundParam param , ReturnOrderRecord returnOrder) throws MpException {
		if(param.getIsMp()) {
			/**mp端操作*/
			switch (param.getReturnOperate()) {
			case OrderConstant.RETURN_OPERATE_MP_SUBMIT_SHIPPING:
				//买家提交物流信息
				submitShipping(returnOrder, param);
				break;
			case OrderConstant.RETURN_OPERATE_MP_REVOKE:
				//买家撤销退款退货
				revokeReturnOrder(returnOrder, param);
				break;
			default:
				break;
			}
		}else {
			/**商家操作*/
			switch (param.getReturnOperate()) {
			case OrderConstant.RETURN_OPERATE_ADMIN_REFUSE:
				//商家拒绝退款退货（退货为提交物流后的拒绝）
				refuseReturn(returnOrder, param);
				break;
			case OrderConstant.RETURN_OPERATE_ADMIN_AGREE_RETURN:
				//商家同意退货申请
				agreeReturn(returnOrder, param);
				break;
			case OrderConstant.RETURN_OPERATE_ADMIN_REFUSE_RETURN_GOODS_APPLY:
				//商家拒绝退货申请
				refuseReturnGoodsApply(returnOrder, param);
				break;
			default:
				break;
			}
		}
	}
	
	/**
	 * 退货提交物流
	 * @param returnOrder
	 * @param param
	 * @throws MpException 
	 */
	public void submitShipping(ReturnOrderRecord returnOrder , RefundParam param) throws MpException {
		//校验
		if(returnOrder.getRefundStatus() != OrderConstant.REFUND_STATUS_AUDIT_PASS) {
			throw new MpException(JsonResultCode.CODE_ORDER_RETURN_OPERATION_NOT_SUPPORTED_BECAUSE_STATUS_ERROR);
		}
		returnOrder.setShippingType(param.getShippingType());
		returnOrder.setShippingNo(param.getShippingNo());
		returnOrder.setPhone(param.getPhone());
		returnOrder.setVoucherImages(param.getVoucherImages());
		returnOrder.setShippingOrRefundTime(DateUtil.getSqlTimestamp());
		returnOrder.setRefundStatus(OrderConstant.REFUND_STATUS_APPLY_REFUND_OR_SHIPPING);
		returnOrder.update();
	}
	
	/**
	 * 撤销退款退货
	 * @param returnOrder
	 * @param param
	 * @throws MpException 
	 */
	public void revokeReturnOrder(ReturnOrderRecord returnOrder , RefundParam param) throws MpException {
		//校验
		if(returnOrder.getRefundStatus() == OrderConstant.REFUND_STATUS_FINISH) {
			throw new MpException(JsonResultCode.CODE_ORDER_RETURN_OPERATION_NOT_SUPPORTED_BECAUSE_STATUS_ERROR);
		}
		returnOrder.setRefundCancelTime(DateUtil.getSqlTimestamp());
		returnOrder.setRefundStatus(OrderConstant.REFUND_STATUS_CLOSE);
		returnOrder.update();
		//TODO php系统撤销未实现
		
	}
	/**
	 * 拒绝退款/退货
	 * @param returnOrder
	 * @param param
	 * @throws MpException 
	 */
	public void refuseReturn(ReturnOrderRecord returnOrder , RefundParam param) throws MpException {
		//校验
		if(returnOrder.getRefundStatus() != OrderConstant.REFUND_STATUS_APPLY_REFUND_OR_SHIPPING) {
			throw new MpException(JsonResultCode.CODE_ORDER_RETURN_OPERATION_NOT_SUPPORTED_BECAUSE_STATUS_ERROR);
		}
		returnOrder.setRefundRefuseTime(DateUtil.getSqlTimestamp());
		returnOrder.setRefundStatus(OrderConstant.REFUND_STATUS_REFUSE);
		returnOrder.setRefundRefuseReason(param.getRefundRefuseReason());
		returnOrder.update();
	}
	
	/**
	 * 审核通过（退货申请）
	 * @param returnOrder
	 * @param param
	 * @throws MpException 
	 */
	public void agreeReturn(ReturnOrderRecord returnOrder , RefundParam param) throws MpException {
		//校验
		if(returnOrder.getRefundStatus() != OrderConstant.REFUND_STATUS_AUDITING) {
			throw new MpException(JsonResultCode.CODE_ORDER_RETURN_OPERATION_NOT_SUPPORTED_BECAUSE_STATUS_ERROR);
		}
		returnOrder.setApplyPassTime(DateUtil.getSqlTimestamp());
		returnOrder.setRefundStatus(OrderConstant.REFUND_STATUS_AUDIT_PASS);
		returnOrder.setConsignee(param.getConsignee());
		returnOrder.setReturnAddress(param.getReturnAddress());
		returnOrder.setMerchantTelephone(param.getMerchantTelephone());
		returnOrder.setZipCode(param.getZipCode());
		returnOrder.update();
	}
	
	/**
	 * 商家拒绝退货申请
	 * @param returnOrder
	 * @param param
	 * @throws MpException 
	 */
	public void refuseReturnGoodsApply(ReturnOrderRecord returnOrder , RefundParam param) throws MpException {
		//校验
		if(returnOrder.getRefundStatus() != OrderConstant.REFUND_STATUS_AUDITING) {
			throw new MpException(JsonResultCode.CODE_ORDER_RETURN_OPERATION_NOT_SUPPORTED_BECAUSE_STATUS_ERROR);
		}
		returnOrder.setApplyNotPassTime(DateUtil.getSqlTimestamp());
		returnOrder.setRefundStatus(OrderConstant.REFUND_STATUS_AUDIT_NOT_PASS);
		returnOrder.setApplyNotPassReason(param.getApplyNotPassReason());
		returnOrder.update();
	}
}



package com.vpu.mp.service.shop.market.groupdraw;

import static com.vpu.mp.db.shop.tables.Goods.GOODS;
import static com.vpu.mp.db.shop.tables.JoinGroupList.JOIN_GROUP_LIST;
import static com.vpu.mp.db.shop.tables.User.USER;

import java.sql.Timestamp;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.jooq.Record8;
import org.jooq.SelectConditionStep;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Service;

import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.foundation.util.PageResult;
import com.vpu.mp.service.pojo.shop.market.groupdraw.group.GroupListParam;
import com.vpu.mp.service.pojo.shop.market.groupdraw.group.GroupListVo;

/**
 * 拼团抽奖 - 开团明细
 *
 * @author 郑保乐
 */
@Service
public class GroupDrawGroupService extends ShopBaseService {

	private static final byte ONE = 1;
	private static final byte TWO = 2;

	public PageResult<GroupListVo> getGroupList(GroupListParam param) {
		SelectConditionStep<Record8<Integer, String, String, Timestamp, Timestamp, Integer, String, String>> select = db()
				.select(JOIN_GROUP_LIST.GROUP_ID, GOODS.GOODS_IMG, GOODS.GOODS_NAME, JOIN_GROUP_LIST.OPEN_TIME,
						JOIN_GROUP_LIST.END_TIME, USER.USER_ID, USER.USERNAME, USER.MOBILE)
				.from(JOIN_GROUP_LIST).leftJoin(GOODS).on(GOODS.GOODS_ID.eq(JOIN_GROUP_LIST.GOODS_ID)).leftJoin(USER)
				.on(USER.USER_ID.eq(JOIN_GROUP_LIST.USER_ID)).where(JOIN_GROUP_LIST.GROUP_DRAW_ID
						.eq(param.getGroupDrawId()).and(JOIN_GROUP_LIST.IS_GROUPER.eq(ONE)));
		select = buildOptions(select, param);
		select.orderBy(JOIN_GROUP_LIST.OPEN_TIME.desc());
		PageResult<GroupListVo> pageResult = this.getPageResult(select, param.getCurrentPage(), param.getPageRows(),
				GroupListVo.class);
		List<GroupListVo> dataList = pageResult.getDataList();
		for (GroupListVo groupListVo : dataList) {
			Integer into = db().select(DSL.count()).from(JOIN_GROUP_LIST)
					.where(JOIN_GROUP_LIST.GROUP_ID.eq(param.getGroupId())).fetchAnyInto(Integer.class);
			groupListVo.setUserCount(into == null ? 0 : into);
			groupListVo.setGoodsImg(imageUrl(groupListVo.getGoodsImg()));
		}
		return pageResult;

	}

	public SelectConditionStep<Record8<Integer, String, String, Timestamp, Timestamp, Integer, String, String>> buildOptions(
			SelectConditionStep<Record8<Integer, String, String, Timestamp, Timestamp, Integer, String, String>> select,
			GroupListParam param) {
		if (!StringUtils.isEmpty(param.getUsername())) {
			select.and(USER.USERNAME.like(likeValue(param.getUsername())));
		}
		if (null != param.getStartTime()) {
			select.and(JOIN_GROUP_LIST.OPEN_TIME.ge(param.getStartTime()));
		}
		if (null != param.getEndTime()) {
			select.and(JOIN_GROUP_LIST.OPEN_TIME.le(param.getEndTime()));
		}
		if (!StringUtils.isEmpty(param.getMobile())) {
			select.and(USER.USERNAME.like(likeValue(param.getMobile())));
		}
		if (null != param.getGrouped()) {
			select.and(JOIN_GROUP_LIST.STATUS.eq((param.getGrouped() ? ONE : TWO)));
		}
		if (null != param.getGroupId()) {
			select.and(JOIN_GROUP_LIST.GROUP_ID.eq(param.getGroupId()));
		}
		return select;
	}
}

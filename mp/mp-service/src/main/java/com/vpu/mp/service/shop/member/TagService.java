package com.vpu.mp.service.shop.member;

import static com.vpu.mp.db.shop.Tables.TAG;
import static com.vpu.mp.db.shop.Tables.USER_TAG;

import java.sql.Timestamp;

import javax.validation.Valid;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.SelectWhereStep;
import org.jooq.impl.DSL;
import org.jooq.tools.StringUtils;

import com.vpu.mp.db.shop.tables.Tag;
import com.vpu.mp.db.shop.tables.UserTag;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.foundation.util.PageResult;
import com.vpu.mp.service.pojo.shop.member.TagInfoVo;
import com.vpu.mp.service.pojo.shop.member.TagPageListParam;
import com.vpu.mp.service.pojo.shop.member.UpdateTagParam;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 
 * @author 黄壮壮 2019-07-09 20:16
 */
@Service

public class TagService extends ShopBaseService {

	public PageResult<TagInfoVo> getPageList(TagPageListParam param) {

		UserTag ut = USER_TAG.as("ut");
		Tag t = TAG.as("t");

		final Byte existTag = 0;

		/*
		 * Field<Integer> count =
		 * this.db().select(DSL.count()).from(ut).where(ut.TAG_ID.eq(t.TAG_ID)).groupBy(
		 * ut.TAG_ID) .asField("count");
		 */

		Field<Integer> count = this.db().select(DSL.count()).from(ut).where(ut.TAG_ID.eq(t.TAG_ID)).asField("count");
		SelectWhereStep<Record4<Integer, String, Timestamp, Integer>> select = (SelectWhereStep<Record4<Integer, String, Timestamp, Integer>>) this
				.db().select(t.TAG_ID, t.TAG_NAME, t.CREATE_TIME, count).from(t).where(t.IS_DELETE.eq(existTag));
		/*
		 * 按照降序进行查询
		 */

		select = buildOptions(select, param, t);

		select.orderBy(t.CREATE_TIME.desc());
		PageResult<TagInfoVo> pageResult = this.getPageResult(select, param.getPage().getCurrentPage(),
				param.getPage().getPageRows(), TagInfoVo.class);
		for (TagInfoVo tag : pageResult.dataList) {
			if (tag.getCount() == null) {
				tag.setCount(0);
			}
		}
		return pageResult;
	}

	/**
	 * 构建选择条件
	 * 
	 * @param select
	 * @param param
	 * @return
	 */

	private SelectWhereStep<Record4<Integer, String, Timestamp, Integer>> buildOptions(SelectWhereStep<Record4<Integer, String, Timestamp, Integer>> select,
			TagPageListParam param,Tag t) {
		if(param == null) {
			return select;
		}
		if(!StringUtils.isEmpty(param.getTagName())) {
			//like value
			String likeValue = this.likeValue(param.getTagName());
			select.where(t.TAG_NAME.like(likeValue));
		}
		return select;
	}

	/**
	 * check if tagName is exits
	 * 
	 * @param tagName
	 */
	public boolean tagNameExists(String tagName) {
		return this.db().fetchCount(TAG, TAG.TAG_NAME.eq(tagName)) > 0;
	}

	/**
	 * 
	 * @param tagName
	 * @return int
	 */
	public int addTagName(String tagName) {
		return this.db().insertInto(TAG, TAG.TAG_NAME).values(tagName).execute();
	}

	/**
	 * 
	 * @param tagId
	 * @return
	 */
	public boolean tagIdExists(Integer tagId) {

		return this.db().fetchCount(TAG, TAG.TAG_ID.eq(tagId)) > 0;
	}

	/**
	 * delete tagName
	 * @param tagId
	 */
	public void deleteTag(Integer tagId) {

		// 删除tag tag_id,删除user_tag
		Byte deleteFlag = 1;

		this.transaction(() -> {
			db().update(TAG)
				.set(TAG.IS_DELETE, deleteFlag)
				.where(TAG.TAG_ID.eq(tagId))
				.execute();
			
			db().delete(USER_TAG)
				.where(USER_TAG.TAG_ID.eq(tagId))
				.execute();
		});

	}

	/**
	 * 更新标签名称
	 * @param param
	 * @return
	 */
	public int updateTag(@Valid UpdateTagParam param) {
		int result = db().update(TAG)
				.set(TAG.TAG_NAME, param.getTagName())
				.where(TAG.TAG_ID.eq(param.getTagId()))
				.execute();
		return result;
	}

}

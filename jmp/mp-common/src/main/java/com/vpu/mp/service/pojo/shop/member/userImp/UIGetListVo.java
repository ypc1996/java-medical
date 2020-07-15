package com.vpu.mp.service.pojo.shop.member.userImp;

import java.sql.Timestamp;
import java.util.List;

import lombok.Data;

/**
 * 文件上传
 * 
 * @author zhaojianqiang
 * @time 下午4:34:06
 */
@Data
public class UIGetListVo {
	private Integer id;
	private String cardId;
	private Integer totalNum;
	private Integer successNum;
	private Integer failNum;
	private Integer activateNum;
	private Timestamp createTime;
	private Timestamp updateTime;
	private Byte delFlag;
	private Timestamp delTime;
	private Integer tagId;
	private Integer groupId;
	private List<CardInfoVo> cardList;

}
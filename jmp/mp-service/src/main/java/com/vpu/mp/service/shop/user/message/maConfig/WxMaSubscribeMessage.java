package com.vpu.mp.service.shop.user.message.maConfig;

import java.io.Serializable;
import java.util.List;

import com.vpu.mp.service.shop.user.message.jsonBuilder.WxMaSubscribeGsonBuilder;

import cn.binarywang.wx.miniapp.util.json.WxMaGsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WxMaSubscribeMessage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7104511825090456523L;

	private String touser;

	private String templateId;

	private String page;

	private List<WxMaSubscribeMessageData> data;

	public String toJson() {
		return WxMaSubscribeGsonBuilder.create().toJson(this);
	}

}

package com.vpu.mp.service.pojo.shop.decoration.module;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 
 * @author lixinguo
 *
 */
public class ModuleHotArea extends ModuleBase {
	/**
	 * 背景图片
	 */
	@JsonProperty(value = "bg_img_url")
	String bg_img_url;
	
	/**
	 * 背景图片宽度
	 */
	@JsonProperty(value = "bg_img_width")
	Integer bgImgWidth;
	
	/**
	 * 背景图片高度
	 */
	@JsonProperty(value = "bg_img_height")
	Integer bgImgHeight;
	
	/**
	 * 热区列表
	 */
	List<HotRetangle> rectangles = new ArrayList<>();
	
	@Data
	public static class HotRetangle{
		
		/**
		 * 热区索引
		 */
		@JsonProperty(value = "hot_idx")
		Integer hotIdx;
		
		/**
		 * 热区x位置
		 */
		Integer x;
		
		/**
		 * 热区y位置
		 */
		Integer y;
		
		/**
		 * 热区宽度
		 */
		Integer w;
		
		/**
		 * 热区高度
		 */
		Integer h;
		
		/**
		 * 跳转链接
		 */
		@JsonProperty(value = "link_url")
		String linkUrl;

		/**
		 * 链接文本
		 */
		@JsonProperty(value = "link_text")
		String linkText;
	}
	
}

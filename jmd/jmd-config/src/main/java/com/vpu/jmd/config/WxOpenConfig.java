package com.vpu.jmd.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author lixinguo
 *
 */
@Configuration
@Data
public class WxOpenConfig {

	@Value(value = "${wx.open.app_id}")
	protected String appId;

	@Value(value = "${wx.open.app_secret}")
	protected String appSecret;

	@Value(value = "${wx.open.token}")
	protected String token;

	@Value(value = "${wx.open.aes_key}")
	protected String aesKey;
}

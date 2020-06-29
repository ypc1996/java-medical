/*
 * This file is generated by jOOQ.
 */
package com.vpu.jmd.service.shop.bo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vpu.mp.service.foundation.data.JsonResultMessage;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TODO: 需根据情况删除无用字段
 * @author 新国
 *
 */
@Data
public class ShopAccountPojo {

    private Integer   sysId;
    @NotBlank(message = JsonResultMessage.MSG_ACCOUNT_USERNAME_NOT_NULL)
    private String    userName;

	@NotBlank(message = JsonResultMessage.MSG_ACCOUNT_PASSWD_NOT_NULL)
	@Pattern(regexp = "^[^\\u4e00-\\u9fa5]{6,16}$",message = JsonResultMessage.MSG_ACCOUNT_PASSWD_LENGTH_LIMIT)
    private String    password;
    private Byte      state;
    private Byte      businessState;
    private Byte      shopGrade;
    private Integer   maxSkuNum;
    private Integer   maxShopNum;
    private Timestamp addTime;
    private Timestamp buyTime;
    private Timestamp endTime;
    private Integer   lastLoginShopId;
    private String    mobile;
    private String    accountName;
    private String    shopAvatar;
    private String    company;
    private String    salesperson;
    private String    provinceCode;
    private String    cityCode;
    private String    districtCode;
    private String    address;
    private Byte      baseSale;
    private String    backlog;
    private Byte      addCommentSwitch;
    private String    officialOpenId;
    private Byte      isBind;

    private BigDecimal renewMoney;
    private Integer shopNumber;


    @JsonIgnore
	public String getPassword() {
		return password;
	}
    @JsonProperty
	public void setPassword(String password) {
		this.password = password;
	}

}

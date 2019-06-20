/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Shop implements Serializable {

    private static final long serialVersionUID = -1737273850;

    private Integer    shopId;
    private Integer    sysId;
    private String     mobile;
    private String     receiveMobile;
    private String     shopName;
    private String     shopAvatar;
    private String     shopBgPath;
    private String     shopPhone;
    private String     shopNotice;
    private String     shopWx;
    private String     shopEmail;
    private Timestamp  created;
    private Byte       isEnabled;
    private Integer    provinceCode;
    private String     provinceName;
    private Integer    cityCode;
    private String     cityName;
    private Integer    districtCode;
    private String     districtName;
    private String     address;
    private String     completeAddress;
    private Integer    shopSellType;
    private String     shopQq;
    private String     lastLoginIp;
    private Byte       state;
    private Byte       businessState;
    private BigDecimal manageFee;
    private String     shopLicense;
    private String     shopTaxCredential;
    private String     organizationCodeCertificate;
    private String     permitForOpeningBankAccount;
    private String     financialRegistration;
    private String     shopBankName;
    private String     shopBank;
    private String     shopBankBranch;
    private String     shopBankNo;
    private BigDecimal surplus;
    private String     rejectReason;
    private String     shopStatCode;
    private String     shopIcp;
    private String     shopCopyright;
    private String     dbConfig;
    private String     shareConfig;

    public Shop() {}

    public Shop(Shop value) {
        this.shopId = value.shopId;
        this.sysId = value.sysId;
        this.mobile = value.mobile;
        this.receiveMobile = value.receiveMobile;
        this.shopName = value.shopName;
        this.shopAvatar = value.shopAvatar;
        this.shopBgPath = value.shopBgPath;
        this.shopPhone = value.shopPhone;
        this.shopNotice = value.shopNotice;
        this.shopWx = value.shopWx;
        this.shopEmail = value.shopEmail;
        this.created = value.created;
        this.isEnabled = value.isEnabled;
        this.provinceCode = value.provinceCode;
        this.provinceName = value.provinceName;
        this.cityCode = value.cityCode;
        this.cityName = value.cityName;
        this.districtCode = value.districtCode;
        this.districtName = value.districtName;
        this.address = value.address;
        this.completeAddress = value.completeAddress;
        this.shopSellType = value.shopSellType;
        this.shopQq = value.shopQq;
        this.lastLoginIp = value.lastLoginIp;
        this.state = value.state;
        this.businessState = value.businessState;
        this.manageFee = value.manageFee;
        this.shopLicense = value.shopLicense;
        this.shopTaxCredential = value.shopTaxCredential;
        this.organizationCodeCertificate = value.organizationCodeCertificate;
        this.permitForOpeningBankAccount = value.permitForOpeningBankAccount;
        this.financialRegistration = value.financialRegistration;
        this.shopBankName = value.shopBankName;
        this.shopBank = value.shopBank;
        this.shopBankBranch = value.shopBankBranch;
        this.shopBankNo = value.shopBankNo;
        this.surplus = value.surplus;
        this.rejectReason = value.rejectReason;
        this.shopStatCode = value.shopStatCode;
        this.shopIcp = value.shopIcp;
        this.shopCopyright = value.shopCopyright;
        this.dbConfig = value.dbConfig;
        this.shareConfig = value.shareConfig;
    }

    public Shop(
        Integer    shopId,
        Integer    sysId,
        String     mobile,
        String     receiveMobile,
        String     shopName,
        String     shopAvatar,
        String     shopBgPath,
        String     shopPhone,
        String     shopNotice,
        String     shopWx,
        String     shopEmail,
        Timestamp  created,
        Byte       isEnabled,
        Integer    provinceCode,
        String     provinceName,
        Integer    cityCode,
        String     cityName,
        Integer    districtCode,
        String     districtName,
        String     address,
        String     completeAddress,
        Integer    shopSellType,
        String     shopQq,
        String     lastLoginIp,
        Byte       state,
        Byte       businessState,
        BigDecimal manageFee,
        String     shopLicense,
        String     shopTaxCredential,
        String     organizationCodeCertificate,
        String     permitForOpeningBankAccount,
        String     financialRegistration,
        String     shopBankName,
        String     shopBank,
        String     shopBankBranch,
        String     shopBankNo,
        BigDecimal surplus,
        String     rejectReason,
        String     shopStatCode,
        String     shopIcp,
        String     shopCopyright,
        String     dbConfig,
        String     shareConfig
    ) {
        this.shopId = shopId;
        this.sysId = sysId;
        this.mobile = mobile;
        this.receiveMobile = receiveMobile;
        this.shopName = shopName;
        this.shopAvatar = shopAvatar;
        this.shopBgPath = shopBgPath;
        this.shopPhone = shopPhone;
        this.shopNotice = shopNotice;
        this.shopWx = shopWx;
        this.shopEmail = shopEmail;
        this.created = created;
        this.isEnabled = isEnabled;
        this.provinceCode = provinceCode;
        this.provinceName = provinceName;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.districtCode = districtCode;
        this.districtName = districtName;
        this.address = address;
        this.completeAddress = completeAddress;
        this.shopSellType = shopSellType;
        this.shopQq = shopQq;
        this.lastLoginIp = lastLoginIp;
        this.state = state;
        this.businessState = businessState;
        this.manageFee = manageFee;
        this.shopLicense = shopLicense;
        this.shopTaxCredential = shopTaxCredential;
        this.organizationCodeCertificate = organizationCodeCertificate;
        this.permitForOpeningBankAccount = permitForOpeningBankAccount;
        this.financialRegistration = financialRegistration;
        this.shopBankName = shopBankName;
        this.shopBank = shopBank;
        this.shopBankBranch = shopBankBranch;
        this.shopBankNo = shopBankNo;
        this.surplus = surplus;
        this.rejectReason = rejectReason;
        this.shopStatCode = shopStatCode;
        this.shopIcp = shopIcp;
        this.shopCopyright = shopCopyright;
        this.dbConfig = dbConfig;
        this.shareConfig = shareConfig;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getSysId() {
        return this.sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getReceiveMobile() {
        return this.receiveMobile;
    }

    public void setReceiveMobile(String receiveMobile) {
        this.receiveMobile = receiveMobile;
    }

    public String getShopName() {
        return this.shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAvatar() {
        return this.shopAvatar;
    }

    public void setShopAvatar(String shopAvatar) {
        this.shopAvatar = shopAvatar;
    }

    public String getShopBgPath() {
        return this.shopBgPath;
    }

    public void setShopBgPath(String shopBgPath) {
        this.shopBgPath = shopBgPath;
    }

    public String getShopPhone() {
        return this.shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public String getShopNotice() {
        return this.shopNotice;
    }

    public void setShopNotice(String shopNotice) {
        this.shopNotice = shopNotice;
    }

    public String getShopWx() {
        return this.shopWx;
    }

    public void setShopWx(String shopWx) {
        this.shopWx = shopWx;
    }

    public String getShopEmail() {
        return this.shopEmail;
    }

    public void setShopEmail(String shopEmail) {
        this.shopEmail = shopEmail;
    }

    public Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Byte getIsEnabled() {
        return this.isEnabled;
    }

    public void setIsEnabled(Byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Integer getProvinceCode() {
        return this.provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getDistrictCode() {
        return this.districtCode;
    }

    public void setDistrictCode(Integer districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrictName() {
        return this.districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompleteAddress() {
        return this.completeAddress;
    }

    public void setCompleteAddress(String completeAddress) {
        this.completeAddress = completeAddress;
    }

    public Integer getShopSellType() {
        return this.shopSellType;
    }

    public void setShopSellType(Integer shopSellType) {
        this.shopSellType = shopSellType;
    }

    public String getShopQq() {
        return this.shopQq;
    }

    public void setShopQq(String shopQq) {
        this.shopQq = shopQq;
    }

    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Byte getState() {
        return this.state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getBusinessState() {
        return this.businessState;
    }

    public void setBusinessState(Byte businessState) {
        this.businessState = businessState;
    }

    public BigDecimal getManageFee() {
        return this.manageFee;
    }

    public void setManageFee(BigDecimal manageFee) {
        this.manageFee = manageFee;
    }

    public String getShopLicense() {
        return this.shopLicense;
    }

    public void setShopLicense(String shopLicense) {
        this.shopLicense = shopLicense;
    }

    public String getShopTaxCredential() {
        return this.shopTaxCredential;
    }

    public void setShopTaxCredential(String shopTaxCredential) {
        this.shopTaxCredential = shopTaxCredential;
    }

    public String getOrganizationCodeCertificate() {
        return this.organizationCodeCertificate;
    }

    public void setOrganizationCodeCertificate(String organizationCodeCertificate) {
        this.organizationCodeCertificate = organizationCodeCertificate;
    }

    public String getPermitForOpeningBankAccount() {
        return this.permitForOpeningBankAccount;
    }

    public void setPermitForOpeningBankAccount(String permitForOpeningBankAccount) {
        this.permitForOpeningBankAccount = permitForOpeningBankAccount;
    }

    public String getFinancialRegistration() {
        return this.financialRegistration;
    }

    public void setFinancialRegistration(String financialRegistration) {
        this.financialRegistration = financialRegistration;
    }

    public String getShopBankName() {
        return this.shopBankName;
    }

    public void setShopBankName(String shopBankName) {
        this.shopBankName = shopBankName;
    }

    public String getShopBank() {
        return this.shopBank;
    }

    public void setShopBank(String shopBank) {
        this.shopBank = shopBank;
    }

    public String getShopBankBranch() {
        return this.shopBankBranch;
    }

    public void setShopBankBranch(String shopBankBranch) {
        this.shopBankBranch = shopBankBranch;
    }

    public String getShopBankNo() {
        return this.shopBankNo;
    }

    public void setShopBankNo(String shopBankNo) {
        this.shopBankNo = shopBankNo;
    }

    public BigDecimal getSurplus() {
        return this.surplus;
    }

    public void setSurplus(BigDecimal surplus) {
        this.surplus = surplus;
    }

    public String getRejectReason() {
        return this.rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getShopStatCode() {
        return this.shopStatCode;
    }

    public void setShopStatCode(String shopStatCode) {
        this.shopStatCode = shopStatCode;
    }

    public String getShopIcp() {
        return this.shopIcp;
    }

    public void setShopIcp(String shopIcp) {
        this.shopIcp = shopIcp;
    }

    public String getShopCopyright() {
        return this.shopCopyright;
    }

    public void setShopCopyright(String shopCopyright) {
        this.shopCopyright = shopCopyright;
    }

    public String getDbConfig() {
        return this.dbConfig;
    }

    public void setDbConfig(String dbConfig) {
        this.dbConfig = dbConfig;
    }

    public String getShareConfig() {
        return this.shareConfig;
    }

    public void setShareConfig(String shareConfig) {
        this.shareConfig = shareConfig;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Shop (");

        sb.append(shopId);
        sb.append(", ").append(sysId);
        sb.append(", ").append(mobile);
        sb.append(", ").append(receiveMobile);
        sb.append(", ").append(shopName);
        sb.append(", ").append(shopAvatar);
        sb.append(", ").append(shopBgPath);
        sb.append(", ").append(shopPhone);
        sb.append(", ").append(shopNotice);
        sb.append(", ").append(shopWx);
        sb.append(", ").append(shopEmail);
        sb.append(", ").append(created);
        sb.append(", ").append(isEnabled);
        sb.append(", ").append(provinceCode);
        sb.append(", ").append(provinceName);
        sb.append(", ").append(cityCode);
        sb.append(", ").append(cityName);
        sb.append(", ").append(districtCode);
        sb.append(", ").append(districtName);
        sb.append(", ").append(address);
        sb.append(", ").append(completeAddress);
        sb.append(", ").append(shopSellType);
        sb.append(", ").append(shopQq);
        sb.append(", ").append(lastLoginIp);
        sb.append(", ").append(state);
        sb.append(", ").append(businessState);
        sb.append(", ").append(manageFee);
        sb.append(", ").append(shopLicense);
        sb.append(", ").append(shopTaxCredential);
        sb.append(", ").append(organizationCodeCertificate);
        sb.append(", ").append(permitForOpeningBankAccount);
        sb.append(", ").append(financialRegistration);
        sb.append(", ").append(shopBankName);
        sb.append(", ").append(shopBank);
        sb.append(", ").append(shopBankBranch);
        sb.append(", ").append(shopBankNo);
        sb.append(", ").append(surplus);
        sb.append(", ").append(rejectReason);
        sb.append(", ").append(shopStatCode);
        sb.append(", ").append(shopIcp);
        sb.append(", ").append(shopCopyright);
        sb.append(", ").append(dbConfig);
        sb.append(", ").append(shareConfig);

        sb.append(")");
        return sb.toString();
    }
}

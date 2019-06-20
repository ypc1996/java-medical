/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables.pojos;


import java.io.Serializable;
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
public class MpAuthShop implements Serializable {

    private static final long serialVersionUID = 2079478272;

    private String    appId;
    private Integer   shopId;
    private String    nickName;
    private String    userName;
    private String    alias;
    private String    verifyTypeInfo;
    private String    headImg;
    private String    funcInfo;
    private Byte      isAuthOk;
    private Timestamp lastAuthTime;
    private Timestamp lastCancelAuthTime;
    private Timestamp createTime;
    private String    qrcodeUrl;
    private Byte      openPay;
    private Byte      openCard;
    private String    authorizerInfo;
    private String    authorizationInfo;
    private String    payMchId;
    private String    payKey;
    private String    payCertContent;
    private String    payKeyContent;
    private Byte      isModifyDomain;
    private Integer   bindTemplateId;
    private Byte      uploadState;
    private Timestamp lastUploadTime;
    private Integer   auditId;
    private Byte      auditState;
    private Timestamp submitAuditTime;
    private Timestamp auditOkTime;
    private String    auditFailReason;
    private Byte      publishState;
    private Timestamp publishTime;
    private String    tester;
    private String    testQrPath;
    private String    category;
    private String    pageCfg;
    private String    principalName;
    private String    bindOpenAppId;
    private String    linkOfficialAppId;
    private Byte      isSubMerchant;
    private String    unionPayAppId;
    private String    unionPayCusId;
    private String    unionPayAppKey;

    public MpAuthShop() {}

    public MpAuthShop(MpAuthShop value) {
        this.appId = value.appId;
        this.shopId = value.shopId;
        this.nickName = value.nickName;
        this.userName = value.userName;
        this.alias = value.alias;
        this.verifyTypeInfo = value.verifyTypeInfo;
        this.headImg = value.headImg;
        this.funcInfo = value.funcInfo;
        this.isAuthOk = value.isAuthOk;
        this.lastAuthTime = value.lastAuthTime;
        this.lastCancelAuthTime = value.lastCancelAuthTime;
        this.createTime = value.createTime;
        this.qrcodeUrl = value.qrcodeUrl;
        this.openPay = value.openPay;
        this.openCard = value.openCard;
        this.authorizerInfo = value.authorizerInfo;
        this.authorizationInfo = value.authorizationInfo;
        this.payMchId = value.payMchId;
        this.payKey = value.payKey;
        this.payCertContent = value.payCertContent;
        this.payKeyContent = value.payKeyContent;
        this.isModifyDomain = value.isModifyDomain;
        this.bindTemplateId = value.bindTemplateId;
        this.uploadState = value.uploadState;
        this.lastUploadTime = value.lastUploadTime;
        this.auditId = value.auditId;
        this.auditState = value.auditState;
        this.submitAuditTime = value.submitAuditTime;
        this.auditOkTime = value.auditOkTime;
        this.auditFailReason = value.auditFailReason;
        this.publishState = value.publishState;
        this.publishTime = value.publishTime;
        this.tester = value.tester;
        this.testQrPath = value.testQrPath;
        this.category = value.category;
        this.pageCfg = value.pageCfg;
        this.principalName = value.principalName;
        this.bindOpenAppId = value.bindOpenAppId;
        this.linkOfficialAppId = value.linkOfficialAppId;
        this.isSubMerchant = value.isSubMerchant;
        this.unionPayAppId = value.unionPayAppId;
        this.unionPayCusId = value.unionPayCusId;
        this.unionPayAppKey = value.unionPayAppKey;
    }

    public MpAuthShop(
        String    appId,
        Integer   shopId,
        String    nickName,
        String    userName,
        String    alias,
        String    verifyTypeInfo,
        String    headImg,
        String    funcInfo,
        Byte      isAuthOk,
        Timestamp lastAuthTime,
        Timestamp lastCancelAuthTime,
        Timestamp createTime,
        String    qrcodeUrl,
        Byte      openPay,
        Byte      openCard,
        String    authorizerInfo,
        String    authorizationInfo,
        String    payMchId,
        String    payKey,
        String    payCertContent,
        String    payKeyContent,
        Byte      isModifyDomain,
        Integer   bindTemplateId,
        Byte      uploadState,
        Timestamp lastUploadTime,
        Integer   auditId,
        Byte      auditState,
        Timestamp submitAuditTime,
        Timestamp auditOkTime,
        String    auditFailReason,
        Byte      publishState,
        Timestamp publishTime,
        String    tester,
        String    testQrPath,
        String    category,
        String    pageCfg,
        String    principalName,
        String    bindOpenAppId,
        String    linkOfficialAppId,
        Byte      isSubMerchant,
        String    unionPayAppId,
        String    unionPayCusId,
        String    unionPayAppKey
    ) {
        this.appId = appId;
        this.shopId = shopId;
        this.nickName = nickName;
        this.userName = userName;
        this.alias = alias;
        this.verifyTypeInfo = verifyTypeInfo;
        this.headImg = headImg;
        this.funcInfo = funcInfo;
        this.isAuthOk = isAuthOk;
        this.lastAuthTime = lastAuthTime;
        this.lastCancelAuthTime = lastCancelAuthTime;
        this.createTime = createTime;
        this.qrcodeUrl = qrcodeUrl;
        this.openPay = openPay;
        this.openCard = openCard;
        this.authorizerInfo = authorizerInfo;
        this.authorizationInfo = authorizationInfo;
        this.payMchId = payMchId;
        this.payKey = payKey;
        this.payCertContent = payCertContent;
        this.payKeyContent = payKeyContent;
        this.isModifyDomain = isModifyDomain;
        this.bindTemplateId = bindTemplateId;
        this.uploadState = uploadState;
        this.lastUploadTime = lastUploadTime;
        this.auditId = auditId;
        this.auditState = auditState;
        this.submitAuditTime = submitAuditTime;
        this.auditOkTime = auditOkTime;
        this.auditFailReason = auditFailReason;
        this.publishState = publishState;
        this.publishTime = publishTime;
        this.tester = tester;
        this.testQrPath = testQrPath;
        this.category = category;
        this.pageCfg = pageCfg;
        this.principalName = principalName;
        this.bindOpenAppId = bindOpenAppId;
        this.linkOfficialAppId = linkOfficialAppId;
        this.isSubMerchant = isSubMerchant;
        this.unionPayAppId = unionPayAppId;
        this.unionPayCusId = unionPayCusId;
        this.unionPayAppKey = unionPayAppKey;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getVerifyTypeInfo() {
        return this.verifyTypeInfo;
    }

    public void setVerifyTypeInfo(String verifyTypeInfo) {
        this.verifyTypeInfo = verifyTypeInfo;
    }

    public String getHeadImg() {
        return this.headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getFuncInfo() {
        return this.funcInfo;
    }

    public void setFuncInfo(String funcInfo) {
        this.funcInfo = funcInfo;
    }

    public Byte getIsAuthOk() {
        return this.isAuthOk;
    }

    public void setIsAuthOk(Byte isAuthOk) {
        this.isAuthOk = isAuthOk;
    }

    public Timestamp getLastAuthTime() {
        return this.lastAuthTime;
    }

    public void setLastAuthTime(Timestamp lastAuthTime) {
        this.lastAuthTime = lastAuthTime;
    }

    public Timestamp getLastCancelAuthTime() {
        return this.lastCancelAuthTime;
    }

    public void setLastCancelAuthTime(Timestamp lastCancelAuthTime) {
        this.lastCancelAuthTime = lastCancelAuthTime;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getQrcodeUrl() {
        return this.qrcodeUrl;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    public Byte getOpenPay() {
        return this.openPay;
    }

    public void setOpenPay(Byte openPay) {
        this.openPay = openPay;
    }

    public Byte getOpenCard() {
        return this.openCard;
    }

    public void setOpenCard(Byte openCard) {
        this.openCard = openCard;
    }

    public String getAuthorizerInfo() {
        return this.authorizerInfo;
    }

    public void setAuthorizerInfo(String authorizerInfo) {
        this.authorizerInfo = authorizerInfo;
    }

    public String getAuthorizationInfo() {
        return this.authorizationInfo;
    }

    public void setAuthorizationInfo(String authorizationInfo) {
        this.authorizationInfo = authorizationInfo;
    }

    public String getPayMchId() {
        return this.payMchId;
    }

    public void setPayMchId(String payMchId) {
        this.payMchId = payMchId;
    }

    public String getPayKey() {
        return this.payKey;
    }

    public void setPayKey(String payKey) {
        this.payKey = payKey;
    }

    public String getPayCertContent() {
        return this.payCertContent;
    }

    public void setPayCertContent(String payCertContent) {
        this.payCertContent = payCertContent;
    }

    public String getPayKeyContent() {
        return this.payKeyContent;
    }

    public void setPayKeyContent(String payKeyContent) {
        this.payKeyContent = payKeyContent;
    }

    public Byte getIsModifyDomain() {
        return this.isModifyDomain;
    }

    public void setIsModifyDomain(Byte isModifyDomain) {
        this.isModifyDomain = isModifyDomain;
    }

    public Integer getBindTemplateId() {
        return this.bindTemplateId;
    }

    public void setBindTemplateId(Integer bindTemplateId) {
        this.bindTemplateId = bindTemplateId;
    }

    public Byte getUploadState() {
        return this.uploadState;
    }

    public void setUploadState(Byte uploadState) {
        this.uploadState = uploadState;
    }

    public Timestamp getLastUploadTime() {
        return this.lastUploadTime;
    }

    public void setLastUploadTime(Timestamp lastUploadTime) {
        this.lastUploadTime = lastUploadTime;
    }

    public Integer getAuditId() {
        return this.auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public Byte getAuditState() {
        return this.auditState;
    }

    public void setAuditState(Byte auditState) {
        this.auditState = auditState;
    }

    public Timestamp getSubmitAuditTime() {
        return this.submitAuditTime;
    }

    public void setSubmitAuditTime(Timestamp submitAuditTime) {
        this.submitAuditTime = submitAuditTime;
    }

    public Timestamp getAuditOkTime() {
        return this.auditOkTime;
    }

    public void setAuditOkTime(Timestamp auditOkTime) {
        this.auditOkTime = auditOkTime;
    }

    public String getAuditFailReason() {
        return this.auditFailReason;
    }

    public void setAuditFailReason(String auditFailReason) {
        this.auditFailReason = auditFailReason;
    }

    public Byte getPublishState() {
        return this.publishState;
    }

    public void setPublishState(Byte publishState) {
        this.publishState = publishState;
    }

    public Timestamp getPublishTime() {
        return this.publishTime;
    }

    public void setPublishTime(Timestamp publishTime) {
        this.publishTime = publishTime;
    }

    public String getTester() {
        return this.tester;
    }

    public void setTester(String tester) {
        this.tester = tester;
    }

    public String getTestQrPath() {
        return this.testQrPath;
    }

    public void setTestQrPath(String testQrPath) {
        this.testQrPath = testQrPath;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPageCfg() {
        return this.pageCfg;
    }

    public void setPageCfg(String pageCfg) {
        this.pageCfg = pageCfg;
    }

    public String getPrincipalName() {
        return this.principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public String getBindOpenAppId() {
        return this.bindOpenAppId;
    }

    public void setBindOpenAppId(String bindOpenAppId) {
        this.bindOpenAppId = bindOpenAppId;
    }

    public String getLinkOfficialAppId() {
        return this.linkOfficialAppId;
    }

    public void setLinkOfficialAppId(String linkOfficialAppId) {
        this.linkOfficialAppId = linkOfficialAppId;
    }

    public Byte getIsSubMerchant() {
        return this.isSubMerchant;
    }

    public void setIsSubMerchant(Byte isSubMerchant) {
        this.isSubMerchant = isSubMerchant;
    }

    public String getUnionPayAppId() {
        return this.unionPayAppId;
    }

    public void setUnionPayAppId(String unionPayAppId) {
        this.unionPayAppId = unionPayAppId;
    }

    public String getUnionPayCusId() {
        return this.unionPayCusId;
    }

    public void setUnionPayCusId(String unionPayCusId) {
        this.unionPayCusId = unionPayCusId;
    }

    public String getUnionPayAppKey() {
        return this.unionPayAppKey;
    }

    public void setUnionPayAppKey(String unionPayAppKey) {
        this.unionPayAppKey = unionPayAppKey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MpAuthShop (");

        sb.append(appId);
        sb.append(", ").append(shopId);
        sb.append(", ").append(nickName);
        sb.append(", ").append(userName);
        sb.append(", ").append(alias);
        sb.append(", ").append(verifyTypeInfo);
        sb.append(", ").append(headImg);
        sb.append(", ").append(funcInfo);
        sb.append(", ").append(isAuthOk);
        sb.append(", ").append(lastAuthTime);
        sb.append(", ").append(lastCancelAuthTime);
        sb.append(", ").append(createTime);
        sb.append(", ").append(qrcodeUrl);
        sb.append(", ").append(openPay);
        sb.append(", ").append(openCard);
        sb.append(", ").append(authorizerInfo);
        sb.append(", ").append(authorizationInfo);
        sb.append(", ").append(payMchId);
        sb.append(", ").append(payKey);
        sb.append(", ").append(payCertContent);
        sb.append(", ").append(payKeyContent);
        sb.append(", ").append(isModifyDomain);
        sb.append(", ").append(bindTemplateId);
        sb.append(", ").append(uploadState);
        sb.append(", ").append(lastUploadTime);
        sb.append(", ").append(auditId);
        sb.append(", ").append(auditState);
        sb.append(", ").append(submitAuditTime);
        sb.append(", ").append(auditOkTime);
        sb.append(", ").append(auditFailReason);
        sb.append(", ").append(publishState);
        sb.append(", ").append(publishTime);
        sb.append(", ").append(tester);
        sb.append(", ").append(testQrPath);
        sb.append(", ").append(category);
        sb.append(", ").append(pageCfg);
        sb.append(", ").append(principalName);
        sb.append(", ").append(bindOpenAppId);
        sb.append(", ").append(linkOfficialAppId);
        sb.append(", ").append(isSubMerchant);
        sb.append(", ").append(unionPayAppId);
        sb.append(", ").append(unionPayCusId);
        sb.append(", ").append(unionPayAppKey);

        sb.append(")");
        return sb.toString();
    }
}

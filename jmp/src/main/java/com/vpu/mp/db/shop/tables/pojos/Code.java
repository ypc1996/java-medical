/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.UInteger;


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
public class Code implements Serializable {

    private static final long serialVersionUID = 1381597568;

    private UInteger  codeId;
    private Short     type;
    private String    paramId;
    private String    typeUrl;
    private String    qrcodeImg;
    private Byte      flag;
    private Timestamp addTime;
    private String    channel;

    public Code() {}

    public Code(Code value) {
        this.codeId = value.codeId;
        this.type = value.type;
        this.paramId = value.paramId;
        this.typeUrl = value.typeUrl;
        this.qrcodeImg = value.qrcodeImg;
        this.flag = value.flag;
        this.addTime = value.addTime;
        this.channel = value.channel;
    }

    public Code(
        UInteger  codeId,
        Short     type,
        String    paramId,
        String    typeUrl,
        String    qrcodeImg,
        Byte      flag,
        Timestamp addTime,
        String    channel
    ) {
        this.codeId = codeId;
        this.type = type;
        this.paramId = paramId;
        this.typeUrl = typeUrl;
        this.qrcodeImg = qrcodeImg;
        this.flag = flag;
        this.addTime = addTime;
        this.channel = channel;
    }

    public UInteger getCodeId() {
        return this.codeId;
    }

    public void setCodeId(UInteger codeId) {
        this.codeId = codeId;
    }

    public Short getType() {
        return this.type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getParamId() {
        return this.paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    public String getTypeUrl() {
        return this.typeUrl;
    }

    public void setTypeUrl(String typeUrl) {
        this.typeUrl = typeUrl;
    }

    public String getQrcodeImg() {
        return this.qrcodeImg;
    }

    public void setQrcodeImg(String qrcodeImg) {
        this.qrcodeImg = qrcodeImg;
    }

    public Byte getFlag() {
        return this.flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    public Timestamp getAddTime() {
        return this.addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Code (");

        sb.append(codeId);
        sb.append(", ").append(type);
        sb.append(", ").append(paramId);
        sb.append(", ").append(typeUrl);
        sb.append(", ").append(qrcodeImg);
        sb.append(", ").append(flag);
        sb.append(", ").append(addTime);
        sb.append(", ").append(channel);

        sb.append(")");
        return sb.toString();
    }
}

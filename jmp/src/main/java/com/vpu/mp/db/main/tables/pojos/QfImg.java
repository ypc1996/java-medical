/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables.pojos;


import java.io.Serializable;

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
public class QfImg implements Serializable {

    private static final long serialVersionUID = -2132915412;

    private UInteger imgId;
    private UInteger questionFeedbackId;
    private String   imgUrl;
    private String   imgDesc;

    public QfImg() {}

    public QfImg(QfImg value) {
        this.imgId = value.imgId;
        this.questionFeedbackId = value.questionFeedbackId;
        this.imgUrl = value.imgUrl;
        this.imgDesc = value.imgDesc;
    }

    public QfImg(
        UInteger imgId,
        UInteger questionFeedbackId,
        String   imgUrl,
        String   imgDesc
    ) {
        this.imgId = imgId;
        this.questionFeedbackId = questionFeedbackId;
        this.imgUrl = imgUrl;
        this.imgDesc = imgDesc;
    }

    public UInteger getImgId() {
        return this.imgId;
    }

    public void setImgId(UInteger imgId) {
        this.imgId = imgId;
    }

    public UInteger getQuestionFeedbackId() {
        return this.questionFeedbackId;
    }

    public void setQuestionFeedbackId(UInteger questionFeedbackId) {
        this.questionFeedbackId = questionFeedbackId;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgDesc() {
        return this.imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("QfImg (");

        sb.append(imgId);
        sb.append(", ").append(questionFeedbackId);
        sb.append(", ").append(imgUrl);
        sb.append(", ").append(imgDesc);

        sb.append(")");
        return sb.toString();
    }
}

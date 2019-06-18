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
public class Article implements Serializable {

    private static final long serialVersionUID = 1652132215;

    private Integer   articleId;
    private Integer   categoryId;
    private String    title;
    private String    author;
    private String    keyword;
    private String    desc;
    private String    content;
    private Byte      isRecommend;
    private Byte      isTop;
    private Byte      status;
    private Timestamp pubTime;
    private Timestamp updateTime;
    private Timestamp createTime;
    private Timestamp lastVisitTime;
    private Integer   pv;
    private Byte      showFooter;

    public Article() {}

    public Article(Article value) {
        this.articleId = value.articleId;
        this.categoryId = value.categoryId;
        this.title = value.title;
        this.author = value.author;
        this.keyword = value.keyword;
        this.desc = value.desc;
        this.content = value.content;
        this.isRecommend = value.isRecommend;
        this.isTop = value.isTop;
        this.status = value.status;
        this.pubTime = value.pubTime;
        this.updateTime = value.updateTime;
        this.createTime = value.createTime;
        this.lastVisitTime = value.lastVisitTime;
        this.pv = value.pv;
        this.showFooter = value.showFooter;
    }

    public Article(
        Integer   articleId,
        Integer   categoryId,
        String    title,
        String    author,
        String    keyword,
        String    desc,
        String    content,
        Byte      isRecommend,
        Byte      isTop,
        Byte      status,
        Timestamp pubTime,
        Timestamp updateTime,
        Timestamp createTime,
        Timestamp lastVisitTime,
        Integer   pv,
        Byte      showFooter
    ) {
        this.articleId = articleId;
        this.categoryId = categoryId;
        this.title = title;
        this.author = author;
        this.keyword = keyword;
        this.desc = desc;
        this.content = content;
        this.isRecommend = isRecommend;
        this.isTop = isTop;
        this.status = status;
        this.pubTime = pubTime;
        this.updateTime = updateTime;
        this.createTime = createTime;
        this.lastVisitTime = lastVisitTime;
        this.pv = pv;
        this.showFooter = showFooter;
    }

    public Integer getArticleId() {
        return this.articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getIsRecommend() {
        return this.isRecommend;
    }

    public void setIsRecommend(Byte isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Byte getIsTop() {
        return this.isTop;
    }

    public void setIsTop(Byte isTop) {
        this.isTop = isTop;
    }

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Timestamp getPubTime() {
        return this.pubTime;
    }

    public void setPubTime(Timestamp pubTime) {
        this.pubTime = pubTime;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getLastVisitTime() {
        return this.lastVisitTime;
    }

    public void setLastVisitTime(Timestamp lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }

    public Integer getPv() {
        return this.pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Byte getShowFooter() {
        return this.showFooter;
    }

    public void setShowFooter(Byte showFooter) {
        this.showFooter = showFooter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Article (");

        sb.append(articleId);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(title);
        sb.append(", ").append(author);
        sb.append(", ").append(keyword);
        sb.append(", ").append(desc);
        sb.append(", ").append(content);
        sb.append(", ").append(isRecommend);
        sb.append(", ").append(isTop);
        sb.append(", ").append(status);
        sb.append(", ").append(pubTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(createTime);
        sb.append(", ").append(lastVisitTime);
        sb.append(", ").append(pv);
        sb.append(", ").append(showFooter);

        sb.append(")");
        return sb.toString();
    }
}

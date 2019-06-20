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
public class Category implements Serializable {

    private static final long serialVersionUID = -1592892249;

    private Short     catId;
    private String    catName;
    private String    keywords;
    private String    catDesc;
    private Short     parentId;
    private Short     level;
    private Byte      hasChild;
    private Timestamp createTime;
    private String    catImg;
    private Short     first;

    public Category() {}

    public Category(Category value) {
        this.catId = value.catId;
        this.catName = value.catName;
        this.keywords = value.keywords;
        this.catDesc = value.catDesc;
        this.parentId = value.parentId;
        this.level = value.level;
        this.hasChild = value.hasChild;
        this.createTime = value.createTime;
        this.catImg = value.catImg;
        this.first = value.first;
    }

    public Category(
        Short     catId,
        String    catName,
        String    keywords,
        String    catDesc,
        Short     parentId,
        Short     level,
        Byte      hasChild,
        Timestamp createTime,
        String    catImg,
        Short     first
    ) {
        this.catId = catId;
        this.catName = catName;
        this.keywords = keywords;
        this.catDesc = catDesc;
        this.parentId = parentId;
        this.level = level;
        this.hasChild = hasChild;
        this.createTime = createTime;
        this.catImg = catImg;
        this.first = first;
    }

    public Short getCatId() {
        return this.catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return this.catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getCatDesc() {
        return this.catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    public Short getParentId() {
        return this.parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    public Short getLevel() {
        return this.level;
    }

    public void setLevel(Short level) {
        this.level = level;
    }

    public Byte getHasChild() {
        return this.hasChild;
    }

    public void setHasChild(Byte hasChild) {
        this.hasChild = hasChild;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCatImg() {
        return this.catImg;
    }

    public void setCatImg(String catImg) {
        this.catImg = catImg;
    }

    public Short getFirst() {
        return this.first;
    }

    public void setFirst(Short first) {
        this.first = first;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Category (");

        sb.append(catId);
        sb.append(", ").append(catName);
        sb.append(", ").append(keywords);
        sb.append(", ").append(catDesc);
        sb.append(", ").append(parentId);
        sb.append(", ").append(level);
        sb.append(", ").append(hasChild);
        sb.append(", ").append(createTime);
        sb.append(", ").append(catImg);
        sb.append(", ").append(first);

        sb.append(")");
        return sb.toString();
    }
}

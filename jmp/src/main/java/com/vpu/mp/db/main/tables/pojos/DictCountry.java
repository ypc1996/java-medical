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
public class DictCountry implements Serializable {

    private static final long serialVersionUID = 1570143886;

    private Integer   countryId;
    private String    name;
    private String    shortName;
    private String    enName;
    private Timestamp created;

    public DictCountry() {}

    public DictCountry(DictCountry value) {
        this.countryId = value.countryId;
        this.name = value.name;
        this.shortName = value.shortName;
        this.enName = value.enName;
        this.created = value.created;
    }

    public DictCountry(
        Integer   countryId,
        String    name,
        String    shortName,
        String    enName,
        Timestamp created
    ) {
        this.countryId = countryId;
        this.name = name;
        this.shortName = shortName;
        this.enName = enName;
        this.created = created;
    }

    public Integer getCountryId() {
        return this.countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DictCountry (");

        sb.append(countryId);
        sb.append(", ").append(name);
        sb.append(", ").append(shortName);
        sb.append(", ").append(enName);
        sb.append(", ").append(created);

        sb.append(")");
        return sb.toString();
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables.pojos;


import java.io.Serializable;

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
public class Jobs implements Serializable {

    private static final long serialVersionUID = -2141571821;

    private Long    id;
    private String  queue;
    private String  payload;
    private Byte    attempts;
    private Integer reservedAt;
    private Integer availableAt;
    private Integer createdAt;

    public Jobs() {}

    public Jobs(Jobs value) {
        this.id = value.id;
        this.queue = value.queue;
        this.payload = value.payload;
        this.attempts = value.attempts;
        this.reservedAt = value.reservedAt;
        this.availableAt = value.availableAt;
        this.createdAt = value.createdAt;
    }

    public Jobs(
        Long    id,
        String  queue,
        String  payload,
        Byte    attempts,
        Integer reservedAt,
        Integer availableAt,
        Integer createdAt
    ) {
        this.id = id;
        this.queue = queue;
        this.payload = payload;
        this.attempts = attempts;
        this.reservedAt = reservedAt;
        this.availableAt = availableAt;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQueue() {
        return this.queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getPayload() {
        return this.payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Byte getAttempts() {
        return this.attempts;
    }

    public void setAttempts(Byte attempts) {
        this.attempts = attempts;
    }

    public Integer getReservedAt() {
        return this.reservedAt;
    }

    public void setReservedAt(Integer reservedAt) {
        this.reservedAt = reservedAt;
    }

    public Integer getAvailableAt() {
        return this.availableAt;
    }

    public void setAvailableAt(Integer availableAt) {
        this.availableAt = availableAt;
    }

    public Integer getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Jobs (");

        sb.append(id);
        sb.append(", ").append(queue);
        sb.append(", ").append(payload);
        sb.append(", ").append(attempts);
        sb.append(", ").append(reservedAt);
        sb.append(", ").append(availableAt);
        sb.append(", ").append(createdAt);

        sb.append(")");
        return sb.toString();
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.main.tables.records;


import com.vpu.mp.db.main.tables.Jobs;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class JobsRecord extends UpdatableRecordImpl<JobsRecord> implements Record7<Long, String, String, Byte, Integer, Integer, Integer> {

    private static final long serialVersionUID = -305493909;

    /**
     * Setter for <code>mini_main.b2c_jobs.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>mini_main.b2c_jobs.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>mini_main.b2c_jobs.queue</code>.
     */
    public void setQueue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mini_main.b2c_jobs.queue</code>.
     */
    public String getQueue() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mini_main.b2c_jobs.payload</code>.
     */
    public void setPayload(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mini_main.b2c_jobs.payload</code>.
     */
    public String getPayload() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mini_main.b2c_jobs.attempts</code>.
     */
    public void setAttempts(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mini_main.b2c_jobs.attempts</code>.
     */
    public Byte getAttempts() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>mini_main.b2c_jobs.reserved_at</code>.
     */
    public void setReservedAt(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mini_main.b2c_jobs.reserved_at</code>.
     */
    public Integer getReservedAt() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mini_main.b2c_jobs.available_at</code>.
     */
    public void setAvailableAt(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mini_main.b2c_jobs.available_at</code>.
     */
    public Integer getAvailableAt() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mini_main.b2c_jobs.created_at</code>.
     */
    public void setCreatedAt(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>mini_main.b2c_jobs.created_at</code>.
     */
    public Integer getCreatedAt() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, Byte, Integer, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, Byte, Integer, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Jobs.JOBS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Jobs.JOBS.QUEUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Jobs.JOBS.PAYLOAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return Jobs.JOBS.ATTEMPTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Jobs.JOBS.RESERVED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Jobs.JOBS.AVAILABLE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Jobs.JOBS.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getQueue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPayload();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getAttempts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getReservedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getAvailableAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getQueue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPayload();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getAttempts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getReservedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getAvailableAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobsRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobsRecord value2(String value) {
        setQueue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobsRecord value3(String value) {
        setPayload(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobsRecord value4(Byte value) {
        setAttempts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobsRecord value5(Integer value) {
        setReservedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobsRecord value6(Integer value) {
        setAvailableAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobsRecord value7(Integer value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobsRecord values(Long value1, String value2, String value3, Byte value4, Integer value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JobsRecord
     */
    public JobsRecord() {
        super(Jobs.JOBS);
    }

    /**
     * Create a detached, initialised JobsRecord
     */
    public JobsRecord(Long id, String queue, String payload, Byte attempts, Integer reservedAt, Integer availableAt, Integer createdAt) {
        super(Jobs.JOBS);

        set(0, id);
        set(1, queue);
        set(2, payload);
        set(3, attempts);
        set(4, reservedAt);
        set(5, availableAt);
        set(6, createdAt);
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_1;
import com.vpu.mp.db.shop.tables.records.MpJumpRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MpJump extends TableImpl<MpJumpRecord> {

    private static final long serialVersionUID = -686991607;

    /**
     * The reference instance of <code>mini_shop_1.b2c_mp_jump</code>
     */
    public static final MpJump MP_JUMP = new MpJump();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MpJumpRecord> getRecordType() {
        return MpJumpRecord.class;
    }

    /**
     * The column <code>mini_shop_1.b2c_mp_jump.id</code>.
     */
    public final TableField<MpJumpRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_1.b2c_mp_jump.app_id</code>.
     */
    public final TableField<MpJumpRecord, String> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mini_shop_1.b2c_mp_jump.app_name</code>.
     */
    public final TableField<MpJumpRecord, String> APP_NAME = createField("app_name", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>mini_shop_1.b2c_mp_jump.flag</code>. 0:可用，1:停用
     */
    public final TableField<MpJumpRecord, Byte> FLAG = createField("flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:可用，1:停用");

    /**
     * The column <code>mini_shop_1.b2c_mp_jump.is_delete</code>. 0:未删除，1:已删除
     */
    public final TableField<MpJumpRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:未删除，1:已删除");

    /**
     * The column <code>mini_shop_1.b2c_mp_jump.add_time</code>.
     */
    public final TableField<MpJumpRecord, Timestamp> ADD_TIME = createField("add_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>mini_shop_1.b2c_mp_jump.update_time</code>.
     */
    public final TableField<MpJumpRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>mini_shop_1.b2c_mp_jump</code> table reference
     */
    public MpJump() {
        this(DSL.name("b2c_mp_jump"), null);
    }

    /**
     * Create an aliased <code>mini_shop_1.b2c_mp_jump</code> table reference
     */
    public MpJump(String alias) {
        this(DSL.name(alias), MP_JUMP);
    }

    /**
     * Create an aliased <code>mini_shop_1.b2c_mp_jump</code> table reference
     */
    public MpJump(Name alias) {
        this(alias, MP_JUMP);
    }

    private MpJump(Name alias, Table<MpJumpRecord> aliased) {
        this(alias, aliased, null);
    }

    private MpJump(Name alias, Table<MpJumpRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MpJump(Table<O> child, ForeignKey<O, MpJumpRecord> key) {
        super(child, key, MP_JUMP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniShop_1.MINI_SHOP_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MP_JUMP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MpJumpRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MP_JUMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MpJumpRecord> getPrimaryKey() {
        return Keys.KEY_B2C_MP_JUMP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MpJumpRecord>> getKeys() {
        return Arrays.<UniqueKey<MpJumpRecord>>asList(Keys.KEY_B2C_MP_JUMP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpJump as(String alias) {
        return new MpJump(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MpJump as(Name alias) {
        return new MpJump(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MpJump rename(String name) {
        return new MpJump(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MpJump rename(Name name) {
        return new MpJump(name, null);
    }
}

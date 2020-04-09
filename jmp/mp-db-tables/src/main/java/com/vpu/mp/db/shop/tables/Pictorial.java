/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.PictorialRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class Pictorial extends TableImpl<PictorialRecord> {

    private static final long serialVersionUID = 2022113961;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_pictorial</code>
     */
    public static final Pictorial PICTORIAL = new Pictorial();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PictorialRecord> getRecordType() {
        return PictorialRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_pictorial.id</code>.
     */
    public final TableField<PictorialRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_pictorial.action</code>. 海报类型： 1：普通 2 ：拼团 3：砍价 4：表单 5:拼团分享
     */
    public final TableField<PictorialRecord, Byte> ACTION = createField("action", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "海报类型： 1：普通 2 ：拼团 3：砍价 4：表单 5:拼团分享");

    /**
     * The column <code>mini_shop_471752.b2c_pictorial.path</code>. 海报路径
     */
    public final TableField<PictorialRecord, String> PATH = createField("path", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "海报路径");

    /**
     * The column <code>mini_shop_471752.b2c_pictorial.rule</code>. 生成触发规则
     */
    public final TableField<PictorialRecord, String> RULE = createField("rule", org.jooq.impl.SQLDataType.CLOB, this, "生成触发规则");

    /**
     * The column <code>mini_shop_471752.b2c_pictorial.user_id</code>.
     */
    public final TableField<PictorialRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_pictorial.identity_id</code>. 关联id： 例如：goods_id, page_id
     */
    public final TableField<PictorialRecord, Integer> IDENTITY_ID = createField("identity_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "关联id： 例如：goods_id, page_id");

    /**
     * The column <code>mini_shop_471752.b2c_pictorial.activity_id</code>. 活动id
     */
    public final TableField<PictorialRecord, Integer> ACTIVITY_ID = createField("activity_id", org.jooq.impl.SQLDataType.INTEGER, this, "活动id");

    /**
     * The column <code>mini_shop_471752.b2c_pictorial.del_flag</code>. 删除标记： 1：删除
     */
    public final TableField<PictorialRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "删除标记： 1：删除");

    /**
     * The column <code>mini_shop_471752.b2c_pictorial.del_time</code>.
     */
    public final TableField<PictorialRecord, Timestamp> DEL_TIME = createField("del_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_pictorial.create_time</code>.
     */
    public final TableField<PictorialRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_pictorial.update_time</code>. 最后修改时间
     */
    public final TableField<PictorialRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * Create a <code>mini_shop_471752.b2c_pictorial</code> table reference
     */
    public Pictorial() {
        this(DSL.name("b2c_pictorial"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_pictorial</code> table reference
     */
    public Pictorial(String alias) {
        this(DSL.name(alias), PICTORIAL);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_pictorial</code> table reference
     */
    public Pictorial(Name alias) {
        this(alias, PICTORIAL);
    }

    private Pictorial(Name alias, Table<PictorialRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pictorial(Name alias, Table<PictorialRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Pictorial(Table<O> child, ForeignKey<O, PictorialRecord> key) {
        super(child, key, PICTORIAL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MiniShop_471752.MINI_SHOP_471752;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PICTORIAL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PictorialRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PICTORIAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PictorialRecord> getPrimaryKey() {
        return Keys.KEY_B2C_PICTORIAL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PictorialRecord>> getKeys() {
        return Arrays.<UniqueKey<PictorialRecord>>asList(Keys.KEY_B2C_PICTORIAL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pictorial as(String alias) {
        return new Pictorial(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pictorial as(Name alias) {
        return new Pictorial(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Pictorial rename(String name) {
        return new Pictorial(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Pictorial rename(Name name) {
        return new Pictorial(name, null);
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.db.shop.tables;


import com.vpu.mp.db.shop.Indexes;
import com.vpu.mp.db.shop.Keys;
import com.vpu.mp.db.shop.MiniShop_471752;
import com.vpu.mp.db.shop.tables.records.UploadedVideoRecord;

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
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UploadedVideo extends TableImpl<UploadedVideoRecord> {

    private static final long serialVersionUID = -1859576316;

    /**
     * The reference instance of <code>mini_shop_471752.b2c_uploaded_video</code>
     */
    public static final UploadedVideo UPLOADED_VIDEO = new UploadedVideo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UploadedVideoRecord> getRecordType() {
        return UploadedVideoRecord.class;
    }

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.video_id</code>.
     */
    public final TableField<UploadedVideoRecord, Integer> VIDEO_ID = createField("video_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.video_type</code>.
     */
    public final TableField<UploadedVideoRecord, String> VIDEO_TYPE = createField("video_type", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.video_size</code>.
     */
    public final TableField<UploadedVideoRecord, Integer> VIDEO_SIZE = createField("video_size", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.video_name</code>. 视频名称，用于前端显示
     */
    public final TableField<UploadedVideoRecord, String> VIDEO_NAME = createField("video_name", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "视频名称，用于前端显示");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.video_orig_fname</code>.
     */
    public final TableField<UploadedVideoRecord, String> VIDEO_ORIG_FNAME = createField("video_orig_fname", org.jooq.impl.SQLDataType.VARCHAR(191).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.video_path</code>.
     */
    public final TableField<UploadedVideoRecord, String> VIDEO_PATH = createField("video_path", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.video_snap_path</code>. 视频截图
     */
    public final TableField<UploadedVideoRecord, String> VIDEO_SNAP_PATH = createField("video_snap_path", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "视频截图");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.video_url</code>.
     */
    public final TableField<UploadedVideoRecord, String> VIDEO_URL = createField("video_url", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.video_cat_id</code>. 视频分类
     */
    public final TableField<UploadedVideoRecord, Integer> VIDEO_CAT_ID = createField("video_cat_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "视频分类");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.video_width</code>.
     */
    public final TableField<UploadedVideoRecord, Integer> VIDEO_WIDTH = createField("video_width", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.video_height</code>.
     */
    public final TableField<UploadedVideoRecord, Integer> VIDEO_HEIGHT = createField("video_height", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.video_meta</code>. 视频信息,json
     */
    public final TableField<UploadedVideoRecord, String> VIDEO_META = createField("video_meta", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "视频信息,json");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.is_refer</code>. 是否引用
     */
    public final TableField<UploadedVideoRecord, Byte> IS_REFER = createField("is_refer", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否引用");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.shop_id</code>. 店铺id
     */
    public final TableField<UploadedVideoRecord, Integer> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺id");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.del_flag</code>.
     */
    public final TableField<UploadedVideoRecord, Byte> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.video_duration</code>. 视频时长
     */
    public final TableField<UploadedVideoRecord, Integer> VIDEO_DURATION = createField("video_duration", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "视频时长");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.user_id</code>. 用户ID
     */
    public final TableField<UploadedVideoRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户ID");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.del_time</code>. 删除时间
     */
    public final TableField<UploadedVideoRecord, Timestamp> DEL_TIME = createField("del_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "删除时间");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.upyun_del</code>. 又拍云是否删除
     */
    public final TableField<UploadedVideoRecord, Byte> UPYUN_DEL = createField("upyun_del", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "又拍云是否删除");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.create_time</code>.
     */
    public final TableField<UploadedVideoRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.update_time</code>. 最后修改时间
     */
    public final TableField<UploadedVideoRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后修改时间");

    /**
     * The column <code>mini_shop_471752.b2c_uploaded_video.duration</code>. 视频时长
     */
    public final TableField<UploadedVideoRecord, Integer> DURATION = createField("duration", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "视频时长");

    /**
     * Create a <code>mini_shop_471752.b2c_uploaded_video</code> table reference
     */
    public UploadedVideo() {
        this(DSL.name("b2c_uploaded_video"), null);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_uploaded_video</code> table reference
     */
    public UploadedVideo(String alias) {
        this(DSL.name(alias), UPLOADED_VIDEO);
    }

    /**
     * Create an aliased <code>mini_shop_471752.b2c_uploaded_video</code> table reference
     */
    public UploadedVideo(Name alias) {
        this(alias, UPLOADED_VIDEO);
    }

    private UploadedVideo(Name alias, Table<UploadedVideoRecord> aliased) {
        this(alias, aliased, null);
    }

    private UploadedVideo(Name alias, Table<UploadedVideoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UploadedVideo(Table<O> child, ForeignKey<O, UploadedVideoRecord> key) {
        super(child, key, UPLOADED_VIDEO);
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
        return Arrays.<Index>asList(Indexes.UPLOADED_VIDEO_PRIMARY, Indexes.UPLOADED_VIDEO_SHOP_ID, Indexes.UPLOADED_VIDEO_VIDEO_ORIG_FNAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UploadedVideoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_UPLOADED_VIDEO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UploadedVideoRecord> getPrimaryKey() {
        return Keys.KEY_B2C_UPLOADED_VIDEO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UploadedVideoRecord>> getKeys() {
        return Arrays.<UniqueKey<UploadedVideoRecord>>asList(Keys.KEY_B2C_UPLOADED_VIDEO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideo as(String alias) {
        return new UploadedVideo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedVideo as(Name alias) {
        return new UploadedVideo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UploadedVideo rename(String name) {
        return new UploadedVideo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UploadedVideo rename(Name name) {
        return new UploadedVideo(name, null);
    }
}

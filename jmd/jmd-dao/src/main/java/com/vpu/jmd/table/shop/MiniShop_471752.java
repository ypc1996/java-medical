/*
 * This file is generated by jOOQ.
 */
package com.vpu.jmd.table.shop;


import com.vpu.jmd.db.shop.tables.*;
import com.vpu.jmd.table.shop.tables.ShopCfg;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
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
public class MiniShop_471752 extends SchemaImpl {

    private static final long serialVersionUID = -390755599;

    /**
     * The table <code>mini_shop_471752.b2c_shop_cfg</code>.
     */
    public final ShopCfg SHOP_CFG = ShopCfg.SHOP_CFG;


    /**
     * The reference instance of <code>mini_shop_471752</code>
     */
    public static final MiniShop_471752 MINI_SHOP_471752 = new MiniShop_471752();

    /**
     * No further instances allowed
     */
    private MiniShop_471752() {
        super("mini_shop_471752", null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            ShopCfg.SHOP_CFG
          );


    }
}

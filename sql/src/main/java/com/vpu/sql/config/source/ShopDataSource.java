package com.vpu.sql.config.source;

import com.vpu.sql.entity.DbConfig;

import javax.sql.DataSource;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

/**
 * @author luguangyao
 */
public interface ShopDataSource {
    /**
     * execute
     * @param sql
     */
    void execute(String sql);

    /**
     * execute
     * @param path
     */
    void execute(Path path);

    /**
     * getShopDataSource
     * @param configs
     * @return
     */
    Map<String,DataSource> getShopDataSource(List<DbConfig> configs);
}

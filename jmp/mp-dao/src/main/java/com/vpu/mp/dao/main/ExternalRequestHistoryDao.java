package com.vpu.mp.dao.main;

import com.vpu.mp.dao.foundation.base.MainBaseDao;
import com.vpu.mp.db.main.tables.records.ExternalRequestHistoryRecord;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

import static com.vpu.mp.db.main.Tables.EXTERNAL_REQUEST_HISTORY;

/**
 * 外部请求历史记录
 * @author 李晓冰
 * @date 2020年07月15日
 */
@Repository
public class ExternalRequestHistoryDao extends MainBaseDao {

    /**
     *  获取对应服务最后一次请求
     * @param appId
     * @param shopId
     * @param serviceName
     * @return
     */
    public Timestamp getLastRequestTime(String appId, Integer shopId, String serviceName) {
        Timestamp timestamp = db().select(DSL.maxDistinct(EXTERNAL_REQUEST_HISTORY.CREATE_TIME).as(EXTERNAL_REQUEST_HISTORY.CREATE_TIME))
            .where(EXTERNAL_REQUEST_HISTORY.APP_ID.eq(appId).and(EXTERNAL_REQUEST_HISTORY.SHOP_ID.eq(shopId))
                .and(EXTERNAL_REQUEST_HISTORY.SERVICE_NAME.eq(serviceName).and(EXTERNAL_REQUEST_HISTORY.ERROR_CODE.eq(0))))
            .fetchAny(EXTERNAL_REQUEST_HISTORY.CREATE_TIME);
        return timestamp;
    }

    /**
     *
     * @param appId
     * @param shopId
     * @param serviceName
     * @param requestParam
     */
    public void insert(String appId, Integer shopId, String serviceName, String requestParam,Integer errorCode) {
        ExternalRequestHistoryRecord record = new ExternalRequestHistoryRecord();
        record.setAppId(appId);
        record.setShopId(shopId);
        record.setServiceName(serviceName);
        record.setRequestParam(requestParam);
        record.setErrorCode(errorCode);
        db().executeInsert(record);
    }

}

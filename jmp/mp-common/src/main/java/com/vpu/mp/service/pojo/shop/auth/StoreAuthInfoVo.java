package com.vpu.mp.service.pojo.shop.auth;

import com.vpu.mp.service.pojo.shop.store.account.StoreAccountVo;
import lombok.Data;

/**
 * @author chenjie
 * @date 2020年08月21日
 */
@Data
public class StoreAuthInfoVo {
    private String msg;
    private StoreAccountVo storeAccountInfo;
    private Boolean isOk=false;
}

package com.vpu.mp.service.pojo.shop.sms;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

/**
 * @author 赵晓东
 * @description
 * @create 2020-08-04 13:53
 **/

@Data
public class ResponseMsgVo {
    private Integer code;
    private String msg;


    @Data
    @Builder
    public static class DataList{
        private String phone;
        private Integer messageId;
    }
}



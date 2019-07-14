package com.vpu.mp.service.pojo.shop.goods.brand;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

/**
 * @author 李晓冰
 * @date 2019年07月02日
 */
@Data
public class GoodsBrand {

    private Integer id;
    private String brandName;
    private String eName;
    private String logo;
    private Byte first;
    private Timestamp createTime;
    private String desc;
    private Byte isRecommend;
    private Integer classifyId;
}

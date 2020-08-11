/*
 * This file is generated by jOOQ.
 */
package com.vpu.mp.common.pojo.shop.table;


import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 用户消息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Data
public class UserMessageDo implements Serializable {

    private static final long serialVersionUID = 997430140;

    private Integer   messageId;
    private String    messageName;
    private String    messageContent;
    private Byte      messageType;
    private Integer   receiverId;
    private String    receiverName;
    private Integer   senderId;
    private String    senderName;
    private Byte      messageStatus;
    private Timestamp messageTime;
    private Integer   messageRelevanceId;
    private String    messageRelevanceOrderSn;
    private Byte      messageChatStatus;
    private Byte      isDelete;
    private Timestamp createTime;
    private Timestamp updateTime;

}

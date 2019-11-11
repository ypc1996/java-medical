package com.vpu.mp.service.pojo.shop.config.message;

import com.vpu.mp.service.pojo.shop.config.ShopMsgTempConfig;

public class MessageTemplateConfigConstant {
    /** 预约取消通知 */
    public static final Integer BOOKING_CANCEL = 2001;
    /** 预约成功提醒 */
    public static final Integer BOOKING_SUCCESS = 2002;
    /** 预约到期提醒 */
    public static final Integer BOOKING_EXPIRED = 2003;
    /** 账户余额变动提醒 */
    public static final Integer MONEY_CHANGE = 2004;
    /** 订单发货提醒 */
    public static final Integer ORDER_SEND = 2005;
    /** 订单未支付通知 */
    public static final Integer ORDER_NO_PAY =2006;
    /** 订单支付成功通知 */
    public static final Integer ORDER_SUCCESS_PAY = 2007;
    /** 确认收货通知 */
    public static final Integer GET_GOODS = 2008;
    /** 退款失败通知 */
    public static final Integer FAIL_RETURN_MONEY= 2009;
    /** 退款状态通知 */
    public static final Integer STATUS_RETURN_MONEY = 2010;
    /** 门店自提到期提醒 */
    public static final Integer OWNER_GET_GOODS = 2011;
    /** 取货成功通知 */
    public static final Integer SUCCESS_GET_GOODS = 2012;
    /** 会员卡余额变动提醒 */
    public static final Integer CHANGE_MEMBER_CARD_MONEY = 3001;
    /** 会员卡领取成功通知 */
    public static final Integer SUCCESS_MEMBER_CARD_GET = 3002;
    /** 限次卡扣减通知 */
    public static final Integer REDUCE_LIMIT_TIMES_MEMBER_CARD = 3003;
    /** 卡券到期提醒 */
    public static final Integer EXPIRED_MEMBER = 3004;
    /** 卡券领取成功通知 */
    public static final Integer GET_COUPON = 3005;
    /** 拼团失败通知 */
    public static final Integer FAIL_TEAM = 3006;
    /** 拼团成功通知 */
    public static final Integer SUCCESS_TEAM = 3007;
    /** 自定义消息模板推送 */
    public static final Integer DIY_MESSAGE_TEMPLATE = 3008;
    /** 砍价成功提醒 */
    public static final Integer SUCCESS_BRING_DOWN = 3009;
    /** 砍价进度通知 */
    public static final Integer PROGRESS_BRING_DOWN = 3010;
    /** 审核通过提醒 */
    public static final Integer SUCCESS_REVIEW = 3011;
    /** 审核不通过提醒 */
    public static final Integer FAIL_REVIEW = 3012;
    /** 分销员等级升级提醒 */
    public static final Integer LEVEL_UP = 3013;
    /** 拼团抽奖结果通知 */
    public static final Integer LOTTERY_TEAM = 3014;

    public static final ShopMsgTempConfig MSG_TEMP_CONFIG = new ShopMsgTempConfig() {{
        setA(new String[]{"eZRlu9Y3zSkEi5dSgnVHij2zF-JxwADkXV9Ni_MOB0E",
            "suK4T3YT6p14sKCrR46MxpkImPfXyqkGCVDFtIFgofc",
            "IisOp3dQozvHB_jFNrPGowce45WbPWNzk28zFFySIRM",
            "Mi_i0drZzsNroKsQX-51rzctcsCVpsfWlXisqTehLKI",
            "pUz3zN_NbRdr0kTzyHnGjw8aYLkO7Awh7hpo_IZ2PRE",
            "48QC9uvKtAdChBPbzYsPrD63vMiZzaAzU76EgTXqfD8",
            "uO52zgL7bxJLiBJYYi-FRWM8OVKKSsP6O-bATbj7oG8",
            "z_fORYEacLyZ2TOk1fjpeD0qa_0g27itoRsx0i26FmY",
            "KXFHhedZw8OidHt9VkTnFpRG4FyN6Go1a683z0Y01s0",
            "Mn8rqbbucnMK4-VCV5KqSitEyXxdhwd1MQCv71A5-Us",
            "2BIgVDb6b6BdlGUsu3w_RFoD1BAGysMwIJ82Rvw6tW8",
            "2BIgVDb6b6BdlGUsu3w_RCkF7Gtb2Gfi_5XjBvMj8vM",
            /* 营销模板 */
            "Mi_i0drZzsNroKsQX-51r3_FUiyK9BGmLU_DLWynqjA",
            "VTA_DPKKWUm9XYmCCrGHsVkgwzZNkMIuqTVuD5jfaQo",
            "HbyPa6MOr9mxNAuBxGeSTaKV_t66wpuNPVeRVplB8v4",
            "kXzlbxb0Kh097K3HJHl1Gk6GXVo5O5Ng8sNsuAH9ySs",
            "VTA_DPKKWUm9XYmCCrGHsRBy-L0bwY22RJ-VQq-keuw",
            "oO3jDLsS8hf3PxUPepVZTUSQkcD9T24L4WmRfYxtE-A",
            "Vth6cQLJ-fqJMRf3mvyFcC_Fp9q7WGZQeONKQs25n-4",
            "aXNzYWhH5M8dNhWv6PfHhSFh_p6cf89lzJAkVhkLxMs",
            "ZQOm29bpgnheGM7KRIYhp3rBXaX-QMQerHDeIuLCE0o",   //暂时没有
            "ZQOm29bpgnheGM7KRIYhp3rBXaX-QMQerHDeIuLCE0o",
            "audit_success",
            "audit_fail",
            "rebate_user_grade",
            "win_draw",
            "order_status",});
        setB(new String[]{"tg_gWnFQV_APJtirPo1bcLA0buOdqv7ChzY78ZXGqGw",
            "iMgLk_sNnQPXUE-cYf54dcA8CY75aWwnWGluLhaps9o",
            "pFMfGVyIQPQgaehBXoqtXBmgXO09OuDk2X-s_NrqgaU",
            "bLsoDoV0X2uQ9L6FRa7OBVOtFAf0mKb4YcZiFp6Vpbw",
            "w_B-8aB5Oj4hnwQ7woZmDO7XWy1mZ99uaOYQ5-xky40",
            "XBX7jv0pAT16ZHeR2ZId2Yo_2lmzzZGJUuT8XtDgD-8",
            "BT2QORduQ4VizGvJFARXqgRwBntIdxtZ2WX2lP5iOIE",
            "A0DAZ84Am8ODHcWOKdJMrNXIiMUdtqaTTnic8v_U0wg",
            "1C7p8BLa6XtXBUHx7hth38kFSF021sGea5F7wn4aD8g",
            "NKX2IWinOvYa_rsCBk3TF9ZZwkIm49rrtrN4Q1jA7lc",
            "SQJ6UMFZszTOnCquxtudTdi77YI6KNYrQGOIkSVi0Ag",
            "T5HpTcXTGy_Hg4yIt-RVsjumVP1mhZnPo2rCQVPSPSo",
            /* 营销模板 */
            "bLsoDoV0X2uQ9L6FRa7OBVOtFAf0mKb4YcZiFp6Vpbw",
            "-uXgVlQXUzcE-Zp3qNjqYSVU_Y60ciqU3zsNnKQ196Y",
            "zm4cetG9dqtHh5eDJPBA8Otwr_9jfUEyG9GnFGnnThs",
            "Lmm4-d3zPPe2Y-4MvQWIYVnRXetfj9DGdHaeaYunGa4",
            "E0SjVVYY-D_z3T4e-sxJ58atiDX6esCYF5gXoJkK39k",
            "mYNy6Z8eGm7oxr1MuOEuO8yAWaP8Ix4GQDO8JxFu2tY",
            "imVsBuhcZt3cBHTHM2xXOhigIjuTMEfnzpShLbPogi8",
            "EQLpDAjB-9NIOAJnd_ry0OocDeqJ8oeLNJlBJ12qwWo",
            "qUq1PaiziOK7w5nYho5pcFmYZYcs_CuFrM8lLpR2pF0",
            "qUq1PaiziOK7w5nYho5pcFmYZYcs_CuFrM8lLpR2pF0",  // 暂时没有
            "audit_success",
            "audit_fail",
            "rebate_user_grade",
            "win_draw",
            "order_status",});
    }};
}

package com.vpu.mp.service.shop.message;

import com.vpu.mp.common.pojo.shop.table.ImSessionDo;
import com.vpu.mp.common.pojo.shop.table.OrderInfoDo;
import com.vpu.mp.common.pojo.shop.table.UserAnnouncementDo;
import com.vpu.mp.dao.shop.UserDao;
import com.vpu.mp.dao.shop.doctor.DoctorDao;
import com.vpu.mp.dao.shop.message.MessageDao;
import com.vpu.mp.dao.shop.message.UserAnnouncementDao;
import com.vpu.mp.dao.shop.order.OrderGoodsDao;
import com.vpu.mp.dao.shop.order.OrderInfoDao;
import com.vpu.mp.dao.shop.prescription.PrescriptionDao;
import com.vpu.mp.dao.shop.session.ImSessionDao;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.pojo.shop.message.*;
import com.vpu.mp.service.pojo.wxapp.medical.im.param.ImSessionUnReadMessageInfoParam;
import com.vpu.mp.service.pojo.wxapp.medical.im.vo.ImSessionUnReadInfoVo;
import com.vpu.mp.service.shop.im.ImSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

import static com.vpu.mp.service.pojo.shop.message.UserMessageConstant.*;


/**
 * @author 赵晓东
 * @description
 * @create 2020-07-23 15:46
 **/

@Service
public class UserMessageService extends ShopBaseService {

    @Autowired
    private MessageDao messageDao;

    @Autowired
    private OrderGoodsDao orderGoodsDao;

    @Autowired
    private ImSessionService imSessionService;

    @Autowired
    private PrescriptionDao prescriptionDao;

    @Autowired
    private DoctorDao doctorDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private OrderInfoDao orderInfoDao;

    @Autowired
    private UserAnnouncementDao userAnnouncementDao;

    @Autowired
    private ImSessionDao imSessionDao;

    /**
     * 更改消息已读状态
     * @param messageId 消息id
     */
    public void changeMessageStatus(Integer messageId, Integer userId) {
        UserMessageVo userMessageVo = messageDao.selectMessageByMessageId(messageId);
        if (USER_MESSAGE_SYSTEM.equals(userMessageVo.getMessageType())) {
            userMessageVo.setReceiverId(userId);
            messageDao.changeAnnStatus(userMessageVo);
        } else {
            messageDao.changeMessageStatus(messageId);
        }
    }

    /**
     * 医师首页展示未读消息计数
     * @param doctorId 医师id
     * @return DoctorMessageCountVo
     */
    public DoctorMessageCountVo countDoctorMessage(Integer doctorId, DoctorMainShowParam doctorMainShowParam) {
        // 将访问当前页面时间置入缓存中，如果存在上次缓存
        DoctorMessageCountVo doctorMessageCountVo = new DoctorMessageCountVo();
        // 根据缓存时间判断数据库中是否有未读新增数据
        // 根据时间判断是否有未读已续方消息
        String hospitalCode = doctorDao.selectDoctorCodeByDoctorId(doctorId);
        Boolean existAlreadyReadContinuedPrescription = prescriptionDao.isExistAlreadyReadContinuedPrescription(hospitalCode, doctorMainShowParam.getLastReadOrderGoodsTime());
        doctorMessageCountVo.setAlreadyPrescription(existAlreadyReadContinuedPrescription);
        // 判断是否有未读已开具消息
        Boolean existAlreadyReadPrescription = prescriptionDao.isExistAlreadyReadPrescription(hospitalCode, doctorMainShowParam.getLastReadPrescriptionTime());
        doctorMessageCountVo.setAlreadyOrderInfoCount(existAlreadyReadPrescription);
        // 判断是否有未读我的问诊消息
        ImSessionUnReadMessageInfoParam imSessionUnReadMessageInfoParam = new ImSessionUnReadMessageInfoParam();
        imSessionUnReadMessageInfoParam.setDoctorId(doctorId);
        List<ImSessionUnReadInfoVo> unReadMessageInfo = imSessionService.getUnReadMessageInfo(imSessionUnReadMessageInfoParam);
        Boolean existAlreadyReadImSession = !unReadMessageInfo.isEmpty();
        doctorMessageCountVo.setAlreadyImSessionCount(existAlreadyReadImSession);
        // 待问诊记录
        doctorMessageCountVo.setNotImSessionCount(messageDao.countDoctorImMessageNum(doctorId));
        // 待开方记录
        doctorMessageCountVo.setNotOrderInfoCount(messageDao.countDoctorOrderMessageNum());
        // 待续方记录
        Integer integer = orderGoodsDao.countAuditOrder();
        if (integer == null) {
            integer = 0;
        }
        doctorMessageCountVo.setNotOrderGoodsCount(integer);
        return doctorMessageCountVo;
    }

    /**
     * 根据消息id删除消息
     * @param messageId 消息id
     */
    public void deleteUserMessage(Integer messageId) {
        messageDao.deleteUserMessage(messageId);
    }



    /**
     * 根据用户id获取用户订单消息
     * @param userId 当前用户id
     * @return List<UserMessageVo>
     */
    public List<UserMessageVo> selectOrderUserMessage(Integer userId) {
        return messageDao.selectOrderUserMessage(userId);
    }

    /**
     * 根据用户id获取用户会话消息
     * @param userId 当前用户id
     * @return List<UserMessageVo>
     */
    public List<UserMessageVo> selectImSessionUserMessage(Integer userId) {
        return messageDao.selectImSessionUserMessage(userId);
    }

    /**
     * 向消息列表新增会话消息 每次打开消息列表时懒汉式更新数据库
     * @param imSessionUnReadMessageInfoParam 当前用户ID
     */
    public void setImSessionMessage(ImSessionUnReadMessageInfoParam imSessionUnReadMessageInfoParam) {
        List<ImSessionUnReadInfoVo> unReadMessageInfo = imSessionService.getUnReadMessageInfo(imSessionUnReadMessageInfoParam);
        // 如果当前用户有新会话
        if (!unReadMessageInfo.isEmpty()) {
            //查询当前用户有没有此医生的问诊记录
            for (ImSessionUnReadInfoVo imSessionUnReadInfoVo : unReadMessageInfo) {
                UserMessageVo imSessionBySessionId = messageDao.getImSessionBySessionId(imSessionUnReadInfoVo.getSessionId(), imSessionUnReadMessageInfoParam.getUserId());
                // 新增
                if (imSessionBySessionId == null) {
                    UserMessageParam userMessageParam = new UserMessageParam();
                    userMessageParam.setMessageType(USER_MESSAGE_CHAT);
                    userMessageParam.setMessageContent(imSessionUnReadInfoVo.getMessageInfos()
                        .get(imSessionUnReadInfoVo.getMessageInfos().size() - 1).getMessage());
                    userMessageParam.setMessageRelevanceId(imSessionUnReadInfoVo.getSessionId());
                    userMessageParam.setSenderId(imSessionUnReadInfoVo.getDoctorId());
                    userMessageParam.setReceiverId(imSessionUnReadMessageInfoParam.getUserId());
                    userMessageParam.setReceiverName(userDao.getUserById(imSessionUnReadMessageInfoParam.getUserId()).getUsername());
                    userMessageParam.setSenderName(doctorDao.getOneInfo(imSessionUnReadInfoVo.getDoctorId()).getName());
                    ImSessionDo imSession = imSessionDao.getImSession(imSessionUnReadInfoVo.getSessionId());
                    userMessageParam.setMessageRelevanceOrderSn(imSession.getOrderSn());
                    userMessageParam.setMessageChatStatus(imSession.getSessionStatus());
                    messageDao.saveMessage(userMessageParam);
                } else { // 更新
                    UserMessageParam userMessageParam = new UserMessageParam();
                    userMessageParam.setMessageStatus(USER_MESSAGE_STATUS_NOT_READ);
                    userMessageParam.setMessageContent(imSessionUnReadInfoVo.getMessageInfos()
                        .get(imSessionUnReadInfoVo.getMessageInfos().size() - 1).getMessage());
                    messageDao.updateMessage(userMessageParam);
                }
            }
        }
    }

    /**
     * 向消息列表新增订单消息，打开消息列表时懒汉式更新数据库
     * @param userId 用户id
     */
    public void setOrderMessage(Integer userId) {
        List<OrderInfoDo> orderInfoDos = orderInfoDao.selectOrderInfoByUserId(userId);
        // 如果当前用户有订单
        if (!orderInfoDos.isEmpty()) {
            // 遍历该用户订单列表
            for (OrderInfoDo orderInfoDo : orderInfoDos) {
                UserMessageVo userMessageVo = messageDao.selectOrderMessageByOrderId(orderInfoDo.getOrderId(), userId);
                // 新增
                if (userMessageVo == null) {
                    UserMessageParam userMessageParam = new UserMessageParam();
                    String messageByOrderStatus = UserMessageTemplate.getMessageByOrderStatus(orderInfoDo.getOrderStatus());
                    assert messageByOrderStatus != null;
                    userMessageParam.setMessageContent(String.format(messageByOrderStatus, orderInfoDo.getOrderSn()));
                    userMessageParam.setReceiverId(userId);
                    userMessageParam.setMessageRelevanceId(orderInfoDo.getOrderId());
                    userMessageParam.setReceiverName(userDao.getUserById(userId).getUsername());
                    userMessageParam.setMessageType(USER_MESSAGE_ORDER);
                    userMessageParam.setMessageRelevanceId(orderInfoDo.getOrderId());
                    userMessageParam.setMessageRelevanceOrderSn(orderInfoDao.selectOrderSnByOrderId(orderInfoDo.getOrderId()));
                    messageDao.saveMessage(userMessageParam);
                } else { // 更改
                    UserMessageParam userMessageParam = new UserMessageParam();
                    userMessageParam.setMessageStatus(USER_MESSAGE_STATUS_NOT_READ);
                    String messageByOrderStatus = UserMessageTemplate.getMessageByOrderStatus(orderInfoDo.getOrderStatus());
                    assert messageByOrderStatus != null;
                    userMessageParam.setMessageContent(String.format(messageByOrderStatus, orderInfoDo.getOrderSn()));
                    messageDao.updateMessage(userMessageParam);
                }
            }
        }
    }

    /**
     * 向用户推送系统公告
     * @param userId 用户id
     */
    public void setAnnouncementMessage(Integer userId) {
        // 获取该用户上次打开公告表时间
        Timestamp lastUserAnnouncement = userAnnouncementDao.getLastUserAnnouncement(userId);
        // 根据时间拉取未读公告
        if (lastUserAnnouncement == null) {
            lastUserAnnouncement = new Timestamp(0);
        }
        List<UserMessageVo> userMessageVos = messageDao.selectLastAnnouncement(lastUserAnnouncement);
        // 为该用户更新用户公告关联表
        for (UserMessageVo userMessageVo : userMessageVos) {
            UserAnnouncementDo userAnnouncementDo = new UserAnnouncementDo();
            userAnnouncementDo.setMessageId(userMessageVo.getMessageId());
            userAnnouncementDo.setUserId(userId);
            userAnnouncementDao.saveUserAnnouncement(userAnnouncementDo);
        }
    }

    /**
     * 用户消息页面获取用户消息列表和消息未读数
     * @param userId 用户id
     * @return UserMainMessageVo
     */
    public UserMainMessageVo selectUserMessage(Integer userId) {
        fetchUserMessage(userId);
        // 封装当前用户信息列表
        UserMainMessageVo userMainMessageVo = new UserMainMessageVo();
        List<UserMessageVo> userMessageVos = messageDao.selectMainMessage(userId);
        Integer announcementCount = messageDao.selectAnnouncementCount(userId);
        Integer orderCount = messageDao.selectOrderCount(userId);
        Integer chatCount = messageDao.selectChatCount(userId);
        userMainMessageVo.setUserMessages(userMessageVos);
        userMainMessageVo.setAnnouncementMessageCount(announcementCount);
        userMainMessageVo.setOrderMessageCount(orderCount);
        userMainMessageVo.setImSessionMessageCount(chatCount);
        return userMainMessageVo;
    }

    /**
     * 查询个人中心用户消息统计数量
     * @param userId 用户id
     * @return Integer
     */
    public Integer selectUserMessageCount(Integer userId) {
        fetchUserMessage(userId);
        Integer announcementCount = messageDao.selectAnnouncementCount(userId);
        Integer orderCount = messageDao.selectOrderCount(userId);
        Integer chatCount = messageDao.selectChatCount(userId);
        return announcementCount + orderCount + chatCount;
    }

    /**
     * 更新用户消息
     * @param userId 用户id
     */
    public void fetchUserMessage(Integer userId) {
        this.transaction(() -> {
            // 拉取用户新信息
            ImSessionUnReadMessageInfoParam imSessionUnReadMessageInfoParam = new ImSessionUnReadMessageInfoParam();
            imSessionUnReadMessageInfoParam.setUserId(userId);
            setImSessionMessage(imSessionUnReadMessageInfoParam);
            setOrderMessage(userId);
            setAnnouncementMessage(userId);
        });
    }

}

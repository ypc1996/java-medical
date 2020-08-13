package com.vpu.mp.service.shop.im;

import com.vpu.mp.common.foundation.data.ImSessionConstant;
import com.vpu.mp.common.foundation.util.*;
import com.vpu.mp.common.pojo.shop.table.ImSessionDo;
import com.vpu.mp.common.pojo.shop.table.ImSessionItemDo;
import com.vpu.mp.dao.shop.session.ImSessionDao;
import com.vpu.mp.dao.shop.session.ImSessionItemDao;
import com.vpu.mp.service.foundation.jedis.JedisKeyConstant;
import com.vpu.mp.service.foundation.jedis.JedisManager;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.pojo.shop.doctor.DoctorSimpleVo;
import com.vpu.mp.service.pojo.shop.patient.PatientSimpleInfoVo;
import com.vpu.mp.service.pojo.wxapp.medical.im.base.ImSessionItemBase;
import com.vpu.mp.service.pojo.wxapp.medical.im.bo.ImSessionItemBo;
import com.vpu.mp.service.pojo.wxapp.medical.im.condition.ImSessionCondition;
import com.vpu.mp.service.pojo.wxapp.medical.im.param.*;
import com.vpu.mp.service.pojo.wxapp.medical.im.vo.ImSessionItemRenderVo;
import com.vpu.mp.service.pojo.wxapp.medical.im.vo.ImSessionListVo;
import com.vpu.mp.service.pojo.wxapp.medical.im.vo.ImSessionUnReadInfoVo;
import com.vpu.mp.service.shop.department.DepartmentService;
import com.vpu.mp.service.shop.doctor.DoctorService;
import com.vpu.mp.service.shop.patient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 会话处理service
 * @author 李晓冰
 * @date 2020年07月21日
 */
@Service
public class ImSessionService extends ShopBaseService {
    @Autowired
    DepartmentService departmentService;
    @Autowired
    PatientService patientService;
    @Autowired
    DoctorService doctorService;

    @Autowired
    private ImSessionDao imSessionDao;
    @Autowired
    private ImSessionItemDao imSessionItemDao;
    @Autowired
    private JedisManager jedisManager;

    /**
     * 分页查询会话信息
     * @param param 分页条件
     * @return 分页结果
     */
    public PageResult<ImSessionListVo> pageList(ImSessionPageListParam param) {
        PageResult<ImSessionListVo> pageResult = imSessionDao.pageList(param);
        List<ImSessionListVo> dataList = pageResult.getDataList();
        List<Integer> doctorIds = new ArrayList<>(dataList.size() / 2);
        List<Integer> patientIds = new ArrayList<>(dataList.size());

        Integer shopId = getShopId();
        Map<Integer, String> imSessionRedisKeyMap = new HashMap<>(dataList.size());
        for (ImSessionListVo imSession : dataList) {
            patientIds.add(imSession.getPatientId());
            doctorIds.add(imSession.getDoctorId());
            // 准备处理未读消息，医师端展示对应会话信息
            if (param.getDoctorId() != null) {
                imSessionRedisKeyMap.put(imSession.getId(), getSessionRedisKey(shopId, imSession.getId(), imSession.getUserId(), imSession.getDoctorId()));
            } else {
                imSessionRedisKeyMap.put(imSession.getId(), getSessionRedisKey(shopId, imSession.getId(), imSession.getDoctorId(), imSession.getUserId()));
            }
        }

        Map<Integer, String> patientIdMap = patientService.listPatientInfo(patientIds).stream().collect(Collectors.toMap(PatientSimpleInfoVo::getId, PatientSimpleInfoVo::getName, (x1, x2) -> x2));
        Map<Integer, String> doctorIdMap = doctorService.listDoctorSimpleInfo(doctorIds).stream().collect(Collectors.toMap(DoctorSimpleVo::getId, DoctorSimpleVo::getName, (x1, x2) -> x2));

        for (ImSessionListVo imSession : dataList) {
            imSession.setPatientName(patientIdMap.get(imSession.getPatientId()));
            imSession.setDoctorName(doctorIdMap.get(imSession.getDoctorId()));
            String sessionKey = imSessionRedisKeyMap.get(imSession.getId());
            Long listSize = jedisManager.getListSize(sessionKey);
            if (listSize != null) {
                imSession.setNewMsgNum(listSize);
            } else {
                imSession.setNewMsgNum(0L);
            }
        }

        return pageResult;
    }

    /**
     * 恢复已有的聊天记录,目前没有做成分页的
     * @param renderPageParam 会话内容请求参数
     * @return 会话聊天内容信息
     */
    public PageResult<ImSessionItemRenderVo> renderSession(ImSessionRenderPageParam renderPageParam) {
        Integer sessionId = renderPageParam.getSessionId();
        ImSessionDo imSessionDo = imSessionDao.getById(sessionId);
        Integer doctorId = imSessionDo.getDoctorId();

        PageResult<ImSessionItemDo> pageResult = null;
        // 从redis中获取数据
        if (ImSessionConstant.SESSION_READY_TO_START.equals(imSessionDo.getSessionStatus()) || ImSessionConstant.SESSION_ON.equals(imSessionDo.getSessionStatus())) {
            pageResult = renderSessionFromRedis(renderPageParam, imSessionDo);
        } else {
            // 从mysql中获取数据
            pageResult = imSessionItemDao.getBySessionItemPgaeList(renderPageParam);
            Collections.reverse(pageResult.getDataList());
        }

        List<ImSessionItemDo> imSessionItemDos = pageResult.getDataList();

        // 此处需要进行倒序排序
        List<ImSessionItemRenderVo> sessionItemRenderVos = imSessionItemDos.stream().map(item -> {
            ImSessionItemRenderVo itemVo = new ImSessionItemRenderVo();
            itemVo.setDoctor(doctorId.equals(item.getFromId()));
            itemVo.setMessage(item.getMessage());
            itemVo.setType(item.getType());
            itemVo.setSendTime(item.getSendTime());
            return itemVo;
        }).collect(Collectors.toList());
        PageResult<ImSessionItemRenderVo> retPageResult = new PageResult<>();
        retPageResult.setPage(pageResult.getPage());
        retPageResult.setDataList(sessionItemRenderVos);
        return retPageResult;
    }

    /**
     * 从 redis中查询分页内容
     * @param renderPageParam
     * @return
     */
    private PageResult<ImSessionItemDo> renderSessionFromRedis(ImSessionRenderPageParam renderPageParam, ImSessionDo imSessionDo) {
        Integer curPage = renderPageParam.getCurrentPage() - 1;
        Integer pageRows = renderPageParam.getPageRows();
        String sessionBakKey = getSessionRedisKeyBak(getShopId(), renderPageParam.getSessionId());

        PageResult<ImSessionItemDo> pageResult = new PageResult<>();
        Page page = new Page();
        page.setPageRows(pageRows);
        Long totalRows = jedisManager.getListSize(sessionBakKey);
        Integer pageCount = (Integer) (int) Math.ceil(Double.valueOf(totalRows) / Double.valueOf(pageRows));
        page.setPageCount(pageCount);
        pageResult.setPage(page);
        List<ImSessionItemDo> imSessionItemDos = null;

        if (renderPageParam.getCurrentPage() > pageCount) {
            imSessionItemDos = new ArrayList<>();
        }else {
            Integer endIndex = -curPage * pageRows - 1;
            // redis list 包含两端，所以要去掉一个元素
            Integer startIndex = endIndex - pageRows + 1;
            List<String> jsonStrs = jedisManager.lrange(sessionBakKey, startIndex, endIndex);
            imSessionItemDos = new ArrayList<>(jsonStrs.size());

            for (String jsonStr : jsonStrs) {
                ImSessionItemDo imSessionItemDo = Util.parseJson(jsonStr, ImSessionItemDo.class);
                imSessionItemDos.add(imSessionItemDo);
            }
        }

        // 如果是从第一次打开会话内容，需要查询是否有自己已发送，但是对方未读取的消息
        if (renderPageParam.getIsFirstTime()) {
            String redisKey = null;
            if (renderPageParam.getIsDoctor()) {
                redisKey = getSessionRedisKey(getShopId(), imSessionDo.getId(), imSessionDo.getDoctorId(), imSessionDo.getUserId());
            } else {
                redisKey = getSessionRedisKey(getShopId(), imSessionDo.getId(), imSessionDo.getUserId(), imSessionDo.getDoctorId());
            }
            List<String> list = jedisManager.getList(redisKey);
            for (String jsonStr : list) {
                ImSessionItemDo imSessionItemDo = Util.parseJson(jsonStr, ImSessionItemDo.class);
                if (imSessionItemDo == null) {
                    continue;
                }
                imSessionItemDo.setImSessionId(imSessionDo.getId());
                if (renderPageParam.getIsDoctor()) {
                    imSessionItemDo.setFromId(imSessionDo.getDoctorId());
                    imSessionItemDo.setToId(imSessionDo.getUserId());
                } else {
                    imSessionItemDo.setFromId(imSessionDo.getUserId());
                    imSessionItemDo.setToId(imSessionDo.getDoctorId());
                }
                imSessionItemDos.add(imSessionItemDo);
            }
        }

        pageResult.setDataList(imSessionItemDos);
        return pageResult;
    }

    /**
     * 查询用户或医师未读消息
     * @return 未读消息 没有未读消息则返回空集合
     */
    public List<ImSessionUnReadInfoVo> getUnReadMessageInfo(ImSessionUnReadMessageInfoParam param) {
        ImSessionCondition imSessionCondition = new ImSessionCondition();
        imSessionCondition.setDoctorId(param.getDoctorId());
        imSessionCondition.setUserId(param.getUserId());
        imSessionCondition.setStatus(ImSessionConstant.SESSION_ON);
        List<ImSessionDo> imSessionDos = imSessionDao.listImSession(imSessionCondition);
        if (imSessionDos == null) {
            return new ArrayList<>(0);
        }
        List<ImSessionUnReadInfoVo> retList = new ArrayList<>(imSessionDos.size());
        String redisKey = null;
        Integer shopId = getShopId();
        List<Integer> doctorIds = new ArrayList<>(imSessionDos.size());
        for (ImSessionDo imSessionDo : imSessionDos) {
            if (param.getDoctorId() == null) {
                // 用户查询自己未读信息
                redisKey = getSessionRedisKey(shopId, imSessionDo.getId(), imSessionDo.getDoctorId(), imSessionDo.getUserId());
            } else {
                // 医师查询自己未读信息
                redisKey = getSessionRedisKey(shopId, imSessionDo.getId(), imSessionDo.getUserId(), imSessionDo.getDoctorId());
            }
            if (!jedisManager.exists(redisKey)) {
                continue;
            }
            ImSessionUnReadInfoVo vo = new ImSessionUnReadInfoVo();
            doctorIds.add(imSessionDo.getDoctorId());
            vo.setSessionId(imSessionDo.getId());
            vo.setDoctorId(imSessionDo.getDoctorId());
            List<String> jsonStrs = jedisManager.getList(redisKey);
            List<ImSessionItemBase> messageList = new ArrayList<>(jsonStrs.size());
            for (String jsonStr : jsonStrs) {
                ImSessionItemBase imSessionItemBase = Util.parseJson(jsonStr, ImSessionItemBase.class);
                messageList.add(imSessionItemBase);
            }
            vo.setMessageInfos(messageList);
            retList.add(vo);
        }

        // 处理医师名称和用户名称
        Map<Integer, String> doctorIdMap = doctorService.listDoctorSimpleInfo(doctorIds).stream().collect(Collectors.toMap(DoctorSimpleVo::getId, DoctorSimpleVo::getName, (x1, x2) -> x2));
        for (ImSessionUnReadInfoVo imSessionUnReadInfoVo : retList) {
            imSessionUnReadInfoVo.setDoctorName(doctorIdMap.get(imSessionUnReadInfoVo.getDoctorId()));
        }
        return retList;
    }

    /**
     * 查询会话记录
     * @param sessionId 会话id
     * @return 会话记录
     */
    public ImSessionDo getSessionInfoById(Integer sessionId) {
        return imSessionDao.getById(sessionId);
    }

    /**
     * 查询会话状态
     * @param sessionId 会话id
     * @return 会话状态
     */
    public Byte getSessionStatus(Integer sessionId) {
        String statusKey = getSessionRedisStatusKey(getShopId(), sessionId);
        String s = jedisManager.get(statusKey);
        if (s == null) {
            return null;
        } else {
            return Byte.valueOf(s);
        }
    }

    /**
     * 查询会话状态
     * @param orderSn
     * @return
     */
    public ImSessionDo getSessionInfoByOrderSn(String orderSn) {
        return imSessionDao.getByOrderSn(orderSn);
    }

    /**
     * 新增待接诊会话
     * @param param 新增会话信息
     * @return 会话id
     */
    public Integer insertNewSession(ImSessionNewParam param) {
        ImSessionDo imSessionDo = new ImSessionDo();
        imSessionDo.setDoctorId(param.getDoctorId());
        imSessionDo.setUserId(param.getUserId());
        imSessionDo.setPatientId(param.getPatientId());
        imSessionDo.setOrderSn(param.getOrderSn());
        imSessionDo.setSessionStatus(ImSessionConstant.SESSION_READY_TO_START);
        imSessionDo.setWeightFactor(ImSessionConstant.SESSION_READY_TO_START_WEIGHT);
        // 可从结束状态转变为继续问诊次数
        imSessionDo.setContinueSessionCount(ImSessionConstant.CONTINUE_SESSION_TIME);
        imSessionDao.insert(imSessionDo);

        String sessionRedisStatusKey = getSessionRedisStatusKey(getShopId(), imSessionDo.getId());
        jedisManager.set(sessionRedisStatusKey, ImSessionConstant.SESSION_READY_TO_START.toString());
        return imSessionDo.getId();
    }

    public void updateSessionEvaluateStatusToAlready(Integer sessionId){
        imSessionDao.batchUpdateSessionEvaluateStatus(Collections.singletonList(sessionId),ImSessionConstant.SESSION_EVALUATE_ALREADY_STATUS,ImSessionConstant.SESSION_EVALUATE_CAN_STATUS);
    }
    /**
     * 会话状态修改为进行中
     * @param sessionId 会话ID
     * @return
     */
    public void updateSessionToGoingOn(Integer sessionId) {
        ImSessionDo imSessionDo = imSessionDao.getById(sessionId);
        if (ImSessionConstant.SESSION_ON.equals(imSessionDo.getSessionStatus())) {
            return;
        }
        Byte prevStatus = imSessionDo.getSessionStatus();
        imSessionDo.setLimitTime(DateUtils.getTimeStampPlus(ImSessionConstant.CLOSE_LIMIT_TIME, ChronoUnit.HOURS));
        String sessionRedisStatusKey = getSessionRedisStatusKey(getShopId(), sessionId);

        if (ImSessionConstant.SESSION_READY_TO_START.equals(prevStatus)) {
            // 状态从1->2
            jedisManager.set(sessionRedisStatusKey, ImSessionConstant.SESSION_ON.toString());
            imSessionDo.setSessionStatus(ImSessionConstant.SESSION_ON);
            imSessionDo.setWeightFactor(ImSessionConstant.SESSION_ON_WEIGHT);
        } else {
            // 从结束状态变为继续问诊状态 4->5
            jedisManager.set(sessionRedisStatusKey, ImSessionConstant.SESSION_CONTINUE_ON.toString());
            imSessionDo.setSessionStatus(ImSessionConstant.SESSION_CONTINUE_ON);
            imSessionDo.setWeightFactor(ImSessionConstant.SESSION_CONTINUE_ON_WEIGHT);
            imSessionDo.setContinueSessionCount(imSessionDo.getContinueSessionCount()-1);
            if (ImSessionConstant.SESSION_EVALUATE_CAN_STATUS.equals(imSessionDo.getEvaluateStatus())) {
                imSessionDo.setEvaluateStatus(ImSessionConstant.SESSION_EVALUATE_CAN_NOT_STATUS);
            }
        }
        imSessionDao.update(imSessionDo);
    }


    /**
     * 批量取消未接诊过期的会话
     */
    public void batchCancelSession(List<String> orderSns) {
        ImSessionCondition cancelCondition = new ImSessionCondition();
        cancelCondition.setOrderSns(orderSns);
        List<ImSessionDo> imSessionDos = imSessionDao.listImSession(cancelCondition);
        List<Integer> sessionIds = new ArrayList<>(imSessionDos.size());
        Integer shopId = getShopId();

        for (ImSessionDo imSessionDo : imSessionDos) {
            clearSessionRedisInfoAndDumpToDb(shopId, imSessionDo.getId(), imSessionDo.getUserId(), imSessionDo.getDoctorId());
            sessionIds.add(imSessionDo.getId());
        }

        imSessionDao.batchUpdateSessionStatus(sessionIds, ImSessionConstant.SESSION_CANCEL,ImSessionConstant.SESSION_CANCEL_WEIGHT);
    }

    /**
     * 批量关闭到时间的会话
     */
    public void batchCloseSession(List<String> orderSns) {
        ImSessionCondition cancelCondition = new ImSessionCondition();
        cancelCondition.setOrderSns(orderSns);
        List<ImSessionDo> imSessionDos = imSessionDao.listImSession(cancelCondition);
        Integer shopId = getShopId();
        List<Integer> sessionDeadIds = new ArrayList<>(imSessionDos.size());
        List<Integer> sessionCloseIds = new ArrayList<>(imSessionDos.size());

        for (ImSessionDo imSessionDo : imSessionDos) {
            if (imSessionDo.getContinueSessionCount() == 0) {
                sessionDeadIds.add(imSessionDo.getId());
                clearSessionRedisInfoAndDumpToDb(shopId, imSessionDo.getId(), imSessionDo.getUserId(), imSessionDo.getDoctorId());
            } else {
                sessionCloseIds.add(imSessionDo.getId());
            }
        }
        imSessionDao.batchUpdateSessionStatus(sessionDeadIds, ImSessionConstant.SESSION_DEAD,ImSessionConstant.SESSION_DEAD_WEIGHT);
        imSessionDao.batchUpdateSessionStatus(sessionCloseIds, ImSessionConstant.SESSION_END,ImSessionConstant.SESSION_END_WEIGTH);
        // 修改评价状态
        imSessionDao.batchUpdateSessionEvaluateStatus(sessionDeadIds,ImSessionConstant.SESSION_EVALUATE_CAN_NOT_STATUS,ImSessionConstant.SESSION_EVALUATE_CAN_STATUS);
        imSessionDao.batchUpdateSessionEvaluateStatus(sessionCloseIds,ImSessionConstant.SESSION_EVALUATE_CAN_STATUS,ImSessionConstant.SESSION_EVALUATE_CAN_NOT_STATUS);
    }

    /**
     * 关闭对话session
     * @param sessionId 会话id
     */
    public void closeImSession(Integer sessionId) {
        ImSessionDo imSessionDo = imSessionDao.getById(sessionId);
        if (!ImSessionConstant.SESSION_ON.equals(imSessionDo.getSessionStatus())) {
            return;
        }
        if (imSessionDo.getContinueSessionCount() == 0) {
            clearSessionRedisInfoAndDumpToDb(getShopId(), imSessionDo.getId(), imSessionDo.getUserId(), imSessionDo.getDoctorId());
            imSessionDao.updateSessionStatus(sessionId, ImSessionConstant.SESSION_DEAD,ImSessionConstant.SESSION_DEAD_WEIGHT);
            imSessionDao.batchUpdateSessionEvaluateStatus(Collections.singletonList(sessionId),ImSessionConstant.SESSION_EVALUATE_CAN_NOT_STATUS,ImSessionConstant.SESSION_EVALUATE_CAN_STATUS);
        } else {
            imSessionDao.updateSessionStatus(sessionId, ImSessionConstant.SESSION_END,ImSessionConstant.SESSION_END_WEIGTH);
            imSessionDao.batchUpdateSessionEvaluateStatus(Collections.singletonList(sessionId),ImSessionConstant.SESSION_EVALUATE_CAN_STATUS,ImSessionConstant.SESSION_EVALUATE_CAN_NOT_STATUS);
        }

    }

    /**
     * 将消息发送，存储至redis
     * @param sendMsgParam 会话消息
     */
    public Byte sendMsg(ImSessionSendMsgParam sendMsgParam) {
        Integer shopId = getShopId();
        String sessionRedisStatusKey = getSessionRedisStatusKey(shopId, sendMsgParam.getSessionId());
        if (!jedisManager.exists(sessionRedisStatusKey)) {
            deleteAllSessionKey(shopId, sendMsgParam.getSessionId(), sendMsgParam.getFromId(), sendMsgParam.getToId());
            return ImSessionConstant.SESSION_CAN_NOT_USE;
        }

        String sessionKey = getSessionRedisKey(getShopId(), sendMsgParam.getSessionId(), sendMsgParam.getFromId(), sendMsgParam.getToId());
        jedisManager.rpush(sessionKey, Util.toJson(sendMsgParam.getImSessionItem()));

        return ImSessionConstant.SESSION_CAN_USE;
    }

    /**
     * 拉取对方发送的消息内
     * @return
     */
    public List<ImSessionItemBase> pullMsg(ImSessionPullMsgParam param) {
        String sessionRedisStatusKey = getSessionRedisStatusKey(getShopId(), param.getSessionId());
        if (!jedisManager.exists(sessionRedisStatusKey)) {
            return null;
        }
        return dumpSessionReadyToBak(getShopId(), param.getSessionId(), param.getPullFromId(), param.getSelfId());
    }

    /**
     * 清空redis中的会话信息（将医生和患者未读信息全部dump到bak中），并入库
     * @param shopId    店铺id
     * @param sessionId 会话id
     * @param userId    用户id
     * @param doctorId  医师id
     */
    private void clearSessionRedisInfoAndDumpToDb(Integer shopId, Integer sessionId, Integer userId, Integer doctorId) {
        // dump医师发送的信息 对于list类型，如果长度为0则自动删除
        dumpSessionReadyToBak(shopId, sessionId, doctorId, userId);
        // dump用户发送的信息
        dumpSessionReadyToBak(shopId, sessionId, userId, doctorId);
        // dump所有bak信息并入库
        dumpSessionBakToDb(shopId, sessionId);

        String sessionRedisStatusKey = getSessionRedisStatusKey(shopId, sessionId);
        jedisManager.delete(sessionRedisStatusKey);
    }

    /**
     * 将待查看会话中的信息内容移动至已读会话记录列表内
     * @param shopId    店铺id
     * @param sessionId 会话id
     * @param fromId    发送者id
     * @param toId      接受者id
     * @return 待查看会话集合
     */
    private List<ImSessionItemBase> dumpSessionReadyToBak(Integer shopId, Integer sessionId, Integer fromId, Integer toId) {
        String sessionKey = getSessionRedisKey(shopId, sessionId, fromId, toId);
        String sessionBakKey = getSessionRedisKeyBak(shopId, sessionId);

        List<String> readyToReadList = jedisManager.getList(sessionKey);
        jedisManager.cleanList(sessionKey);
        List<ImSessionItemBase> retVos = new ArrayList<>(readyToReadList.size());
        // 没有需要读的信息
        if (readyToReadList.size() == 0) {
            return retVos;
        }

        List<String> dumpList = new ArrayList<>(readyToReadList.size());

        Timestamp curTime = DateUtils.getLocalDateTime();
        for (String s : readyToReadList) {
            ImSessionItemBase vo = Util.parseJson(s, ImSessionItemBase.class);
            if (vo == null) {
                continue;
            }
            vo.setSendTime(curTime);
            retVos.add(vo);
            ImSessionItemBo imSessionItemBo = new ImSessionItemBo(sessionId, fromId, toId, vo);
            dumpList.add(Util.toJson(imSessionItemBo));
        }
        jedisManager.rpush(sessionBakKey, dumpList);
        return retVos;
    }

    /**
     * 将已读会话记录信息的从redis清空并入库
     * @param shopId    店铺id
     * @param sessionId 会话id
     */
    private void dumpSessionBakToDb(Integer shopId, Integer sessionId) {
        String sessionBakKey = getSessionRedisKeyBak(shopId, sessionId);
        List<String> list = jedisManager.getList(sessionBakKey);
        jedisManager.cleanList(sessionBakKey);
        if (list.size() == 0) {
            return;
        }
        List<ImSessionItemDo> readyToDb = new ArrayList<>();
        for (String s : list) {
            ImSessionItemDo imSessionItemDo = Util.parseJson(s, ImSessionItemDo.class);
            if (imSessionItemDo == null) {
                continue;
            }
            readyToDb.add(imSessionItemDo);
        }
        imSessionItemDao.batchInsert(readyToDb);
    }

    /**
     * 删除所有无用key,避免医师结束了会话而此刻用户又发了消息而产生的垃圾key
     * @param shopId    店铺id
     * @param sessionId 会话id
     * @param id1       会话者的id
     * @param id2       会话者的id
     */
    private void deleteAllSessionKey(Integer shopId, Integer sessionId, Integer id1, Integer id2) {
        String msgKey1 = getSessionRedisKey(shopId, sessionId, id1, id2);
        String msgKey2 = getSessionRedisKey(shopId, sessionId, id2, id1);
        String sessionRedisKeyBak = getSessionRedisKeyBak(shopId, sessionId);
        jedisManager.delete(new String[]{msgKey1, msgKey2, sessionRedisKeyBak});
    }

    /**
     * 判断信息
     * @param sessionId
     * @return
     */
    public boolean sessionExist(Integer sessionId) {
        return imSessionDao.getById(sessionId) != null;
    }

    /**
     * 获取待查看会话redis key
     * @param shopId    店铺id
     * @param sessionId 会话id
     * @param fromId    发送者id
     * @param toId      接受者id
     * @return
     */
    private String getSessionRedisKey(Integer shopId, Integer sessionId, Integer fromId, Integer toId) {
        return String.format(JedisKeyConstant.IM_SESSION_ITEM_LIST_KEY, shopId, sessionId, fromId, toId);
    }

    /**
     * 获取已查看会话记录redis key
     * @param shopId    店铺id
     * @param sessionId 会话id
     * @return
     */
    private String getSessionRedisKeyBak(Integer shopId, Integer sessionId) {
        return String.format(JedisKeyConstant.IM_SESSION_ITEM_LIST_KEY_BAK, shopId, sessionId);
    }

    /**
     * 获取标识会话是否可用的key
     * @param shopId    店铺id
     * @param sessionId 会话id
     * @return
     */
    private String getSessionRedisStatusKey(Integer shopId, Integer sessionId) {
        return String.format(JedisKeyConstant.IM_SESSION_STATUS, shopId, sessionId);
    }

    /**
     * 获取历史聊天记录
     * @param param
     * @return
     */
    public PageResult<ImSessionItemRenderVo> getSessionHistory( ImSessionQueryPageListParam param){
        ImSessionDo imSessionDo=imSessionDao.getByOrderSn(param.getOrderSn());
        ImSessionRenderPageParam renderPageParam=new ImSessionRenderPageParam();
        FieldsUtil.assign(param,renderPageParam);
        renderPageParam.setSessionId(imSessionDo.getId());
        PageResult<ImSessionItemRenderVo>  pageResult = renderSession(renderPageParam);
        return pageResult;
    }

}

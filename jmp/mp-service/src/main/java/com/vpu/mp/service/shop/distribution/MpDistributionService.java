package com.vpu.mp.service.shop.distribution;

import com.vpu.mp.common.foundation.data.DistributionConstant;
import com.vpu.mp.common.foundation.util.DateUtils;
import com.vpu.mp.common.foundation.util.PageResult;
import com.vpu.mp.common.foundation.util.Util;
import com.vpu.mp.dao.shop.UserDao;
import com.vpu.mp.dao.shop.image.UploadedImageDao;
import com.vpu.mp.db.main.tables.records.MpAuthShopRecord;
import com.vpu.mp.db.shop.tables.records.*;
import com.vpu.mp.service.foundation.service.ShopBaseService;
import com.vpu.mp.service.pojo.shop.config.distribution.DistributionParam;
import com.vpu.mp.service.pojo.shop.decoration.DistributorApplyParam;
import com.vpu.mp.service.pojo.shop.distribution.*;
import com.vpu.mp.service.pojo.shop.image.UploadedImageDo;
import com.vpu.mp.service.pojo.shop.member.MemberEducationEnum;
import com.vpu.mp.service.pojo.shop.member.MemberIndustryEnum;
import com.vpu.mp.service.pojo.shop.member.MemberMarriageEnum;
import com.vpu.mp.service.pojo.shop.member.data.EducationVo;
import com.vpu.mp.service.pojo.shop.member.data.IndustryVo;
import com.vpu.mp.service.pojo.shop.member.data.MarriageData;
import com.vpu.mp.service.pojo.wxapp.account.UserInfo;
import com.vpu.mp.service.pojo.wxapp.distribution.*;
import com.vpu.mp.service.pojo.wxapp.distribution.RebateGoodsVo;
import com.vpu.mp.service.pojo.wxapp.distribution.withdraw.*;
import com.vpu.mp.service.saas.shop.MpAuthShopService;
import com.vpu.mp.service.shop.config.DistributionConfigService;
import com.vpu.mp.service.shop.config.ShopCommonConfigService;
import com.vpu.mp.service.shop.user.user.UserService;
import jodd.util.StringUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.vpu.mp.common.foundation.data.DistributionConstant.*;

import static com.vpu.mp.common.foundation.data.DistributionConstant.*;
import static com.vpu.mp.db.shop.Tables.*;
import static org.jooq.impl.DSL.recordType;
import static org.jooq.impl.DSL.sum;

/**
 * mp分销模块service
 * @author changle
 */
@Service
public class MpDistributionService extends ShopBaseService{

    @Autowired
    public DistributionConfigService distributionCfg;

    @Autowired
    public BrokerageStatisticalService bs;

    @Autowired
    public UserTotalFanliService userTotalFanli;

    @Autowired
    public DistributorListService distributorList;

    @Autowired
    public DistributorGroupService distributorGroup;

    @Autowired
    public DistributorListService disList;

    @Autowired
    public DistributionConfigService disCfg;
    @Autowired
    public ShopCommonConfigService scs;
    @Autowired
    private UserService us;
    @Autowired
    public MpAuthShopService mss;
    @Autowired
    protected UploadedImageDao uploadedImageDao;
    @Autowired
    protected UserDao userDao;
    private final static String DEFAULT_USER_AVATAR = "/image/admin/head_icon.png";
    public static Integer ORDER_TYPE_WAIT_FANLI = 1;
    public static Integer ORDER_TYPE_HAS_FANLI = 2;
    public static Integer GOODS_RECOMMEND_NO = 0;
    public static Integer GOODS_RECOMMEND_THREE = 1;
    public static Integer GOODS_RECOMMEND_SELECT = 2;
    /**
     * 申请分销员页面信息
     * @param lang
     * @return
     */
    public ActivationInfoVo getActivationInfo(Integer userId,String lang){
        //获取用户基本信息
        UserBaseInfoVo baseInfo = db().select(USER.MOBILE,USER_DETAIL.REAL_NAME,USER_DETAIL.ADDRESS,USER_DETAIL.PROVINCE_CODE,USER_DETAIL.CITY_CODE,USER_DETAIL.DISTRICT_CODE,
            USER_DETAIL.EDUCATION,USER_DETAIL.INDUSTRY_INFO,USER_DETAIL.MARITAL_STATUS,USER_DETAIL.SEX)
            .from(USER.leftJoin(USER_DETAIL).on(USER.USER_ID.eq(USER_DETAIL.USER_ID)))
            .where(USER.USER_ID.eq(userId)).fetchOne().into(UserBaseInfoVo.class);

        //分销分组信息
        List<DistributorGroupListVo> groupList = bs.getGroupList();

        //转换行业码对应的名称
        if(baseInfo.getIndustryInfo() != null){
            String industryInfo = MemberIndustryEnum.getNameByCode(baseInfo.getIndustryInfo(),lang);
            baseInfo.setIndustryName(industryInfo);
        }
        //教育程度
        if(baseInfo.getEducation() != null){
            String education = MemberEducationEnum.getNameByCode(baseInfo.getEducation(),lang);
            baseInfo.setEducationName(education);
        }
        //性别
        if(baseInfo.getSex() != null){
            String female = "f";
            if(baseInfo.getSex().equalsIgnoreCase(female)){
                baseInfo.setSex("女");
            }else {
                String male = "m";
                if(baseInfo.getSex() != null && baseInfo.getSex().equalsIgnoreCase(male)){
                    baseInfo.setSex("男");
                }
            }
        }
        //婚姻状况
        if(baseInfo.getMaritalStatus() != null){
            String maritalInfo = MemberMarriageEnum.getNameByCode(baseInfo.getMaritalStatus(),lang);
            baseInfo.setMaritalName(maritalInfo);
        }

        //获取分销配置，成为分销员是否需要审核
        DistributionParam cfg = this.distributionCfg.getDistributionCfg();
        ActivationInfoVo activationInfo = new ActivationInfoVo();
        //用户基本信息
        activationInfo.setUserBaseInfo(baseInfo);
        //分组列表
        activationInfo.setGroupList(groupList);
        //获取行业信息
        List<IndustryVo> allIndustryInfo = MemberIndustryEnum.getAllIndustryInfo(lang);
        activationInfo.setIndustryList(allIndustryInfo);
        //获取教育程度
        List<EducationVo> allEducationWithCode = MemberEducationEnum.getAllEducationWithCode(lang);
        activationInfo.setEducationList(allEducationWithCode);
        //获取婚姻状况
        List<MarriageData> allMarriageWithCode = MemberMarriageEnum.getAllMarriageWithCode(lang);
        activationInfo.setMarriageData(allMarriageWithCode);
        activationInfo.setCfg(cfg);
        return activationInfo;
    }
	/**
	 * 用户申请成为分销员
	 * @param param
	 * @return state申请状态 -1：邀请码不存在；0：审核中；1：审核通过
	 */
	public int distributorApply(DistributorApplyParam param) {
        DistributorApplyRecord record = new DistributorApplyRecord();
        //返回状态
        int state = 0;

        //获取分销配置，成为分销员是否需要审核
        DistributionParam cfg = this.distributionCfg.getDistributionCfg();
        if(cfg.getActivation() == 0){
            //不提交审核信息，直接成为分销员
            String checkInfo = Util.toJsonNotNull(param.getActivationFields());
            assign(param, record);
            record.setActivationFields(checkInfo);
            db().executeInsert(record);
            state = 0;
        }else {
            //生成有效邀请码
            String inviteCode = this.validInviteCode();

            Integer codeIsExist = 1;
            //邀请码存在或不校验
            //用户提交邀请码不为空的时候判断邀请码是否存在有效
            if (param.getActivationFields().getInvitationCode() != null) {
                codeIsExist = sentInviteCodeVerify(param.getActivationFields().getInvitationCode());
                if (codeIsExist == 0) {
                    //邀请码不存在
                    state = -1;
                }
            }
            if (state != -1) {
                if (cfg.getAutoExamine() == 1) {
                    //自动审核
                    //申请信息插入审核记录表
                    String checkInfo = Util.toJson(param.getActivationFields());
                    assign(param, record);
                    record.setActivationFields(checkInfo);
                    db().executeInsert(record);

                    DistributorApplyDetailParam res = db().select().from(DISTRIBUTOR_APPLY).where(DISTRIBUTOR_APPLY.USER_ID.eq(param.getUserId())).
                        orderBy(DISTRIBUTOR_APPLY.CREATE_TIME.desc()).limit(1).fetchOne().into(DistributorApplyDetailParam.class);
                    //更新申请表数据
                    db().update(DISTRIBUTOR_APPLY)
                        .set(DISTRIBUTOR_APPLY.STATUS, (byte) 1)
                        .set(DISTRIBUTOR_APPLY.IS_AUTO_PASS, (byte) 1)
                        .where(DISTRIBUTOR_APPLY.ID.eq(res.getId())).execute();

                    //建立邀请关系
                    Integer inviteId = db().select(USER.USER_ID).from(USER).where(USER.INVITATION_CODE.eq(param.getActivationFields().getInvitationCode())).fetchOne().into(Integer.class);
                    UserBindParam userBindParam = new UserBindParam();
                    userBindParam.setInviteId(inviteId);
                    userBindParam.setUserId(param.getUserId());
                    userBind(userBindParam);

                    //邀请失效时间
                    Timestamp inviteExpiryDate = DateUtils.getTimeStampPlus(cfg.getVaild(), ChronoUnit.DAYS);
                    Date ed = new Date(inviteExpiryDate.getTime());
                    //分销分组
                    Integer inviteGroup = 0;
                    if (param.getActivationFields().getRebateGroup() != null) {
                        inviteGroup = param.getActivationFields().getRebateGroup();
                    }
                    //邀请人id
                    Integer inviteUserId = db().select(USER.USER_ID).from(USER)
                        .where(USER.INVITATION_CODE.eq(param.getActivationFields().getInvitationCode())).fetchOne().into(Integer.class);
                    //更新用户信息
                    db().update(USER)
                        .set(USER.IS_DISTRIBUTOR, (byte) 1)
                        .set(USER.INVITATION_CODE, inviteCode)
                        .set(USER.INVITE_GROUP, inviteGroup)
                        .set(USER.INVITE_TIME, DateUtils.getLocalDateTime())
                        .where(USER.USER_ID.eq(res.getUserId())).execute();
                    //审核通过
                    state = 1;
                } else {//后台手动审核
                    String checkInfo = Util.toJsonNotNull(param.getActivationFields());
                    assign(param, record);
                    record.setActivationFields(checkInfo);
                    db().executeInsert(record);
                }
            }
        }
        return state;
	}

    /**
     * 生成分销邀请码
     * @return
     */
	public String generateInvitationCode(){
        String inviteCode = "";
        char[] str = "0123456789abcdefghijkmlnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int len=6;
        for (int i = 0; i < len; i++) {
            int index = (int) (Math.random() * str.length);
            inviteCode += str[index];
        }
        return inviteCode;
    }

    /**
     * 判断邀请码是否重复,生成有效邀请吗
     * @param
     * @return
     */
    public String validInviteCode(){
        String inviteCode = this.generateInvitationCode();
        Integer ct = db().selectCount().from(USER).where(USER.INVITATION_CODE.eq(inviteCode)).fetchOne().into(Integer.class);
        while (ct != 0){
            inviteCode = this.generateInvitationCode();
            ct = db().selectCount().from(USER).where(USER.INVITATION_CODE.equalIgnoreCase(inviteCode)).fetchOne().into(Integer.class);
        }
        return inviteCode;
    }

    /**
     * 自动审核校验邀请码是否正确
     * @param sentCode
     * @return
     */
    public Integer sentInviteCodeVerify(String sentCode){
        Record record = db().selectCount().from(USER).where(USER.INVITATION_CODE.eq(sentCode)).fetchOne();
        if(record != null){
            return record.into(Integer.class);
        }else{
            return 0;
        }
    }

    /**
     * 获取申请分销员审核状态
     * @param param
     * @return
     */
	public DistributorApplyDetailParam getDistributorApplyDetail(DistributorApplyDetailParam param){
        DistributorApplyDetailParam detail = new DistributorApplyDetailParam();
	    //用户是否分销员
        Integer isDistributor = this.isDistributor(param.getUserId());
        //获取最新申请记录
	   Record record = db().select().from(DISTRIBUTOR_APPLY).where(DISTRIBUTOR_APPLY.USER_ID.eq(param.getUserId())).
           orderBy(DISTRIBUTOR_APPLY.CREATE_TIME.desc()).limit(1).fetchOne();
	   if(record != null){
           detail = record.into(DistributorApplyDetailParam.class);
           if(isDistributor == 0 && detail.getStatus() == 1){
               detail.setStatus(3);
           }
       }else {
           detail.setStatus(3);
       }
	   return detail;
    }

    /**
     * 获取分销推广文案
     * @return
     */
    public DistributionDocumentParam getDistributorDoc(){
        DistributionDocumentParam distributionDocument = distributionCfg.getDistributionDocument();
        if(distributionDocument == null){
            distributionDocument = new DistributionDocumentParam();
            distributionDocument.setDocument(null);
        }
        //获取分销审核开关配置
        Byte activation = this.distributionCfg.getDistributionCfg().getActivation();
        distributionDocument.setActivation(activation);
        return distributionDocument;

    }

    /**
     * 分销个人中心
     * @param userId
     * @return
     */
    public RebateCenterVo rebateCenter(Integer userId) {
        RebateCenterVo rebateCenterVo = new RebateCenterVo();
        //是否是分销员
        Integer isDistributor = this.isDistributor(userId);
        rebateCenterVo.setIsDistributor(isDistributor);
        //分销开关是否开启
        DistributionParam distributionCfg = this.distributionCfg.getDistributionCfg();
        if(distributionCfg != null) {
            rebateCenterVo.setJudgeStatus(distributionCfg.getJudgeStatus());
            rebateCenterVo.setStatus(distributionCfg.getStatus());
            rebateCenterVo.setRankStatus(distributionCfg.getRankStatus());
            //可提现金额
            rebateCenterVo.setCanWithdraw(canWithdraw(userId));
            //设置返利金额
            processSetRebateMoney(userId, rebateCenterVo);
            //累积返利商品总额
            BigDecimal rebateGoodsMoney = rebateGoodsMoney(userId);
            rebateCenterVo.setTotalCanFanliMoney(rebateGoodsMoney);
            //我的邀请码
            UserRecord userInfo = db().select().from(USER).where(USER.USER_ID.eq(userId)).fetchOne().into(UserRecord.class);
            rebateCenterVo.setInvitationCode(userInfo.getInvitationCode());
            //邀请用户数
            Integer inviteUserNum = this.inviteUserNum(userId);
            rebateCenterVo.setInviteUserNum(inviteUserNum);
            //返利订单数
            Integer rebateOrderNum = getRebateOrderNum(userId);
            rebateCenterVo.setRebateOrderNum(rebateOrderNum);
            //我的等级
            DistributorLevelParam distributorLevelInfo = this.distributorLevel(userId);
            rebateCenterVo.setDistributorLevel(distributorLevelInfo.getLevelName());
            //我的分组
            DistributorGroupListVo groupInfo = distributorGroup.getGroupByUserId(userId);
            rebateCenterVo.setDistributorGroup(groupInfo.getGroupName());
            //返利佣金排行top
            List<RebateRankingTopVo> rebateRankingTop = this.getRebateRankingTop();
            rebateCenterVo.setRebateRankingTop(rebateRankingTop);
            //当前分销员排名
            Integer rebateRanking = this.getRebateRanking(userId);
            rebateCenterVo.setRebateRanking(rebateRanking);
            //当前分销员返利信息
            UserRebateVo userRebate = this.getUserRebate(userId);
            rebateCenterVo.setUserRebate(userRebate);
            //返利轮播信息
            List<RebateOrderListVo> rebateOrderList = this.getRebateOrderList();
            rebateCenterVo.setRebateOrderList(rebateOrderList);
            //最低分销员等级信息
            DistributorLevelRecord lowerLevel = lowerDistributorLevel();
            if(lowerLevel != null){
                rebateCenterVo.setLowerLevelName(lowerLevel.getLevelName());
            }
            List<PromotionLanguageListVo> promotionLanguageListVos = promotionLanguagelist(userId);
            if(promotionLanguageListVos!=null){
                rebateCenterVo.setHasPromotionLanguage(1);
            }else{
                rebateCenterVo.setHasPromotionLanguage(0);
            }
            //分销邀请码配置
            rebateCenterVo.setInvitationCodeCfg(distributionCfg.getInvitationCode());
            //提现开关
            rebateCenterVo.setWithdrawStatus(distributionCfg.getWithdrawStatus());
            // 处理独立商品推广页的权限
            if (DistributionConstant.DISTRIBUTOR_PROMOTE_OPEN.equals(distributionCfg.getGoodsPromoteStatus())) {
                rebateCenterVo.setPersonalPromote(disposePersonalPromote(distributionCfg, userId));
            }
            // 判断该分销员是否已上传微信二维码
            UploadedImageDo distributorImage = getDistributorImage(userId);
            if (distributorImage == null || StringUtils.isBlank(distributorImage.getImgUrl())) {
                rebateCenterVo.setQrCode(DistributionConstant.NO_QR_CODE);
            } else {
                rebateCenterVo.setQrCode(DistributionConstant.QR_CODE);
            }
        }
        return rebateCenterVo;

    }

    private void processSetRebateMoney(Integer userId, RebateCenterVo rebateCenterVo) {
        BigDecimal allRebateMoney = BigDecimal.ZERO;
        BigDecimal allWaitRebateMoney = BigDecimal.ZERO;
        List<RebateOrderVo.RebateOrderInfo> allRebate = totalRebateMoney(userId);
        for(RebateOrderVo.RebateOrderInfo item : allRebate){
            if(item.getSettlementFlag() != null){
                if(item.getSettlementFlag() == 1){
                    allRebateMoney = allRebateMoney.add(item.getRebateMoney());
                }
                if(item.getSettlementFlag() == 0){
                    allWaitRebateMoney = allWaitRebateMoney.add(item.getRebateMoney());
                }
            }
        }
        //累积返利佣金总额
        rebateCenterVo.setTotalWithdraw(allRebateMoney);
        //待返利佣金
        rebateCenterVo.setWaitWithdraw(allWaitRebateMoney);
    }
    /**
     * 最低分销员等级信息
     * @return
     */
    public DistributorLevelRecord lowerDistributorLevel(){
        Record record = db().select().from(DISTRIBUTOR_LEVEL).orderBy(DISTRIBUTOR_LEVEL.LEVEL_ID.asc()).limit(1).fetchOne();
        if(record != null){
            return record.into(DistributorLevelRecord.class);
        }else{
            return null;
        }
    }
    /**
     * 分销中心推广语列表
     * @return
     */
    public  List<PromotionLanguageListVo> promotionLanguagelist(Integer userId){
        Result<Record> record = db().select().from(PROMOTION_LANGUAGE)
            .where(PROMOTION_LANGUAGE.IS_BLOCK.eq((byte) 0)).and(PROMOTION_LANGUAGE.DEL_FLAG.eq((byte) 0)).fetch();
        if(record.isNotEmpty()){
            List<PromotionLanguageListVo> lists = record.into(PromotionLanguageListVo.class);
            for (PromotionLanguageListVo list : lists){
                Record record1 = db().select().from(USER_PROMOTION_LANGUAGE).where(USER_PROMOTION_LANGUAGE.USER_ID.eq(userId)).and(USER_PROMOTION_LANGUAGE.LAN_ID.eq(list.getId())).fetchOne();
                if(record1 != null){
                    list.setIsDefault((byte)1);
                }
            }
            return lists;
        }else{
            return null;
        }
    }
    /**
     * 判断分销员是否有独立商品推广页的权限
     * @param distributionCfg 分销配置
     * @param userId 分销员id
     * @return 0:不具有 1:具有
     */
    private Byte disposePersonalPromote(DistributionParam distributionCfg, Integer userId) {
        // 全部分销员具有独立推广页权限
        if (DistributionConstant.ALL_DISTRIBUTOR.equals(distributionCfg.getGoodsPromoteScope())) {
            return DistributionConstant.PERSONAL_PROMOTE;
        }

        // 部分分销员具有独立推广页权限
        if (DistributionConstant.PART_DISTRIBUTOR.equals(distributionCfg.getGoodsPromoteScope())) {
            String distributorLevelIds = distributionCfg.getGoodsPromoteLevel();
            List<Integer> distributorIds = userDao.listUserIdByDistributorLevel(Util.stringToList(distributorLevelIds));

            String promoteDistributorIds = distributionCfg.getGoodsPromoteDistributor();
            distributorIds.addAll(Util.stringToList(promoteDistributorIds));

            if (distributorIds.contains(userId)) {
                return DistributionConstant.PERSONAL_PROMOTE;
            }
        }

        return DistributionConstant.NO_PERSONAL_PROMOTE;
    }

    /**
     * 设置默认推广语
     * @param param
     * @return
     */
    public int setDefault(SetDefaulttParam param){
        int res = 0;
        Record record = db().select().from(USER_PROMOTION_LANGUAGE).where(USER_PROMOTION_LANGUAGE.USER_ID.eq(param.getUserId())).fetchOne();
        if(record != null){
            res = db().update(USER_PROMOTION_LANGUAGE).set(USER_PROMOTION_LANGUAGE.LAN_ID,param.getLanguageId()).where(USER_PROMOTION_LANGUAGE.USER_ID.eq(param.getUserId())).execute();
        }else{
            UserPromotionLanguageRecord userPromotionLanguage = new UserPromotionLanguageRecord();
            userPromotionLanguage.setUserId(param.getUserId());
            userPromotionLanguage.setLanId(param.getLanguageId());
            userPromotionLanguage.setCreateTime(Util.currentTimeStamp());
            assign(userPromotionLanguage,userPromotionLanguage);
            res = db().executeInsert(userPromotionLanguage);
        }
        return res;
    }
    /**
     * 待返利佣金金额
     * @param userId
     * @return
     */
    public BigDecimal waitFanliMoney(Integer userId){
        //待返利佣金金额
        BigDecimal waitFanliMoney = db().select(sum(ORDER_GOODS_REBATE.REAL_REBATE_MONEY).as("wait_fanli_money")).from(ORDER_GOODS_REBATE
            .leftJoin(ORDER_INFO).on(ORDER_GOODS_REBATE.ORDER_SN.eq(ORDER_INFO.ORDER_SN)))
            .where(ORDER_INFO.SETTLEMENT_FLAG.eq((byte)0))
            .and(ORDER_INFO.ORDER_STATUS.ge((byte)3))
            .and(ORDER_GOODS_REBATE.REBATE_USER_ID.eq(userId))
            .fetchOne().into(BigDecimal.class);
        if(waitFanliMoney == null){
            waitFanliMoney = new BigDecimal(0.00);
        }
        return waitFanliMoney;
    }

    /**
     * 邀请用户数
     * @param userId
     * @return
     */
    public Integer inviteUserNum(Integer userId){
        int inviteNum = db().selectCount().from(USER).where(USER.INVITE_ID.eq(userId)).fetchOne().into(Integer.class);
        return inviteNum;
    }

    /**
     * 累积返利商品总额
     * @param userId
     * @return
     */
    public BigDecimal totalCanFanliMoney(Integer userId){
        //累积返利商品总额
        BigDecimal totalCanFanli = db().select(sum(USER_FANLI_STATISTICS.TOTAL_CAN_FANLI_MONEY).as("can_fanli_goods_money"))
            .from(USER_FANLI_STATISTICS).where(USER_FANLI_STATISTICS.FANLI_USER_ID.eq(userId))
            .fetchOne().into(BigDecimal.class);
        if(totalCanFanli == null){
            totalCanFanli = new BigDecimal(0.00);
        }
        return totalCanFanli;
    }

    /**
     * 分销员等级
     * @param userId
     * @return
     */
    public DistributorLevelParam distributorLevel(Integer userId){
        DistributorLevelParam distributorLevelInfo = db().select(DISTRIBUTOR_LEVEL.LEVEL_NAME).from(USER.leftJoin(DISTRIBUTOR_LEVEL).on(USER.DISTRIBUTOR_LEVEL.eq(DISTRIBUTOR_LEVEL.LEVEL_ID)))
            .where(USER.USER_ID.eq(userId)).fetchOne().into(DistributorLevelParam.class);
        return distributorLevelInfo;
    }

    /**
     * 分销员邀请下级用户（我邀请的用户）
     * @param param
     * @return
     */
    public  PageResult<InviteUserVo> myInviteUser(InviteUserListParam param){
        SelectConditionStep<? extends Record> select = db().select(USER.USER_ID, USER.USERNAME,USER_DETAIL.USER_AVATAR, USER.INVITE_TIME, USER_FANLI_STATISTICS.ORDER_NUMBER,
            USER_FANLI_STATISTICS.TOTAL_FANLI_MONEY,DISTRIBUTOR_LEVEL.LEVEL_NAME,USER.INVITE_PROTECT_DATE,USER.INVITE_EXPIRY_DATE,USER.IS_DISTRIBUTOR,USER.INVITE_ID,USER.DISTRIBUTOR_LEVEL)
            .from(USER).leftJoin(USER_FANLI_STATISTICS).on(USER.USER_ID.eq(USER_FANLI_STATISTICS.USER_ID))
            .leftJoin(USER_DETAIL).on(USER.USER_ID.eq(USER_DETAIL.USER_ID))
            .leftJoin(DISTRIBUTOR_LEVEL).on(USER.DISTRIBUTOR_LEVEL.eq(DISTRIBUTOR_LEVEL.LEVEL_ID)).where();
        myInviteUserOption(select,param);
        PageResult<InviteUserVo> inviteUserList = this.getPageResult(select, param.getCurrentPage(), param.getPageRows(), InviteUserVo.class);
        Timestamp nowDate = Util.currentTimeStamp();


        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < inviteUserList.dataList.size(); i++) {
            InviteUserVo inviteUserVo = inviteUserList.dataList.get(i);
            //合并相同用户的返利订单数以及佣金
            if (map.containsKey(inviteUserVo.getUserId())) {
                //1.合并返利订单数以及佣金
                InviteUserVo userVo = inviteUserList.dataList.get(map.get(inviteUserVo.getUserId()));
                userVo.setOrderNumber(userVo.getOrderNumber() + inviteUserVo.getOrderNumber());
                userVo.setTotalFanliMoney(userVo.getTotalFanliMoney().add(inviteUserVo.getTotalFanliMoney()));
                inviteUserList.dataList.set(map.get(inviteUserVo.getUserId()), userVo);

                //2.从列表中删除当前记录
                inviteUserList.dataList.set(i, null);
            } else {
                map.put(inviteUserList.dataList.get(i).getUserId(), i);
            }
            //间接邀请
            if(inviteUserVo.getInviteId() != null && inviteUserVo.getInviteId().compareTo(param.getUserId()) != 0){
                inviteUserVo.setInviteType((byte)1);
            }
            if(inviteUserVo.getInviteProtectDate() != null && inviteUserVo.getInviteProtectDate().compareTo(nowDate)>0){
                int leftProtectDay = Util.differentDays(nowDate, inviteUserVo.getInviteProtectDate());
                inviteUserVo.setLeftProtectDay(leftProtectDay);
            }else{
                inviteUserVo.setIsFailture(1);
            }
            if(inviteUserVo.getInviteExpiryDate() != null && inviteUserVo.getInviteExpiryDate().compareTo(nowDate)>0){
                int leftExpireDay = Util.differentDays(nowDate, inviteUserVo.getInviteExpiryDate());
                inviteUserVo.setLeftExpiryDay(leftExpireDay);
            }
            if (inviteUserVo.getOrderNumber() == null) {
                inviteUserVo.setOrderNumber(0);
            }
            if (inviteUserVo.getTotalFanliMoney() == null) {
                inviteUserVo.setTotalFanliMoney(new BigDecimal(0));
            }
            String inviteName = db().select(USER.USERNAME).from(USER).where(USER.USER_ID.eq(inviteUserVo.getInviteId())).fetchOne().into(String.class);
            inviteUserVo.setInviteName(inviteName);
        }

        //处理inviteUserList.dataList中的null值
        List<InviteUserVo> nullArr = new ArrayList<>();
        nullArr.add(null);
        inviteUserList.dataList.removeAll(nullArr);
        //修改总记录数
        inviteUserList.getPage().setTotalRows(inviteUserList.dataList.size());

        return inviteUserList;

    }
    /**
     * 邀请用户列表条件查询｜表头排序
     * @param select
     * @param param
     */
    public void myInviteUserOption(SelectConditionStep<? extends Record> select,InviteUserListParam param){
        List<Integer> inviteUser = null;
        //受邀用户Id集合
        Result<Record1<Integer>> fetch = db().select(USER.USER_ID).from(USER).where(USER.INVITE_ID.eq(param.getUserId())).fetch();
        Timestamp nowdate = Util.currentTimeStamp();
        Timestamp failureDate = Util.getEarlyTimeStamp(nowdate,10);

        Date nowdate1 = Date.valueOf(DateUtils.getLocalDate());
        Date tenLater = new Date(failureDate.getTime());

        if(fetch != null){
            inviteUser = fetch.into(Integer.class);
        }
        //邀请关系集合 0:全部；1：直接邀请；2：间接邀请
        processInviteTypeOption(select, param, inviteUser);

        //用户类型：0：有效用户；1：即将过期用户；2：已失效用户
        processInviteUserStatusOption(select, param, nowdate, failureDate);
        //有效期集合 0:都不选；1:都选； 2:保护有效期剩余不超过10天；3：返利有效期不超过10天
        processValidityDateOption(select, param, nowdate, failureDate, nowdate1, tenLater);

        //分销员等级
        if (CollectionUtils.isNotEmpty(param.getDistributorLevels())) {
            select.and(USER.DISTRIBUTOR_LEVEL.in(param.getDistributorLevels()));
        }
        //用户昵称
        if(StringUtil.isNotEmpty(param.getUsername())){
            select.and(USER.USERNAME.contains(param.getUsername()));
        }
        if(INVITE_TIME.equals(param.getSortField())){
            if(SORT_TYPE.equals(param.getSortType())){
                select.orderBy(USER.INVITE_TIME.desc());
            }else{
                select.orderBy(USER.INVITE_TIME.asc());
            }

        }
        if(ORDER_NUMBER.equals(param.getSortField())){
            if(SORT_TYPE.equals(param.getSortType())){
                select.orderBy(USER_FANLI_STATISTICS.ORDER_NUMBER.desc());
            }else{
                select.orderBy(USER_FANLI_STATISTICS.ORDER_NUMBER.asc());
            }

        }
        if(TOTAL_FANLI_MONEY.equals(param.getSortField())){
            if(SORT_TYPE.equals(param.getSortType())){
                select.orderBy(USER_FANLI_STATISTICS.TOTAL_FANLI_MONEY.desc());
            }else{
                select.orderBy(USER_FANLI_STATISTICS.TOTAL_FANLI_MONEY.asc());
            }

        }
    }
    private void processInviteTypeOption(SelectConditionStep<? extends Record> select, InviteUserListParam param, List<Integer> inviteUser) {
        if (param.getInviteType() != null && param.getInviteType().equals(INVITE_RELATION_ALL)) {
            select.and(USER.INVITE_ID.eq(param.getUserId()).or(USER.INVITE_ID.in(inviteUser)));
        }

        if (param.getInviteType() != null && param.getInviteType().equals(INVITE_RELATION_DIRECTLY)) {
            //直接邀请
            select.and(USER.INVITE_ID.eq(param.getUserId()));
        }

        if (param.getInviteType() != null && param.getInviteType().equals(INVITE_RELATION_INDIRECT)) {
            //间接邀请
            select.and(USER.INVITE_ID.in(inviteUser));
        }
    }

    private void processInviteUserStatusOption(SelectConditionStep<? extends Record> select, InviteUserListParam param, Timestamp nowdate, Timestamp failureDate) {
        Date foreverDate = new Date(946656000);
        Timestamp forever = Util.getEarlyTimeStamp(foreverDate, 1);

        if(param.getInviteUserStatus() != null && param.getInviteUserStatus().equals(USER_EFFECTIVE)){
            select.and(USER.INVITE_PROTECT_DATE.ge(nowdate).or(USER.INVITE_PROTECT_DATE.eq(forever)));
        }
        if(param.getInviteUserStatus() != null && param.getInviteUserStatus().equals(USER_WILL_EXPIRE)){
            select.and(USER.INVITE_PROTECT_DATE.ge(nowdate).and(USER.INVITE_PROTECT_DATE.le(failureDate)));
        }
        if(param.getInviteUserStatus() != null && param.getInviteUserStatus().equals(USER_HAS_EXPIRE)){
            select.and(USER.INVITE_PROTECT_DATE.le(nowdate)).and(USER.INVITE_PROTECT_DATE.ne(forever));
        }
    }

    private void processValidityDateOption(SelectConditionStep<? extends Record> select, InviteUserListParam param, Timestamp nowdate, Timestamp failureDate, Date nowdate1, Date tenLater) {
        if (param.getValidityDate() != null && param.getValidityDate().equals(ALL_EXPIRE_PROTECT)) {
            select.and(USER.INVITE_PROTECT_DATE.ge(nowdate).and(USER.INVITE_PROTECT_DATE.le(failureDate))).
                and(USER.INVITE_EXPIRY_DATE.ge(nowdate1).and(USER.INVITE_EXPIRY_DATE.le(tenLater)));
        }
        if (param.getValidityDate() != null && param.getValidityDate().equals(PROTECT_LEFT_TEN)) {
            select.and(USER.INVITE_PROTECT_DATE.ge(nowdate).and(USER.INVITE_PROTECT_DATE.le(failureDate)));
        }

        if (param.getValidityDate() != null && param.getValidityDate().equals(EXPIRE_LEFT_TEN)) {
            select.and(USER.INVITE_EXPIRY_DATE.ge(nowdate1).and(USER.INVITE_EXPIRY_DATE.le(tenLater)));
        }
    }
    /**
     * 佣金排名前三榜
     * @return
     */
    public List<RebateRankingTopVo> getRebateRankingTop(){
        BigDecimal finalMoney = BigDecimal.ZERO;
        Result<Record4<Integer, BigDecimal, String, String>> fetch = db().select(USER_TOTAL_FANLI.USER_ID, USER_TOTAL_FANLI.FINAL_MONEY, USER.USERNAME, USER_DETAIL.USER_AVATAR).from(USER_TOTAL_FANLI)
            .leftJoin(USER).on(USER_TOTAL_FANLI.USER_ID.eq(USER.USER_ID))
            .leftJoin(USER_DETAIL).on(USER_TOTAL_FANLI.USER_ID.eq(USER_DETAIL.USER_ID))
            .where(USER_TOTAL_FANLI.FINAL_MONEY.ge(finalMoney)).orderBy(USER_TOTAL_FANLI.FINAL_MONEY.desc()).limit(3).fetch();
        if(fetch != null){
            return fetch.into(RebateRankingTopVo.class);
        }else{
            return null;
        }
    }

    /**
     * 当前分销员排名
     * @param userId
     */
    public Integer getRebateRanking(Integer userId){
        BigDecimal finalMoney = BigDecimal.ZERO;
        Record record = db().select().from(USER_TOTAL_FANLI).where(USER_TOTAL_FANLI.USER_ID.eq(userId)).and(USER_TOTAL_FANLI.FINAL_MONEY.gt(finalMoney)).fetchOne();
        if(record != null){
            UserTotalFanliRecord userFanli = record.into(UserTotalFanliRecord.class);
            //获取排行信息
            Integer ranking = db().selectCount().from(USER_TOTAL_FANLI).leftJoin(USER).on(USER_TOTAL_FANLI.USER_ID.eq(USER.USER_ID))
                .where(USER_TOTAL_FANLI.FINAL_MONEY.ge(userFanli.getFinalMoney())).fetchOne().into(Integer.class);
            return ranking;
        }else{
            return 0;
        }
    }

    /**
     * 当前分销员返利信息
     * @param userId
     * @return
     */
    public UserRebateVo getUserRebate(Integer userId){
        Record record = db().select(USER_TOTAL_FANLI.FINAL_MONEY, USER.USER_ID, USER.USERNAME,USER_DETAIL.USER_AVATAR).from(USER_TOTAL_FANLI).leftJoin(USER).on(USER_TOTAL_FANLI.USER_ID.eq(USER.USER_ID))
            .leftJoin(USER_DETAIL).on(USER_TOTAL_FANLI.USER_ID.eq(USER_DETAIL.USER_ID))
            .where(USER_TOTAL_FANLI.USER_ID.eq(userId)).fetchOne();
        if(record != null){
            return record.into(UserRebateVo.class);
        }else{
            return null;
        }
    }

    /**
     * 返利轮播信息
     * @return
     */
    public List<RebateOrderListVo> getRebateOrderList(){
        BigDecimal finalMoney = BigDecimal.ZERO;
        Timestamp nowDate = Util.currentTimeStamp();
        Timestamp toDate = Util.getEarlyTimeStamp(nowDate, -30);
        Result<Record5<Integer, BigDecimal, Timestamp, String, String>> info = db().select(ORDER_INFO.FANLI_USER_ID, ORDER_INFO.FANLI_MONEY, ORDER_INFO.FINISHED_TIME, USER_DETAIL.USERNAME, USER_DETAIL.USER_AVATAR)
            .from(ORDER_INFO)
            .leftJoin(USER_DETAIL).on(ORDER_INFO.FANLI_USER_ID.eq(USER_DETAIL.USER_ID))
            .where(ORDER_INFO.FANLI_TYPE.eq((byte) 1))
            .and(ORDER_INFO.FINISHED_TIME.gt(toDate))
            .and(ORDER_INFO.SETTLEMENT_FLAG.eq((byte) 1))
            .and(ORDER_INFO.FANLI_MONEY.gt(finalMoney))
            .orderBy(ORDER_INFO.FINISHED_TIME.desc()).limit(10).fetch();
        if(info != null){
            return info.into(RebateOrderListVo.class);
        }else{
            return null;
        }
    }

    /**
     * 邀请用户返利订单
     * @param param
     * @return
     */
    public RebateOrderVo rebateOrder(RebateOrderParam param){
        SelectOnConditionStep<? extends Record> select = db().select(ORDER_GOODS.ORDER_SN, ORDER_INFO.CREATE_TIME, ORDER_INFO.FINISHED_TIME,ORDER_INFO.SETTLEMENT_FLAG,
            ORDER_INFO.ORDER_STATUS, ORDER_INFO.ORDER_STATUS_NAME,USER.USERNAME,sum(ORDER_GOODS.CAN_CALCULATE_MONEY).as("canCalculateMoney"), sum(ORDER_GOODS_REBATE.REAL_REBATE_MONEY).as("rebateMoney"),
            ORDER_GOODS_REBATE.REBATE_LEVEL)
            .from(ORDER_GOODS_REBATE)
            .leftJoin(ORDER_INFO).on(ORDER_GOODS_REBATE.ORDER_SN.eq(ORDER_INFO.ORDER_SN))
            .leftJoin(ORDER_GOODS).on(ORDER_GOODS_REBATE.ORDER_SN.eq(ORDER_GOODS.ORDER_SN))
            .leftJoin(USER).on(ORDER_INFO.USER_ID.eq(USER.USER_ID));
        SelectOnConditionStep<? extends Record> sql = rebateOrderOptions(select, param);
        PageResult<RebateOrderVo.RebateOrderInfo> pageResult = getPageResult(sql, param.getCurrentPage(), param.getPageRows(), RebateOrderVo.RebateOrderInfo.class);

        List<RebateOrderVo.RebateOrderInfo> allRebate = db().select(ORDER_GOODS_REBATE.ORDER_SN,sum(ORDER_GOODS_REBATE.REAL_REBATE_MONEY).as("rebateMoney"),ORDER_INFO.SETTLEMENT_FLAG).from(ORDER_GOODS_REBATE)
            .leftJoin(ORDER_INFO).on(ORDER_GOODS_REBATE.ORDER_SN.eq(ORDER_INFO.ORDER_SN))
            .where(ORDER_GOODS_REBATE.REBATE_USER_ID.eq(param.getUserId())).groupBy(ORDER_GOODS_REBATE.ORDER_SN,ORDER_INFO.SETTLEMENT_FLAG).fetch().into(RebateOrderVo.RebateOrderInfo.class);

        RebateOrderVo orderVo = new RebateOrderVo();
        BigDecimal rebateMoney =BigDecimal.ZERO;
        BigDecimal rebateGoodsMoney = BigDecimal.ZERO;
        BigDecimal allRebateMoney = BigDecimal.ZERO;
        BigDecimal allWaitRebateMoney = BigDecimal.ZERO;
        //时间端内统计
        for(RebateOrderVo.RebateOrderInfo list : pageResult.dataList){
            if(list.getSettlementFlag() == 1){
                rebateMoney = rebateMoney.add(list.getRebateMoney());
            }
            if(list.getCanCalculateMoney() != null){
                rebateGoodsMoney = rebateGoodsMoney.add(list.getCanCalculateMoney());
            }

//            getCanCalculateMoney(list.getOrderSn(),param.getUserId());
        }
        for(RebateOrderVo.RebateOrderInfo item : allRebate){
            if(item.getSettlementFlag() != null){
                if(item.getSettlementFlag() == 1){
                    allRebateMoney = allRebateMoney.add(item.getRebateMoney());
                }
                if(item.getSettlementFlag() == 0){
                    allWaitRebateMoney = allWaitRebateMoney.add(item.getRebateMoney());
                }
            }
        }
        orderVo.setPartRebateMoney(rebateMoney);
        orderVo.setPartRebateGoodsMoney(rebateGoodsMoney);
        orderVo.setAllRebateMoney(allRebateMoney);
        orderVo.setWaitRebateMoney(allWaitRebateMoney);
        orderVo.setRebateOrderInfo(pageResult);
        return orderVo;
    }

    /**
     * 返利订单条件查询
     * @param select
     * @param param
     * @return
     */
    public SelectOnConditionStep<? extends Record> rebateOrderOptions(SelectOnConditionStep<? extends Record> select,RebateOrderParam param){
        logger().info("param"+param);
        select.where(ORDER_GOODS_REBATE.REBATE_USER_ID.eq(param.getUserId()));
        if(param.getOrderType().equals(ORDER_TYPE_WAIT_FANLI)){ //待返利
            select.where(ORDER_INFO.SETTLEMENT_FLAG.eq(DistributionConstant.WAIT_SETTLEMENT_FLAG));
        }
        if(param.getOrderType().equals(ORDER_TYPE_HAS_FANLI)){ //已返利
            select.where(ORDER_INFO.SETTLEMENT_FLAG.eq(DistributionConstant.HAS_SETTLEMENT_FLAG));
        }
        if(param.getStartTime() != null && param.getStartTime() != null){
            select.and(ORDER_INFO.CREATE_TIME.gt(param.getStartTime())).and(ORDER_INFO.CREATE_TIME.lt(param.getEndTime()));
        }
        select.groupBy(ORDER_GOODS.ORDER_SN, ORDER_INFO.CREATE_TIME, ORDER_INFO.FINISHED_TIME,
            ORDER_INFO.ORDER_STATUS, ORDER_INFO.ORDER_STATUS_NAME, USER.USERNAME,
            ORDER_GOODS_REBATE.REBATE_LEVEL,ORDER_INFO.SETTLEMENT_FLAG);
        return select;
    }

    /**
     * 计算订单返利金额
     * @param orderSn
     * @param rebateUserId
     * @return
     */
    public BigDecimal getCanCalculateMoney(String orderSn,Integer rebateUserId) {
        //查询商品行信息
        List<OrderGoodsRecord> orderGoodsInfo = db().select(ORDER_GOODS.ORDER_SN, ORDER_GOODS.PRODUCT_ID, ORDER_GOODS.CAN_CALCULATE_MONEY, ORDER_GOODS.GOODS_NUMBER, ORDER_GOODS.RETURN_NUMBER)
            .from(ORDER_GOODS).where(ORDER_GOODS.ORDER_SN.eq(orderSn)).fetch().into(OrderGoodsRecord.class);

        //得到订单信息 SETTLEMENT_FLAG：结算标记：0未结算；1结算
        Integer settlementFlag = db().select(ORDER_INFO.SETTLEMENT_FLAG).from(ORDER_INFO).where(ORDER_INFO.ORDER_SN.eq(orderSn)).fetchOne().into(Integer.class);
        BigDecimal calculateMoney = new BigDecimal(0);
        for (OrderGoodsRecord item : orderGoodsInfo) {
            if (rebateUserId > 0 && settlementFlag == 1) {
                Record2<BigDecimal, BigDecimal> record = db().select(ORDER_GOODS_REBATE.REBATE_MONEY, ORDER_GOODS_REBATE.REAL_REBATE_MONEY).from(ORDER_GOODS_REBATE).where(ORDER_GOODS_REBATE.ORDER_SN.eq(item.getOrderSn())).and(ORDER_GOODS_REBATE.PRODUCT_ID.eq(item.getProductId()))
                    .and(ORDER_GOODS_REBATE.REBATE_USER_ID.eq(rebateUserId)).fetchOne();
                if (record != null) {
                    OrderGoodsRebateRecord goodsRebate = record.into(OrderGoodsRebateRecord.class);
                    if (goodsRebate.getRebateMoney().compareTo(BigDecimal.ZERO) > 0) {
                        BigDecimal divide = goodsRebate.getRealRebateMoney().divide(goodsRebate.getRebateMoney(), 2);
                        calculateMoney = calculateMoney.multiply(divide);
                    } else {
                        BigDecimal goodsNumber = BigDecimal.valueOf(item.getGoodsNumber());
                        BigDecimal returnNumber = BigDecimal.valueOf(item.getReturnNumber());
                        calculateMoney = calculateMoney.add(item.getCanCalculateMoney().multiply(goodsNumber.subtract(returnNumber)));
                    }
                }
            } else {
                BigDecimal goodsNumber = BigDecimal.valueOf(item.getGoodsNumber());
                BigDecimal returnNumber = BigDecimal.valueOf(item.getReturnNumber());
                calculateMoney = calculateMoney.add(item.getCanCalculateMoney().multiply(goodsNumber.subtract(returnNumber)));
            }

        }
        return calculateMoney;
    }

    /**
     * 用户(分销员)之间建立绑定关系
     * @param param
     */
    public void userBind(UserBindParam param){
        int canBind = 0;
        //0不能建立邀请关系；1：可以建立邀请关系；
        //一、排除二级成环情况
        //判断邀请人是否有上级，若有返回上级ID
        int upId = isBind(param.getInviteId());
        if(upId > 0){
            //有上级邀请人
            if(upId != param.getUserId()){
                // 邀请人的上级不是被邀请人，可以建立邀请关系
                canBind = 1;
            }
        }else{
            //无上级邀请人，可建立邀请关系
            canBind = 1;
        }
        //二、建立绑定关系
        if(canBind == 1){
            //判断被邀请人是否已有邀请人
            int inviteId = isBind(param.getUserId());
            if(inviteId > 0){
                //被邀请人已有上级
                //判断上级是否为分销员
                int isDistributor = isDistributor(inviteId);
                //是分销员，判断保护期是否有效
                if(isDistributor == 1){
                    int isEffective = inviteProtectIsEffective(param.getUserId());
                    if(isEffective == 0){
                        //不在有效保护期内，可以重新绑定
                        //与当前邀请人建立绑定关系
                        confirmUserBind(param);
                    }
                }else{
                    //当前邀请人是普通用户，可以与当前用户建立邀请绑定
                    confirmUserBind(param);
                }
            }else{
                //被邀请人没有上级，直接绑定
                confirmUserBind(param);
            }
        }
    }

    /**
     * 确定用户与邀请人建立绑定关系
     * @param param
     */
    private void confirmUserBind(UserBindParam param){
        System.out.println("开始建立关系");
        //邀请人是否为分销员
        int isDistributor = isDistributor(param.getInviteId());
        if(!(param.getUserId().equals(param.getInviteId()))){
            //原始邀请人
            Integer oldInviteId = db().select(USER.INVITE_ID).from(USER).where(USER.USER_ID.eq(param.getUserId())).fetchOne().into(Integer.class);
            if(isDistributor == 1){//是分销员，需计算邀请保护期
                //获取分销配置
                DistributionParam cfg = this.distributionCfg.getDistributionCfg();
                //邀请保护时间
                Timestamp protectDate = DateUtils.getTimeStampPlus(cfg.getProtectDate(), ChronoUnit.DAYS);
                if(cfg.getProtectDate() == -1){
                    //-1为永久保护
                    Date foreverDate = new Date(946656000);
                    protectDate = Util.getEarlyTimeStamp(foreverDate,1);
                }
                if(cfg.getProtectDate() == 0){
                    //没有保护期
                    protectDate =Util.currentTimeStamp();
                }

                //邀请失效时间
                Timestamp inviteExpiryDate = DateUtils.getTimeStampPlus(cfg.getVaild(), ChronoUnit.DAYS);
                if(cfg.getVaild() == 0){
                    //永久返利有效
                    Date foreverDate = new Date(946656000);
                    inviteExpiryDate = Util.getEarlyTimeStamp(foreverDate,1);
                }
                Date ed = new Date(inviteExpiryDate.getTime());
                db().update(USER).set(USER.INVITE_ID,param.getInviteId())
                    .set(USER.INVITE_EXPIRY_DATE,ed)
                    .set(USER.INVITE_PROTECT_DATE,protectDate)
                    .set(USER.INVITE_TIME,Util.currentTimeStamp())
                    .where(USER.USER_ID.eq(param.getUserId())).execute();
            }else{
                //不是分销员，直接建立绑定关系
                db().update(USER).set(USER.INVITE_ID,param.getInviteId())
                    .set(USER.INVITE_TIME,Util.currentTimeStamp())
                    .where(USER.USER_ID.eq(param.getUserId())).execute();
            }
            updateSublayerNumber(param.getInviteId());
            if(oldInviteId > 0){
                updateSublayerNumber(oldInviteId);
            }
        }
    }

    /**
     * 用户是否已绑定邀请人
     * @param userId
     * @return
     */
     public int isBind(Integer userId){
         Record record = db().select(USER.INVITE_ID).from(USER).where(USER.USER_ID.eq(userId)).fetchOne();
         if(record != null) {
             return record.into(Integer.class);
         } else {
             return 0;
         }
    }

    /**
     * 用户是否为分销员
     * @param userId
     * @return
     */
    public int isDistributor(Integer userId){
        int isDistributor =  db().select(USER.IS_DISTRIBUTOR).from(USER).where(USER.USER_ID.eq(userId)).fetchOne().into(Integer.class);
        return isDistributor;
     }

    /**
     * 邀请保护时间是否有效
     * @param userId
     * @return 0：邀请保护失效；1：邀请保护有效
     */
     private int inviteProtectIsEffective(Integer userId){
         UserRecord info = db().select(USER.INVITE_PROTECT_DATE).from(USER).where(USER.USER_ID.eq(userId)).fetchOne().into(UserRecord.class);
         Timestamp nowDate = Util.currentTimeStamp();
         Date foreverDate = new Date(946656000);
         Timestamp protectDate = Util.getEarlyTimeStamp(foreverDate,3650);
         if(nowDate.compareTo(info.getInviteProtectDate()) > 0 && info.getInviteProtectDate().compareTo(protectDate)>0) {
             //邀请保护失效
             return 0;
         } else {
             //邀请保护有效
             return 1;
         }
     }

    /**
     *
     * @param userId
     * @return
     */
     public String getDistributorRealName(Integer userId) {
         DistributorApplyRecord record = db().selectFrom(DISTRIBUTOR_APPLY)
             .where(DISTRIBUTOR_APPLY.USER_ID.eq(userId)
                 .and(DISTRIBUTOR_APPLY.CONFIG_FIELDS.like(likeValue("real_name")))
                 .and(DISTRIBUTOR_APPLY.STATUS.eq((byte) 1)))
             .orderBy(DISTRIBUTOR_APPLY.CREATE_TIME.desc())
             .fetchAny();
         if(record == null) {
             return null;
         }
         DistributorApplyParam.InfoField infoField = Util.parseJson(record.getActivationFields(), DistributorApplyParam.InfoField.class);
         if (infoField != null) {
             return infoField.getRealName();
         }
         return null;
     }

    /**
     * 更新用户下级用户数
     * @param userId
     */
     public void updateSublayerNumber(Integer userId){
         Integer into = db().selectCount().from(USER_TOTAL_FANLI).where(USER_TOTAL_FANLI.USER_ID.eq(userId)).fetchOne().into(Integer.class);
         if(into == 0){
             String mobile = db().select(USER.MOBILE).from(USER).where(USER.USER_ID.eq(userId)).fetchOne().into(String.class);
             UserTotalFanliRecord userTotalFanliRecord = new UserTotalFanliRecord();
             userTotalFanliRecord.setUserId(userId);
             userTotalFanliRecord.setMobile(mobile);
             userTotalFanliRecord.setCreateTime(Util.currentTimeStamp());
             db().executeInsert(userTotalFanliRecord);
         }
         Integer sublayerNumber = db().selectCount().from(USER).where(USER.INVITE_ID.eq(userId)).fetchOne().into(Integer.class);
         db().update(USER_TOTAL_FANLI).set(USER_TOTAL_FANLI.SUBLAYER_NUMBER,sublayerNumber).where(USER_TOTAL_FANLI.USER_ID.eq(userId)).execute();
     }


    public WithdrawDetailVo withdrawDetail(Integer userId, Integer shopId){
        WithdrawDetailVo withdrawDetailVo = new WithdrawDetailVo();
        int isBindMobile = scs.getBindMobile();
        //用户信息
        UserInfo userInfo = us.getUserInfo(userId);
        //分销配置
        DistributionParam cfg = distributionCfg.getDistributionCfg();
        BigDecimal canWithdraw = canWithdraw(userId);
        //是否绑定公众号
        MpAuthShopRecord authShopInfo = mss.getAuthShopByShopId(shopId);
        System.out.println(authShopInfo);
        //已绑定公众号
        if(authShopInfo.getLinkOfficialAppId() != null){
            String isPublicUser = getOpenIdFromMpOpenId(authShopInfo.getLinkOfficialAppId(), authShopInfo.getAppId(), userInfo.getWxOpenid());
            if(isPublicUser != null){
                //判断关注状态 0：取关；1：关注
                com.vpu.mp.db.main.tables.records.MpOfficialAccountUserRecord mp = saas().shop.mpOfficialAccountUserService.getUser(authShopInfo.getAppId(), userInfo.getWxOpenid());
                withdrawDetailVo.setIsPublicUser(mp.getSubscribe());
            }
        }else{
            withdrawDetailVo.setNickName(null);
            withdrawDetailVo.setIsPublicUser((byte)0);
        }
        withdrawDetailVo.setIsBindMobile(isBindMobile);
        withdrawDetailVo.setRealName(userInfo.getRealName());
        withdrawDetailVo.setWithdrawCash(cfg.getWithdrawCash());
        withdrawDetailVo.setWithdrawStatus(cfg.getWithdrawStatus());
        withdrawDetailVo.setCanWithdraw(canWithdraw);
        withdrawDetailVo.setWithdrawSource(cfg.getWithdrawSource());
        return withdrawDetailVo;

    }

    /**
     * 分销中心-提现记录
     * @param param
     * @return
     */
    public WithdrawRecordVo withdrawRecord(WithdrawRecordParam param) {
        WithdrawRecordVo withdrawRecordVo = new WithdrawRecordVo();
        //提现金额
        BigDecimal totalWithdraw = BigDecimal.ZERO;

        Record1<BigDecimal> bigDecimalRecord1 = db().select(sum(DISTRIBUTION_WITHDRAW.WITHDRAW_CASH))
            .from(DISTRIBUTION_WITHDRAW)
            //状态：出账成功
            .where(DISTRIBUTION_WITHDRAW.STATUS.eq(WithdrawStatusEnum.SUCCESS.getStatus()))
            .and(DISTRIBUTION_WITHDRAW.USER_ID.eq(param.getUserId())).fetchOne();

        if (bigDecimalRecord1.value1() != null) {
            totalWithdraw = bigDecimalRecord1.value1();
        }
        withdrawRecordVo.setTotalWithdraw(totalWithdraw);

        SelectSeekStep1<Record9<Byte, BigDecimal, String, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp>, Timestamp> selectSeekStep1 =
            db().select(DISTRIBUTION_WITHDRAW.STATUS, DISTRIBUTION_WITHDRAW.WITHDRAW_CASH, DISTRIBUTION_WITHDRAW.REFUSE_DESC,
                        DISTRIBUTION_WITHDRAW.CHECK_TIME, DISTRIBUTION_WITHDRAW.REFUSE_TIME, DISTRIBUTION_WITHDRAW.BILLING_TIME,
                        DISTRIBUTION_WITHDRAW.FAIL_TIME, DISTRIBUTION_WITHDRAW.CREATE_TIME, DISTRIBUTION_WITHDRAW.DESC_TIME)
            .from(DISTRIBUTION_WITHDRAW)
            .where(DISTRIBUTION_WITHDRAW.USER_ID.eq(param.getUserId()))
            .orderBy(DISTRIBUTION_WITHDRAW.CREATE_TIME.desc());
        //提现记录分页展示
        PageResult<SingleWithdrawRecordVo> pageResult =
            this.getPageResult(selectSeekStep1, param.getCurrentPage(), param.getPageRows(), SingleWithdrawRecordVo.class);

        pageResult.dataList.stream().forEach(e -> {
            //处理状态 1待审核 2拒绝 3已审核待出账 4出账成功 5失败
            if (WithdrawStatusEnum.PENDING.getStatus().equals(e.getStatus())) {
                e.setCheckTime(e.getCreateTime());
            } else if (WithdrawStatusEnum.REFUSE.getStatus().equals(e.getStatus())) {
                e.setCheckTime(e.getRefuseTime());
            } else if (WithdrawStatusEnum.SUCCESS.getStatus().equals(e.getStatus())) {
                e.setCheckTime(e.getBillingTime());
            } else if (WithdrawStatusEnum.FAILURE.getStatus().equals(e.getStatus())) {
                e.setCheckTime(e.getFailTime());
            }
        });
        withdrawRecordVo.setWithdrawRecords(pageResult);
        return withdrawRecordVo;
    }

    /**
     * 用户真实姓名
     * @param userId
     * @return
     */
    public String getUserRealName(Integer userId){
        Record1<String> record = db().select(USER_DETAIL.REAL_NAME).from(USER_DETAIL).where(USER_DETAIL.USER_ID.eq(userId)).fetchOne();
        if(record != null){
            return record.into(String.class);
        }else{
            return null;
        }
    }

    /**
     * 分销员可提现金额
     * @param userId
     * @return
     */
    public BigDecimal canWithdraw(Integer userId){
        //用户余额
        BigDecimal account = db().select(USER.ACCOUNT).from(USER).where(USER.USER_ID.eq(userId)).fetchOne().into(BigDecimal.class);
        //返利金额
        BigDecimal totalMoney = BigDecimal.ZERO;
        Record1<BigDecimal> record = db().select(USER_TOTAL_FANLI.TOTAL_MONEY).from(USER_TOTAL_FANLI).where(USER_TOTAL_FANLI.USER_ID.eq(userId)).fetchOne();
        if(record != null){
            totalMoney = record.into(BigDecimal.class);
        }
        if(account.compareTo(totalMoney)>0){
            return totalMoney;
        }else{
            return account;
        }
    }

    public String getOpenIdFromMpOpenId(String linkOfficialAppId,String appId,String wxOpenid){
        com.vpu.mp.db.main.tables.records.MpOfficialAccountUserRecord mp = saas().shop.mpOfficialAccountUserService.getUser(appId, wxOpenid);
        if(mp != null){
            Record record = db().select().from(USER).where(USER.WX_OPENID.eq(wxOpenid)).fetchOne();
            if(record != null){
                UserRecord user = record.into(UserRecord.class);
                if(user.getWxUnionId() != null){
                    com.vpu.mp.db.main.tables.records.MpOfficialAccountUserRecord userByUnionId = saas().shop.mpOfficialAccountUserService.getUserByUnionId(appId, wxOpenid);
                    if(userByUnionId != null){
                        return userByUnionId.getOpenid();
                    }else{
                        return null;
                    }
                }
            }
        }
        return null;
    }

    /**
     * 查看开启中的分销员等级
     * @return
     */
    public List<DistributorLevelInfoVo> distributorLevelList() {
        Result<Record2<String, Byte>> fetch = db().select(DISTRIBUTOR_LEVEL.LEVEL_NAME, DISTRIBUTOR_LEVEL.LEVEL_ID).from(DISTRIBUTOR_LEVEL).where(DISTRIBUTOR_LEVEL.LEVEL_STATUS.eq((byte) 1)).fetch();
        if(fetch != null){
            return fetch.into(DistributorLevelInfoVo.class);
        }
        return null;
    }

    /**
     * 小程序端返利订单数
     * @param userId
     * @return
     */
    public Integer getRebateOrderNum(Integer userId){
        Integer rebateOrderNum = db().selectCount().from(ORDER_GOODS_REBATE).where(ORDER_GOODS_REBATE.REBATE_USER_ID.eq(userId)).fetchOne().into(Integer.class);
        return rebateOrderNum;
    }

    /**
     * 累积佣金信息（返利和待返利）
     */
    public List<RebateOrderVo.RebateOrderInfo> totalRebateMoney(Integer userId){
        List<RebateOrderVo.RebateOrderInfo> allRebate = db().select(ORDER_GOODS_REBATE.ORDER_SN,sum(ORDER_GOODS_REBATE.REAL_REBATE_MONEY).as("rebateMoney"),ORDER_INFO.SETTLEMENT_FLAG).from(ORDER_GOODS_REBATE)
            .leftJoin(ORDER_INFO).on(ORDER_GOODS_REBATE.ORDER_SN.eq(ORDER_INFO.ORDER_SN))
            .where(ORDER_GOODS_REBATE.REBATE_USER_ID.eq(userId)).groupBy(ORDER_GOODS_REBATE.ORDER_SN,ORDER_INFO.SETTLEMENT_FLAG).fetch().into(RebateOrderVo.RebateOrderInfo.class);
        return allRebate;
    }

    public BigDecimal rebateGoodsMoney(Integer userId){
        BigDecimal rebateGoodsMoney = BigDecimal.ZERO;
        List<RebateOrderVo.RebateOrderInfo> all = db().select(ORDER_GOODS.ORDER_SN, sum(ORDER_GOODS.CAN_CALCULATE_MONEY).as("canCalculateMoney"))
            .from(ORDER_GOODS_REBATE)
            .leftJoin(ORDER_GOODS).on(ORDER_GOODS_REBATE.ORDER_SN.eq(ORDER_GOODS.ORDER_SN))
            .where(ORDER_GOODS_REBATE.REBATE_USER_ID.eq(userId))
            .groupBy(ORDER_GOODS_REBATE.ORDER_SN,ORDER_GOODS.ORDER_SN).fetch().into(RebateOrderVo.RebateOrderInfo.class);
        for (RebateOrderVo.RebateOrderInfo item:all){
            if(item.getCanCalculateMoney() != null){
                rebateGoodsMoney = rebateGoodsMoney.add(item.getCanCalculateMoney());
            }
        }
        return rebateGoodsMoney;
    }



    /**
     * 分销员佣金排行榜
     * @param param
     * @return
     */
    public RebateRankingListVo getRebateRankingList(RebateRankingParam param){
        RebateRankingListVo rebateRankingListVo = new RebateRankingListVo();
        //当前分销员排名
        Integer rebateRanking = this.getRebateRanking(param.getUserId());
        rebateRankingListVo.setRanking(rebateRanking);
        //当前分销员返利信息
        UserRebateVo userRebate = getUserRebate(param.getUserId());
        rebateRankingListVo.setDistributorLevel(userRebate.getLevelName());
        if(DEFAULT_USER_AVATAR.equals(userRebate.getUserAvatar())){
            rebateRankingListVo.setUserAvatar(imageUrl(userRebate.getUserAvatar()));
        }else{
            rebateRankingListVo.setUserAvatar(userRebate.getUserAvatar());
        }
        rebateRankingListVo.setTotalRebateMoney(userRebate.getFinalMoney());
        rebateRankingListVo.setUsername(userRebate.getUsername());

        BigDecimal finalMoney = BigDecimal.ZERO;
        SelectConditionStep<? extends Record> fetch = db().select(USER.USER_ID, USER_TOTAL_FANLI.USER_ID, USER_TOTAL_FANLI.FINAL_MONEY, USER.USERNAME, USER_DETAIL.USER_AVATAR)
            .from(USER_TOTAL_FANLI)
            .leftJoin(USER).on(USER_TOTAL_FANLI.USER_ID.eq(USER.USER_ID))
            .leftJoin(USER_DETAIL).on(USER_TOTAL_FANLI.USER_ID.eq(USER_DETAIL.USER_ID))
            .where(USER_TOTAL_FANLI.FINAL_MONEY.gt(finalMoney));

        if(param.getNav() == 1){
            fetch.and(USER.DISTRIBUTOR_LEVEL.eq(userRebate.getLevelId()));
        }
        Result<? extends Record> record = fetch.orderBy(USER_TOTAL_FANLI.FINAL_MONEY.desc()).fetch();
        if(record != null){
            List<RebateRankingListVo.RebateList> into = record.into(RebateRankingListVo.RebateList.class);
            rebateRankingListVo.setRebateList(into);
            for (RebateRankingListVo.RebateList item : into){
                Integer ranking = this.getRebateRanking(item.getUserId());
                item.setRanking(ranking);
                if(item.getUserAvatar() != null && item.getUserAvatar().equals(DEFAULT_USER_AVATAR)) {
                    item.setUserAvatar(imageUrl(item.getUserAvatar()));
                }
            }
        }
        return rebateRankingListVo;
    }
    /**
     * 获取分销员上传的微信二维码
     * @param distributorId 分销员id
     * @return 如果返回null说明当前分销员不存在微信二维码
     */
    public UploadedImageDo getDistributorImage(Integer distributorId) {
        List<UploadedImageDo> imageList = uploadedImageDao.getValidImageByUserId(distributorId);
        if (imageList != null && imageList.size() > 0) {
            imageList = imageList.stream().filter(img -> img.getImgName().startsWith(DistributionConstant.DISTRIBUTOR_IMAGE_PREFIX)).collect(Collectors.toList());
            if (imageList.size() > 0) {
                return imageList.get(0);
            }
        }

        return null;
    }



}

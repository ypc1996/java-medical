package com.vpu.mp.controller.admin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vpu.mp.service.foundation.data.JsonResult;
import com.vpu.mp.service.foundation.util.PageResult;
import com.vpu.mp.service.pojo.shop.market.commentaward.CommentAwardIdParam;
import com.vpu.mp.service.pojo.shop.market.commentaward.CommentAwardListParam;
import com.vpu.mp.service.pojo.shop.market.commentaward.CommentAwardListVo;
import com.vpu.mp.service.pojo.shop.market.commentaward.CommentAwardParam;

/**
 * 评价有礼
 *
 * @author 孔德成
 * @date 2019/8/20 9:52
 */
@RestController
@RequestMapping("/api/admin/market/comment/award")
public class AdminCommentAwardController extends AdminBaseController {

    /**
     *  添加
     * @param param CommentAwardParam
     * @return Json
     */
    @PostMapping("/add")
    public JsonResult addCommentAwardActivity(@RequestBody  CommentAwardParam param) {
        int flag = shop().commentAward.addCommentAwardActivity(param);
        if (flag==0){
            return fail();
        }
        return success();
    }

    /**
     * 跟新
     * @param param CommentAwardActivity
     * @return json
     */
    @PostMapping("/update")
    public JsonResult updateCommentAwardActivity(@RequestBody CommentAwardParam param){
        int flag = shop().commentAward.updateCommentAwardActivity(param);
        if (flag==0){
            return fail();
        }
        return success();
    }

    /**
     * 跟新状态
     * @param param id
     * @return  json
     */
    @PostMapping("/change/status")
    public JsonResult changeCommentAwardActivity( @RequestBody CommentAwardIdParam param){
        int flag = shop().commentAward.changeCommentAwardActivity(param.getId());
        if (flag==0){
            return fail();
        }
        return success();
    }

    /**
     * 查询活动详情
     * @param param id
     * @return json
     */
    @PostMapping("/get")
    public JsonResult getCommentAwardActivity( @RequestBody CommentAwardIdParam param){
        shop().commentAward.getCommentAwardActivity(param.getId());
        return success();
    }

    /**
     * 查询活动列表
     * @param param
     * @return
     */
    @PostMapping("/list")
    public JsonResult getCommentAwardActivityList( @RequestBody CommentAwardListParam param){
        PageResult<CommentAwardListVo> pageResult = shop().commentAward.getCommentAwardActivityList(param);
        return success(pageResult);
    }


}

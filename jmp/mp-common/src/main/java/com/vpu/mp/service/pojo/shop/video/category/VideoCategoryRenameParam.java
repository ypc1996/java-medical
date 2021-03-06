package com.vpu.mp.service.pojo.shop.video.category;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.vpu.mp.common.foundation.data.JsonResultMessage;

/**
 * @author 孔德成
 * @date 2019/7/15 17:29
 */
@Data
@NoArgsConstructor
public class VideoCategoryRenameParam {
    @NotNull(message = JsonResultMessage.MSG_IMAGE_CATEGORY_IMGCATID_NOT_NULL)
    private Integer videoCatId;
    @NotBlank(message = JsonResultMessage.MSG_IMAGE_CATEGORY_IMGCATNAME_NOT_NULL)
    private String videoCatName;
}

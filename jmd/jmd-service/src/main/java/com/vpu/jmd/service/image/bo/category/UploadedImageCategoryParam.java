/*
 * This file is generated by jOOQ.
 */
package com.vpu.jmd.service.image.bo.category;


import com.vpu.mp.service.foundation.data.JsonResultMessage;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author 新国，孔德成
 */
@Data
@NoArgsConstructor
public class UploadedImageCategoryParam {

    @NotNull(message = JsonResultMessage.MSG_IMAGE_CATEGORY_IMGCATID_NOT_NULL)
    private Integer imgCatId;
    @NotNull(message = JsonResultMessage.MSG_IMAGE_CATEGORY_IMGCATPARENTID_NOT_NULL)
    private Integer imgCatParentId;
    private Integer sort;

}

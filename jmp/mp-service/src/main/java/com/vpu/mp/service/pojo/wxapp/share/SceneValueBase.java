package com.vpu.mp.service.pojo.wxapp.share;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * scene值对应类
 * @author 李晓冰
 * @date 2020年06月17日
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SceneValueBase {
    private Integer uid;
    private Integer gid;
    private Integer aid;
    private Byte atp;
}

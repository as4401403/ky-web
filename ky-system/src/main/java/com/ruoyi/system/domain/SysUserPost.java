package com.ruoyi.system.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户和岗位关联 sys_user_post
 * 
 * @author ruoyi
 */
@Data
@NoArgsConstructor
public class SysUserPost implements Serializable
{
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    private Long userId;
    
    /** 岗位ID */
    private Long postId;
}

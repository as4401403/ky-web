package com.ruoyi.system.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户和角色关联 sys_user_role
 * 
 * @author ruoyi
 */
@Data
@NoArgsConstructor
public class SysUserRole implements Serializable
{
    /** 用户ID */
    private Long userId;
    
    /** 角色ID */
    private Long roleId;
}

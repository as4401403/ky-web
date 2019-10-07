package com.ruoyi.system.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 角色和部门关联 sys_role_dept
 * 
 * @author ruoyi
 */
@Data
@NoArgsConstructor
public class SysRoleDept implements Serializable
{
    /** 角色ID */
    private Long roleId;
    
    /** 部门ID */
    private Long deptId;

}

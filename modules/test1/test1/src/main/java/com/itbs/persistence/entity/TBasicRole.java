package com.itbs.persistence.entity;

public class TBasicRole {
    private Integer id;

    private String roleCode;

    private String roleName;

    private Object roleDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Object getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(Object roleDesc) {
        this.roleDesc = roleDesc;
    }
}
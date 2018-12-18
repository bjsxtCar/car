package com.bjsxt.pojo;


public class Roles
{
    private long roleId;
    private String roleName;
    private Boolean isDelete;

    public Roles()
    {
    }

    public Roles(long roleId, String roleName, Boolean isDelete)
    {
        this.roleId = roleId;
        this.roleName = roleName;
        this.isDelete = isDelete;
    }

    public long getRoleId()
    {
        return roleId;
    }

    public void setRoleId(long roleId)
    {
        this.roleId = roleId;
    }

    public String getRoleName()
    {
        return roleName;
    }

    public void setRoleName(String roleName)
    {
        this.roleName = roleName;
    }

    public Boolean isDelete()
    {
        return isDelete;
    }

    public void setDelete(Boolean delete)
    {
        isDelete = delete;
    }
}

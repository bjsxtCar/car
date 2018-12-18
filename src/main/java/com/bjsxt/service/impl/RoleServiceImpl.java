package com.bjsxt.service.impl;

import com.bjsxt.mapper.RolesMapper;
import com.bjsxt.pojo.Roles;
import com.bjsxt.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService
{
    private RolesMapper rolesMapper;
    @Autowired
    public void setRolesMapper(RolesMapper rolesMapper)
    {
        this.rolesMapper = rolesMapper;
    }

    @Override
    public List<Roles> getAllRoles()
    {
        return rolesMapper.getAllRoles();
    }
}

package com.bjsxt.mapper;

import com.bjsxt.pojo.Roles;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolesMapper
{
    public List<Roles> getAllRoles();
}

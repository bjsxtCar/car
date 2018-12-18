package com.bjsxt.controller;

import com.bjsxt.pojo.Roles;
import com.bjsxt.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RoleController
{
    private IRoleService iRoleService;
    @Autowired
    public void setiRoleService(IRoleService iRoleService)
    {
        this.iRoleService = iRoleService;
    }

    @RequestMapping("/getAllRoles")
    public ModelAndView getAllRoles(ModelAndView mv)
    {
        List<Roles> roles = iRoleService.getAllRoles();
        mv.addObject("allRoles",roles);
        mv.setViewName("AllRoles");
        return mv;
    }
}

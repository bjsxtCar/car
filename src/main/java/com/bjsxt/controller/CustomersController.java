package com.bjsxt.controller;

import com.bjsxt.pojo.Customers;
import com.bjsxt.service.ICustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomersController
{
    private ICustomersService service;
    @Autowired
    public void setService(ICustomersService service)
    {
        this.service = service;
    }

    @RequestMapping("/toGetCustomerByIdPage")
    ModelAndView toGetCustomerByIdPage(ModelAndView mv)
    {
        mv.setViewName("GetCustomerByIdPage");
        return mv;
    }

    @RequestMapping(value = "/getCustomerById",produces = "application/json;charset=UTF-8")
    @ResponseBody
    Customers getCustomerById(@RequestParam("customerId") String id)
    {
//        Customers result = service.getCustomerById(id);
        return service.getCustomerById(id);
    }
}

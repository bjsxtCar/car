package com.bjsxt.service.impl;

import com.bjsxt.mapper.CustomersMapper;
import com.bjsxt.pojo.Customers;
import com.bjsxt.service.ICustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService implements ICustomersService
{
    private CustomersMapper mapper;
    @Autowired
    public void setMapper(CustomersMapper mapper)
    {
        this.mapper = mapper;
    }

    @Override
    public Customers getCustomerById(String id)
    {
        return mapper.getCustomerById(id);
    }
}

package com.bjsxt.mapper;

import com.bjsxt.pojo.Customers;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersMapper
{
    Customers getCustomerById(@Param("id") String id);
}

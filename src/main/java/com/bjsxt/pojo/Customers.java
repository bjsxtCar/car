package com.bjsxt.pojo;

import com.bjsxt.pojo.enums.Sex;

public class Customers
{
    private String customerId;
    private String customerName;
    private Sex sex;
    private String address;
    private String phone;
    private String career;
    private String customerPwd;

    public Customers()
    {
    }

    public Customers(String customerId, String customerName, Sex sex, String address, String phone, String career, String customerPwd)
    {
        this.customerId = customerId;
        this.customerName = customerName;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
        this.career = career;
        this.customerPwd = customerPwd;
    }

    public String getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(String customerId)
    {
        this.customerId = customerId;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public Sex getSex()
    {
        return sex;
    }

    public void setSex(Sex sex)
    {
        this.sex = sex;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getCareer()
    {
        return career;
    }

    public void setCareer(String career)
    {
        this.career = career;
    }

    public String getCustomerPwd()
    {
        return customerPwd;
    }

    public void setCustomerPwd(String customerPwd)
    {
        this.customerPwd = customerPwd;
    }
}

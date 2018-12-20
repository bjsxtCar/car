package com.bjsxt.pojo;

import com.bjsxt.pojo.enums.Sex;

public class User
{
    private String userId;
    private String userName;
    private String fullName;
    private Sex sex;
    private String address;
    private String phone;
    private String position;
    private Integer userLevel;
    private String userPwd;

    public User()
    {
    }

    public User(String userId, String userName, String fullName, Sex sex, String address, String phone, String position, Integer userLevel, String userPwd)
    {
        this.userId = userId;
        this.userName = userName;
        this.fullName = fullName;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
        this.position = position;
        this.userLevel = userLevel;
        this.userPwd = userPwd;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
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

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public Integer getUserLevel()
    {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel)
    {
        this.userLevel = userLevel;
    }

    public String getUserPwd()
    {
        return userPwd;
    }

    public void setUserPwd(String userPwd)
    {
        this.userPwd = userPwd;
    }
}

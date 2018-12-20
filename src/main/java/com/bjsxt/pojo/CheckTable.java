package com.bjsxt.pojo;

import java.time.LocalDateTime;

public class CheckTable
{
    private String checkId;
    private LocalDateTime checkDate;
    private String field;
    private String problem;
    private Float paying;
    private User checkUser;
    private RentTable rentTable;

    public CheckTable()
    {
    }

    public CheckTable(String checkId, LocalDateTime checkDate, String field, String problem, Float paying, User checkUser, RentTable rentTable)
    {
        this.checkId = checkId;
        this.checkDate = checkDate;
        this.field = field;
        this.problem = problem;
        this.paying = paying;
        this.checkUser = checkUser;
        this.rentTable = rentTable;
    }

    public String getCheckId()
    {
        return checkId;
    }

    public void setCheckId(String checkId)
    {
        this.checkId = checkId;
    }

    public LocalDateTime getCheckDate()
    {
        return checkDate;
    }

    public void setCheckDate(LocalDateTime checkDate)
    {
        this.checkDate = checkDate;
    }

    public String getField()
    {
        return field;
    }

    public void setField(String field)
    {
        this.field = field;
    }

    public String getProblem()
    {
        return problem;
    }

    public void setProblem(String problem)
    {
        this.problem = problem;
    }

    public Float getPaying()
    {
        return paying;
    }

    public void setPaying(Float paying)
    {
        this.paying = paying;
    }

    public User getCheckUser()
    {
        return checkUser;
    }

    public void setCheckUser(User checkUser)
    {
        this.checkUser = checkUser;
    }

    public RentTable getRentTable()
    {
        return rentTable;
    }

    public void setRentTable(RentTable rentTable)
    {
        this.rentTable = rentTable;
    }
}

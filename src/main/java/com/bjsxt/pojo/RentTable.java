package com.bjsxt.pojo;

import java.time.LocalDateTime;

public class RentTable
{
    private String tableId;
    private Float imprest;
    private Float shouldPayPrice;
    private Float price;
    private LocalDateTime beginDate;
    private LocalDateTime shouldReturnDate;
    private LocalDateTime returnDate;
    private Integer rentFlag;
    private Customers customer;
    private Car car;
    private User user;

    public RentTable()
    {
    }

    public RentTable(String tableId, Float imprest, Float shouldPayPrice, Float price, LocalDateTime beginDate, LocalDateTime shouldReturnDate, LocalDateTime returnDate, Integer rentFlag, Customers customer, Car car, User user)
    {
        this.tableId = tableId;
        this.imprest = imprest;
        this.shouldPayPrice = shouldPayPrice;
        this.price = price;
        this.beginDate = beginDate;
        this.shouldReturnDate = shouldReturnDate;
        this.returnDate = returnDate;
        this.rentFlag = rentFlag;
        this.customer = customer;
        this.car = car;
        this.user = user;
    }

    public String getTableId()
    {
        return tableId;
    }

    public void setTableId(String tableId)
    {
        this.tableId = tableId;
    }

    public Float getImprest()
    {
        return imprest;
    }

    public void setImprest(Float imprest)
    {
        this.imprest = imprest;
    }

    public Float getShouldPayPrice()
    {
        return shouldPayPrice;
    }

    public void setShouldPayPrice(Float shouldPayPrice)
    {
        this.shouldPayPrice = shouldPayPrice;
    }

    public Float getPrice()
    {
        return price;
    }

    public void setPrice(Float price)
    {
        this.price = price;
    }

    public LocalDateTime getBeginDate()
    {
        return beginDate;
    }

    public void setBeginDate(LocalDateTime beginDate)
    {
        this.beginDate = beginDate;
    }

    public LocalDateTime getShouldReturnDate()
    {
        return shouldReturnDate;
    }

    public void setShouldReturnDate(LocalDateTime shouldReturnDate)
    {
        this.shouldReturnDate = shouldReturnDate;
    }

    public LocalDateTime getReturnDate()
    {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate)
    {
        this.returnDate = returnDate;
    }

    public Integer getRentFlag()
    {
        return rentFlag;
    }

    public void setRentFlag(Integer rentFlag)
    {
        this.rentFlag = rentFlag;
    }

    public Customers getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customers customer)
    {
        this.customer = customer;
    }

    public Car getCar()
    {
        return car;
    }

    public void setCar(Car car)
    {
        this.car = car;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}

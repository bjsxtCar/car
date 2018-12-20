package com.bjsxt.pojo;

public class Car
{
    private String carNumber;
    private String carType;
    private String color;
    private Float price;
    private Float rentPrice;
    private Float deposit;
    private Boolean isRenting;
    private String carDesc;
    private String carImg;

    public Car()
    {
    }

    public Car(String carNumber, String carType, String color, Float price, Float rentPrice, Float deposit, Boolean isRenting, String carDesc, String carImg)
    {
        this.carNumber = carNumber;
        this.carType = carType;
        this.color = color;
        this.price = price;
        this.rentPrice = rentPrice;
        this.deposit = deposit;
        this.isRenting = isRenting;
        this.carDesc = carDesc;
        this.carImg = carImg;
    }

    public String getCarNumber()
    {
        return carNumber;
    }

    public void setCarNumber(String carNumber)
    {
        this.carNumber = carNumber;
    }

    public String getCarType()
    {
        return carType;
    }

    public void setCarType(String carType)
    {
        this.carType = carType;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public Float getPrice()
    {
        return price;
    }

    public void setPrice(Float price)
    {
        this.price = price;
    }

    public Float getRentPrice()
    {
        return rentPrice;
    }

    public void setRentPrice(Float rentPrice)
    {
        this.rentPrice = rentPrice;
    }

    public Float getDeposit()
    {
        return deposit;
    }

    public void setDeposit(Float deposit)
    {
        this.deposit = deposit;
    }

    public Boolean getRenting()
    {
        return isRenting;
    }

    public void setRenting(Boolean renting)
    {
        isRenting = renting;
    }

    public String getCarDesc()
    {
        return carDesc;
    }

    public void setCarDesc(String carDesc)
    {
        this.carDesc = carDesc;
    }

    public String getCarImg()
    {
        return carImg;
    }

    public void setCarImg(String carImg)
    {
        this.carImg = carImg;
    }
}

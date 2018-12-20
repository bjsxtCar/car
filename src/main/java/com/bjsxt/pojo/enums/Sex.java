package com.bjsxt.pojo.enums;

import com.bjsxt.exception.SexNotFoundException;

public enum Sex
{
    MALE("1"),FEMALE("0");

    private String text;
    Sex(String text)
    {
        this.text = text;
    }

    @Override
    public String toString()
    {
        return text;
    }

    public static Sex getSexByText(String text) throws SexNotFoundException
    {
        Sex[] vals = Sex.values();
        for (Sex val:vals)
        {
            if (val.text.equals(text))
            {
                return val;
            }
        }

        throw new SexNotFoundException();
    }
}

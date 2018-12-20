package com.bjsxt.exception;

public class SexNotFoundException extends Exception
{
    public SexNotFoundException(String message)
    {
        super(message);
    }

    public SexNotFoundException(String message,Throwable cause)
    {
        super(message, cause);
    }

    public SexNotFoundException()
    {
        super();
    }
}

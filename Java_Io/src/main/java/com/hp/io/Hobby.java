package com.hp.io;

import java.io.Serializable;

public class Hobby implements Serializable
{

    private  static final long serialVersionUID = 88140507416128973L;

    String hobby1;
    String hobby2;

    public Hobby(String hobby1, String hobby2)
    {
        this.hobby1 = hobby1;
        this.hobby2 = hobby2;
    }

    public Hobby()
    {
    }

    public String getHobby1()
    {
        return hobby1;
    }

    public void setHobby1(String hobby1)
    {
        this.hobby1 = hobby1;
    }

    public String getHobby2()
    {
        return hobby2;
    }

    public void setHobby2(String hobby2)
    {
        this.hobby2 = hobby2;
    }

    @Override
    public String toString()
    {
        return "Hobby{" +
                "hobby1='" + hobby1 + '\'' +
                ", hobby2='" + hobby2 + '\'' +
                '}';
    }
}

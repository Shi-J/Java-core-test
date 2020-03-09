package com.hp.io;

import java.io.Serializable;

public class User  implements Serializable
{

    private  static final long serialVersionUID = 8814050741612894173L;

  static   String name;
   transient int age ;
    Hobby hobby;

    public User(String name, int age, Hobby hobby)
    {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public User()
    {
    }

    public User(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + hobby +
                '}';
    }
}

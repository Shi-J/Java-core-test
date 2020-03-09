package com.hp.reflect;

public class Person
{
    private String name ;
    int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Person()
    {
    }

    private Person(String name){

    }

    private String show(String name){
        System.out.println("我的名字是:" + name);
        return  name;
    }


}

package com.hp.reflect.reflect2;

import java.io.Serializable;

public class Creature<T> implements Serializable
{
    private String weight;
    public String height;

    public void eat(){
        System.out.println("生物在吃东西");
    }

    public void breathe(){
        System.out.println("生物呼吸");
    }

    public Creature (){

    }



}

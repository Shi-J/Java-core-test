package com.hp.dome.extendsdome.overridedome;

import java.io.IOException;
import java.sql.SQLOutput;

// 这是父类
public class Father {

    public static void main(String[] args)
    {

    }
    String major ;
    //  父类抛出异常
    public int getNum()  {

        return 0;
    }

    //  吃这个行为（方法）
    public void sleep(){
        System.out.println("我是父类我一般要睡7个小时");
    }

    //  父类私有的方法
    private void pvt(){
        System.out.println("这是我私有的方法");
    }


}

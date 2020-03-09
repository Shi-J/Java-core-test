package com.hp.dome.extendsdome;

//  这是一个生物类
public class Being {
    String name; // 生物的名字
    int age;  // 生物的性别
    private int foot; //  脚

    public int getFoot()
    {
        return foot;
    }

    public void setFoot(int foot)
    {
        this.foot = foot;
    }

    public void sleep(int foot){
        System.out.println(name+foot+"只脚，平躺着睡觉");
    }

}

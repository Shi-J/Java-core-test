package com.hp.dome.extendsdome.overridedome;

import java.io.IOException;

//这是子类
public class Son  extends  Father{
    //  子类重写父类的方法抛出的异常大于父类的异常
    public int getNum() {
        return  0;
    }

    //  无法重写父类私有方法
    private String pvt(){
        return "son";
    }
}

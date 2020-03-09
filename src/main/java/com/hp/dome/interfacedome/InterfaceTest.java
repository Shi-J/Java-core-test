package com.hp.dome.interfacedome;

import java.sql.SQLOutput;

public class InterfaceTest {
    public static void main(String[] args)
    {

    }
}

interface  InterfaceTest1{
    //  全局变量
    public static final String NAME="zs";
    int AGE =22;

    //  抽象方法
    public abstract  void getMethod1();

    void getMethod2();

}

class InterfaceTest2  implements InterfaceTest1 {

    @Override
    public void getMethod1()
    {

    }

    @Override
    public void getMethod2()
    {

    }
}








































interface  D{
    public abstract void getMethodD();
}

interface  E{
    public abstract void getMethodE();

}

//  接口之间的多继承
interface F extends D,E{

}












interface  A{
    public abstract void getMethodA();
}

interface  B{
    public abstract void getMethodB();

}

class c implements A,B{

    @Override
    public void getMethodA() {

    }

    @Override
    public void getMethodB() {

    }
}



package com.hp.dome.interfacedome;

public class InterfaceJava8 {
    public static void main(String[] args)
    {
        InterfaceJava8Test2 in2=new InterfaceJava8Test2();
//        in2.getStaticMethod1(); //静态方法无法实现类来调用 只能由接口本身来调用
        in2.getDefaultMethod2();
        InterfaceJava8Test1.getStaticMethod1(); //  接口本身调用静态方法
//        InterfaceJava8Test1.getDefaultMethod2(); //接口本身无法调用自身的默认方法
        in2.getDefaultMethod3();  // 输出结果为父类中的结果

    }

}

interface  InterfaceJava8Test1{
    //  静态方法
    public static void getStaticMethod1(){
        System.out.println("InterfaceJava8Test1的静态方法");
    }

    //  默认方法
    public   default  void getDefaultMethod2(){
        System.out.println("InterfaceJava8Test1的默认方法");
    }

    public  default void getDefaultMethod3(){
        System.out.println("InterfaceJava8Test1的默认方法2");
    }

}

interface  InterfaceJava8Test3{
    public  default void getDefaultMethod3(){
        System.out.println("InterfaceJava8Test1的默认方法2");
    }

}

class InterfaceJava8Test2   implements InterfaceJava8Test1,InterfaceJava8Test3{

    public     void getDefaultMethod2(){
        System.out.println("InterfaceJava8Test2的默认方法");
    }

    @Override
    public void getDefaultMethod3()
    {

    }

    public void myMethod(){
        InterfaceJava8Test1.super.getDefaultMethod3(); //   得到InterfaceJava8Test1中的getDefaultMethod3方法
    }

}

class InterfaceJava8Super{
    //  同名同参数的方法
    public   void getDefaultMethod3(){
        System.out.println("InterfaceJava8Super中的方法");
    }
}

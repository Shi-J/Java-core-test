package com.hp.dome.singleton;
/*
*
* 单例模式饿汉式
* */
public class SingletonTest1 {
    public static void main(String[] args)
    {
        SingletonDome1 singletonDome1 = SingletonDome1.singletonDome1;
        SingletonDome1 singletonDome2 = SingletonDome1.singletonDome1;
        System.out.println(singletonDome1==singletonDome2);
    }
}

//  饿汉式，一调用就拿到改对象
class SingletonDome1{
        //  1.  私有化构造器 目的外部无法创建实例
        private SingletonDome1(){}

        //  2.声明当前类的对象为static保证调用的是用一个实例，并初始化对象
        public final static SingletonDome1 singletonDome1=new SingletonDome1();

}

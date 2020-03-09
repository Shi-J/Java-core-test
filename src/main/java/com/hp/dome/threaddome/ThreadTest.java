package com.hp.dome.threaddome;

public class ThreadTest
{
    public static void main(String[] args)
    {
        //  3.实例化Thread类的子类对象
        MyThread myThread=new MyThread();
        //  利用start方法启动线程 ，不启动无法运行
        myThread.start();

    }
}

//  1. 继承Thread类
class MyThread extends  Thread{

    //  2.重写Thread类中的run方法
    @Override
    public void run()
    {
        int result = 0;
        for (int i = 1; i <=100 ; i++)
        {
            result = result + i;
        }
        System.out.println("1~100之间数之和为:"+Thread.currentThread().getName()+" :"+result);
    }
}


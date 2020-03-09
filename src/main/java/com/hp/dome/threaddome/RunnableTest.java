package com.hp.dome.threaddome;

import com.hp.dome.extendsdome.A;

import java.sql.SQLOutput;

public class RunnableTest {
    public static void main(String[] args)
    {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        thread.start();
        thread1.start();
        thread2.start();

//        A1 a1=new A1();
//        a1.start();
//
//        A2 a11=new A2();
//        a11.start();
//
//        A3 a111=new A3();
//        a111.start();


    }
}
class MyRunnable implements  Runnable{




      int a=100;
    @Override
    public void run()
    {
        synchronized (Object.class)
        {
            for (int i = 1; i < 100; i++)
            {
                System.out.println(Thread.currentThread().getName() + " * *" + i);
            }
        }
    }
}

class A1 extends  Thread{
    A2 a2=new A2();

    @Override
    public void run()
    {
        for (int i = 1; i <100 ; i++)
        {

            try
            {
                a2.join();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" * *"+i);

        }
    }
}

class A2 extends  Thread{
    A3 a3=new A3();
    @Override
    public void run()
    {
        for (int i = 1; i <100 ; i++)
        {
            try
            {
                a3.join();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" * *"+i);
        }
    }
}
class A3 extends  Thread{
    @Override
    public void run()
    {
        for (int i = 1; i <100 ; i++)
        {
            System.out.println(Thread.currentThread().getName()+" * *"+i);
        }
    }
}

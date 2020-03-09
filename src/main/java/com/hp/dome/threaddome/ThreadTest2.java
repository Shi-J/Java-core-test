package com.hp.dome.threaddome;

public class ThreadTest2{
    public static void main(String[] args)
    {
        MyThread2 myThread2 =new MyThread2();
        myThread2.setName("线程一");
        myThread2.setPriority(Thread.MAX_PRIORITY);
        myThread2.start();
        for (int i = 0; i <100 ; i++)
        {

            System.out.println(Thread.currentThread().getName() + "\t"+i);
            if(i == 50){
                try
                {
                    myThread2.join();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }


        }


    }
}

class MyThread2 extends  Thread{

    @Override
    public void run()
    {
        for (int i = 0; i <100; i++)
        {

                System.out.println(Thread.currentThread().getName() + "\t"+i);



        }
    }
}

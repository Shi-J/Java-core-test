package com.hp.dome.threaddome;

public class ThreadTest3
{
    public static void main(String[] args)
    {
        MyThread3 myThread3 = new MyThread3();
        Thread t1 = new Thread(myThread3);
        Thread t2 = new Thread(myThread3);


        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

class MyThread3 implements Runnable {
    private int result = 1; //    共享数据

    @Override
    public void run()
    {
        while (true){  //  循环打印
            synchronized (MyThread3.class)
            {
                notify(); //    唤醒被wait();方法阻塞的线程

                    if (result <= 100)
                    {
                        System.out.println(Thread.currentThread().getName() + "：打印:" + result);
                        result++;
                    }
                    else
                    {
                        break; //   退出当前循环
                    }

                try
                {
                    wait();  // 使用wait();方法第一个线程进入打印完一次之后就进入阻塞状态
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}

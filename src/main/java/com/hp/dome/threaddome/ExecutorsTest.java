package com.hp.dome.threaddome;

import java.util.concurrent.*;

public class ExecutorsTest {
    public static void main(String[] args)
    {
        //  1.创建线程池  newFixedThreadPool方法创建指定的线程个数
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //  2.创建对应的线程存放到线程池当中
        executorService.execute(new ExecutorsTest2()); //   实现Runnable接口
        executorService.execute(new ExecutorsTest3()); //   继承Thread类
        Future submit = executorService.submit(new ExecutorsTest4());//   实现Callable接口
        try
        {
            //  实现Callable接口得到返回结果
            Object o = submit.get();
            System.err.println(o);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        catch (ExecutionException e)
        {
            e.printStackTrace();
        }

        //  3.关闭线程池
        executorService.shutdown();

    }
}

//  2.1 创建线程
class ExecutorsTest2 implements  Runnable{


    @Override
    public void run()
    {
        for (int i=1 ;i<=100; i++){
            System.out.println(Thread.currentThread().getName()+": 打印第"+i+"次");
        }
    }
}

class ExecutorsTest3 extends  Thread{
    @Override
    public void run()
    {
        for (int i=1 ;i<=100; i++){
            System.out.println(Thread.currentThread().getName()+": 打印第"+i+"次");
        }
    }
}

class ExecutorsTest4 implements Callable
{

    @Override
    public Object call() throws Exception
    {

        for (int i=1 ;i<=100; i++){
            System.out.println(Thread.currentThread().getName()+": 打印第"+i+"次");
        }
        return "call方法执行完毕";
    }
}

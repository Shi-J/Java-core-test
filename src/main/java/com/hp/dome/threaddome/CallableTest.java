package com.hp.dome.threaddome;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest
{
    public static void main(String[] args)
    {
        //  3.实例化Callable接口的实现类
        CallableTest1 c1 = new CallableTest1();
        //  4.创建FutureTask
        FutureTask futureTask= new FutureTask(c1);
        //  5.创建Thread并启动线程
        new Thread(futureTask).start();

        try
        {
            //  得到Callable接口实现类中重写的call方法的返回值
            Object o = futureTask.get();
            System.out.println(o);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        catch (ExecutionException e)
        {
            e.printStackTrace();
        }

    }
}

//  1.实现Callable接口
class CallableTest1 implements Callable
{
    //  2.重写call方法
    @Override
    public Object call() throws Exception
    {
        int result = 0;
        for (int i = 1; i <=100 ; i++)
        {
            result += i;
        }
        return result;
    }
}


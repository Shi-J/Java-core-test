package com.hp.dome.singleton;
/*
*
* 单例模式懒汉式
* */
public class SingletonTest2 {
    public static void main(String[] args)
    {
        //  创建二个线程
        Thread thread1=new Thread(){
            @Override
            public void run()
            {
                SingletonDome2 singletonDome3 = SingletonDome2.getSingletonDome2();
                System.out.println("singletonDome3的地址值"+singletonDome3);
            }
        };

        Thread thread2=new Thread(){
            @Override
            public void run()
            {
                SingletonDome2 singletonDome4 = SingletonDome2.getSingletonDome2();
                System.out.println("singletonDome4的地址值"+singletonDome4);
            }
        };

        thread1.start();
        thread2.start();




    }
}

// 懒汉式，需要使用的时候在拿到改对象
class SingletonDome2{
        //  1.  私有化构造器 目的外部无法创建实例
        private SingletonDome2(){}

        //  2.声明当前类的对象为static，不立即创建对象
        private static SingletonDome2 singletonDome2=null;

        //  3.提供外部能获取到私有对象的方法,并且需要使用static来修饰，证明是共享的
        public static SingletonDome2 getSingletonDome2(){
                //  添加Java自带的锁，锁住该类
                synchronized (SingletonDome2.class)
                {
                    //  判断是否没有该对象的实例，如果没有就创建，如果有就使用原来的
                    if (singletonDome2 == null)
                    {
                        try
                        {
                            //  休眠时间变长，检查是否线程安全
                            Thread.sleep(1000);

                        }
                        catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }

                        singletonDome2 = new SingletonDome2();
                    }
                };
            return singletonDome2;
        }
}

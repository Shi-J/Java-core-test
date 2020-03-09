package com.hp.dome.threaddome;

public class SiSuo {
    public static void main(String[] args)
    {
        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        new Thread(){
            @Override
            public void run()
            {
                synchronized (sb1){
                    sb1.append("a");
                    sb2.append("c");
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                synchronized (sb2){
                    sb1.append("a");
                    sb2.append("c");
                }
            }
        }.start();


        new Thread(){
            @Override
            public void run()
            {
                synchronized (sb2){
                    sb1.append("a");
                    sb2.append("c");
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                synchronized (sb1){
                    sb1.append("a");
                    sb2.append("c");
                }
            }
        }.start();
    }
}

package com.hp;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdderssTest
{
    @Test
    public  void InetAdderssTest1()
    {

        try
        {
            InetAddress ia = InetAddress.getByName("www.baidu.com");
            System.out.println(ia);


            //  获取本机Ip 地址
            System.out.println(InetAddress.getByName("localhost"));

            System.out.println(InetAddress.getLocalHost());

            //  getHostName获取指定目标参数的域名，getHostAddress或者指定目标参数的ip
            System.out.println(ia.getHostName());
            System.out.println(ia.getHostAddress());
        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
        }



    }
}

package com.hp;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest
{
    @Test
    public void urlTest1()
    {
        try
        {
            URL url = new URL("http://172.0.0.1:8080/user?name=zs && age =23");
            //public String getProtocol()获取该URL的协议名
            System.out.println(url.getProtocol());

            //public String getHost()获取该URL的主机名
            System.out.println(url.getHost());

            //public String getPort( )获取该URL的端口号
            System.out.println(url.getPort());

            //public String getPath( )获取该URL的文件路径
            System.out.println(url.getPath());

             //public String getFile( )获取该URL的文件名
            System.out.println(url.getFile());

            //public String getQuery()获取该URL的查询名
            System.out.println(url.getQuery());

        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }

    }
}

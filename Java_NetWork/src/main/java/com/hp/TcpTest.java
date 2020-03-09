package com.hp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpTest
{
    // 服务端
    @Test
    public void tcpServer(){
        ServerSocket ssc = null;
        Socket accept = null;
        InputStream is = null;
        ByteArrayOutputStream bao = null;
        try
        {
            //  1.创建服务器端口号
            ssc = new ServerSocket(3698);
            //  2.接收客户端的Socket
             accept = ssc.accept();
            //  3.得到客户端socket并得到他传输过来的数据
             is = accept.getInputStream();
            //  4.处理相应的数据
             bao =new ByteArrayOutputStream();
            byte [] buffer =new byte[20];
            int len = 0;
            while ( (len= is.read(buffer) )!= -1){
                bao.write(buffer, 0 ,len);
            }
            System.out.println(bao.toString());

            System.out.println(accept.getInetAddress().getHostAddress() + "发来的信息");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(bao != null){
                try
                {
                    bao.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

            if(is  != null ){
                try
                {
                    is.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

            if(accept != null){
                try
                {
                    accept.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

            if(ssc != null){
                try
                {
                    ssc.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }


    //客户端
    @Test
    public void tcpClient(){
        InetAddress ia = null;
        Socket sk = null;
        OutputStream os = null;
        try
        {
            //  1.创建客户端 指定需要连接的服务端ip 及进程端口
             ia =InetAddress.getByName("127.0.0.1");
             sk =new Socket(ia,3698);
            //  2.创建对应的流
             os = sk.getOutputStream();
            //  3.进行数据操作
            os.write("您好我是石同学 ..".getBytes());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(os != null ){
                try
                {
                    os.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if(sk !=null){
                try
                {
                    sk.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

        }


    }
}

package com.hp;

import org.junit.Test;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpTest
{

    //  接收端
    @Test
    public void udpReceive(){
        DatagramSocket ds = null;
        try
        {
            ds =new DatagramSocket(9090);
            byte [] data =new byte[1024];
            DatagramPacket dp =new DatagramPacket(data,0,data.length);

            ds.receive(dp);
            System.out.println(new String(dp.getData(),0,dp.getLength()));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(ds != null){
                ds.close();
            }
        }
    }

    //  发送端
    @Test
    public void udpSend(){
        DatagramSocket ds = null;
        try
        {
             ds =new DatagramSocket();
            String str= "我是udp方式";
            byte [] data =str.getBytes();
            InetAddress ia=InetAddress.getLocalHost();
            DatagramPacket dp =new DatagramPacket(data,0,data.length,ia,9090);

            ds.send(dp);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(ds != null){
                ds.close();
            }
        }
    }



}

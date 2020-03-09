package com.hp.io;

import org.junit.Test;

import java.io.*;

public class DataInputAndOutput
{

    @Test
    public void dataOutputStreamTest(){
        //  1.创建指定流 ，并指定操作的目标对象
        DataOutputStream dos = null;
        try
        {
            dos = new DataOutputStream(new FileOutputStream("data.txt"));

            //  2.操作对应的数据
            dos.writeUTF("石头"); //  writeUTF传入字符串
            dos.writeInt(23);
            dos.writeBoolean(true);

            dos.flush();   //   强制刷新流
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            //  3.流的关闭操作
            try
            {
                if(dos != null)
                dos.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void dataInputStreamTest(){

        DataInputStream dis = null;
        try
        {
            //  1.创建指定流 ，并指定操作的目标对象
            dis = new DataInputStream(new FileInputStream("data.txt"));

            //  2.操作对应的数据  ,在读取数据的时候要和写入的数据顺序一致， 不一致会出现数据错误，或者程序错误
            String name = dis.readUTF();
            int age = dis.readInt();
            boolean b = dis.readBoolean();

            System.out.println("name = "+ name +"\tage = " + age + "\tsex = " +b);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            //  3.流的关闭操作
            try
            {
                if(dis != null)
                    dis.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }


    }
}

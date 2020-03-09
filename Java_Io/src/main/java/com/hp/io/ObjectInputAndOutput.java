package com.hp.io;

import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import java.io.*;

public class ObjectInputAndOutput
{
    @Test
    public  void objectOutputStream(){
        ObjectOutputStream oos = null;
        try
        {
            //  1.创建流
             oos =new ObjectOutputStream(new FileOutputStream("Object.txt"));

            //  2.操作数据
            User user=new User("zs",13);
            User user2=new User("zs",13,new Hobby("足球","篮球"));

            oos.writeObject(user);
            oos.writeObject(user2);
            oos.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            //  3.关闭流
            try
            {
                if(oos != null)
                oos.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
    }




    @Test
    public  void objectInputStream(){
        ObjectInputStream ois = null;
        try
        {
            //  1.创建流
            ois =new ObjectInputStream(new FileInputStream("Object.txt"));

            //  2.操作数据
            Object object = ois.readObject();
            Object object1 = ois.readObject();
            System.out.println(object);
            System.out.println(object1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            //  3.关闭流
            try
            {
                if(ois != null)
                    ois.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
    }
}

package com.hp.io;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamAndFileOutputStrame
{
    @Test
    public void FileInputStreamTest(){
        FileInputStream fis = null;
        //  1.指定需要操作的文件
        try
        {
            File file=new File("hello.txt");
            //  2.创建具体需要使用的流
             fis=new FileInputStream(file);
            //  3.对数据进行操作
            byte [] bytes=new byte[5];
            int len = 0;
           while ((len = fis.read(bytes)) != -1){
               String str= new String(bytes ,0,len);
               System.out.print(str);
           }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //  4.流的关闭
                if(fis !=null){
                    fis.close();
                }

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }


    }


    @Test
    public void FileOutputStreamTest(){

        FileInputStream fis =null;
        FileOutputStream fos = null;
        try
        {
            File file1= new File("io.png");
            File file2= new File("io2.png");

             fis =new FileInputStream(file1);
             fos= new FileOutputStream(file2);

            int read = fis.read();
            while (read != -1){
                fos.write(read);
                read = fis.read();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {

            try
            {
                if(fis !=null)
                fis.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            try
            {
                if( fos!=null)
                    fos.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }


    }
}

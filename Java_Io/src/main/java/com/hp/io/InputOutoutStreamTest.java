package com.hp.io;

import org.junit.Test;

import java.io.*;
import java.time.format.FormatStyle;

public class InputOutoutStreamTest
{

    @Test
    public void inputStreamReaderTest(){
        InputStreamReader isr= null;
        try
        {
            //  1. 指定需要操作的目标对象，创建需要的流
            FileInputStream is=new FileInputStream("hello.txt");

//            isr = new InputStreamReader(is);
            //  指定编码参数

            //  2.创建对应的转换流
            isr = new InputStreamReader(is,"UTF-8");

            //  3.操作数据
            int read = isr.read();
            while (read != -1){
                System.out.print((char) read);
                read= isr.read();
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
                //  4.流关闭
                if(isr != null)
                isr.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void outputStreamWriter(){
        OutputStreamWriter osw = null;
        try
        {
            FileOutputStream fos= new FileOutputStream("hello4.txt");

            osw = new OutputStreamWriter(fos);

            osw.write("OutputStreamWriter 操作");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(osw != null)
                osw.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void ioStream(){
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try
        {
            //  1.创建对应的流
            FileInputStream fis=new FileInputStream("hello.txt");
            FileOutputStream fos =new FileOutputStream("hello5.txt");

             isr=new InputStreamReader(fis,"UTF-8");
             osw= new OutputStreamWriter(fos,"gbk");

            //  2.操作对应的数据
            int read = isr.read();
            while (read != -1){
                osw.write(read);
                read = isr.read();
            }
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
                if(isr != null)
                isr.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            try
            {
                if(isr != null)
                osw.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }




    }

}

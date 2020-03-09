package com.hp.io;

import org.junit.Test;

import javax.annotation.processing.Filer;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAnWirterTest
{


    @Test
    public void readerTest1()
    {
        /**
         *
         *    注意事项： 1. 因为流是比较耗资源的，为了保证流的关闭，我们可以使用 try - catch -finally进行流的关闭操作
         *              2. 为了保证数据能够找到我们必须在File实例化文件路径的时候要存在
         */

        FileReader fr = null;
        try
        {
            //  1.实例化File对象，指名需要操作的对象
            File file = new File("F:\\io\\hello.txt");
            //  2.提供具体操作流 , 传入需要操作的对象
            fr = new FileReader(file);

            //  3.进行数据的操作
            int read = fr.read();   //  read()：返回读入的一个字符，如果找到文件的末尾位置，就返回 -1
            while (read != -1)
            {
                System.out.print((char) read);
                read=fr.read();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            //  4.关闭流，释放资源
            try
            {
                if (fr != null)
                {
                    fr.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }


    }


    @Test
    public void writerTest1()
    {
        /**
         *
         *    注意事项： 1. 因为流是比较耗资源的，为了保证流的关闭，我们可以使用 try - catch -finally进行流的关闭操作
         *              2. 使用输入流时，如果文件不存在会自动给你创建
         *                  如果文件存在并且输入流调用的参数  FileWriter(file,false) 或者 FileWriter(file)那么在次执行会覆盖原有的数据
         *                                  如果调用的参数  FileWriter(file,true)那么在次执行不会覆盖原有的数据
         */

        FileWriter fw = null;
        try
        {
            //  1.实例化File对象，指名需要操作的对象
            File file = new File("F:\\io\\hello2.txt");
            //  2.提供具体操作流 , 传入需要操作的对象
            fw = new FileWriter(file,true);

            //  3.进行数据的操作
           fw.write("写入数据1\n");
           fw.write("写入数据2");
            System.out.println("写入成功");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            //  4.关闭流，释放资源
            try
            {
                if (fw != null)
                {
                    fw.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void readerAndwriterTest(){
        //  文本赋值操作
        FileReader fr= null;
        FileWriter fw= null;
        try
        {
            //  1.创建File类，指名要操作的文件
            File file1=new File("hello.txt");
            File file2=new File("hello2.txt");

            //  2.提供具体操作流 , 传入需要操作的File对象文件
            fr= new FileReader(file1); // 读入流
             fw=new FileWriter(file2); // 写出流

            //  3.进行数据的操作
            int read = fr.read();   //  read()：返回读入的一个字符，如果找到文件的末尾位置，就返回 -1
            while (read != -1)
            {
                fw.write((char)read);
                read=fr.read();

            }


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            //  4.流的关闭
            if(fr !=null){
                try
                {
                    fr.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

            if(fw !=null){
                try
                {
                    fw.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

    }
}

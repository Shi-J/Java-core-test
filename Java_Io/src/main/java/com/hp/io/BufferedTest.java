package com.hp.io;

import org.junit.Test;

import javax.annotation.processing.Filer;
import java.io.*;
import java.lang.reflect.WildcardType;

public class BufferedTest
{
    @Test
    public void BufferdTest1(){
        long l1 = System.currentTimeMillis();


        BufferedReader br =null;
        BufferedWriter bw = null;
        //  1.指定目标资源
        try
        {
            File file1 =new File("hello.txt");
            File file2 = new File("hello3.txt");

            //  2.创建对应的流
            //  2.1 .创建节点流
            FileReader fr=new FileReader(file1);
            FileWriter fw= new FileWriter(file2);
            //  2.2 .创建处理流（缓存流）
             br = new BufferedReader(fr);
             bw= new BufferedWriter(fw);

            //  3. 操作数据
            int read = br.read();
            while (read!=-1){
                bw.write(read);
                read= br.read();
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
                if(br!=null)
                br.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            try
            {
                if(bw!=null)
                    bw.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        long l2= System.currentTimeMillis();

        System.out.println(l2-l1);

    }

    @Test
    public void BufferdTest2(){
        long l1 = System.currentTimeMillis();
        FileReader fr= null;
        FileWriter fw = null;
        //  1.指定目标资源
        try
        {
            File file1 =new File("hello.txt");
            File file2 = new File("hello3.txt");

            //  2.创建对应的流
            //  2.1 .创建节点流
             fr=new FileReader(file1);
             fw= new FileWriter(file2);

            //  3. 操作数据
            int read = fr.read();
            while (read!=-1){
                fw.write(read);
                read= fr.read();
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
                if(fr!=null)
                    fr.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            try
            {
                if(fw!=null)
                    fw.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        long l2= System.currentTimeMillis();

        System.out.println(l2-l1);

    }
}

package com.hp.io;

import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomAccessFileTest
{
    @Test
    public void RandomAccessFile1(){
        RandomAccessFile raf1 =null;
        RandomAccessFile raf2=null;
        try
        {
             raf1 =new RandomAccessFile("io.png","r");
             raf2 =new RandomAccessFile("io3.png","rw");

            int read = raf1.read();
            while (read != -1){
                raf2.write((char)read);
                read = raf1.read();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(raf1 != null){
                try
                {
                    raf1.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }


            if(raf2 != null){
                try
                {
                    raf2.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }


    }


    @Test
    public void RandomAccessFile2(){
        RandomAccessFile raf1 =null;
        try
        {
            raf1 =new RandomAccessFile("hello.txt","rw");

            raf1.write("abc".getBytes());

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (raf1 != null)
            {
                try
                {
                    raf1.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}

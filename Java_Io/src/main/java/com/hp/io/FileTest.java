package com.hp.io;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Date;

public class FileTest
{

    @Test
    public void dome1(){
        File file1=new File("F:\\io\\dome1.txt");
        File file2=new File("hi.txt");
        System.out.println(file1);
        System.out.println(file2);
    }

    /*
    * String getAbsolutePath 获取抽象路径的绝对路径以字符串形式
    * File getAbsoluteFile  获取抽象路径的绝对路径以File形式
    * String  getPath 获取文件路径
    * String getName 获取文件名称
    * String getParent 返回上一层目录如果没有则返回 null。
    * Long length   返回文件中长度 （即字节数） 。无法获取目录的长度
    * Long  lastModified    获取最后一次修改的时间，单位为毫秒
    * list方法获取该文件下的所有文件名 ， 以字符串的形式显示
    * listFiles方法获取该文件下的所有文件名 ， 绝对路径的形式显示
    * boolean renameTo 文件重命名为指定的文件路径
    *   比如 file1.renameTo(file2)为例：
    *       要想保证为true，需要file1在文件中存在，file2在文件中不存在。
    *
    * */
    @Test
    public void dome2(){
        File file1=new File("hello.txt");
        File file2=new File("F:\\io\\hi.txt");
        File file3=new File("E:\\BaiduNetdiskDownload");
        //  String getAbsolutePath 获取抽象路径的绝对路径以字符串形式
        System.out.println(file1.getAbsolutePath());
        //  File getAbsoluteFile  获取抽象路径的绝对路径以File形式
        System.out.println(file1.getAbsoluteFile());
        //  String  getPath 获取文件路径
        System.out.println(file1.getPath());
        //  String getName 获取文件名称
        System.out.println(file1.getName());
        //  String getParent 返回上一层目录如果没有则返回 null。
        System.out.println(file1.getParent());
        //  Long length   返回文件中长度 （即字节数） 。无法获取目录的长度
        System.out.println(file1.length());
        //  Long  lastModified    获取最后一次修改的时间，单位为毫秒
        System.out.println(new Date(file1.lastModified()));

        System.out.println("================================");

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());

        //  list方法获取该文件下的所有文件名 ， 以字符串的形式显示
        String[] list = file3.list();
        for(String s : list){
            System.out.println(s);
        }

        //  listFiles方法获取该文件下的所有文件名 ， 绝对路径的形式显示
        File[] files = file3.listFiles();
        for(File file : files){
            System.out.println(file);
        }


    }


    @Test
    public void  dome3(){
        File file=new File("hello.txt");
        File file1=new File("F:\\io\\hi.txt");

        boolean renameTo = file.renameTo(file1);
        System.out.println(renameTo);
    }

    /*
    * boolean isDirectory 判断是否为文件目录
    * boolean isFile 判断是否为文件
    * boolean isHidden 判断是否隐藏
    * boolean exists    判断是否存在
    * boolean canRead   判断是否可读
    * boolean canWrite  判断是否可写
    * */
    @Test
    public void dome4(){
        File file=new File("hello.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.isHidden());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        System.out.println("======================");
        File file2=new File("F:\\io");
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.isHidden());
        System.out.println(file2.exists());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
    }

    /*
    * boolean createNewFile 创建文件
    * boolean delete  文件或者文件夹删除 、Java在删除的时候，不会结果垃圾回收站
    * boolean mkdir  创建文件目录，如果上级目录不存在创建不成功，（如果创建的目录以及存在，那么也会返回false，也不会再创建）
    * boolean mkdirs    创建文件目录，如果上级目录不存在，连上级目录一起创建，（如果创建的目录以及存在，那么也会返回false，也不会再创建）
    *
    *
    * */
    @Test
    public void dome5() throws IOException
    {
        File file=new File("hello2.txt");
      /*  if(!file.exists()){ //  判断文件不存在在创建
            file.createNewFile();   //  创建文件
            System.out.println("文件创建成功");
        }else{ // 文件存在
            System.out.println("文件以存在");
        }*/

        /*if(file.exists()){ // 文件不存在
            file.delete();
            System.out.println("文件删除成功");
        }else{
            System.out.println("文件不存在删除失败");
        }*/
        File file1=new File("F:\\io\\io1");
        if (file1.mkdir()){
            System.out.println("目录创建成功");
        }else{
            System.out.println("目录创建失败");
        }

        File file2=new File("F:\\ioo\\ioo1");
        if (file2.mkdirs()){
            System.out.println("目录创建成功");
        }else{
            System.out.println("目录创建失败");
        }
    }
}

package com.hp.reflect;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassTest
{
   @Test
   public void ClassTest1() throws ClassNotFoundException
   {
       //   1.方式一：调用运行时的属性 .class
       Class<Person> personClass = Person.class;
       System.out.println(personClass);
       //   2. 方式二：通过运行时类的对象
       Person p=new Person();
       Class aClass = p.getClass();
       System.out.println(aClass);
       //   3.方式三:调用Class类的静态方法forName 方法
       Class<?> aClass1 = Class.forName("com.hp.reflect.Person");
       System.out.println(aClass1);

       //   4.方式四：ClassLoader的loadClass方法
       ClassLoader classLoader = ClassTest.class.getClassLoader();
       Class<?> aClass2 = classLoader.loadClass("com.hp.reflect.Person");
       System.out.println(aClass2);


   }

   @Test
    public void test1(){
       Properties properties =new Properties();
       FileInputStream fis = null;
       try
       {
           /*  方法一获取资源

           //   1.获取资源路径
            fis =new FileInputStream("src//user.properties");
            //  2.加载资源
            properties.load(fis);

           String name = properties.getProperty("name");
           String age = properties.getProperty("age");
           System.out.println("name ="+ name+"\t age = " +age);*/

           /*
           * 方法二: ClassLoader回去资源
           * */

           // 1.获取ClassLoader
           ClassLoader classLoader = ClassTest.class.getClassLoader();
           //   2.使用ClassLoader的getResourceAsStream方法获取资源路径
           InputStream resourceAsStream = classLoader.getResourceAsStream("src\\user.properties");
           properties.load(resourceAsStream); //    3.加载资源

           String name = properties.getProperty("name");
           String age = properties.getProperty("age");
           System.out.println("name ="+ name+"\t age = " +age);

       }
       catch (Exception e)
       {
           e.printStackTrace();
       }finally
       {
           try
           {
               if(fis != null)
               fis.close();
           }
           catch (IOException e)
           {
               e.printStackTrace();
           }
       }
   }


}

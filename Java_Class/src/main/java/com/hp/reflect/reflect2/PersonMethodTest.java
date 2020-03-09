package com.hp.reflect.reflect2;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class PersonMethodTest
{
    @Test
    public  void  test1(){
        Class<Person> clazz = Person.class;

        //  getMethods : 获取当前运行时类及其父类所有public修饰的方法
        Method [] method = clazz.getMethods();
        for (Method m :method){
            System.out.println(m);
        }
        System.out.println();


        //  getMethods : 获取当前运行时类所有的方法 （不包括父类中的方法）
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method dm :declaredMethods){
            System.out.println(dm);
        }

    }

    @Test
    public void test2(){
        Class<Person> clazz = Person.class;
        //  getConstructors(); 获取当前运行时类及其父类所有public修饰的构造方法
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor c : constructors){
            System.out.println(c);
        }
        System.out.println();

        //  getDeclaredConstructors();  获取当前运行时类所有的构造方法 （不包括父类中的方法）
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor dc : declaredConstructors){
            System.out.println(dc);
        }

    }
}

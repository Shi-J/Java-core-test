package com.hp.reflect.reflect2;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;
import org.junit.Test;

import java.lang.annotation.Annotation;

public class PersonInterfaceTest
{

    @Test
    public void test(){
        Class<Person> clazz = Person.class;
        //  1.获取运行时类的接口
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class i :interfaces){
            System.out.println(i);
        }

        System.out.println();

        //  2.获取运行时类父类的接口
        Class<?>[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for (Class i : interfaces){
            System.out.println(i);
        }
        System.out.println();
        //  3.获取运行时类所在的包
        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
        System.out.println();

        //  4.获取运行时类所在的注解
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation a : annotations){
            System.out.println(a);
        }



    }
}

package com.hp.reflect.reflect2;

import org.junit.Test;
import sun.security.provider.MD2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PersonAnnotationTest
{
    @Test
    public void test1(){
        Class<Person> clazz = Person.class;
        //  1.获取运行时类中的方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for ( Method dm :declaredMethods){
            //  1.1.获取方法中的注解 getAnnotations(); 获取运行时类的所有方法上的注解
            Annotation[] annotations = dm.getAnnotations();
            for (Annotation a :annotations){
                System.out.println(a);
            }


            //  1.2获取方法的权限修饰符
            System.out.println(Modifier.toString(dm.getModifiers()));
            //  1.3获取方法的返回值
            System.out.println(dm.getReturnType());

            //  1.4获取方法名
            System.out.println(dm.getName());

            //  1.5获取方法的形参列表
            Class<?>[] parameterTypes  = dm.getParameterTypes();
            if(!(parameterTypes == null || parameterTypes.length == 0)){
                for (Class p : parameterTypes){
                    System.out.println(p.getName());
                }
            }


            //  1.6获取异常
            Class<?>[] exceptionTypes = dm.getExceptionTypes();
                for (int i =0 ; i<exceptionTypes.length ; i++){
                    System.out.println(exceptionTypes [i].getName());
                    break;
                }


        }


    }
}

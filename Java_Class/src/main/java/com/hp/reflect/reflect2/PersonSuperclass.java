package com.hp.reflect.reflect2;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class PersonSuperclass
{

    @Test
    public void test(){

        Class<Person> clazz = Person.class;
        //  获取运行时的父类
        Class<? super Person> superclass = clazz.getSuperclass();
        System.out.println(superclass);

        //  获取运行时带泛型的父类
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);

        //  获取运行时带泛型的父类的泛型
        Type genericSuperclass2 = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType=(ParameterizedType) genericSuperclass2;
        //  获取泛型类型
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for(Type a : actualTypeArguments){
            System.out.println(a);
        }


    }
}

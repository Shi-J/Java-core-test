package com.hp.reflect.reflect2;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest
{
    @Test
    public  void test1() throws Exception
    {
        //  1.得到Class
        Class<Person> clazz = Person.class;
        //  2.创建运行时类的对象
        Person person = clazz.newInstance();
        //  3.得到属性 getField 此方法只能设置运行时类的public修饰属性
        Field name = clazz.getField("name");
        //  4.设置值
        name.set(person,"zs");
        //  5.得到值
        Object o = name.get(person);

        System.out.println(o);
        System.out.println(person);

    }

    @Test
    public  void test2() throws Exception
    {
        //  1.得到Class
        Class<Person> clazz = Person.class;
        //  2.创建运行时类的对象
        Person person = clazz.newInstance();
        //  3.得到属性 getField 此方法只能设置运行时类的public修饰属性
        Field age = clazz.getDeclaredField("height");
        //  4.设置当前属性是可以访问的
        age.setAccessible(true);
        //  5.设置值
        age.set(person,"123");
        //  6.得到值
        Object o = age.get(person);

        System.out.println(o);
        System.out.println(person);

    }

    @Test
    public void test3() throws Exception
    {
        //  1.得到Class
        Class<Person> clazz = Person.class;
        //  2.创建运行时类的对象
        Person person = clazz.newInstance();
        //  3.获取指定的方法
        Method show = clazz.getDeclaredMethod("show", String.class);
        //  4.保证当前方法是可访问的
        show.setAccessible(true);
        //  5.调用方法的invoke（）: invoke 方法的返回值就是运行时类方法的返回值
        Object invoke = show.invoke(person, "123");
        System.out.println("方法的返回值为 ： " + invoke);

        System.out.println();
        //  调用静态方法
        Method showDesc = clazz.getDeclaredMethod("showDesc", String.class);

        showDesc.setAccessible(true);

        Object o1 = showDesc.invoke(person, "活泼");
        System.out.println(o1);

    }


    @Test
    public void test4() throws Exception
    {
        //  1.得到Class
        Class<Person> clazz = Person.class;
        //  2.指定构造器
        Constructor<Person> declaredConstructor   = clazz.getDeclaredConstructor(String.class);
        //  3.保证构造器可访问
        declaredConstructor.setAccessible(true);
        //  4.创建构造器
        Person sj = declaredConstructor.newInstance("sj");
        System.out.println(sj);


    }
}

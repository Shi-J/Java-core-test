package com.hp.reflect.reflect2;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class PersionTest
{
    @Test
    public void test(){
        Class<Person> clazz = Person.class;

        //  获取所有的属性
        Field[] fields = clazz.getFields();
        //  结论 ： getFields方法能获取当前运行时类的和其所有父类中用public修饰的所有属性
        for (Field f : fields){
            System.out.println(f);
        }

        System.out.println();
        //  getDeclaredFields获取运行时类的所有属性 （ 不包含父类中的属性）
        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field d : declaredFields){
            System.out.println(d);
        }


    }

    @Test
public void test2(){
    Class<Person> clazz = Person.class;

    Field[] declaredFields = clazz.getDeclaredFields();

    for (Field d : declaredFields){
        //  1.获取权限修饰符   1 代表public  2 代表private  3 代表默认不写 4 代表protected
        int modifiers = d.getModifiers();
        System.out.println(Modifier.toString(modifiers)); //Modifier.toString(modifiers)把对应的数字转为修饰符
        //  2.数据类型
        Class<?> type = d.getType();
        System.out.println(type);

        //  3.方法名
        String name = d.getName();
        System.out.println(name);

        System.out.println();
    }

}
}

package com.hp.reflect;

import org.junit.Test;

public class NewInstanceTest
{
    @Test
    public void test1() throws Exception
    {
        //  1.获取指定对象的class
        Class<Person> personClass = Person.class;
        /* 2.通过newInstance创建对应的运行时类的对象，调用了运行时类的空参构造器

           要想此方法能够正常运行需要满足的条件
           1.该类运行时必须提供空参的构造器
           2.空参构造器的访问权限要足够，通常设置为public
         */
        Person person = personClass.newInstance();
        System.out.println(person);


    }
}

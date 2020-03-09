package com.hp.jdk8;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest
{

    @Test
    public void test1(){
        //  语法格式一： 无参，无返回值
        Runnable r1=new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("我爱吃菠菜");
            }
        };

        r1.run();

        System.out.println("****lambda表达式写法****");

        Runnable r2 = () -> {System.out.println("我是一个善良的人类");};

        r2.run();
    }

    @Test
    public  void  test2(){
        //  语法格式二：需要一个参数，都是没有返回值
        Consumer<String> c1 =new Consumer<String>()
        {
            @Override
            public void accept(String s)
            {
                System.out.println(s);
            }
        };

        c1.accept("Consumer的使用");

        System.out.println("****lambda表达式写法****");
        Consumer<String> c2 =(String s) -> { System.out.println(s); };
        c2.accept("Consumer的lambda使用");

    }


    @Test
    public  void  test3(){
        //  语法格式三：数据类型可以省略，因为可有编译器推断得出，我们称为“类型推断”
        Consumer<String> c1 =new Consumer<String>()
        {
            @Override
            public void accept(String s)
            {
                System.out.println(s);
            }
        };

        c1.accept("Consumer的使用");

        System.out.println("****lambda表达式写法****");
        //  类型推断
        Consumer<String> c2 =(s) -> { System.out.println(s); };
        c2.accept("Consumer的lambda使用");

    }


    @Test
    public void  test4(){
        //语法格式四: Lampda 若只需要一个参数时，参数的小括号可以省略
        Consumer<String> c1 =new Consumer<String>()
        {
            @Override
            public void accept(String s)
            {
                System.out.println(s);
            }
        };

        c1.accept("Consumer的使用");

        System.out.println("****lambda表达式写法****");
        Consumer<String> c2 = s -> { System.out.println(s); };
        c2.accept("Consumer的lambda使用");
    }



    @Test
    public void test5(){
        //  语法格式五：Lambda 需要两个或以上的参数，多条执行语句，井且可以有返回值
      Comparator<Integer> c1=new Comparator<Integer>()
      {
          @Override
          public int compare(Integer o1, Integer o2)
          {
              System.out.println(o1);
              System.out.println(o2);
              return o1.compareTo(o2);
          }
      };

        int compare = c1.compare(11, 12);
        System.out.println(compare);


        Comparator<Integer> c2=( o1,  o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return  o1.compareTo(o2);
        };

        int compare2 = c2.compare(22, 21);
        System.out.println(compare2);

    }

    @Test
    public void test6(){
        //  语法格式六：当Lambda体只有一条语句时，return 与大括号若有，都可以省略
        Comparator<Integer> c1=new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o1.compareTo(o2);
            }
        };

        int compare = c1.compare(11, 12);
        System.out.println(compare);


        Comparator<Integer> c2=( o1,  o2) -> o1.compareTo(o2);
        int compare2 = c2.compare(22, 21);
        System.out.println(compare2);

    }
}

package com.hp.reflect.reflect2;


@MyAnnotation(value = "人")
public class Person extends Creature<String> implements Comparable<String>,MyInterface
{
    public String name;
    private int age;
    boolean sex;
    public boolean isSex()
    {
        return sex;
    }

    public void setSex(boolean sex)
    {
        this.sex = sex;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    private Person(String name){
        this.name=name;
    }

    public Person()
    {
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @MyAnnotation("show-MyAnnotation")
    public String show(String name){
        System.out.println("show 方法" + name);
        return name;
    }
    @MyAnnotation("nationality-MyAnnotation")
    private void nationality(String nationality){
        System.out.println("我的国籍是"+nationality);
    }

    @Override
    public void info()
    {
        System.out.println("我是一个人");
    }

    @Override
    public int compareTo(String o)
    {
        return 0;
    }

    public static String showDesc(String name){
        System.out.println("我是一个" + name+"的人");
        return name;
    }
}

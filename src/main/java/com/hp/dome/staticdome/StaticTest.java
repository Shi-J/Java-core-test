package com.hp.dome.staticdome;



public class StaticTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="zs";
        p1.age=23;
        p1.nation="china";
        Person p2=new Person();
        p2.name="ls";
        p2.age=24;
        System.out.println(p2.nation);
    }
}

class Person{
    String name;
    int age;
    static String nation;

    public static void eat(){
    }

}

package com.hp.dome.exceptiondome;

import javax.swing.*;

public class ErrorTest {

    public static void main(String[] args)
    {
        //  java.lang.StackOverflowError栈溢出
//        main(args);

        //  java.lang.OutOfMemoryError堆溢出
//        Integer [] integers=new Integer[1024*1024*1024];

        String a=" abc ";
        System.out.println(a.charAt(4));


    }
}

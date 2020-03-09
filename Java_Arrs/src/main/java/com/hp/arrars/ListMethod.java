package com.hp.arrars;

import org.junit.Test;

public class ListMethod {

    @Test
    public void listTest1(){
        int [] a= new int [] {1,2,3};

        for (int i = 0; i <a.length ; i++)
        {
            a[i] = 5;
        }

        for (int i = 0; i <a.length ; i++)
        {
            System.out.println(a[i]);
        }
    }
}

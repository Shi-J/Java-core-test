package com.hp.arrars;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest
{
    public static void main(String[] args) throws IOException
    {
        Properties properties=new Properties();
        properties.load(new FileInputStream("Java_Arrs/jdbc.properties"));

        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("age"));
    }
}

package com.hp.stringdome;

public class StringMethod {
    public static void main(String[] args)
    {
        String s1="Hello World";
        String s2="Hello world";
        //  常用的
        System.out.println(s1.length());    //  int length 获取字符串的长度
        System.out.println(s1.charAt(6));   //  char charAt 返回某处位置的字符串 空格也算一个
        System.out.println(s1.isEmpty());   //  boolean isEmpty 判断字符串是否为空
        System.out.println(s1.toLowerCase());   //  String toLowerCase 将字符串全部变为小写
        System.out.println(s1.toUpperCase());   //  String toUpperCase 将字符串全部变为大写
        System.out.println(s1.trim());      //  String trim 去掉字符串的首位部的空格
        System.out.println(s1.equals(s2));  //  boolean equals 比较二个字符串之间的内容是否相同
        System.out.println(s1.equalsIgnoreCase(s2));    //  boolean equalsIgnoreCase 忽略大小写的情况下比较二个字符串之间的内容是否相同
        System.out.println(s1.concat(s2));    //  String concat 将指定的字符串连接到此字符串的尾部
        System.out.println(s1.compareTo(s2));    //  int compareTo 比较二个字符串之间的大小是否相同
        System.out.println(s1.compareToIgnoreCase(s2));    //  int compareToIgnoreCase 忽略大小写的情况下比较二个字符串之间的大小是否相同
        System.out.println(s1.substring(2));    //  String substring 从指定位置的前一个位置截取之后的字符串
        System.out.println(s1.substring(3,8));    //  String substring 从指定的二个位置中截取字符串并且不包含最后截取位置上的字符 相当于[ ) 区间
        System.out.println(s1.indexOf("e"));    //  int indexOf 查找字符串中是否有此字符串，并返回其首次出现的位置（找不到为 -1 ）
        System.out.println(s1.indexOf("l",0));    //  int indexOf 从指定位置查找字符串中是否有此字符串，并显示该字符串出现的次数（找不到为 -1 ）


        //  其他
        String s3="Hello World";
        System.out.println(s1.endsWith("h"));   //  boolean endsWith 测试字符串是否已此为结束
        System.out.println(s1.startsWith("H")); //  boolean startsWith 测试字符串是否已此为开始 (区分大小写)
        System.out.println(s1.contains("he"));  //  boolean contains 测试此字符串是否包含需要检查的字符串 (区分大小写)
        System.out.println(s1.contains("he"));  //  boolean contains 测试此字符串是否包含需要检查的字符串 (区分大小写)
        System.out.println(s3.lastIndexOf("l"));    //  int lastIndexOf 从字符串的尾部开始查找指定字符串的位置 （找不到为 -1 ）
        System.out.println(s3.lastIndexOf("l",5));    //  int lastIndexOf 从字符串的尾部开始查找指定字符串的位置,从指定位置方向搜索 （找不到为 -1 ）
        System.out.println(s3.replace("l", "D"));   //  String replace  将字符串中的指定字符，替换成需要修改的字符（替换原字符串中所有找到的字符）


    }
}

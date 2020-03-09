package com.hp.stringdome;

public class StringTest {
    public static void main(String[] args)
    {

        String s1="A";
        String s2="A";
        String s3=new String("A");
        String s4=new String("A");
        System.out.println(s1 == s2); //    true 指向的地址同在字符串常量池当中
        System.out.println(s1 == s3); //    false s1指向的地址是字符串常量池，s3指向的地址是堆空间中的地址值
        System.out.println(s1 == s4); //    false s1指向的地址是字符串常量池，s4指向的地址是堆空间中的地址值
        System.out.println(s3 == s4); //    false s3和s4都是new创建的，在堆空间创建了二个地址，并且s3和s4指向的地址值不一致

        //  intern();方法的使用
        String s5 = s3;
        String s6 = s3.intern();
        System.out.println(s5==s2); //  false 因为s3的地址值在堆当中，而s2的地址值在字符串常量池当中
        System.out.println(s6==s2); //  true 使用了intern()
    }
}

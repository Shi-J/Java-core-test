package com.hp.stringdome;

public class StringBufferTest {
    public static void main(String[] args)
    {
        StringBuffer sb1=new StringBuffer(123);
       /*  源码分析
         * Constructs a string buffer with no characters in it and an
         * initial capacity of 16 characters.
         * public StringBuffer() {
         * super(16);
         * }*/
        StringBuilder stringBuilder=new StringBuilder();

        /**
         * Constructs a string builder initialized to the contents of the
         * specified string. The initial capacity of the string builder is
         * {@code 16} plus the length of the string argument.
         *
         * @param   str   the initial contents of the buffer.

        public StringBuilder(String str) {
        super(str.length() + 16);
        append(str);
          }
         */

        String a="abcaababbaa";

        String b="";


        char[] chars = a.toCharArray();
        for (int i =a.length()-1 ; i >=0 ;i--){
            System.out.println(chars[i]);
            b+=chars[i];
        }
        System.out.println(b);
    }


}

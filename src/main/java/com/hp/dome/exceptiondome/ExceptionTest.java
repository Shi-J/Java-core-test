package com.hp.dome.exceptiondome;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args)
    {
        int i=7;
        try
        {

            try
            {

            }catch (Exception e){

            }finally
            {

            }
            System.out.println(i/0);
            //  出现异常后的代码
            System.out.println(1);
        } catch (ArithmeticException a){
            System.out.println("除数不能为0哦！！！！");
            System.out.println(a.getMessage());
            System.out.println(a.getStackTrace());
        }

        System.out.println(2);

    }
}
class A extends  Exception{

        public void a() throws Exception
        {

        }

        public void b() throws IOException {

        }
}

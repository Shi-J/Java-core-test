package com.hp.dome;


import java.security.PublicKey;

public class JavaDome01   {
    public static void main(String[] args)
    {
        //  计算1+100的和
        System.out.println(getNum1(100));

        System.out.println(getNum2(100));




    }

    //  计算1+100的和 方法1
    public static int getNum1(int value){
        int sum=0;
        for (int i =1 ; i<=value; i++){
//            sum=sum+i;
            sum+=i;
        }
        return sum;
    }


    //  计算1+100的和 方法2 递归计算
    public static int getNum2(int value){
       if(value == 1 ){
           return 1;
       }else{
           return value+(getNum2(value-1));
       }
    }

    class A{

    }


}

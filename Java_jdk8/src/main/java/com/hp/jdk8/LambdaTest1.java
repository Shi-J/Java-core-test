package com.hp.jdk8;

import org.junit.Test;

import java.util.Map;
import java.util.function.Consumer;

public class LambdaTest1
{
    @Test
    public  void test1(){
        happyTime(10, new Consumer<Double>()
        {
            @Override
            public void accept(Double money)
            {
                System.out.println("我去景区买瓶水需要"+ money + "元");
            }
        });


        happyTime(1.5, (money) -> System.out.println("我去学校买瓶水需要"+ money + "元"));



    }

    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }
}

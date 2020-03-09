package com.hp.arrars;

import org.junit.Test;

import java.util.ArrayList;

public class GenericsTest
{

    @Test
    public void dome1(){
        ArrayList arrayList=new ArrayList();
        //  录入学生成绩
        arrayList.add(77);
        arrayList.add(79);
        arrayList.add(86);
        arrayList.add(62);
        //   不小心录入错误
        arrayList.add("78s");

        for (Object scores : arrayList){
            //  会出现 ClassCastException异常
            int score =(int )scores;
            System.out.println(score);
        }
    }


    @Test
    public void dome2(){
        ArrayList<Integer> arrayList2=new ArrayList<Integer>();
        //  录入学生成绩
        arrayList2.add(77);
        arrayList2.add(79);
        arrayList2.add(86);
        arrayList2.add(62);
        //  数据类型不一致编译无法通过
//        arrayList2.add("78s");

        for (Integer scores : arrayList2){
            //  会出现 ClassCastException异常
            int score =(int )scores;
            System.out.println(score);
        }
    }
}

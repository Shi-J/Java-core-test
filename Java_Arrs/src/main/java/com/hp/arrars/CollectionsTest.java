package com.hp.arrars;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsTest
{
    public static void main(String[] args)
    {
        List list=new ArrayList();
        list.add(123);
        list.add(234);
        list.add(234);
        list.add(234);
        list.add(345);

        //  reverse方法，list集合倒序排序
//        Collections.reverse(list);

        //  shuffle方法，随机给list集合进行排序
//        Collections.shuffle(list);

        //  sort方法从小到大排序
//        Collections.sort(list);

        //  swap方法，交互二个数组中数据的位置
//        Collections.swap(list,1,2);

        //  max方法，根据元素的自然顺序，返回元素中最大的元素
//        Comparable max = Collections.max(list);

        //  min，根据元素的自然顺序，返回元素中最小的元素
//        Comparable min = Collections.min(list);
//        System.out.println(min);

        //  frequency方法，查看当前数据在集合中存在的个数
//        System.out.println(Collections.frequency(list, 234));




        System.out.println(list);

    }


    @Test
    public void dd(){
        Collections.synchronizedList(new ArrayList<>());
        Collections.synchronizedSet(new HashSet());
        Collections.synchronizedMap(new HashMap());
    }
}

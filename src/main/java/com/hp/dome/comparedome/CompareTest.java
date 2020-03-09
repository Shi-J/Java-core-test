package com.hp.dome.comparedome;

import com.sun.corba.se.spi.ior.ObjectKey;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest
{
    @Test
    public void CompareTest1()
    {

        Goods[] goods = new Goods[4];
        goods[0] = new Goods("ip7", 3500);
        goods[1] = new Goods("ip8", 4500);
        goods[2] = new Goods("ip6", 2500);
        goods[3] = new Goods("ipx", 5500);


        Arrays.sort(goods);

        System.out.println(Arrays.toString(goods));

    }

    @Test
    public void CompareTest2(){
        String [] arrs= new String[] {"DD","CC","AA","EE","BB"};
        Arrays.sort(arrs, new Comparator()
        {
            //  按照字符串从小到大依次排序
            @Override
            public int compare(Object o1, Object o2)
            {
                if(o1 instanceof String && o2 instanceof  String){
                    String str1 = (String) o1;
                    String str2 = (String) o2;
                    return -str1.compareTo(str2);  //   不写为小到大，添加 - 就是从大到小
                } else {
                    throw  new RuntimeException("类型不一致");
                }
            }
        });

        System.out.println(Arrays.toString(arrs));
    }


    @Test
    public void CompareTest3()
    {


        Goods[] goods = new Goods[5];
        goods[0] = new Goods("ip7", 3500);
        goods[1] = new Goods("ip8", 4500);
        goods[2] = new Goods("ip6", 2600);
        goods[4] = new Goods("ip6", 2500);
        goods[3] = new Goods("ipx", 5500);


        Arrays.sort(goods, new Comparator()
        {
            @Override
            public int compare(Object o1, Object o2)
            {
                if(o1 instanceof  Goods && o2 instanceof  Goods){
                    Goods goods1 = (Goods) o1;
                    Goods goods2 = (Goods) o2;
                    if(goods1.getName().equals(goods2.getName())){ // 如果名字是一样的 那就按照价格从低到高进行排序
                        return Double.compare(goods1.getPrice(),goods2.getPrice());
                    }else{
                        return goods1.getName().compareTo(goods2.getName());
                    }
                }
                 throw  new RuntimeException("类型不一致");
            }
        });

        System.out.println(Arrays.toString(goods));

    }
}

package com.hp.arrars;

import java.io.Serializable;
import java.util.*;

public class CollectionTest
{
    public static void main(String[] args)
    {
        Collection co = new ArrayList(); // 没有指定类型，默认为Object
        //  add方法添加元素
        co.add("zs");
        co.add(23); // 自动装箱
        co.add(new Date());

        System.out.println(co);
        Collection coo = new ArrayList();
        coo.add("ls");
        coo.add(24);

        //  addAll方法添加Collection类型的数据
        co.addAll(coo);
        System.out.println(co);

        //  size方法，查看当前集合中元素的个数
        System.out.println(co.size());

        //  isEmpty方法，查看集合是否为null (是否有元素)
        System.out.println(co.isEmpty());

        //  clear方法，清空集合中所有的元素
//        co.clear();
//        System.out.println(co.size());

        //  contains方法，查看集合中是否存在该元素， 比较的方式是使用equals进行比较
        System.out.println(co.contains("zs"));

        //  containsAll方法，传入的是Collection类型并判断二个Collection中的元素是否一致传入的参数中的元素是否都存在当中
        System.out.println(co.containsAll(coo));

        //  remove方法，指定删除的元素，删除成功为true，失败为false
//        System.out.println(co.remove("zs"));

        //  removeAll方法，传入的是Collection类型，并从集合中移除传入Collection类型中所有的元素
        List list = Arrays.asList("zs", 23, 123);
        System.out.println(co.removeAll(list));
        System.out.println(co);

        //  retainAll方法：传入的是Collection类型，可以说是交集，取二个Collection类型的相同元素部分
        List list2 = Arrays.asList(new Date(), "ls",24);
        System.out.println(co.retainAll(list2));
        System.out.println(co);

        //  equals方法，比较二个集合是否相同
        Collection co2 = new ArrayList();
        System.out.println(co.equals(co2));

        //  hashCode方法，返回该对象的哈希值
        System.out.println(co.hashCode());

        //  toArray方法，将集合转为数组
        Object [] obj = co.toArray();
        for (int i = 0; i <obj.length ; i++)
        {
            System.out.println(obj[i]);
        }

        //  iterator方法，迭代器，遍历集合中的元素
        Iterator iterator = co.iterator();
        while (iterator.hasNext()){//   判断是否有元素
            System.out.println(iterator.next());
        }


    }
}

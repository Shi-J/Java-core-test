package com.hp.arrars;

import org.junit.Test;

import java.util.*;

public class MapMethod
{
    @Test
    public void mapMethodTest(){
        Map  map=new HashMap();
        //  put方法，向map中添加数据或者修改数组
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        //  put方法修改数据 , key和需要修改数据的key一致，value就是需要修改的value
        map.put("C",33);
        System.out.println(map);

        //  putAll,向map中添加map类型的数据
        Map  map2=new HashMap();
        map.put("AA",11);
        map.put("BB",22);
        map.putAll(map2);
        System.out.println(map);

        //  remove方法，传入指定的key，删除其key value对，并能得到返回的value值
        Object a = map.remove("A");
        System.out.println(a);

        //  clear方法,清空当前map中的所有数据
//        map.clear();

        //  get方法，获取指定key对应的value
        Object aa = map.get("AA");
        System.out.println(aa);
        //  containsKey方法， 传入key值，查看是否包含指定的key
        boolean aa1 = map.containsKey("AA");
        System.out.println(aa1);
        //  containsValue方法，传入value值，查看是否包含指定的value
        boolean b = map.containsValue(33);
        System.out.println(b);
        //  size()方法，返回map中key-value对的个数
        System.out.println(map.size());
        //  isEmpty方法， 判断当前map是否为空
        System.out.println(map.isEmpty());
        //  equals方法 判断当前map和参数对象是否相等
        System.out.println(map.equals(map2));

        //  keySet方法 遍历所有的key
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        //  values方法 遍历所有的value
        Collection values = map.values();
        for( Object val : values){
            System.out.println(val);
        }
        System.out.println();

        //  entrySet方法，遍历key   value 的值
        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}

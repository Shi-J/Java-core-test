package com.hp.dome.comparedome;

public class Goods implements  Comparable
{
    private String name;
    private int price;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Goods()
    {
    }

    public Goods(String name, int price)
    {
        this.name = name;
        this.price = price;
    }


    // 指定按照什么大小进行排序 ，比如按照价格从滴到高
    @Override
    public int compareTo(Object o)
    {
        if(o instanceof  Goods){ //
            Goods goods=  (Goods) o;
            if(this.price > goods.price){
                return  1;
            }else if (this.price < goods.price){
                return  -1;
            }else {
                return 0;
            }

        }else {
            throw  new  RuntimeException("二者类型不一致");
        }
    }
}

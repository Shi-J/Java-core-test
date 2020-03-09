package com.hp.reflect.reflect3;

/*
* 静态代理案例
*
* 特点 ： 代理类和被代理类在编译期间就确定了下来
* */



//  衣物工厂
interface ClothFactory{
    //  生产衣物
    void produceCloth();
}
//  代理类
class ProxyClothFactory implements ClothFactory{

    private ClothFactory clothFactory;

    public ProxyClothFactory(ClothFactory clothFactory){
        this.clothFactory=clothFactory;
    }

    @Override
    public void produceCloth()
    {
        System.out.println("代理工厂正在准备");

        clothFactory.produceCloth();

        System.out.println("代理工厂准备收尾");
    }
}

//  被代理对象 耐克品牌
class NikeClothFactory implements ClothFactory{
    @Override
    public void produceCloth()
    {
        System.out.println("耐克工厂生产服装");
    }
}

public class StaticProxyTest
{
    public static void main(String[] args)
    {
        //  创建被代理类对象
        NikeClothFactory nike=new NikeClothFactory();

        //  创建代理类对象
        ClothFactory proxyClothFactory=new ProxyClothFactory(nike);

        proxyClothFactory.produceCloth();


    }
}

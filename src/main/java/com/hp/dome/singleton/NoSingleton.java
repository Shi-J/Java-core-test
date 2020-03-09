package com.hp.dome.singleton;
//  没有使用单例模式
public class NoSingleton
{
    public static void main(String[] args)
    {
        NoSingletonDome noSingletonDome1 = new NoSingletonDome();
        NoSingletonDome noSingletonDome2 = new NoSingletonDome();
        System.out.println(noSingletonDome1==noSingletonDome2);
    }
}


class NoSingletonDome{


}



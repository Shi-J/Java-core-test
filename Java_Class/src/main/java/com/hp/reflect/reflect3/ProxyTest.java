package com.hp.reflect.reflect3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* 动态代理
* */
//  人类
interface Human{
    //  信仰
    String getBelief();
    //  吃
    void eat(String food);
}

class Superman implements Human{

    @Override
    public String getBelief()
    {
        return "超人信仰佛教";
    }

    @Override
    public void eat(String food)
    {
        System.out.println("超人爱吃:"  + food);
    }
}

class ProxyFactory{
    //  调用此方法，返回一个代理类对象
    public  static  Object getProxyInstance(Object obj){
        MyInvocationHandler myInvocationHandler=new MyInvocationHandler();

        myInvocationHandler.bind(obj);

       return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),myInvocationHandler);
    }

}

class MyInvocationHandler implements InvocationHandler{

    //  创建被代理类
    private Object obj;

    public void bind(Object obj){
        this.obj =obj;
    }

    //  当我们通过代理类的对象，调用方法a时，就会自动的调用如下invoke方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        //  将被代理类要执行的方法a 的功能就声明在invoke方法中
        Object invoke = method.invoke(obj, args);
        //  上述方法的返回值就是invoke方法的返回值
        return invoke;
    }
}


public class ProxyTest
{
    public static void main(String[] args)
    {

        Superman superman=new Superman();
        //  ProxyFactory代理类
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superman);
        //  当通过代理类的对象调用此方法时，会自动调用代理类中同名的方法
        System.out.println(proxyInstance.getBelief());

        proxyInstance.eat("菠菜");




    }
}

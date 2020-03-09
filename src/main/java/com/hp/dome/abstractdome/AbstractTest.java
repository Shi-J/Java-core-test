package com.hp.dome.abstractdome;

public class AbstractTest {
    public static void main(String[] args)
    {
//            AbstractDome1 abstractDome1=new AbstractDome1();
    }

}

abstract  class   AbstractDome1{

    //  构造方法
    public AbstractDome1(){

    }
    //  抽象方法  可以没有
    public abstract void  AbstractDome2();
    public abstract void  AbstractDome3();
    //  普通方法
    public  void getMethod1(){
        System.out.println("我是方法1");
    }
}

  class AbstractDome2 extends AbstractDome1{
    public AbstractDome2(){
        super(); // 默认会调用父类的无参构造器
    }

    //  方案二 重写父类中所有的抽象方法
      @Override
      public void AbstractDome2()
      {

      }
      @Override
      public void AbstractDome3()
      {

      }

  }

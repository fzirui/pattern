package com.example.singleton.hungry;

// 饿汉式:静态代码块式单例
public class HungryStaticMethodSingleton {

    private static final HungryStaticMethodSingleton hungryStaticMethodSingleton;

    private HungryStaticMethodSingleton(){}

    static{
        hungryStaticMethodSingleton = new HungryStaticMethodSingleton();
    }

    public static HungryStaticMethodSingleton getInstance(){
        return hungryStaticMethodSingleton;
    }
}

package com.example.singleton.hungry;

// 饿汉式:静态代码块式单例
public class HungryStaticBlockSingleton {

    private static final HungryStaticBlockSingleton hungryStaticMethodSingleton;

    private HungryStaticBlockSingleton(){}

    static{
        hungryStaticMethodSingleton = new HungryStaticBlockSingleton();
    }

    public static HungryStaticBlockSingleton getInstance(){
        return hungryStaticMethodSingleton;
    }
}

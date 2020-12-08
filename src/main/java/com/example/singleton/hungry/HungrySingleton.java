package com.example.singleton.hungry;

// 饿汉式:普通方式单例
// 实例在初始化时就创建好了,不会存在线程安全问题
// 不使用也会存在,造成空间浪费
// 不加锁，性能高
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }
}

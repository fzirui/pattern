package com.example.singleton.lazy;

// 懒汉式:DCL式（Double Check Lock）双重检查锁
public class LazyDCLSingleton {

    private static LazyDCLSingleton lazyDCLSingleton;

    private LazyDCLSingleton(){}

    public static LazyDCLSingleton getInstance(){
        if(lazyDCLSingleton == null){
            synchronized(LazyDCLSingleton.class){
                if(lazyDCLSingleton == null){
                    lazyDCLSingleton = new LazyDCLSingleton();
                }
                return lazyDCLSingleton;
            }
        }
        return lazyDCLSingleton;
    }
}

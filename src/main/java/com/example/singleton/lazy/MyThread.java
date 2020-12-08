package com.example.singleton.lazy;

public class MyThread implements Runnable{

    @Override
    public void run() {

//        System.out.println(Thread.currentThread().getName() + ":" +  LazySingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" +  LazyDCLSingleton.getInstance());
    }
}

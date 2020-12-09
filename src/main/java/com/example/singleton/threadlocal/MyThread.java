package com.example.singleton.threadlocal;

import com.example.singleton.lazy.LazyInnerClassSingleton;

public class MyThread implements Runnable{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + ":" +  ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" +  ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" +  ThreadLocalSingleton.getInstance());
    }
}

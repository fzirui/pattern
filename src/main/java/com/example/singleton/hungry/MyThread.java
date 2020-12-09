package com.example.singleton.hungry;

public class MyThread implements Runnable{

    @Override
    public void run() {

        //System.out.println(Thread.currentThread().getName() + ":" +  HungrySingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" +  HungryStaticBlockSingleton.getInstance());
    }
}

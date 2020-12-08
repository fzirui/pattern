package com.example.singleton.hungry;


public class SingletonTest {
    public static void main(String[] args) {
        // 三个线程返回的对象是同一个
        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();
    }
}

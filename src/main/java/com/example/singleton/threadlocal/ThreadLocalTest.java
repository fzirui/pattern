package com.example.singleton.threadlocal;

public class ThreadLocalTest {
    public static void main(String[] args) {

        //三个线程,各自线程内的对象相同
        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();
    }
}

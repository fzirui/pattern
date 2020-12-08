package com.example.singleton.lazy;

public class SingletonTest {
    public static void main(String[] args) {

        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();
    }
}


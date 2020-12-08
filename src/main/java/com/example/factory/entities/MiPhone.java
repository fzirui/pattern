package com.example.factory.entities;

public class MiPhone implements Phone{
    @Override
    public void start() {
        System.out.println("小米手机启动");
    }
}

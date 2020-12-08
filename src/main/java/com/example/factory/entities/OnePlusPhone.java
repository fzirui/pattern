package com.example.factory.entities;

public class OnePlusPhone implements Phone{
    @Override
    public void start() {
        System.out.println("一加手机启动");
    }
}

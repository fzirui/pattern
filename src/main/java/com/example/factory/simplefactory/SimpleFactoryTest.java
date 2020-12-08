package com.example.factory.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        PhoneFactory.createPhone("mi").start();
        PhoneFactory.createPhone("oneplus").start();
        System.out.println("***********");
        PhoneFactory.createPhone2("com.example.factory.entities.MiPhone").start();
        PhoneFactory.createPhone2("com.example.factory.entities.OnePlusPhone").start();

        Calendar instance = Calendar.getInstance();
        Logger logger = LoggerFactory.getLogger("11");
    }
}

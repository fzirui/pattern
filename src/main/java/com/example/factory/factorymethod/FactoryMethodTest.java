package com.example.factory.factorymethod;

import com.example.factory.entities.Phone;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Phone mi = new MiPhoneFactory().create();
        Phone oneplus = new OneplusPhoneFactory().create();
        System.out.println(mi);
        System.out.println(oneplus);
    }
}

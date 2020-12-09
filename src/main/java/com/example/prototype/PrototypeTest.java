package com.example.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        Pets pet = new Pets("小白", 2);
        Person p1 = new Person("张三", 18,pet);
        Person p2 = (Person)p1.clone();
        System.out.println(p1.getPets() == p2.getPets());
        System.out.println(p1);
        System.out.println(p2);
        pet.setPetName("小黄");
        System.out.println(p1);
        System.out.println(p2);
    }
}

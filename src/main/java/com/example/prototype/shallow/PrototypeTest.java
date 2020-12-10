package com.example.prototype.shallow;

/**
 * 浅克隆,只能克隆基本的属性,克隆出来的对象里面的引用类型会指向原来的引用
 * p1 跟 p2 对象里的 Pets 是同一个,所以修改P1里面的pets,p2里面的也会改变
 */
public class PrototypeTest {
    public static void main(String[] args) {
        Pets pet = new Pets("小白", 2);
        Person p1 = new Person("张三", 18,pet);
        Person p2 = (Person)p1.clone();
        System.out.println(p1 == p2);   // 对象为false
        System.out.println(p1.getPets() == p2.getPets()); // 对象里面的引用对象还是同一个
        System.out.println(p1);
        System.out.println(p2);
        p1.getPets().setPetName("小黄");  // 修改 p1 的 pets
        System.out.println(p2.getPets().getPetName());  // 输出 p2 的 pets
    }
}

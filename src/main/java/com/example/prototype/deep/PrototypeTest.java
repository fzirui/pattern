package com.example.prototype.deep;


/**
 * 深克隆,克隆完整的对象,包括对象里的引用类型
 * p1 跟 p2 里的 Pets 是不同的,所以修改p1的,p2的不会改变
 *  步骤：1.将对象里的引用类型也实现Cloneable接口,并重写Clone()方法
 *       2.在对象的clone()中将里面的引用类型也clone(),并赋值给当前对象
 *
 *
 */
public class PrototypeTest {
    public static void main(String[] args) {
        Pets pet = new Pets("小白", 2);
        Person p1 = new Person("张三", 18,pet);
        Person p2 = (Person)p1.clone();
        System.out.println(p1 == p2);   // false 对象不相等
        System.out.println(p1.getPets() == p2.getPets()); // false 对象里面的引用对象不相等
        System.out.println(p1);
        System.out.println(p2);
        //改了 p1 的 pets,p2的 pets 不会改变
        p1.getPets().setPetName("小黄");  // 修改 p1 的 pets
        System.out.println(p2.getPets().getPetName());  // 输出 p2 的 pets
    }
}

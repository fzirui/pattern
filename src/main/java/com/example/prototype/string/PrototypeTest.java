package com.example.prototype.string;


/** String类型
 *  拷贝出来的对象在堆中的内存地址不相等,但是都是指向常量池中的同一个对象
 *  若修改常量池里的原对象,会造成克隆对象的改变
 *  String直接指向常量池的话不会,因为若是String被修改会直接将引用指向新的常量池对象,不会造成对原对象的修改
 *
 */
public class PrototypeTest {
    public static void main(String[] args) {
//      //String petName = new String("小白");
        String petName = "小白";
        StringBuilder personName = new StringBuilder("张三");
        Pets pet = new Pets(petName, 2);
        Person p1 = new Person(personName, 18,pet);
        Person p2 = (Person)p1.clone();
        System.out.println(p1 == p2);   //false
        System.out.println(p1.getPets() == p2.getPets());   //false
        System.out.println("==============================");
        p1.setName(personName.reverse());   //使用 StringBuilder,修改原值会造成克隆对象的改变
        System.out.println(p2.getName());
        p1.getPets().setPetName(p1.getPets().getPetName().concat("aa"));    //使用 String/new String 不会造成原值的修改
        System.out.println(p1.getPets().getPetName());
        System.out.println(p2.getPets().getPetName());
    }
}

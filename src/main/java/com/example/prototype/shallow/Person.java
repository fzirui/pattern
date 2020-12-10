package com.example.prototype.shallow;


public class Person implements Cloneable{
    private String name;
    private int age;
    private Pets pets;

    @Override
    public Object clone(){
        try {
            return super.clone();
        }catch (CloneNotSupportedException  e){
            e.printStackTrace();
        }
        return null;
    }

    public Person() {

    }

    public Person(String name, int age, Pets pets) {
        this.name = name;
        this.age = age;
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pets=" + pets +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pets getPets() {
        return pets;
    }

    public void setPets(Pets pets) {
        this.pets = pets;
    }
}

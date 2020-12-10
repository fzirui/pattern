package com.example.prototype.string;


public class Person implements Cloneable{
    private StringBuilder name;
    private int age;
    private Pets pets;

    @Override
    public Object clone(){
        try {
            Person person = (Person) super.clone();
            person.pets = (Pets) pets.clone();
            return person;
        }catch (CloneNotSupportedException  e){
            e.printStackTrace();
        }
        return null;
    }

    public Person() {}

    public Person(StringBuilder name, int age, Pets pets) {
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

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
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

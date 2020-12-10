package com.example.prototype.shallow;

public class Pets{
    private String petName;
    private int age;

    public Pets() {
    }

    public Pets(String petName, int age) {
        this.petName = petName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "petName='" + petName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

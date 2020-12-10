package com.example.prototype.deep;

public class Pets implements Cloneable{
    private String petName;
    private int age;

    public Pets() {
    }

    public Pets(String petName, int age) {
        this.petName = petName;
        this.age = age;
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        }catch (CloneNotSupportedException  e){
            e.printStackTrace();
        }
        return null;
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

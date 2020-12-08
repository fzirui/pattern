package com.example.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        MiFactoryImpl miFactory = new MiFactoryImpl();
        Computer miComputer = miFactory.createComputer();
        Television miTelevision = miFactory.createTelevision();
        System.out.println(miComputer);
        System.out.println(miTelevision);
    }
}

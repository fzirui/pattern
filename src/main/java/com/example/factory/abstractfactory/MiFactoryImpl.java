package com.example.factory.abstractfactory;

public class MiFactoryImpl implements MiFactory {
    @Override
    public Computer createComputer() {
        return new MiComputer();
    }

    @Override
    public Television createTelevision() {
        return new MiTelevision();
    }
}

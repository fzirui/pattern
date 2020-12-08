package com.example.factory.factorymethod;

import com.example.factory.entities.MiPhone;
import com.example.factory.entities.Phone;

public class MiPhoneFactory implements PhoneFactory {
    @Override
    public Phone create() {
        return new MiPhone();
    }
}

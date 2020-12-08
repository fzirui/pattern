package com.example.factory.factorymethod;

import com.example.factory.entities.OnePlusPhone;
import com.example.factory.entities.Phone;

public class OneplusPhoneFactory implements PhoneFactory {
    @Override
    public Phone create() {
        return new OnePlusPhone();
    }
}

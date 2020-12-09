package com.example.singleton.serialize;

import java.io.Serializable;

public class SerializeSingleton implements Serializable {

    private static final SerializeSingleton INSTANCE = new SerializeSingleton();;

    private SerializeSingleton(){}

    public static SerializeSingleton getInstance() {
        return INSTANCE;
    }

    // 反序列化破坏后,加上就解决了
    private Object readResolve(){
        return INSTANCE;
    }
}

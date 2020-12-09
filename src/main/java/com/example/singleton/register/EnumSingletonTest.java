package com.example.singleton.register;

import com.example.singleton.serialize.SerializeSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {
    public static void main(String[] args) {

        try {

            Class<EnumSingleton> clazz = EnumSingleton.class;
            Constructor<EnumSingleton> c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            EnumSingleton enumSingleton = c.newInstance();

            EnumSingleton instance = EnumSingleton.getInstance();
            System.out.println(enumSingleton == instance);
        }catch (Exception e){
            e.printStackTrace();
        }

//        EnumSingleton s1 = null;
//        EnumSingleton s2 = EnumSingleton.getInstance();
//
//        try {
//            // 将对象序列化读入磁盘
//            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(s2);
//            oos.flush();
//            oos.close();
//            // 将对象反序列化
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            s1 = (EnumSingleton) ois.readObject();
//            ois.close();
//
//            System.out.println(s1);
//            System.out.println(s2);
//            System.out.println(s1 == s2);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }

}

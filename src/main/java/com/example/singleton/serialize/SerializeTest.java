package com.example.singleton.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {
    public static void main(String[] args) {

        SerializeSingleton s1 = null;
        SerializeSingleton s2 = SerializeSingleton.getInstance();

        try{
            // 将对象序列化读入磁盘
            FileOutputStream fos = new FileOutputStream("SerializeSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            // 将对象反序列化
            FileInputStream fis = new FileInputStream("SerializeSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializeSingleton) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            // false
            // 只需要加上 readResolve() 方法即可解决
            System.out.println(s1 == s2);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

package com.example.singleton.reflect;

import com.example.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

public class ReflectTest {
    public static void main(String[] args) {

        try {

            LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();

            // 通过反射获取到私有的空参构造器创建对象
            // 结果为 false
            // 在私有化构造器中加判断,若不等于 null 则抛异常
            // 加上后反射破坏不了了
            Class<LazyInnerClassSingleton> clazz = LazyInnerClassSingleton.class;
            Constructor<LazyInnerClassSingleton> c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            LazyInnerClassSingleton obj = c.newInstance();

            System.out.println(obj);
            System.out.println(instance);
            System.out.println(obj == instance);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

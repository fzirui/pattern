package com.example.singleton.threadlocal;

/**
 * 不能保证创建的对象是全局唯一,可以保证在单个线程中是唯一的
 *  单例为达到线程安全目的,加锁。
 *  ThreadLocal将所有的对象全部放在 ThreadLocalMap 中,为每个线程提供一个对象
 */

public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton =
            new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue(){
            return new ThreadLocalSingleton();
        }
    };
    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingleton.get();
    }
}

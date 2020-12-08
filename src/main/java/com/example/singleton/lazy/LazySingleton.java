package com.example.singleton.lazy;

// 懒汉式
// 用的时候才检查是否存在,不存在则创建，存在则直接返回
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton(){}

    // 加上 synchronize 为线程安全的
    public static synchronized LazySingleton getInstance() {
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}

/**
 * 多线程下 Debug
 * 打完端点后，右键断点，将 suspend 切换成 Thread
 * 调试 LazySingleton
 *      在一个线程执行并调用 getInstance()方法时
 *      另一个线程再调用 getInstance()方法，该线程的状态
 *      会从 RUNNING 变成 MONITOR,出现阻塞
 *      直到第一个线程执行完,第二个线程才会恢复成 RUNNING
 *      继续执行
 *   结论：在线程较多的情况下,会导致大量线程出现阻塞
 * 调试 LazyDCLSingleton
 *       第一个线程调用 getInstance()方法时，第二个线程
 *       也可以调用 getInstance()方法，党第一个线程执行
 *       到 synchronize 时会上锁，第二个线程就会变成 MONITOR
 *       出现阻塞，但 阻塞并不是基于整个 LazyDCLSingleton，
 *       而是在方法内部阻塞，性能相对高些
 *
 *
 */


package com.example.singleton.lazy;

// 静态内部内式
// 外部类被加载时不会立即加载内部类，内部类不会被加载则不会去初始化,所以不占内存空间
// 只有当第一次调用 getInstance()时才会去初始化 INSTANCE
// 可以保证线程安全,也延迟了实例化
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        // 测试反射破坏时加上
        if(LazyInner.INSTANCE != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static LazyInnerClassSingleton getInstance(){
        return LazyInner.INSTANCE;
    }

    private static final class LazyInner{
        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }


}

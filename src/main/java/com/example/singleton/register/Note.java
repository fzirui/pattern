package com.example.singleton.register;

public class Note {
    /**
     * 注册时单例（登记式单例）
     *  将每一个实例都登记到某个地方,使用唯一的表示获取实例
     *  两种：
     *      1.枚举登记==>EnumSingleton
     *      2.容器缓存==>ContainerSingleton
     *
     * 枚举登记
     *  使用 jad 反编译 EnumSingleton.class
     *      static{
     *         INSTANCE = new EnumSingleton("INSTANCE", 0);
     *         $VALUES = (new EnumSingleton[] {
     *             INSTANCE
     *         });
     *      }
     *      1）枚举单例中在静态代码块中就给 INSTANCE 赋值了,饿汉式
     *      序列化是否能破坏单例,查看 ObjectInputStream.java中的readObject0()
     *           case TC_ENUM:
     *              if (type == String.class) {
     *                  throw new ClassCastException("Cannot cast an enum to java.lang.String");
     *              }
     *              return checkResolve(readEnum(unshared));
     *      readEnum(unshared) ==> 2068:Enum<?> en = Enum.valueOf((Class)cl, name);
     *      通过类名和Class对象找到一个为一个枚举对象,因此枚举对象不可能被类加载器加载多次
     *      2）反射能否破坏单例
     *      通过jad反编译的文件没有空参构造,使用两个参数的构造器反射创建对象
     *      private EnumSingleton(String s, int i){ super(s, i); }
     *      启动后报错：java.lang.IllegalArgumentException: Cannot reflectively create enum objects
     *          不能使用反射来创建枚举类型
     *      查看源码：
     *      newInstance()==>416：if ((clazz.getModifiers() & Modifier.ENUM) != 0)
     *             throw new IllegalArgumentException("Cannot reflectively create enum objects");
     * 容器缓存
     *  适用于创建实例非常多的情况,便于管理,但是非线程安全
     */
}

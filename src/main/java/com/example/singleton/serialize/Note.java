package com.example.singleton.serialize;

public class Note {
    /**
     * 反序列化破坏单例
     *      将单例对象序列化到磁盘后,经过反序列化的 readObject
     *      ObjectInputStream.java
     *      1.readObejct() ==> return readObject(Object.class); 423行
     *      2.readObject(Object.class) ==> Object obj = readObject0(type, false); 465行
     *      3.readObject0 ==>有段 switch 代码： 1621行
     *              case TC_OBJECT:
     *                     if (type == String.class) {
     *                         throw new ClassCastException("Cannot cast an object to java.lang.String");
     *                     }
     *                     return checkResolve(readOrdinaryObject(unshared));
     *
     *      4.checkResolve(readOrdinaryObject(unshared))  1625行
     *      5.readOrdinaryObject(unshared) ==> obj = desc.isInstantiable() ? desc.newInstance() : null;  2110行
     *          ObjectStreamClass.java
     *      6. desc.isInstantiable() ==>    判断构造方法是否为空,不为空则返回 true：只要有无参构造方法就会实例化 1032行
     *              boolean isInstantiable() {
     *                  requireInitialized();
     *                  return (cons != null);
     *              }
     *      7.回到 readOrdinaryObject(unshared),在判断是否有构造器之后又调用了 desc.hasReadResolveMethod()
     *      8.desc.hasReadResolveMethod() ==>  判断 readResolveMethod 是否为空  1080行
     *              boolean hasReadResolveMethod() {
     *                  requireInitialized();
     *                  return (readResolveMethod != null);
     *              }
     *      9.找到 readResolveMethod 赋值的地方 ObjectStreamClass.java 533行
     *                          readResolveMethod = getInheritableMethod(cl, "readResolve", null, Object.class);
     *                          就是通过反射找到无参的 readResolve()方法,并保存下来
     *      10.回到 readOrdinaryObject(unshared),之后  Object rep = desc.invokeReadResolve(obj);   2135行
     *         desc.invokeReadResolve(obj) ==>return readResolveMethod.invoke(obj, (Object[]) null);  1274行
     *      11.desc.invokeReadResolve(obj) ==>通过反射调用了 readResolveMethod()方法返回实例
     *          readResolveMethod()也就是之前反射取得的 readResolve()
     *      12.对象实例化了两次,只不过新创建的对象没有被返回
     */
}

package com.kyle.single;

/**
 * 线程安全双重锁
 * Created by ko on 2018/5/12.
 */
public class ThreadSafeDoubleCheckLocking {

    /**
     *  类加载不实例化，并且使用volatile修饰
     *  volatile作用：当volatile修饰的变量在某一个线程发生改变时，会在所有用的此变量的线程刷新成新的值
     */
    private static volatile ThreadSafeDoubleCheckLocking instance;

    // 私有化构造器
    private ThreadSafeDoubleCheckLocking(){

        // 防止使用反射实例化ThreadSafeDoubleCheckLocking实例
        if (null == instance){
            throw new IllegalStateException("Already initialized!");
        }
    }

    /**
     * @description 给类添加同步锁实现单例模式
     * @return 唯一单例对象
     */
    public static ThreadSafeDoubleCheckLocking getInstance(){
        ThreadSafeDoubleCheckLocking result = instance;
        if (null == result){
            synchronized (ThreadSafeDoubleCheckLocking.class){
                result = instance;
                if (null == result){
                    instance = result = new ThreadSafeDoubleCheckLocking();
                }
            }
        }
        return result;
    }

}

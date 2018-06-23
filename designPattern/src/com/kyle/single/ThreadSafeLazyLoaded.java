package com.kyle.single;

/**
 * 线程安全的懒汉单例模式
 * Created by ko on 2018/5/12.
 */
public class ThreadSafeLazyLoaded {

    // 类加载时候不实例化
    private static ThreadSafeLazyLoaded instance;

    // 私有化构造器，防止运行期new新的实例
    private ThreadSafeLazyLoaded(){
        //防止反射调用
        if (null != instance){
            throw new IllegalStateException("Already initialized!");
        }
    }

    // 第一次用到的时候实例化，懒加载，线程安全
    public ThreadSafeLazyLoaded getInstance(){
        if (null == instance){
            instance = new ThreadSafeLazyLoaded();
        }
        return instance;
    }

}

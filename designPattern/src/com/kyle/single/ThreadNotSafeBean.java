package com.kyle.single;

/**
 * 懒汉模式 线程不安全
 * Created by ko on 2018/5/12.
 */
public class ThreadNotSafeBean {

    // 类加载时不实例化
    private static ThreadNotSafeBean instance;

    // 第一次用时 懒加载 线程不安全
    public static ThreadNotSafeBean getInstance(){
        // 以下代码线程不安全，多线程情况下可能会new出来多个实例
        if (null == instance){
            instance = new ThreadNotSafeBean();
        }
        return instance;
    }


}

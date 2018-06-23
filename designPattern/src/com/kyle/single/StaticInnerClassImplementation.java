package com.kyle.single;

/**
 * 静态内部类实现单例模式
 * Created by ko on 2018/5/12.
 */
public final class StaticInnerClassImplementation {

    // 私有化构造器
    private StaticInnerClassImplementation(){};

    public static StaticInnerClassImplementation getInstance(){
        return HelpHolder.INSTANCE;
    }

    // 静态内部类对外部类进行实例化
    private static class HelpHolder{
        private static StaticInnerClassImplementation INSTANCE = new StaticInnerClassImplementation();
    }

}

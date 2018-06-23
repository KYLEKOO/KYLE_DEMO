package com.kyle.single;

/**
 * 饿汉模式 线程安全
 * Created by ko on 2018/5/12.
 */
public class HungryManImplementation {

    //构造方法私有化 不允许外界直接创造对象
    private HungryManImplementation(){}

    /**
     * 创建类的唯一实例，使用 private static final 来修饰
     *  java虚拟机类加载的时候自动实例化static修饰的变量
     *  使用private 不允许通过 类名.instance 方式再次实例化
     */
    private static final HungryManImplementation instance = new HungryManImplementation();

    /**
     * 对外提供一个公共的用于获取实例的方法（public 修饰）
     * @return 唯一实例
     */
    public static HungryManImplementation getInstance(){
        return instance;
    }


}

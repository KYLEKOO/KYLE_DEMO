package com.kyle.factory;

/**
 * 抽象产品类（接口）
 * Created by ko on 2018/5/12.
 */
public interface Machine {
    // 车发动起来
    void start() ;
    // 车加速度
    void speed() ;
    // 车制动
    void stop() ;
}

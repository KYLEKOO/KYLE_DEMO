package com.kyle.factory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ko on 2018/5/12.
 */
public class Car implements Machine{
    private final Logger _logger = LoggerFactory.getLogger(this.getClass()) ;
    @Override
    public void start() {
        _logger.info("汽车启动啦");
    }

    @Override
    public void speed() {
        _logger.info("汽车加速啦");
    }

    public void blow() {
        _logger.info("汽车按铃啦");
    }

    @Override
    public void stop() {
        _logger.info("汽车停车啦");
    }
}

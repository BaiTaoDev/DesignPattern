package com.jamie.strategy;

/**
 * @author JamieBai
 * @create 2018/1/4
 */
public class StrategyB implements Strategy {

    @Override
    public void validService() {
        System.out.println("策略B");
    }
}

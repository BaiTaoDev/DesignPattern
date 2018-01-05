package com.jamie.strategy;

/**
 * @author JamieBai
 * @create 2018/1/4
 */
public class Context {
    private Strategy strategy;

    public void biz() {
        strategy.validService();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}

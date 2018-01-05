package com.jamie.strategy;

/**
 * @author JamieBai
 * @create 2018/1/4
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new StrategyA());
        context.biz();

        context.setStrategy(new StrategyB());
        context.biz();
    }
}

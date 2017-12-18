package com.jamie.observer.observer.ownimpl;

/**
 * @author JamieBai
 * @create 2017/12/16
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Observable observable = new Observable();
        observable.addObserver(new ConcreteObserver1());
        observable.addObserver(new ConcreteObserver2());

        observable.changed();
    }
}
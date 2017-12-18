package com.jamie.observer.observer.ownimpl;

/**
 * @author JamieBai
 * @create 2017/12/16
 */
public class ConcreteObserver2 implements Observer{

    public void update(Observable o) {
        System.out.println("观察者2观察到" + o.getClass().getSimpleName() + "发生变化");
    }

}
package com.jamie.observer.observer.ownimpl;

/**
 * @author JamieBai
 * @create 2017/12/16
 */
public class ConcreteObserver1 implements Observer{

    @Override
    public void update(Observable o) {
        System.out.println("观察者1观察到" + o.getClass().getSimpleName() + "发生变化");
    }

}
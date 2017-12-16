package com.jamie.observer.observer.ownimpl;

public class ConcreteObserver2 implements Observer{

    public void update(Observable o) {
        System.out.println("观察者2观察到" + o.getClass().getSimpleName() + "发生变化");
    }

}
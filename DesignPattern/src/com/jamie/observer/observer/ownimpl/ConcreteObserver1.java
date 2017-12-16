package com.jamie.observer.observer.ownimpl;

public class ConcreteObserver1 implements Observer{

    public void update(Observable o) {
        System.out.println("观察者1观察到" + o.getClass().getSimpleName() + "发生变化");
    }

}
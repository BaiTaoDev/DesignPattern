package com.jamie.observer.observer.ownimpl;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * @author JamieBai
 * @create 2017/12/16
 */
public class Observable {

    List<Observer> observers = new ArrayList<>();
    
    public void addObserver(Observer o){
        observers.add(o);
    }
    
    public void changed(){
        System.out.println("我是被观察者，我已经发生变化了");
        notifyObservers();//通知观察自己的所有观察者
    }
    
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
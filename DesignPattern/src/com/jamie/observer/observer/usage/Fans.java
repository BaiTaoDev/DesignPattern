package com.jamie.observer.observer.usage;

import java.util.Observable;
import java.util.Observer;

/**
 * @author JamieBai
 * @create 2017/12/16
 */
public class Fans implements Observer {

    private String name;

    public Fans(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof FootballPlayer) {
            System.out.println(name + "看到" + ((FootballPlayer)o).getName() + "发表了note.");
        }
    }
}

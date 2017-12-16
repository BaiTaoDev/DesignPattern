package com.jamie.observer.observer.usage;

import java.util.Observable;

/**
 * @author JamieBai
 * @create 2017/12/16
 */
public class FootballPlayer extends Observable {
    private String name;

    public FootballPlayer(String name) {
        this.name = name;
    }

    public void addNote(String note) {
        System.out.println(name + "发布了:" + note);
        setChanged();
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.jamie.proxy.ownimpl;

public class Tank implements Moveable {

    @Override
    public void move() {
        System.out.println("moving....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.jamie.proxy.ownimpl;


public class Client {
    public static void main(String[] args) throws Exception {
        InvocationHandler h = new TransactionHandler(new Tank());
        Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class, h);
        m.move();
    }
}

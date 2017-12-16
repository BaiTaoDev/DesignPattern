package com.jamie.proxy.ownimpl;

import java.lang.reflect.Method;

public class TransactionHandler implements InvocationHandler {

    private Object target;

    public TransactionHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public void invoke(Object o, Method md) throws Exception {
        System.out.println("transaction start....");
        md.invoke(target);
        System.out.println("transaction end....");
    }
}

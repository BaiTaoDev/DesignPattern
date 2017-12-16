package com.jamie.proxy.usage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author JamieBai
 * @create 2017/12/16
 */
public class PersonHandler implements InvocationHandler {

    private Object obj;

    public PersonHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {

        System.out.println("before");
        Object result = method.invoke(obj, args);
        System.out.println("after");
        return result;
    }

}
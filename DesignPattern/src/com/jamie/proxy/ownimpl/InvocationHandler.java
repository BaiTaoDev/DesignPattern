package com.jamie.proxy.ownimpl;

import java.lang.reflect.Method;

public interface InvocationHandler {
    void invoke(Object target, Method m) throws Exception;
}

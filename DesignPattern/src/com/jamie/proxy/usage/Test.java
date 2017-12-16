package com.jamie.proxy.usage;

import java.lang.reflect.Proxy;

/**
 * @author JamieBai
 * @create 2017/12/16
 */
public class Test {

    @org.junit.Test
    public void test(){
        Person person = new JavaDeveloper();
        PersonHandler handler = new PersonHandler(person);

        Person proxy = (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                handler);
        proxy.say();
    }
}

package com.jamie.observer.event;

import java.util.EventObject;

/**
 * @author JamieBai
 * @create 2017/12/17
 */
public class UserRegistEvent extends EventObject {
    public UserRegistEvent(User user) {
        super(user);
    }
}

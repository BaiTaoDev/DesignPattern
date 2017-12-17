package com.jamie.observer.event;

import java.util.EventObject;

/**
 * @author JamieBai
 * @create 2017/12/17
 */
public class UserFollowEvent extends EventObject {
    public UserFollowEvent(User user) {
        super(user);
    }
}

package com.jamie.observer.event;

import java.util.EventListener;

/**
 * @author JamieBai
 * @create 2017/12/17
 */
public interface UserRegistEventListener extends EventListener {
    void userRegist(UserRegistEvent event);
}

package com.jamie.observer.event;

import java.util.EventListener;

/**
 * @author JamieBai
 * @create 2017/12/17
 */
public interface UserFollowEventListener extends EventListener {
    void userFollow(UserFollowEvent event);
}

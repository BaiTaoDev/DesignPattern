package com.jamie.observer.event;

/**
 * @author JamieBai
 * @create 2017/12/17
 */
public class User {

    private String name;

    private UserFollowEventListener userFollowEventListener;

    private UserRegistEventListener userRegistEventListener;

    public void regist() {
        userRegistEventListener.userRegist(new UserRegistEvent(this));
    }

    public void follow() {
        userFollowEventListener.userFollow(new UserFollowEvent(this));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRegistEventListener getUserRegistEventListener() {
        return userRegistEventListener;
    }

    public void setUserRegistEventListener(UserRegistEventListener userRegistEventListener) {
        this.userRegistEventListener = userRegistEventListener;
    }

    public UserFollowEventListener getUserFollowEventListener() {
        return userFollowEventListener;
    }

    public void setUserFollowEventListener(UserFollowEventListener userFollowEventListener) {
        this.userFollowEventListener = userFollowEventListener;
    }
}

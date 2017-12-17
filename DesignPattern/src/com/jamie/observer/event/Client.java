package com.jamie.observer.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * @author JamieBai
 * @create 2017/12/17
 */
public class Client {

    private User user;

    public Client() {
        user = new User();
        user.setName("白陶");
        user.setUserRegistEventListener(new UserRegistEventListener() {
            @Override
            public void userRegist(UserRegistEvent event) {
                String name = ((User)event.getSource()).getName();
                System.out.println(name + "用户注册了");
            }
        });
        user.setUserFollowEventListener(new UserFollowEventListener() {
            @Override
            public void userFollow(UserFollowEvent event) {
                String name = ((User) event.getSource()).getName();
                System.out.println(name + "用户关注了");
            }
        });
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.getUser().regist();
        client.getUser().follow();
    }

    public User getUser() {
        return user;
    }
}

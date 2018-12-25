package com.jamie.adapter.object;

import com.jamie.observer.observer.ownimpl.Observable;
import com.jamie.observer.observer.ownimpl.Observer;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author baitao
 * @date 2018/9/19
 */
public class UserAdapter extends UserEntity implements Observer {

    @Override
    public void update(Observable o) {
        System.out.println("观察者User观察到" + o.getClass().getSimpleName() + "发生变化");

    }

    public static void main(String[] args) {
        CopyOnWriteArrayList<BaseEntity> list = new CopyOnWriteArrayList<>();
        list.add(new UserEntity());
        list.add(new UserEntity());
        list.add(new UserEntity());
    }
}

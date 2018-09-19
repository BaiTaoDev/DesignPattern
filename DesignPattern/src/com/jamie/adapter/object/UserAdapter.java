package com.jamie.adapter.object;

import com.jamie.observer.observer.ownimpl.Observable;
import com.jamie.observer.observer.ownimpl.Observer;

/**
 * @author baitao
 * @date 2018/9/19
 */
public class UserAdapter extends UserEntity implements Observer {

    @Override
    public void update(Observable o) {
        System.out.println("观察者User观察到" + o.getClass().getSimpleName() + "发生变化");
    }
}

package com.jamie.commond;

/**
 * @author baitao
 * @date 2018/12/25
 */
public class Recevier {
    private String name;

    public Recevier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void action(Command command) {
        System.out.println(name + "执行了" + command.getClass().getName());
    }

    @Override
    public String toString() {
        return "Recevier{" + "name='" + name + '\'' + '}';
    }
}

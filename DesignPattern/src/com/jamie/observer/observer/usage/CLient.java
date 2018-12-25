package com.jamie.observer.observer.usage;

/**
 * @author JamieBai
 * @create 2017/12/16
 */
public class Client {
    public static void main(String[] args) {
        FootballPlayer f1 = new FootballPlayer("C罗");
        FootballPlayer f2 = new FootballPlayer("梅西");
        Fans fans1 = new Fans("张三");
        Fans fans2 = new Fans("李四");
        f1.addObserver(fans1);
        f2.addObserver(fans1);

        f1.addObserver(fans2);
        f2.addObserver(fans2);

        f1.addNote("haha");
        f2.addNote("hehe");
    }
}

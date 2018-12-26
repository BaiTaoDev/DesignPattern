package com.jamie.commond;

/**
 * @author baitao
 * @date 2018/12/25
 */
public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new BugFixCommand(new Recevier("白陶")));
        invoker.ExecuteCommand();
    }
}

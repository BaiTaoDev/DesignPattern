package com.jamie.commond;

/**
 * @author baitao
 * @date 2018/12/25
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void ExecuteCommand() {
        command.execute();
    }
}

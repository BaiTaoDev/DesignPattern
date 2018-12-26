package com.jamie.commond;

/**
 * @author baitao
 * @date 2018/12/25
 */
public class BugFixCommand implements Command {

    private Recevier recevier;

    public BugFixCommand(Recevier recevier) {
        this.recevier = recevier;
    }

    @Override
    public void execute() {
        recevier.action(this);
    }
}

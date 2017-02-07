/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.d_command;

/**
 * 调用者
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2016/12/8 16:31 Exp $
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void action() {
        command.execute();
    }
}

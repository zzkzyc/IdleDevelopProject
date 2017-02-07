/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.d_command;

/**
 * 命令模式测试类
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2016/12/8 16:33 Exp $
 */
public class MainClass {

    public static void main(String[] args) {

        Command command = new FastPasteCommandImpl(new CopyReceiver(),new PasteReceiver());
        Invoker invoker = new Invoker(command);
        invoker.action();

        /*Command command = new CopyCommandImpl(new CopyReceiver());
        Invoker invoker = new Invoker(command);
        invoker.action();

        command = new PasteCommandImpl(new PasteReceiver());
        invoker = new Invoker(command);
        invoker.action();*/
    }
}

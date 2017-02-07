/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.a_factorymethod.common;

/**
 * mail方式发送
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/5/31 9:47 zhouzongkun Exp $$
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail send");
    }
}

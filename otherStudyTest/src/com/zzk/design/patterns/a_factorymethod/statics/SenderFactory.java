/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.a_factorymethod.statics;

/**
 * 发送工厂
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/5/31 10:52 zhouzongkun Exp $$
 */
public class SenderFactory {
    /**
     * 创建sms发送者
     * @param
     * @return
     * @throws
     * @date:  2016-05-31 10:37:32
     */
    public static Sender produceSmsSender() {
        return new SmsSender();
    }

    /**
     * 创建mail发送者
     * @return
     */
    public static Sender produceMailSender() {
        return new MailSender();
    }
}

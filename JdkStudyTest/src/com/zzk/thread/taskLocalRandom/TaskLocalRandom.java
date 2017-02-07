/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread.taskLocalRandom;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 并发集合（ThreadLocalRandom）创建并发随机数
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/29 15:26 zhouzongkun Exp $$
 */
public class TaskLocalRandom implements Runnable {
    public TaskLocalRandom() {
        ThreadLocalRandom.current();
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0 ; i < 10 ; i++) {
            System.out.printf("%s: %d\n",name,ThreadLocalRandom.current().nextInt(10));
        }
    }
}

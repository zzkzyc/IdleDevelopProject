/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread.taskLocalRandom;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/29 15:30 zhouzongkun Exp $$
 */
public class TaskLocalRandomTest {
    public static void main(String[] args) {
        Thread[] threads = new Thread[3];
        /*for (int i = 0 ; i < 3; i++) {
            TaskLocalRandom taskLocalRandom = new TaskLocalRandom();
            threads[i] = new Thread(taskLocalRandom);
            threads[i].start();
        }*/
        /*ThreadLocal<TaskLocalRandom> localRandom = new ThreadLocal<TaskLocalRandom>(){
            protected TaskLocalRandom initialValue() {
                return new TaskLocalRandom();
            }
        };*/
        for (int i = 0 ; i < 3; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.printf("%s : %d",Thread.currentThread().getName(), ThreadLocalRandom.current().nextInt(10,20));
                }
            });
            threads[i].start();
        }
    }
}

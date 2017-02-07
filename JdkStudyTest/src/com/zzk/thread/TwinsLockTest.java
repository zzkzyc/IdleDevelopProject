/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread;

import java.util.concurrent.locks.Lock;

/**
 * @author zhouzongkun
 * @version $$Id: HelloWorld, v 0.1 2016/5/26 14:59 zhouzongkun Exp $$
 */
public class TwinsLockTest {
    static final Lock lock = new TwinsLock();
    static class  Worker extends Thread {
        public void run() {
            while (true) {
                lock.lock();
                try {
                    Thread.sleep(1000);
                    System.out.println("当前线程为：" + Thread.currentThread());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Worker w = new Worker();
            w.start();
        }

        new Thread() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(200L);
                        System.out.println();
                    } catch (Exception ex) {
                    }
                }
            }
        }.start();

        try {
            Thread.sleep(20000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread;

import java.util.Collection;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhouzongkun
 * @version $$Id: HelloWorld, v 0.1 2016/5/26 15:25 zhouzongkun Exp $$
 */
public class ReentrantLockTest {
    static final Lock fairLock = new ReentrantLock2(true);
    static final Lock nonFairLock = new ReentrantLock2();

    private static class Job implements Runnable {
        private Lock lock;

        public Job(Lock lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                lock.lock();
                try {
                    System.out.println("Lock by :" + Thread.currentThread().getName() + "and" + ((ReentrantLock2) lock).getQueuedThreads() + "wait");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    /**
     * 定义自己的ReentrantLock
     */
    private static class ReentrantLock2 extends ReentrantLock {
        public ReentrantLock2(boolean fair) {
            super(fair);
        }

        public ReentrantLock2() {
            super();
        }

        public Collection<Thread> getQueuedThreads() {
            return super.getQueuedThreads();
        }
    }


    public static void main(String[] args) {
        System.out.println("fair version");
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Job(fairLock)){
                public String toString() {
                    return getName();
                }
            };
            thread.setName("fairThread_" + i);
            thread.start();
        }

       /* System.out.println("unfair version");
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Job(nonFairLock)) {
                public String toString() {
                    return getName();
                }
            };

            thread.setName("nonFairThread_" + i);
            thread.start();
        }*/
    }
}

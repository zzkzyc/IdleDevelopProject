/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicInteger测试
 *
 * atomicInteger     确保操作原子性
 * volatile          确保可见性，不能确保原子性
 * 锁                确保原子性和可见性
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/1 14:59 zhouzongkun Exp $$
 */
public class AtomicIntegerTest {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    private static int sum = 0;
    private static volatile int count = 0;
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    ++sum;
                    ++count;
                    atomicInteger.getAndIncrement();
                    //System.out.println(Thread.currentThread().getName() + "==" +atomicInteger.get() + "==========" + sum);
                   // System.out.println("================================");
                }
            }).start();
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(atomicInteger.get());
        System.out.println(sum);
        System.out.println(count);
    }
}

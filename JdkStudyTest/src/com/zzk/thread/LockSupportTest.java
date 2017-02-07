/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread;

import java.util.concurrent.locks.LockSupport;

/**
 * block当前线程，是否真的block了取决于permit是否available
 * permit相当于1,0的开关， 默认是0， 调一次unpark就+1变成1了,调一次park会消费这个1又变成0了（park立即返回）,
 * 再次调用park会变成block（因为没有1可以拿了，会等在这，直到有1），这时调用unpark会把1给回去(线程解锁返回)
 * 每个线程都有个相关的permit, permit最多一个,调用unpark多次也不会积累
 * 当为permit available时，方法会立即返回，不会block，反之就会block当前线程直到下面3件事发生
 * 1. 其他线程调用了unpark(此线程)
 * 2. 其他线程interrupts了此线程
 * 3. The call spuriously (that is, for no reason) returns.
 * @author zhouzongkun
 * @version $$Id: HelloWorld, v 0.1 2016/5/26 16:53 zhouzongkun Exp $$
 */
public class LockSupportTest {
    public static void main(String[] args) {
        //一开始会block线程，直到给定时间过去后才往下走
        System.out.println("start");
        LockSupport.parkNanos(1000000000);
        System.out.println("end");

       /* System.out.println("=========================================");
        //不会block，因为一开始给了一个permit
        System.out.println("start");
        LockSupport.unpark(Thread.currentThread());
        LockSupport.parkNanos(1000000000);
        System.out.println("end");

        System.out.println("=========================================");
        //第一个park不会block，第2个会，因为permit不会因为多次调用unpark就积累
        System.out.println("start");
        LockSupport.unpark(Thread.currentThread());
        LockSupport.unpark(Thread.currentThread());
        LockSupport.parkNanos(1000000000);
        System.out.println("inter");
        LockSupport.parkNanos(1000000000);
        System.out.println("end");*/

    }
}

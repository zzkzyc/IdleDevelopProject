/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread.blockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * 消费者
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/7/12 10:25 zhouzongkun Exp $$
 */
public class consumer implements Runnable{
    private final BlockingQueue<String> produceQueue;

    public consumer(BlockingQueue<String> produceQueue) {
        this.produceQueue = produceQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(produceQueue.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

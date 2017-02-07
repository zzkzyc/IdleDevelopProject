/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread.blockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * 生成者
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/7/12 10:19 zhouzongkun Exp $$
 */
public class produce implements Runnable{

    private final BlockingQueue<String> produceQueue;

    private final String name;

    public produce(BlockingQueue<String> produceQueue, String name) {
        this.produceQueue = produceQueue;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            produceQueue.put(name);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread.blockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 测试类
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/7/12 10:27 zhouzongkun Exp $$
 */
public class BlockingQueueTest {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<>(8);
        for(int i = 0; i < 16 ; i++) {
            String name = "我是第"+i+"个队列数字";
            new Thread(new produce(blockingQueue,name)).start();
        }
        for(int i = 0; i < 16 ; i++) {
            new Thread(new consumer(blockingQueue)).start();
        }
    }
}

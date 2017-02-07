/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * ArrayBlockingQueue功能测试
 *
 * @author zhouzongkun
 * @version : HelloWorld, v 0.1 2016/5/27 14:43 zhouzongkun Exp $$
 */
public class ArrayBlockingQueueTest {
    public static void main(String[] args) {
        final ArrayBlockingQueue<String> bq = new ArrayBlockingQueue<String>(8);

        for (int i = 0; i < 4; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            String log = bq.take();
                            System.out.println("目前在消费的log是："+log);
                            parseLog(log);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }

        for (int i = 0; i < 16; i++) {
            String log = i + 1 + "->";
            if (!bq.offer(log)) {
                System.out.println("当前队列已满，正等待消费");
            } else{
                System.out.println("正在添加的log是："+ log);
            }
        }
    }

    public static void parseLog(String log) {
        System.out.println(log + System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

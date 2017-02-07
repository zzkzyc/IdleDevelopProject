/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试Lock中Condition作用
 * <pre>
 *     生产者与消费者关系
 *     1：如果仓库已满，则生产者等待消费者消费完
 *     2：如果仓库清空，则消费者等待生产者生产完
 * </pre>
 *
 * @author zhouzongkun
 * @version : HelloWorld, v 0.1 2016/5/27 9:47 zhouzongkun Exp $$
 */
public class ConditionTest {

    public static Lock lock = new ReentrantLock();
    public static Condition empty = lock.newCondition();
    public static Condition full = lock.newCondition();

    public static void main(String[] args) {
        List list = new ArrayList(12);
        Product product = new Product(list,10);
        Consumer consumer = new Consumer(list,0);

        Thread tProduct = new Thread(product);
        Thread tConsumer = new Thread(consumer);

        tProduct.start();
        tConsumer.start();
    }

    static class Product implements Runnable {
        private List list;
        private int maxCount;

        public Product(List list, int maxCount) {
            super();
            this.list = list;
            this.maxCount = maxCount;
        }

        @Override
        public void run() {
            while (true) {
                if (lock.tryLock()) {
                    try {
                        if (getsize() >= maxCount) {
                            System.out.println("目前已满仓，无需再生产");
                            full.await();
                        }
                        //未满仓，则继续生产
                        System.out.println("开始生产。。。");
                        list.add(new Object());
                        empty.signal();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("未获取到生产资格。。。");
                }
            }
        }

        public int getsize() {
            return list.size();
        }
    }

    static class Consumer implements Runnable {
        private List list;
        private int minCount;

        public Consumer(List list, int minCount) {
            super();
            this.list = list;
            this.minCount = minCount;
        }

        @Override
        public void run() {
            while (true) {
                if (lock.tryLock()) {
                    try {
                        if ( getSize() <=minCount) {
                            System.out.println("已空仓，无产品可消费，请耐心等待。。。");
                            empty.await();
                        }
                        System.out.println("开始消费了。。。");
                        list.remove(0);
                        full.signal();
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("未获取到消费资格。。。");
                }
            }
        }
        public int getSize() {
            return list.size();
        }
    }

}

/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author zhouzongkun
 * @version $$Id: HelloWorld, v 0.1 2016/5/26 14:03 zhouzongkun Exp $$
 */
public class TwinsLock  implements Lock{

    private final Sync sync = new Sync(2);

    private static final class Sync extends AbstractQueuedSynchronizer {
        public Sync(int count) {
            if (count < 0) {
                throw new IllegalArgumentException("count must rather then zero");
            }
            setState(count);
        }
        public int tryAcquireShared (int acquire) {
            for (;;) {
                int current = getState();
                int newCount = current - acquire;
                if (newCount < 0 || compareAndSetState(current,newCount)) {
                    return newCount;
                }
            }
        }

        public boolean tryReleaseShared (int acquire) {
            for (;;) {
                int current = getState();
                int newCount = current + acquire;
                if (compareAndSetState(current,newCount)) {
                    return true;
                }
            }
        }
    }

    public void lock() {
        sync.acquireShared(1);
    }

    public void lockInterruptibly() throws InterruptedException {
        sync.acquireSharedInterruptibly(1);
    }

    public boolean tryLock() {
        return sync.tryAcquireShared(1) >= 0;
    }

    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return sync.tryAcquireSharedNanos(1,unit.toNanos(time));
    }

    public void unlock() {
        sync.releaseShared(1);
    }

    public Condition newCondition() {
        return null;
    }
}

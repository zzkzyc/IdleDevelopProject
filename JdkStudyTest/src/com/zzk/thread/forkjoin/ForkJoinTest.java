/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * forkJoin测试
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/5/31 15:16 zhouzongkun Exp $$
 */
public class ForkJoinTest extends RecursiveTask {

    private static final int THRESHOLD = 2;
    private int start;
    private int end;

    public ForkJoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Object compute() {
        int sum = 0;
        System.out.println("start==" + start +  "; end ==" +end);
        boolean canCompute = end - start <= THRESHOLD;
        if (canCompute) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            int mid = start + end / 2;
            ForkJoinTest leftTask = new ForkJoinTest(start,mid);
            ForkJoinTest rightTask = new ForkJoinTest(mid + 1,end);

            leftTask.fork();
            rightTask.fork();

            int leftResult = (int) leftTask.join();
            int rightResult = (int) rightTask.join();

            sum = leftResult + rightResult;

        }
        return sum;
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        //生成一个计算资格，负责计算1+2+3+4
        ForkJoinTest forkJoinTest = new ForkJoinTest(1,4);
        Future<Integer> result = forkJoinPool.submit(forkJoinTest);
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

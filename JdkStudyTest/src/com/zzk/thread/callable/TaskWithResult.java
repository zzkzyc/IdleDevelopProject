/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread.callable;

import java.util.concurrent.Callable;

/**
 * 创建从任务中返回值的多线程，可以判断他的状态
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/7/11 11:45 zhouzongkun Exp $$
 */
public class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id){
        this.id  = id;
    }
    @Override
    public String call() throws Exception {
        return "result of TaskWithResult" + id;
    }
}

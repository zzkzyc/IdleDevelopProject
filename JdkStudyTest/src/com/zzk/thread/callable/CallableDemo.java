/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.thread.callable;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/7/11 11:46 zhouzongkun Exp $$
 */
public class CallableDemo {
    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for(Future<String> fs : results){
            try{
                System.out.println(fs.get());//可以调用很多方法，包括是否工作等等
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                exec.shutdown();
            }
        }
    }
}

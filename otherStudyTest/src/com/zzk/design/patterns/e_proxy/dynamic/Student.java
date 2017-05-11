package com.zzk.design.patterns.e_proxy.dynamic;

/**
 * Created by zhouzongkun on 2017/5/10.
 */
public class Student implements IPerson {
    @Override
    public void say() {
        System.out.println("i am a student");
    }

    @Override
    public void run() {
        System.out.println("a student is running");
    }
}

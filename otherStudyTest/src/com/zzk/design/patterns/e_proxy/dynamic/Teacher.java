package com.zzk.design.patterns.e_proxy.dynamic;

/**
 * Created by zhouzongkun on 2017/5/10.
 */
public class Teacher implements IPerson {
    @Override
    public void say() {
        System.out.println("i am a teacher");
    }

    @Override
    public void run() {
        System.out.println("a teacher is running");
    }
}

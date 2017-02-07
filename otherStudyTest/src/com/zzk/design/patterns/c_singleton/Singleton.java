/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.c_singleton;

/**
 * 单例对象（Singleton）是一种常用的设计模式。在Java应用中，单例对象能保证在一个JVM中，该对象只有一个实例存在
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/15 20:12 zhouzongkun Exp $$
 */
public class Singleton {
    private Singleton () {

    }

    /**
     * 静态方式 - 饿汉式 - 类加载较慢，但是获取对象速度快 -基于类加载机制避免了多线程的同步问题
     */
   /* private static Singleton singleton = new Singleton();

    private static Singleton getInstance() {
        return singleton;
    }*/


    private static Singleton singleton;
    /**
     * 懒汉式 - 线程不安全，多线程不能正常工作
     */
    /*private static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }*/

    /**
     * 懒汉式 - 线程安全 - 但是每次调用getInstance都进行同步，不必要的同步开销
     * @return
     */
    /*private static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }*/
    /*private static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
            return singleton;
        }
    }*/
    /*private static Object object = new Object();
    private static Singleton getInstance() {
        synchronized (object) {
            if (singleton == null) {
                singleton = new Singleton();
            }
            return singleton;
        }
    }*/

    /**
     * 双重检查模式（DCL） - 两次判空，第一次是为了不必要的同步 - volatile关键字不一定非要使用，会多少影响性能 - 某些情况下会有DCL失效
     * @return
     */
    /*private static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }*/

    /**
     * 静态内部类 - 第一次加载时不会初始化，第一次调用getInstance，虚拟机加载SingletonHelper并且初始化Singleton - 既可以保证线程安全又可以保证Singleton类的唯一性
     * @return
     */
    /*private static Singleton getInstance() {
        return SingletonHelper.singleton;
    }
    private static class SingletonHelper {
        private static final Singleton singleton = new Singleton();
    }*/
}

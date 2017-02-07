/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.guava.collect.immutable;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

/**
 * 　在JDK中提供了Collections.unmodifiableXXX系列方法来实现不可变集合, 但是存在一些问题，下面我们先看一个具体实例
 *
 * Collections.unmodifiableList实现的不是真正的不可变集合，当原始集合修改后，不可变集合也发生变化。
 * 不可变集合不可以修改集合数据，当强制修改时会报错。
 *
 * 问题总结：
 *      1.它用起来笨拙繁琐你不得不在每个防御性编程拷贝的地方用这个方法
 *　　  2.它不安全：如果有对象reference原始的被封装的集合类，这些方法返回的集合也就不是正真的不可改变。
 *　　  3.效率低：因为它返回的数据结构本质仍旧是原来的集合类，所以它的操作开销，包括并发下修改检查，hash table里的额外数据空间都和原来的集合是一样的。
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/9 10:00 Exp $
 */
public class UnmodifiableListTest {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1,2,3);
        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("unmodifiableList:" + unmodifiableList);
        list.add(4);
        System.out.println("list 再添加4之后。。。");
        System.out.println("unmodifiableList:" + unmodifiableList);
    }

}

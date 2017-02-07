/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.guava.collect.immutable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Lists;

import java.awt.*;
import java.util.List;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/9 10:12 Exp $
 */
public class ImmutableTest {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1,2,3);
        ImmutableList<Integer> immutableList = ImmutableList.copyOf(list);
        System.out.println("immutableList:" +immutableList);
        list.add(4);
        System.out.println("list 再添加4之后。。。");
        System.out.println("immutableList:" + immutableList);

        ImmutableList<Integer> immutableList1 = ImmutableList.of(4,5,6);
        System.out.println("ImmutableList 用of创建并初始化：" + immutableList1);

        ImmutableSet<String> imSortList = ImmutableSortedSet.of("a", "b", "c", "a", "d", "b");
        System.out.println("imSortList："+imSortList);

        ImmutableSet<Integer> immutableSortedSet = ImmutableSortedSet.of(11,5,36,8,10);
        System.out.println("immutableSortedSet:" + immutableSortedSet);

        ImmutableSet<Color> immutableSet = ImmutableSet.<Color>builder().
                add(new Color(0,255,233)).add(new Color(255,0,0)).build();
        System.out.println("immutableSet : " + immutableSet);

        ImmutableSet<Integer> immutableSet1 = ImmutableSet.<Integer>builder().add(1).add(11).build();
        System.out.println("immutableSet1 :" +immutableSet1 );
    }
}

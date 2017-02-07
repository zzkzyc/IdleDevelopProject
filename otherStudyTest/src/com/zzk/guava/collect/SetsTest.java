/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.guava.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;

import java.util.Set;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/5 17:09 Exp $
 */
public class SetsTest {
    public static void main(String[] args) {
        String ss = "111";
        System.out.println(Preconditions.checkNotNull(ss));
        Set<Integer> set1 = Sets.newHashSet(1,2,3,4,5);
        Set<Integer> set2 = Sets.newHashSet(3,5,6,7);
        System.out.println("************SET并集************");
        Set<Integer> union = Sets.union(set1,set2);
        for (Integer i : union) {
            System.out.println(i);
        }
        System.out.println("************SET差集************");
        Set<Integer> difference = Sets.difference(set1,set2);
        for (Integer i : difference) {
            System.out.println(i);
        }
        System.out.println("************SET交集************");
        Set<Integer> intersection = Sets.intersection(set1, set2);
        for (Integer i : intersection) {
            System.out.println(i);
        }
    }
}

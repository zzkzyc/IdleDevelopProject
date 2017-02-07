/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.guava.collect;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;

import java.util.Map;

/**
 *  Multiset：不是集合，可以增加重复的元素，并且可以统计出重复元素的个数
 *
 *  Multiset占据了List和Set之间的一个灰色地带：允许重复，但是不保证顺序。
 *
 *  Multiset有一个有用的功能，就是跟踪每种对象的数量，所以你可以用来进行数字统计
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/5 15:30 Exp $
 */
public class MultisetTest {
    public static void main(String[] args) {
        Multiset<Integer> multiset = HashMultiset.create();
        multiset.add(1);
        multiset.add(2);
        multiset.add(1);
        System.out.println(multiset.count(1));
        System.out.println(multiset.count(2));
        System.out.println(multiset.size());
        System.out.println("********************");
        multiset.setCount(3,4);
        for (Integer i : multiset.elementSet()) {
            System.out.println(i);
        }
        System.out.println("********************");
        System.out.println(multiset.count(3));


        System.out.println("********************testWordCount方法********************");
        testWordCount();

        System.out.println("********************testWordCountWithMultiset********************");
        testWordCountWithMultiset();

    }

    public static void testWordCount() {
        String strWorld="wer|dffd|ddsa|dfd|dreg|de|dr|ce|ghrt|cf|gt|ser|tg|ghrt|cf|gt|" +
                "ser|tg|gt|kldf|dfg|vcd|fg|gt|ls|lser|dfr|wer|dffd|ddsa|dfd|dreg|de|dr|" +
                "ce|ghrt|cf|gt|ser|tg|gt|kldf|dfg|vcd|fg|gt|ls|lser|dfr";
        String[] wordArr = strWorld.split("\\|");
        Map<String,Integer> map = Maps.newHashMap();
        for (String str : wordArr) {
            if (map.containsKey(str)) {
                Integer count = map.get(str);
                map.put(str,count + 1);
            } else {
                map.put(str,1);
            }
        }
        System.out.println("map:");
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }

    public static void testWordCountWithMultiset() {
        String strWorld="wer|dffd|ddsa|dfd|dreg|de|dr|ce|ghrt|cf|gt|ser|tg|ghrt|cf|gt|" +
                "ser|tg|gt|kldf|dfg|vcd|fg|gt|ls|lser|dfr|wer|dffd|ddsa|dfd|dreg|de|dr|" +
                "ce|ghrt|cf|gt|ser|tg|gt|kldf|dfg|vcd|fg|gt|ls|lser|dfr";
        String[] wordArr = strWorld.split("\\|");
        Multiset<String> multiset = HashMultiset.create();
        for (String str : wordArr) {
            multiset.add(str);
        }
        for (String str : multiset.elementSet()) {
            System.out.println(str +":" + multiset.count(str));
        }
    }
}

/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.guava.collect;

import com.google.common.base.Function;
import com.google.common.collect.*;

import java.util.List;
import java.util.Map;

/**
 * Multimap：一种key可以重复的map，子类有ListMultimap和SetMultimap，对应的通过key分别得到list和set
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/5 14:21 Exp $
 */
public class MultimapTest {
    public static void main(String[] args) {
        System.out.println("*********************Multimap测试*******************");
        Multimap<Integer,Integer> multimap = ArrayListMultimap.create();
        multimap.put(1,1);
        multimap.put(1,1);
        multimap.put(1,2);
        multimap.put(1,4);
        System.out.println(multimap.get(1).size());
        for (Integer i : multimap.get(1)) {
            System.out.println(i);
        }
        System.out.println("*********************SetMultimap测试*******************");
        Multimap<Integer,Integer> setMultimap = HashMultimap.create();
        setMultimap.put(1,1);
        setMultimap.put(1,1);
        setMultimap.put(1,2);
        setMultimap.put(1,2);
        for (Integer i : setMultimap.get(1)) {
            System.out.println(i);
        }

        System.out.println("*********************分片集合测试测试*******************");

        Map<String,String> map = ImmutableMap.of("省","浙江","市","杭州");
        Map<String,String> map1 = ImmutableMap.of("省","江西","市","上饶");
        Map<String,String> map2 = ImmutableMap.of("省","浙江","市","义务");
        List<Map<String,String>> list = Lists.newArrayList(map,map1,map2);
        Multimap<String,Map<String,String>> shengMap = Multimaps.index(list, new Function<Map<String, String>, String>() {
            @Override
            public String apply(Map<String, String> input) {
                return input.get("省");
            }
        });
        Multimap<String,Map<String,String>> shiMap = Multimaps.index(list, new Function<Map<String, String>, String>() {
            @Override
            public String apply(Map<String, String> input) {
                return input.get("市");
            }
        });
        for(String ss : shengMap.keySet()) {
            System.out.println(ss);

            System.out.println("**************");

        }
        for(String ss : shiMap.keySet()) {
            System.out.println(ss);

            System.out.println("**************");

        }

    }
}

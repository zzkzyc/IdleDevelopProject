/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.guava.collect;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.*;
import com.zzk.guava.Person;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Lists测试类
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/5 9:46 Exp $
 */
public class ListsTest {
    public static void main(String[] args) {
        //一次性添加多个元素
        System.out.println("***********一次性添加多个元素****************");
        List<Integer> list = Lists.newArrayList(1,2,3);
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        //创建不可变list
        System.out.println("***********创建不可变list****************");

        List<Integer> list1 = ImmutableList.of(4,5);
        //list1.add(2);
        iter = list1.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        //创建不可变map
        System.out.println("***********创建不可变map****************");
        Map<Integer,Integer> map = ImmutableMap.of(1,1,2,2);
        Iterator<Integer> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            System.out.println(keys.next());
        }

        //通过copy其他list创建新不可变list
        System.out.println("***********通过copy其他list创建新不可变list****************");
        List<Integer> list2 = ImmutableList.copyOf(list);
        iter = list2.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("***********筛选集合(通过copy其他list创建新不可变list)****************");
        ImmutableMultiset<Person> persons = getList();
        for (Person person : persons.elementSet()) {
            System.out.println(person);
        }

        System.out.println("***********转换一个集合为另外一个集合(通过copy其他list创建新不可变list)****************");
        ImmutableList<String> Names = getNames();
        for (String string : Names.asList()) {
            System.out.println(string);
        }
    }

    /**
     * 筛选集合
     * @return
     */
    private static ImmutableMultiset<Person>  getList() {
        List<Person> list = Lists.newArrayList(new Person("zzk",1,1),new Person("zz",0,2),new Person("z",0,3));
        return ImmutableMultiset.copyOf(Collections2.filter(list, new Predicate<Person>() {
            @Override
            public boolean apply(Person input) {
                return input.getSex() == 0;
            }
        }));
    }

    /**
     * 转换一个集合为另外一个集合
     * @return
     */
    private static ImmutableList<String> getNames() {
        List<Person> list = Lists.newArrayList(new Person("zzk",1,1),new Person("zz",0,2),new Person("z",0,3),new Person("z",0,4));
        return ImmutableList.copyOf(Collections2.transform(list, new Function<Person, String>() {
            @Override
            public String apply(Person input) {
                return input.getName();
            }
        }));
    }
}

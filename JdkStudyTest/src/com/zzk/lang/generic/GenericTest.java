/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.lang.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型测试
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/16 20:47 zhouzongkun Exp $$
 */
public class GenericTest {
    public static void main(String[] args) {
        SubStack<Number> numberSubStack = new SubStack<>();
        numberSubStack.push(1);
        numberSubStack.push(2);
        numberSubStack.push("str");
        Collection<Object> objects = new ArrayList<>();
        numberSubStack.popAll(objects);
        Iterator iterator = objects.iterator();
       /* while (iterator.hasNext())
            System.out.println(iterator.next());*/

        System.out.println("==========================");

        SubStack<Number> numberSubStack1 = new SubStack<>();
        numberSubStack1.pushAll(iterator);
        Iterator iterator1 = numberSubStack1.iterator();
        while (iterator1.hasNext())
            System.out.println(iterator1.next());
    }
}

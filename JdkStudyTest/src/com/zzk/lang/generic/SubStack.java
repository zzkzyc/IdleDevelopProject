/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.lang.generic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/6/16 20:50 zhouzongkun Exp $$
 */
public class SubStack<E> extends Stack {
    /**
     *
     * @param src
     */
    public void pushAll(Iterator<? extends E> src) {
        while (src.hasNext()) {
            push(src.next());
        }
    }

    public void popAll(Collection<Object> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }
}

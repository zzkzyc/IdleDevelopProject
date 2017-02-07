/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.guava.collect.bimap;

import java.util.Map;
import java.util.Set;

/**
 * TODO:描述
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2017/1/5 16:25 Exp $
 */
public interface BiMapInterface<K,V> extends Map<K,V> {

    V put(K key,V value);

    void putAll(Map<? extends K,? extends V> map);

    Set<V> values();
}

/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.c_singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一管理多个单例
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/7/4 11:16 zhouzongkun Exp $$
 */
public class SingletonManager {
    private static Map<String,Object> instanceMap = new HashMap<>();

    public static void registerInstance(String key ,Object value) {
        if (!instanceMap.containsKey(key)) {
            instanceMap.put(key,value);
        }
    }

    public static Object getInstance(String key) {
        return instanceMap.get(key);
    }

    /*private static Map instanceMap = new HashMap();

    public static void registerInstance(String key ,Object value) {
        if (!instanceMap.containsKey(key)) {
            instanceMap.put(key,value);
        }
    }
    public static Object getInstance(String key) {
        return instanceMap.get(key);
    }*/
}

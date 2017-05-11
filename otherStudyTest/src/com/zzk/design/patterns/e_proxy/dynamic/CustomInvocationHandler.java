package com.zzk.design.patterns.e_proxy.dynamic;

import com.google.common.collect.Maps;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * Created by zhouzongkun on 2017/5/10.
 */
public class CustomInvocationHandler implements InvocationHandler {

    private Object object;

    private Map<String,Object> proxyObjectMap = Maps.newConcurrentMap();

    public Object getProxyObject(Object object) {
        this.object = object;
        String objectString = object.getClass().getPackage().toString() + "." + object.getClass().getName();
        System.out.println(objectString);
        Object proxyObject;

        //先从map里获取代理对象
        proxyObject = proxyObjectMap.get(objectString);
        System.out.println("GET OBJECT FROM MAP :" + proxyObject);
        if (proxyObject == null) {
            synchronized (proxyObjectMap) {

                //双重锁解决重复创建代理对象
                proxyObject = proxyObjectMap.get(objectString);
                if (proxyObject == null) {
                    System.out.println("DO NOT GET OBJECT FROM MAP :" + proxyObject);
                    proxyObject = Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
                    proxyObjectMap.put(objectString,proxyObject);
                }
            }

        }

        return proxyObject;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态反向代理开始");
        System.out.println("方法名："+ method.getName());
        method.invoke(object,args);
        System.out.println("动态反向代理结束");
        return null;
    }
}

package com.zzk.design.patterns.e_proxy.statics;

/**
 * Created by zhouzongkun on 2017/5/11.
 */
public class XiaoMing implements IPerson{
    private String name ;

    public XiaoMing(String name) {
        this.name = name;
    }

    public void giveFlowers() {
        System.out.println(name + "送一束花给你");
    }

    public void giveGift() {
        System.out.println(name + "送礼物给你");
    }
}

package com.zzk.design.patterns.e_proxy.statics;

/**
 * Created by zhouzongkun on 2017/5/11.
 */
public class XiaoMingProxy implements IPerson{
    private XiaoMing xiaoMing;

    public XiaoMingProxy(XiaoMing xiaoMing) {
        this.xiaoMing = xiaoMing;
    }

    @Override
    public void giveFlowers() {
        xiaoMing.giveFlowers();
    }

    @Override
    public void giveGift() {
        xiaoMing.giveGift();
    }
}

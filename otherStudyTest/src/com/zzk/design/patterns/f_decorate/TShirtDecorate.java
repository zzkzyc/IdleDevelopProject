package com.zzk.design.patterns.f_decorate;

/**
 * Created by zhouzongkun on 2017/5/12.
 */
public class TShirtDecorate extends AbstractDecorate {

    public TShirtDecorate(IComponent component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.print("穿着体恤");
    }
}

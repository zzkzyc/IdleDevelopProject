package com.zzk.design.patterns.f_decorate;

/**
 * Created by zhouzongkun on 2017/5/12.
 */
public class PantsInnerDecorate extends AbstractDecorate {

    public PantsInnerDecorate(IComponent component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("裤子下穿着内裤");
    }
}

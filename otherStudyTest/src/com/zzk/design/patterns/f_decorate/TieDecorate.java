package com.zzk.design.patterns.f_decorate;

/**
 * Created by zhouzongkun on 2017/5/12.
 */
public class TieDecorate extends AbstractDecorate {

    public TieDecorate(IComponent component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.print("打着领带");
    }
}

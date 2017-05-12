package com.zzk.design.patterns.f_decorate;

/**
 * Created by zhouzongkun on 2017/5/12.
 */
public class PantsOutDecorate extends AbstractDecorate {

    public PantsOutDecorate(IComponent component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("外面套着条内裤，瞬间超人");
    }
}

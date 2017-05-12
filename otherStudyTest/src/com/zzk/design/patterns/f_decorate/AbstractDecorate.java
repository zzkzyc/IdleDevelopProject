package com.zzk.design.patterns.f_decorate;

/**
 * Created by zhouzongkun on 2017/5/12.
 */
public abstract class AbstractDecorate implements IComponent {
    private IComponent component;

    public AbstractDecorate(IComponent component) {
        this.component = component;
    }

    @Override
    public void show() {
        component.show();
    }
}

package com.zzk.design.patterns.f_decorate;

/**
 * 需要被装饰的具体对象
 * Created by zhouzongkun on 2017/5/12.
 */
public class XiaoQiang implements IComponent {
    private String name;

    public XiaoQiang(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.print("帅气的" + name);
    }
}

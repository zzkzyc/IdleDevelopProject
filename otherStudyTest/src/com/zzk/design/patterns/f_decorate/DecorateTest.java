package com.zzk.design.patterns.f_decorate;

/**
 * Created by zhouzongkun on 2017/5/12.
 */
public class DecorateTest {
    public static void main(String[] args) {
        XiaoQiang xiaoQiang = new XiaoQiang("小强");
        TShirtDecorate tShirtDecorate = new TShirtDecorate(xiaoQiang);
        TieDecorate tieDecorate = new TieDecorate(tShirtDecorate);
        PantsInnerDecorate pantsInnerDecorate = new PantsInnerDecorate(tieDecorate);
        pantsInnerDecorate.show();

        System.out.println("=================================");

        TieDecorate tieDecorate1 = new TieDecorate(xiaoQiang);
        TShirtDecorate tShirtDecorate1 = new TShirtDecorate(tieDecorate1);
        PantsOutDecorate pantsOutDecorate = new PantsOutDecorate(tShirtDecorate1);
        pantsOutDecorate.show();
    }
}

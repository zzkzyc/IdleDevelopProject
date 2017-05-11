package com.zzk.design.patterns.e_proxy;

import com.zzk.design.patterns.e_proxy.statics.IPerson;
import com.zzk.design.patterns.e_proxy.statics.XiaoHong;
import com.zzk.design.patterns.e_proxy.statics.XiaoMing;
import com.zzk.design.patterns.e_proxy.statics.XiaoMingProxy;

/**
 * 用代理模式给美女送礼物
 *
 * <pre>
 *         这是一个神奇的故事。从前有个小伙，叫小明。因为爱上了一个美女叫小红，所以想给小红送礼物。
 *     由于小明是一个腼腆的男孩，且怕小红因为不认识他，不接受他。
 *         直达有一天，他看见他认识的一个朋友叫小强，居然跟小红在聊天，而且聊的很嗨，小明就心里打着小算盘。
 *     第二天早上，小明就拿着个礼物来到小强家，小强很高兴的接待了他。小明就将今天来的目的告诉了小强，小强
 *     二话不说就答应下来。在之后的每一天，小明都会给礼物小强，而小强也会把礼物送到小红手上。
 *         随着时间的推移，小红渐渐的爱上了小强。小强却不知道该如何是好。预知后面结果，请大家敬请关注。。。
 * </pre>
 *
 * Created by zhouzongkun on 2017/5/11.
 */
public class StaticsTest {

    public static void main(String[] args) {
        XiaoHong xiaoHong = new XiaoHong("小红");
        IPerson iPerson = new XiaoMingProxy(new XiaoMing(xiaoHong.getName()));
        iPerson.giveGift();
    }
}

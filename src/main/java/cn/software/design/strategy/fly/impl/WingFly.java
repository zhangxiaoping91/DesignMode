package cn.software.design.strategy.fly.impl;

import cn.software.design.strategy.fly.IFlyBehavior;

/**
 * @author ：zhangxpc@jiedaibao.com
 * @Description ：用翅膀飞
 * @ClassName ：WingFly
 * @date ：2017/5/7 10:01
 */
public class WingFly implements IFlyBehavior {
    public void fly() {
        System.out.println("using wing fly!!!");
    }
}

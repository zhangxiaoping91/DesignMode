package cn.software.design.strategy.fly.impl;

import cn.software.design.strategy.fly.IFlyBehavior;

/**
 * @author ：zhangxiaoping91@163.com
 * @Description ：不会飞
 * @ClassName ：NoFly
 * @date ：2017/5/7 10:08
 */
public class NoFly implements IFlyBehavior {
    public void fly() {
        System.out.println("no fly!!!");
    }
}

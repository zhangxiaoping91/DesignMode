package cn.software.design.strategy.fly.impl;

import cn.software.design.strategy.fly.IFlyBehavior;

/**
 * @author ：zhangxpc@jiedaibao.com
 * @Description ：借助工具飞
 * @ClassName ：ToolFly
 * @date ：2017/5/7 10:03
 */
public class ToolFly implements IFlyBehavior {
    public void fly() {
        System.out.println("using tool fly!!!");
    }
}

package cn.software.design.strategy.quack.impl;

import cn.software.design.strategy.quack.IQuackBehavior;

/**
 * @author ：zhangxiaoping91@163.com
 * @Description ：
 * @ClassName ：NoQuack
 * @date ：2017/5/7 10:11
 */
public class NoQuack implements IQuackBehavior {
    public void quack() {
        System.out.println("no quack");
    }
}

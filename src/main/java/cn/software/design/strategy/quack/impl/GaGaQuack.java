package cn.software.design.strategy.quack.impl;

import cn.software.design.strategy.quack.IQuackBehavior;

/**
 * @author ：zhangxiaoping91@163.com
 * @Description ：
 * @ClassName ：GaGaQuack
 * @date ：2017/5/7 10:10
 */
public class GaGaQuack implements IQuackBehavior {
    public void quack() {
        System.out.println("==gaga quack");
    }
}

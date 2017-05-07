package cn.software.design.strategy.duck;

import cn.software.design.strategy.fly.IFlyBehavior;
import cn.software.design.strategy.quack.IQuackBehavior;

/**
 * @author ：zhangxiaoping91@163.com
 * @Description ：
 * @ClassName ：AbstrackDuck
 * @date ：2017/5/7 10:12
 */
public abstract class AbstrackDuck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public AbstrackDuck() {

    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }
}

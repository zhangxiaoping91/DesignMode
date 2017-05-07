package cn.software.design.strategy;

import cn.software.design.strategy.duck.AbstrackDuck;
import cn.software.design.strategy.duck.GreenHeadDuck;
import cn.software.design.strategy.duck.RedHeadDuck;

/**
 * @author ：zhangxpc@jiedaibao.com
 * @Description ：duck策略模式演示
 * @ClassName ：Duck
 * @date ：2017/5/7 9:55
 */
public class Duck {
    public static void main(String[] args) {
        AbstrackDuck duck = new GreenHeadDuck();
        duck.fly();
        duck.quack();

        duck = new RedHeadDuck();
        duck.fly();
        duck.quack();

    }

}

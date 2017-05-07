package cn.software.design.strategy.duck;

import cn.software.design.strategy.fly.impl.ToolFly;
import cn.software.design.strategy.quack.impl.NoQuack;

/**
 * @author ：zhangxiaoping91@163.com
 * @Description ：
 * @ClassName ：RedHeadDuck
 * @date ：2017/5/7 10:17
 */
public class RedHeadDuck extends AbstrackDuck {
    public RedHeadDuck(){
        flyBehavior = new ToolFly();
        quackBehavior = new NoQuack();
    }
}

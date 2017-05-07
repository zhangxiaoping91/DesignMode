package cn.software.design.strategy.duck;

import cn.software.design.strategy.fly.impl.WingFly;
import cn.software.design.strategy.quack.impl.GaGaQuack;

/**
 * @author ：zhangxiaoping91@163.com
 * @Description ：
 * @ClassName ：GreenHeadDuck
 * @date ：2017/5/7 10:15
 */
public class GreenHeadDuck  extends  AbstrackDuck{
    public  GreenHeadDuck(){
        flyBehavior = new WingFly();
        quackBehavior = new GaGaQuack();
    }
}

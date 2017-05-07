package cn.software.design.observer.abs.impl;

import cn.software.design.observer.abs.Observer;

/**
 * @author ：zhangxiaoping91@163.com
 * @Description ：   预测明天的天气情况
 * @ClassName ：ForcaseCondition
 * @date ：2017/5/7 20:09
 */
public class ForcaseCondition implements Observer{
    private float mt;
    private float mp;
    private float mh;
    public void update(float mt, float mp, float mh) {
        this.mt = mt;
        this.mp = mp;
        this.mh = mh;
        display();
    }

    public void display(){
        System.out.println("***tomorrow mt is "+ mt+Math.random());
        System.out.println("***tomorrow mp is "+ mp+10*Math.random());
        System.out.println("***tomorrow mh is "+ mh+Math.random());
    }
}

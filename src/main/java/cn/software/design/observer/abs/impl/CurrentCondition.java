package cn.software.design.observer.abs.impl;

import cn.software.design.observer.abs.Observer;

/**
 * @author ：zhangxiaoping91@163.com
 * @Description ：当前天气情况
 * @ClassName ：CurrentCondition
 * @date ：2017/5/7 20:05
 */
public class CurrentCondition implements Observer {
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
        System.out.println("***today mt is "+ mt);
        System.out.println("***today mp is "+ mp);
        System.out.println("***today mh is "+ mh);
    }
}

package cn.software.design.observer.abs.impl;

import cn.software.design.observer.abs.Observer;
import cn.software.design.observer.abs.Subject;

import java.util.ArrayList;

/**
 * @author ：zhangxiaoping91@163.com
 * @Description ：
 * @ClassName ：WeatherDataSubject
 * @date ：2017/5/7 20:12
 */
public class WeatherDataSubject implements Subject {
    private float mt;
    private float mp;
    private float mh;
    private ArrayList<Observer> observers;

    public WeatherDataSubject() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(getMt(), getMp(), getMh());
        }

    }

    public float getMt() {
        return mt;
    }

    public float getMp() {
        return mp;
    }

    public float getMh() {
        return mh;
    }

    public void dataChange() {
             notifyObserver();
    }

    public void setData(float mt, float mp, float mh) {
        this.mt = mt;
        this.mp = mp;
        this.mh = mh;
        dataChange();
    }
}

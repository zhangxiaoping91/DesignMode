package cn.software.design.observer;

import cn.software.design.observer.abs.impl.CurrentCondition;
import cn.software.design.observer.abs.impl.ForcaseCondition;
import cn.software.design.observer.abs.impl.WeatherDataSubject;

/**
 * @author ：zhangxiaoping91@163.com
 * @Description ：观察者之天气预测测试类
 * @ClassName ：WeatherData
 * @date ：2017/5/7 19:57
 */
public class WeatherData {
    public static void main(String[] args) {
        CurrentCondition currentCondition;
        ForcaseCondition forcaseCondition;
        WeatherDataSubject weatherDataSubject;
        currentCondition = new CurrentCondition();
        forcaseCondition = new ForcaseCondition();
        weatherDataSubject = new WeatherDataSubject();
        weatherDataSubject.registerObserver(currentCondition);
        weatherDataSubject.registerObserver(forcaseCondition);
        weatherDataSubject.setData(30,150,40);
        System.out.println("****************************************************");
        weatherDataSubject.removeObserver(currentCondition);
        weatherDataSubject.setData(50,150,40);

    }
}

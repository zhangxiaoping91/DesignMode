package cn.software.design.observer.abs;

/**
 * @author ：zhangxiaoping91@163.com
 * @Description ：观察者的订阅、移除、通知
 * @ClassName ：Subject
 * @date ：2017/5/7 19:59
 */
public interface Subject {
    /**
     * 注册观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     *
     */
    void notifyObserver();
}

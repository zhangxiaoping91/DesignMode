package cn.software.design.observer.abs;

/**
 * @author ：zhangxiaoping91@163.com
 * @Description ：   第三方
 * @ClassName ：Observer
 * @date ：2017/5/7 20:00
 */
public interface Observer {
    /**
     * 通知更新天气
     *
     * @param mt 温度
     * @param mp 气压
     * @param mh 湿度
     */
    void update(float mt, float mp, float mh);
}

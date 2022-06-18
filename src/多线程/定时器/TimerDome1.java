package 多线程.定时器;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer定时器的使用
 * Timer是单线程,存在延时与设置定时器的时间有出入
 * 某一任务死虚拟机直接挂
 */
public class TimerDome1 {
    public static void main(String[] args) {
        Timer timer=new Timer();
        //定时器本身是一个单线程
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行一次A"+new Date());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },0,2000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行一次B"+new Date());
            }
        },0,2000);
    }
}

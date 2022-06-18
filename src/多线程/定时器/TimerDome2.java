package 多线程.定时器;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TimerDome2 {
    public static void main(String[] args) {
        //创建ScheduledExecutorService线程池,做定时器
        //线程1挂掉线程2继续跑
        //任务挂掉,不抛异常,正常运行.线程会挂掉
        ScheduledExecutorService pool=new ScheduledThreadPoolExecutor(3);
        //开始定时任务
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行输出AAA"+new Date());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },0,2, TimeUnit.SECONDS);
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+10/0+new Date());

            }
        },0,2, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行输出CCC"+new Date());

            }
        },0,2, TimeUnit.SECONDS);
    }
}

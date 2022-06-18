package 多线程.线程池;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i< 5; i++) {
            System.out.println(Thread.currentThread().getName()+"输出了:HelloWorld===>"+i);
        }
        try {
            System.out.println(Thread.currentThread().getName()+"此任务与线程绑定线程开始休眠");
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

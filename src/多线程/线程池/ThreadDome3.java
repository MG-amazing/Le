package 多线程.线程池;


import java.util.concurrent.*;


public class ThreadDome3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //固定线程
        //允许请求的任务队列的长度是有限的,任务太多直接挂
        //不会导致内存溢出
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());//已经没有线程了


    }
}

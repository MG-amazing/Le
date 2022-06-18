package 多线程.线程池;


import java.util.concurrent.*;

/**
 * 自定义创建线程池对象,并使用
 * int corePoolSize,
 * int maximumPoolSize,
 * long keepAliveTime,
 * TimeUnit unit,
 * BlockingQueue<Runnable> workQueue,
 * ThreadFactory threadFactory,
 * RejectedExecutionHandler handle
 */
public class ThreadDome2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        //给任务交给线程池

        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));
        Future<String> f5 = pool.submit(new MyCallable(500));
        //主线程会等待线程执行完成后再去拿结果
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
        System.out.println(f5.get());

    }
}

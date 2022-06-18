package 多线程.线程池;

/**
 *
 * 线程池就是复用线程的技术
 * ThreadPoolExecutor构造器参数说明
 * 参数一 corePoolSize指定线程池的线程数量(核心线程)    不能小于0
 * 参数二maximumPoolSize指定线程池可支持的最大线程数    最大数量>=核心线程数量
 * 参数三keepAliveTime指定临时线程的最大存活时间    不能小于0
 * 参数四unit指定存活时间单位      时间单位
 * 参数五指定任务队列workQueue 不能为null
 * 参数六threadFactory指定使用那个线程工厂创建线程  不能为null
 * 参数七handler指定线程忙,任务满的时候新任务来了怎么办   不能为null//具体的策略
 * 拒绝策略 ThreadPoolExecutor.AbortPolicy 丢弃当前执行的任务并抛出异常默认的策略RejectedExecutionException默认的策略
 * ThreadPoolExecutor.DiscardPolicy 丢弃当前正在执行的任务,不会抛出异常
 * ThreadPoolExecutor.DiscardOldestPolicy 抛弃队列中等待最久的任务 把当前任务加入队列中去
 *ThreadPoolExecutor.CallerRunsPolicy 主线程负责调用run()方法从而绕过线程池直接执行==>变为单线程
 * 临时线程什么时候创建?
 * 新任务提交时发现核心线程都在忙,任务队列也满了,并且还可以创建临时线程,此时才会创建临时线程
 * 什么时候会开始拒绝任务?
 * 核心线程和临时线程都在忙,任务队列也满了,新的任务过来的时候才会开始任务拒绝
 */
/**
 * Executors 线程池的工具类通过调用方法返回不同类型的线程池对象
 * newCachedThreadPool() 线程数量随着任务增加而增加,如果线程任务执行完毕且空闲了一段时间则会被回收掉
 * newFixedThreadPool() (int nThreads)创建固定的线程数量的线程池,如果某个线程因为执行异常而结束,那么线程池会补充一个新
 * 线程替代它
 * newSingleThreadExecutor()创建只有一个线程的线程池对象,如果该线程出现异常而结束,那么线程池会补充一个新线程.
 * newScheduledThreadPool(int corePoolSize)创建一个线程池,可以实现在给定的延迟后运行执行任务,或者定期执行任务.
 * 任务过多,内存溢出,线程过多,内存溢出
 */

import java.util.concurrent.*;

/**
 * 自定义创建线程池对象,并使用
 *                               int corePoolSize,
 *                               int maximumPoolSize,
 *                               long keepAliveTime,
 *                               TimeUnit unit,
 *                               BlockingQueue<Runnable> workQueue,
 *                               ThreadFactory threadFactory,
 *                               RejectedExecutionHandler handle
 */
public class ThreadDome1{
    public static void main(String[] args) {
        ExecutorService pool=new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        //给任务交给线程池
        Runnable target=new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        //创建临时线程
        pool.execute(target);
        //继续创建临时线程
        pool.execute(target);
        //pool.shutdownNow();//立即关闭,即使任务没有完成,会丢失任务 跑路的代码==>抛出线程睡眠打死异常
        //拒绝策略被触发,拒接任务
        //pool.execute(target);
        //关闭线程池  一般不会用到
        pool.shutdown();//等待任务销毁后关闭线程



    }
}

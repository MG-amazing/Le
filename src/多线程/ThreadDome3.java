package 多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 目标:实现Callable接口,结合FutureTask完成
 */
public class ThreadDome3 {
    public static void main(String[] args) {
        //创建任务对象
        Callable<String> call = new MyCallable(100);
        //把Callable任务对象交给 FutureTask 对象
        //FutureTask对象的作用1:是Runnable 的对象(实现了Runnable接口),可以交给Thread
        //FutureTask对象的作用2:可以在线程执行完毕之后通过调用get方法得到线程执行完成的结果
        FutureTask<String>f1=new FutureTask<>(call);
        //交给线程处理
        Thread t1=new Thread(f1);
        //启动线程
        t1.start();


        Callable<String> call1 = new MyCallable(200);
        //把Callable任务对象交给 FutureTask 对象
        //FutureTask对象的作用1:是Runnable 的对象(实现了Runnable接口),可以交给Thread
        //FutureTask对象的作用2:可以在线程执行完毕之后通过调用get方法得到线程执行完成的结果
        FutureTask<String>f2=new FutureTask<>(call1);
        //交给线程处理
        Thread t2=new Thread(f2);
        //启动线程
        t2.start();

        try {
            //f1等待线程1执行完毕
            String rs1=f1.get();
            System.out.println(rs1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //f1等待线程1执行完毕
            String rs2=f2.get();
            System.out.println(rs2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * 定义一个任务类实现Callable接口,应该申明任务完成后的数据类型
 */
class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "子线程执行结果是" + sum;
    }
}

package 多线程.线程池;

import java.util.concurrent.Callable;

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
        return Thread.currentThread().getName()+"执行1-"+n+"的结果是" + sum;
    }
}

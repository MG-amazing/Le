package 多线程.线程创建;

/**
 学会线程创建方式2,理解其优缺点
 优点只是实现接口,可以继续继承和实现接口,扩展性强
 缺点编程多一层包装对象,如果线程执行结果是不可以直接返回的
 */
public class ThreadDome2 {
    public static void main(String[] args) {
        Runnable task=new MyRunnable();
        Thread thread=new Thread(task);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程输出"+i);
        }
    }
}
/**
 * 定义一个线程任务类 实现Runnable接口
 */

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("字线程输出"+i);
        }
    }
}
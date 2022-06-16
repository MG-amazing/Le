package 多线程.线程创建;

//使用多线程可以继承Thread类来实现
//此方法代码简单,容易理解
//已继承Thread无法继承其他类
//start可以将任务提交给CPU
public class ThreadDome1 {
    public static void main(String[] args) {
        Thread t=new MyThread();
        t.start();
        for (int i = 0; i <5 ; i++) {
            System.out.println("主线程输出"+i);
        }

    }
}

class MyThread extends Thread {
    /**
     * 重写Run方法
     */
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出" + i);
        }
    }
}


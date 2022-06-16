package 多线程.线程api;



public class MyThreadDome1 {
    public static void main(String[] args) {
        Thread t1=new MyThread("一号线程");

        t1.setName("1号");
        t1.start();
        Thread t2=new MyThread("二号线程");
        t2.setName("2号");
        t2.start();
        //那个线程执行就得到那个线程对象
        Thread m=Thread.currentThread();
        System.out.println(m.getName());
        for (int i = 0; i <5 ; i++) {
            System.out.println("main线程输出"+i);
        }

    }
}

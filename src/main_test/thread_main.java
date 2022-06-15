package main_test;

public class thread_main {
    public static void main(String[] args) {
        saleRunnable sr = new saleRunnable();
        Thread s1 = new Thread(sr, "1");
        Thread s2 = new Thread(sr, "2");
        Thread s3 = new Thread(sr, "3");
        Thread s4 = new Thread(sr, "4");
        s1.setPriority(1);
        s2.setPriority(2);
        s3.setPriority(3);
        s4.setPriority(4);
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}

class saleRunnable implements Runnable {
    private int ticks = 30;

    @Override
    public void run() {
        while (true) {
            if (ticks > 0) {
                System.out.println("输出当前的线程名称" + java.lang.Thread.currentThread().getName() + "售出" + (ticks--));
                System.out.println("----"+Thread.currentThread().getPriority());
            }
        }
    }
}
package 多线程.线程api;


public class MyThreadDome2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 5; i++) {
            System.out.println("输出" + i);
            if (i == 3) {
                //线程休眠
                Thread.sleep(3000);

            }
        }
    }
}

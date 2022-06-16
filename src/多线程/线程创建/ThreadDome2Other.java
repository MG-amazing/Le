package 多线程.线程创建;

/**
 * 多线程创建方式1
 */
public class ThreadDome2Other {
    public static void main(String[] args) {
        Runnable task=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println("子线程1执行输出"+i);
                }
            }
        };
        new Thread (new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println("子线程2执行输出"+i);
                }
            }
        }).start();

        new Thread (() -> {
            for (int i = 0; i <10 ; i++) {
                System.out.println("子线程3执行输出"+i);
            }
        }).start();


        Thread t=new Thread(task);
        t.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("主线程输出"+i);
        }
    }
}

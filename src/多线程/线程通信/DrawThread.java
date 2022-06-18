package 多线程.线程通信;

public class DrawThread extends Thread{
    private Account acc;

    public DrawThread(Account acc,String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        while (true) {
            acc.drawMoney(100000);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package 多线程.线程通信;

public class DepositThread extends Thread{
    private Account acc;

    public DepositThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }
//亲爹\干爹\岳父
    @Override
    public void run() {
        while (true) {
            acc.deposit(100000);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

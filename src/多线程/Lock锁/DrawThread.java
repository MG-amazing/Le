package 多线程.Lock锁;

/**
 * 取钱的线程类
 */
public class DrawThread extends Thread{
    private Account acc;

    /**
     * 接受处理账户对象
     * @param acc
     */
    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        //取钱的方法
        //小明和小红
        acc.drawMoney(100000);

    }
}

package 多线程.线程通信;

public class Account {
    private String cardId;
    private double money;

    public Account() {

    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * 小明 小红 取钱
     *
     * @param money
     */
    public synchronized void drawMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if (this.money >= money) {
                //钱够
                this.money -= money;
                System.out.println(name+"来取钱"+money+"成功\t,余额是:"+this.money);
            } else {
                //钱不够.不可取
                //唤醒别人,等待自己
                this.notifyAll();//唤醒所有线程
                this.wait();//锁对象让当前线程进入等待!
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void deposit(double money) {
        String name=Thread.currentThread().getName();
        try {
            if (this.money==0){
                this.money+=money;
                System.out.println(name+"存钱"+money+"存钱成功\t存钱后的余额是:"+this.money);
                //没钱了
                this.notifyAll();
                //唤醒其他线程
                this.wait();
            }else {
                //有钱,不存钱
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

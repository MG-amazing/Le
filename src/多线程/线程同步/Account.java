package 多线程.线程同步;

public class Account  {
    private String cardId;
    private double money;

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public Account() {
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
     *
     * @param money
     * 在方法体上面加synchronized可以实现线程安全问题
     */
    public synchronized void drawMoney(double money) {
        //先查看是谁来取钱,看线程的名称是谁
        String name=Thread.currentThread().getName();
       //第一步判断账户中钱是否足够

        //this代指当前账户对象

            if (this.money>=money){
                //吐钱
                System.out.println(name+"来取钱成功吐出"+money);
                //更新金额
                this.money-=money;
                System.out.println(name+"取钱后剩余:"+this.money);
            }else {
                System.out.println(name+"来取钱余额不足");
            }


    }
}

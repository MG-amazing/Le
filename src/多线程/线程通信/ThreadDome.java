package 多线程.线程通信;

public class ThreadDome {
    public static void main(String[] args) {
        //了解线程通信的流程
        //使用三个爸爸存钱,2个孩子取钱,模拟线程通信的思想(一存 一取)
        //创建账户对象,代表5个人共同操作的账户.
        Account acc=new Account("ICBC-112",0);
        //创建2个取钱线程代表小明和小红
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();
        //创建3个线程代表代表 亲爹 干爹 岳父
        new DepositThread(acc,"亲爹").start();
        new DepositThread(acc,"干爹").start();
        new DepositThread(acc,"岳父").start();


    }
}

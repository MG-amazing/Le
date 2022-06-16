package 多线程.线程api;

public class MyThread extends Thread{
    public  MyThread(){

    }
    public MyThread(String name){
        //为当前线程对象设置名称,送给父类有参构造器初始化名称
        super(name);
    }
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread());
        }
    }
}

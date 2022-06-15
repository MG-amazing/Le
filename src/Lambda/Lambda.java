package Lambda;


public class Lambda {
    public static void main(String[] args) {
        Animal a=new Animal() {
            @Override
            public void run() {
                System.out.println("乌龟跑的很快");
            }
        };
        a.run();//抽象类不能被简化



    }
}
abstract  class Animal{
    public abstract void run();
}
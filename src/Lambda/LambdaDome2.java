package Lambda;

public class LambdaDome2 {
    public static void main(String[] args) {
        //只能简化抽象类接口中只有一个抽象方法的内部类形式
        //lambda
//        Swimming s1=new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("老师游泳");
//            }
//        };
        Swimming s1=()->{
            System.out.println("老师游泳");
        };
        go(s1);
        System.out.println("--------------------------------");
//        go(new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("学生游泳");
//            }0=-e//        });
        go(()->{System.out.println("学生游泳");});




    }
    public static void go(Swimming s){
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}
@FunctionalInterface// 里面只能有一个抽象方法
interface Swimming{
    void swim();
}
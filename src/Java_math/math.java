package Java_math;
import java.util.Arrays;

public class math {
    public static void main(String[] args) {
        //取绝对值
        System.out.println(Math.abs(10));//10
        System.out.println(Math.abs(-10.3));//10.3
        //向上取整
        System.out.println(Math.ceil(4.00000000001));//5.0
        System.out.println(Math.ceil(4.0));//4.0
        //向下取整
        System.out.println(Math.floor(4.9999999999));//4.0
        System.out.println(Math.floor(4.0));//4.0
        //取指数次方
        System.out.println(Math.pow(2, 3));//2^3=8
        //四舍五入
        System.out.println(Math.round(4.49999));//4
        System.out.println(Math.round(4.5000001));//5
        System.out.println(Math.random());//0.0-1.0
        //3-9之间的随机数
        //[0-6)+3
        int data = (int) (Math.random() * 7) + 3;
        System.out.println(data);
        //System.exit(0);千万不要用干掉系统
        //获取当前时间的毫秒值，从1970-1-1 00:00:00
        long time =System.currentTimeMillis();
        System.out.println(time);
        //进行性能分析
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long endTime =System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000.0+"s");
        //数组拷贝
        int [] arr1={10,20,30,40,50,60,70};
        int [] arr2=new int[6];//==>[0,0,40,50,60,0]
        System.arraycopy(arr1,3,arr2,2,3);
        System.out.println(Arrays.toString(arr2));
    }
}

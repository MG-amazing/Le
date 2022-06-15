package D2_pararns;

import java.util.Arrays;
/**
 * 可变参数用在形式中可以接受多个数据。
 * 可变参数的格式：数据类型。。。参数名称
 * 可变参数的作用，方便。可以不传参数，可以传输1个或多个，也可以传输一个数组
 * 一个形参列表中只能有一个可变参数。（相当严谨）
 * 可变参数必须放在形参列表的最后面
 * 传参数非常灵活，方便
 */


public class Method {
    public static void main(String[] args) {
        sum();//可以不传参数
        sum(10);//可以传一个参数
        sum(10,20,30);//可以传输多个参数
        sum(new  int[]{10,20,30,40,50});//可以传一个数组
    }
    public static void sum(int...nums){
        System.out.println("元素个数"+nums.length);
        System.out.println("元素内容"+ Arrays.toString(nums));
    }
}

package BigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BD {
    public static void main(String[] args) {
        System.out.println(0.01+0.09);
        System.out.println(1.0-0.32);
        System.out.println(1.015*100);
        System.out.println(1.301/100);
        System.out.println("--------------------");
        double a=0.1;
        double b=0.2;
        double c=a+b;
        System.out.println(c);
        System.out.println("----------------------");
        BigDecimal a1=BigDecimal.valueOf(a);
        BigDecimal b1=BigDecimal.valueOf(b);
        BigDecimal c1=a1.add(b1);//加法
        System.out.println(c1);
        BigDecimal c2=a1.subtract(c1);//减法
        System.out.println(c2);
        BigDecimal c3 =a1.multiply(c2);//乘法
        System.out.println(c3);
        BigDecimal c4=a1.divide(c2);//除法
        System.out.println(c4);
        //转完接一下转成double方可运算或使用

        //BigDecimal遇到无限循环小数时崩溃
        BigDecimal a11=BigDecimal.valueOf(10.0);
        BigDecimal b11=BigDecimal.valueOf(3.0);
        //BigDecimal c11=a11.divide(b11);运行时崩溃
        BigDecimal c11=a11.divide(b11,2, RoundingMode.HALF_UP);//保留两位小数四舍五入
        System.out.println(c11);
    }
}

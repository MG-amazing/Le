package regex;

import java.util.Scanner;

public class RegexTest3 {
    public static void main(String[] args) {
        //校验手机号码 邮箱 电话号码
        checkPhone();
        checkEmail();
    }

    public static void checkEmail(){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的手机号码:");
            String phone=sc.next();
            if (phone.matches("")){
                System.out.println("手机号码格式正确，注册完成!");
                break;
            }else {
                System.out.println("格式有误");
            }
        }
    }

    public static void checkPhone(){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的手机号码:");
            String phone=sc.next();
            if (phone.matches("1[3-9]\\d{9}")){
                System.out.println("手机号码格式正确，注册完成!");
                break;
            }else {
                System.out.println("格式有误");
            }
        }
    }
}

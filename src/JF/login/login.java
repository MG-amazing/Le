package JF.login;

import javax.swing.*;
import java.awt.*;

public class login {
    public static void main(String[] args) {
        IUI();
    }

    private static void IUI() {
        JFrame frame=new JFrame();
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel label=new JLabel("姓名:");
        label.setSize(70,30);
        label.setFont(new Font("宋体",Font.BOLD,20));
        label.setLocation(200,100);
        frame.add(label);
        JLabel label1=new JLabel("密码:");
        label1.setLocation(200,200);
        label1.setFont(new Font("宋体",Font.BOLD,20));
        label1.setSize(70,30);
        frame.add(label1);
        TextField t1=new TextField();
        t1.setSize(100,30);
        t1.setLocation(350,100);
        frame.add(t1);
        TextField t2=new TextField();
        t2.setSize(100,30);
        t2.setLocation(350,200);
        frame.add(t2);
        JButton btn=new JButton("登录");
        btn.setSize(180,40);
        btn.setLocation((210),270);
        btn.setFont(new Font("宋体",Font.BOLD,20));
        btn.setBackground(new Color(0,128,255));
        frame.add(btn);
        frame.setVisible(true);
    }
}

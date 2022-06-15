package JF.JP;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;

public class JPanel_Dome1 {
    public static void main(String[] args) {
    IUI();
    }

    private static void IUI() {
        JFrame frame=new JFrame();
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel j1=new JPanel();
        j1.setBackground(new Color(255,0,0));
        JPanel j2=new JPanel();
        j2.setBackground(new Color(26,80,50));
        JPanel j3=new JPanel();
        j3.setBackground(new Color(180,70,74));
        JPanel j4=new JPanel();
        j4.setBackground(new Color(160,150,120));
        JPanel j5=new JPanel();
        j5.setBackground(new Color(160,0,120));
        j1.setSize(200,100);
        j2.setSize(200,100);
        j3.setSize(200,100);
        j4.setSize(200,100);
        j5.setSize(200,100);
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

        j1.setLocation(0,80);
        j2.setLocation(0,160);
        j3.setLocation(0,240);
        j4.setLocation(0,320);
        j5.setLocation(0,400);
        frame.add(j1);
        frame.add(j2);
        frame.add(j3);
        frame.add(j4);
        frame.add(j5);
//        frame.add(j2,BorderLayout.LINE_END);
//        frame.add(j3,BorderLayout.LINE_START);
//        frame.add(j4,BorderLayout.PAGE_END);
//        frame.add(j1,BorderLayout.PAGE_START);
//        frame.add(j5,BorderLayout.CENTER);



        frame.setVisible(true);


    }

}

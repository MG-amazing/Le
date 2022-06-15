package JF;

import javax.swing.*;
import java.awt.*;

public class myFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(myFrame::INU);
    }
    public static void INU(){
        JFrame frame=new JFrame();
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JButton btn1=new JButton("一");
        btn1.setSize(150,30);
        btn1.setFont(new Font("微软雅黑",Font.BOLD,10));
        btn1.setLocation(150,100);
        JButton btn2=new JButton("二");
        btn2.setSize(150,30);
        btn2.setLocation(500,100);
        JButton btn3=new JButton("三");
        btn3.setSize(150,30);
        btn3.setLocation(150,400);
        JButton btn4=new JButton("四");
        btn4.setSize(150,30);
        btn4.setLocation(500,400);
        frame.add(btn4);
        frame.add(btn3);
        frame.add(btn2);
        frame.add(btn1);


        frame.setVisible(true);
    }
}

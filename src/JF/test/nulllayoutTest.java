package JF.test;

import javax.swing.*;
import java.awt.*;

public class nulllayoutTest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(nulllayoutTest::INUI);
    }

    public static void INUI() {

        JFrame frame=new JFrame();
        frame.setSize(1100,700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JButton btn=new JButton("搜索");
        btn.setSize(89,68);
        btn.setLocation(0,0);
        frame.add(btn);
        JButton btn2=new JButton("歌单");
        btn2.setSize(89,68);
        btn2.setLocation(0,68);
        btn.setFont(new Font("微软雅黑",Font.BOLD,15));
        btn2.setForeground(new Color(255,128,128));
        frame.add(btn2);






        frame.setVisible(true);
    }

}


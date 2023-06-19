import javax.swing.*;
import java.awt.*;

/*
null layout
>how to use null layout
 */
public class Swing23NullLayout {
    public static void main(String[] args) {
        JFrame f=new JFrame("null layout example");
        f.setBounds(300,200,500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        Container c=f.getContentPane();
        JButton b1,b2,b3,b4,b5;
        b1=new JButton("red");
        b2=new JButton("yellow");
        b3=new JButton("orange");
        b4=new JButton("black");
        b5=new JButton("white");

        b1.setBounds(20,20,80,30);
        b2.setBounds(120,20,80,30);
        b3.setBounds(220,20,80,30);
        b4.setBounds(20,100,80,30);
        b5.setBounds(120,100,80,30);

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.setLayout(null);

    }
}

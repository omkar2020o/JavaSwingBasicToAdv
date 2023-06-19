import javax.swing.*;
import java.awt.*;

public class Swing24BorderLayout {
    public static void main(String[] args) {
        JFrame f = new JFrame("null layout example");
        f.setBounds(300, 200, 500, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);


        Container c=f.getContentPane();

        BorderLayout bl=new BorderLayout(10,5);
        c.setLayout(bl);
        JButton b1,b2,b3,b4,b5;
        b1=new JButton("Page start");
        b2=new JButton("Page end");
        b3=new JButton("Line start");
        b4=new JButton("center");
        b5=new JButton("line end");

        c.add(b1,BorderLayout.PAGE_START);
        c.add(b2,BorderLayout.PAGE_END);
        c.add(b3,BorderLayout.LINE_START);
        c.add(b4, BorderLayout.CENTER);
//        c.add(b5,BorderLayout.LINE_END);

        f.setVisible(true);
    }
}

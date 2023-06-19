import javax.swing.*;
import java.awt.*;

/*
>how to use Gride Layout

1. just like flow layout, gride layout also sets the components left-to-right in a flow
2. in gride layout all the available space is consumed by the components
3.gride layout can be divided inti thhe form of rows and colums
4. in gride layout the all the components have the same size.
 */
public class Swing26GrideLayout extends JFrame {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("flow layout example");
        f.setBounds(100,200,500,300);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=f.getContentPane();

        JButton btn1=new JButton("button 1");
        JButton btn2=new JButton("button 2");
        JButton btn3=new JButton("button 3");
        JButton btn4=new JButton("button 4");
        JButton btn5=new JButton("button 5");

        GridLayout g=new GridLayout(2,3);
        g.setVgap(10);
        g.setHgap(20);
        c.setLayout(g);

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);

        f.setVisible(true);
    }
}

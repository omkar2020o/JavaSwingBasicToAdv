/*
Flow layout
>how to use flow layout
>set ALignment in flow layout
>setVgap() & setHgap()
>indexing in flow Layout
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
1. flow layout is the default layout for Jpanel
2. it sets the components as its preferred size in java
3. it also sets the width of the components acc. to its content.
4. if width of JFrame is less than it shifts the extra components to the next row.
5. if width of JFrame is more then it align the component to the center.
 */
public class Swing25FlowLayout  extends JFrame {

    public static void main(String args[])
    {
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
        c.add(btn1,0);
        c.add(btn2,0);
        c.add(btn3,0);
        c.add(btn4,0);
        c.add(btn5,0);

        FlowLayout fd=new FlowLayout(FlowLayout.LEADING,100,20);
        c.setLayout(fd);

        f.setVisible(true);
    }

}

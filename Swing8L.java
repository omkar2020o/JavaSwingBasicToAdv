/*
how to create JRadio Button
setFont(Font)
setEnabled(boolean)
ButtonGroup()
how to create already select radio button
setSelected(boolean)
 */

import javax.swing.*;
import java.awt.*;

public class Swing8L {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(100,100,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=frame.getContentPane();
        c.setLayout(null);

        JRadioButton b1=new JRadioButton("male");
        b1.setBounds(100,50,100,20);
        JRadioButton b2=new JRadioButton("female");
        b2.setBounds(200,50,100,20);
        c.add(b1);
        c.add(b2);

        ButtonGroup gender = new ButtonGroup();
        gender.add(b1);
        gender.add(b2);
        frame.setVisible(true);
    }
}

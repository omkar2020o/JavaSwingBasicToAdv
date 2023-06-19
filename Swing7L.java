/*
how to create JTextArea
setText(String)
setFont(Font)
setEeditable(boolean)
setLineWrape(boolean)
 */

import javax.swing.*;
import java.awt.*;
public class Swing7L {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        JTextArea t1=new JTextArea();
        t1.setBounds(100,100,400,200);
        t1.setText("omkar suryawanshi");
        t1.setFont(new Font("arial",Font.ITALIC,30));
        t1.setEditable(true);
        t1.setLineWrap(true);
        c.add(t1);

        frame.setVisible(true);
    }
}

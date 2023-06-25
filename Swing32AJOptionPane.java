/*
JOPtionPane

>show an input dialog
>show a message dialog
>show a confirm dialog
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
INPUT Dialog

Str=JOptionPane.showInputDialog("enter your name")
 */
public class Swing32AJOptionPane {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("Input Dialog");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1=new JButton("Button 1");
        f.add(b1);
        f.setLayout(new FlowLayout());


        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==b1)
                {
                    String str = JOptionPane.showInputDialog("enter your name");
                    if (str.length() > 0)
                    {
                        System.out.println("the name of user is "+str);
                    }
                }
            }
        });


        f.setVisible(true);
    }
}

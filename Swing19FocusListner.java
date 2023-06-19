/*
FocusListener

How to write FocusListner
>FocusListner
>void focusGained()
>void focusLost()
>addFocusListner()
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class  newmotion1 extends JFrame implements FocusListener {
   JTextField t1;
   JTextArea ta;
    newmotion1()
    {
        Container c=getContentPane();
        c.setLayout(null);
        t1=new JTextField();
        t1.setBounds(50,100,100,30);
        t1.setFont(new Font("arial",Font.BOLD,25));
        c.add(t1);
        t1.addFocusListener(this);

        ta=new JTextArea();
        ta.setBounds(200,50,300,300);
        c.add(ta);
    }

    @Override
    public void focusGained(FocusEvent e) {
        ta.setText(ta.getText()+"\n"+" Focues gained");
    }

    @Override
    public void focusLost(FocusEvent e) {
        ta.setText(ta.getText()+"\n"+" focuse lost");
    }
}

public class Swing19FocusListner {
    public static void main(String[] args) {
        newmotion1 f=new newmotion1();
        f.setTitle("focus listner");
        f.setBounds(100,100,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}

/*
KeyListner
how to write KeyListner
>KeyListner()
>void keyPressed()
>void keyTyped()
void keyRelesed()
>addKeyListner()
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyFrameo extends JFrame implements KeyListener {
    JTextArea ta;
     MyFrameo()
    {
        Container c=getContentPane();
        c.setLayout(null);

        ta=new JTextArea();
        ta.setBounds(10,10,370,330);
        c.add(ta);
        ta.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"key is typed :"+e.getKeyChar());
        ta.setBackground(Color.CYAN);
    }

    @Override
    public void keyPressed(KeyEvent e) {
         ta.setText(ta.getText()+"\n"+"key is pressed :"+e.getKeyChar());
        ta.setBackground(Color.ORANGE);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"key is release :"+e.getKeyChar());
       ta.setBackground(Color.PINK);
    }
}
public class Swing16LKeyListner {
    public static void main(String[] args) {
        MyFrameo f = new MyFrameo();
        f.setTitle("KeyEvent demo");
        f.setBounds(100,100,400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

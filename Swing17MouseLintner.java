/*
MouseListner
How to write MouseListner
>mouseListner
>void mouseEntered()
>void mouseExited()
>void mousePressed()
>void mouseClicked()
>void mouseReleased()
>addMouseListner()
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Mmyframe extends JFrame implements MouseListener {
    JLabel lable;
    JTextArea ta;
    Mmyframe()
    {
        Container c=getContentPane();
        c.setLayout(null);

        lable=new JLabel("my label");
        lable.setFont(new Font("arial",Font.BOLD,18));
        lable.setBounds(50,50,100,30);
        c.add(lable);

        ta=new JTextArea();
        ta.setBounds(200,50,300,300);
        c.add(ta);
        lable.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+" mouse is clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+" mouse is pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+" mouse is released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+" mouse is Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+" mouse is exited");
    }
}
public class Swing17MouseLintner {
    public static void main(String[] args) {
        Mmyframe f = new Mmyframe();
        f.setTitle("Mouse listner and event");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}

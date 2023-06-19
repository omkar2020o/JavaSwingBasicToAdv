import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/*
MouseMotionListner

how to write MouseMotionListner
>MouseMotionListner
>void mouseMoved()
>void mouseDragged()
>addMouseMotionListner()
 */
class newmotion extends JFrame implements MouseMotionListener {
    Container c;
    JLabel l1;
    JTextArea ta;
    newmotion()
    {
        c=getContentPane();
        c.setLayout(null);

        l1=new JLabel("my label");
        l1.setFont(new Font("arial",Font.BOLD,18));
        l1.setBounds(50,50,100,30);
        c.add(l1);

        ta=new JTextArea();
        ta.setBounds(200,50,300,300);
        c.add(ta);
        l1.addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+" mouse is dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+" mouse is moved");
    }
}

public class Swing18MotionListner {
    public static void main(String[] args) {
        newmotion f=new newmotion();
        f.setTitle("mouse motion");
        f.setBounds(100,100,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}

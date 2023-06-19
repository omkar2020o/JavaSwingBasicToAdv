/*
multiple button event
handling
getSource()
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Myframe1 extends JFrame implements ActionListener {
    Container c;
    JButton btn1 = new JButton("RED");
    JButton btn2 = new JButton("yellow");
    JButton btn3 = new JButton("Green");

    Myframe1() {
        c = this.getContentPane();
        c.setLayout(null);
        btn1.setBounds(100, 100, 100, 50);
        btn2.setBounds(250, 100, 100, 50);
        btn3.setBounds(400, 100, 100, 50);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent g) {
        if (g.getSource() == btn1)
        {
            c.setBackground(Color.RED);
        }
        if (g.getSource()==btn2) {
             c.setBackground(Color.yellow);
        }
        if (g.getSource()==btn3)
        {
            c.setBackground(Color.GREEN);
        }
    }
}

public class Swing6bL {

    public static void main(String[] args) {
     Myframe1 f = new Myframe1();
        f.setTitle("Action demo");
        f.setSize(700,500);
        f.setLocation(100,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

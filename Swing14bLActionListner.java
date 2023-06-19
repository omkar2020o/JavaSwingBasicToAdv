/*

 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Nmyframw1 extends JFrame implements ActionListener {
    Container c;
    JTextField t1;

    Nmyframw1()
    {
        c=getContentPane();
        t1=new JTextField();
        t1.setBounds(100,100,100,30);
        c.add(t1);
        c.setLayout(null);
        t1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        c.setBackground(Color.ORANGE);
        String str=t1.getText();
        t1.setText(str.toUpperCase());
    }
}
public class Swing14bLActionListner {
    public static void main(String[] args) {
        Nmyframw1 f=new Nmyframw1();
        f.setTitle("ActionEvent");
        f.setBounds(100,100,400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        f.setVisible(true);
    }
}

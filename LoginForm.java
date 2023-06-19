import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe2 extends JFrame
{
    Container c;
    JButton enter = new JButton("Subbmit");
    JLabel lable1= new JLabel("Username");
    JLabel label2= new JLabel("Password");
    JTextField t1=new JTextField();
    JPasswordField t2 = new JPasswordField();
    Myframe2()
    {
     c=this.getContentPane();
     c.setLayout(null);
     enter.setBounds(150,300,100,20);
     c.add(enter);
     c.add(lable1);
     c.add(label2);

     lable1.setText("Username");
     lable1.setVisible(true);
     label2.setBounds(100,200,100,50);
     lable1.setBounds(100,150,100,50);


        c.add(t1);
        t1.setBounds(200,170,100,20);
        c.add(t2);
        t2.setBounds(200,210,100,20);
    }

}
public class LoginForm {
    public static void main(String[] args) {
        Myframe2 f = new Myframe2();
        f.setTitle("Action demo");
        f.setSize(700,500);
        f.setLocation(100,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

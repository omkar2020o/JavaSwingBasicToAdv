/*
login form
how to create
how to validate
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe3 extends JFrame implements ActionListener{

    Container c;
    JLabel lable1,label2;
    JTextField user;
    JPasswordField pass;
    JButton btn;
      Myframe3()
      {
          setTitle("login form");

          setSize(400,300);
          setLocation(100,100);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          c=getContentPane();
          c.setLayout(null);

          lable1=new JLabel("username");
          label2=new JLabel("password");

          lable1.setBounds(10,50,100,20);
          label2.setBounds(10,100,100,20);

          c.add(lable1);
          c.add(label2);

          user=new JTextField();
          user.setBounds(120,50,120,20);
          c.add(user);

          pass=new JPasswordField();
          pass.setBounds(120,100,120,20);
          c.add(pass);

          btn=new JButton("login");
          btn.setBounds(100,150,70,20);
          c.add(btn);

          btn.addActionListener(this);
          setVisible(true);
      }

      public void actionPerformed(ActionEvent e)
      {
          System.out.println("username " +user.getText());
          System.out.println("password: " +pass.getText());
      }
}

public class Swing6fLoginForm {
    public static void main(String[] args) {
        Myframe3 frame = new Myframe3();
    }
}

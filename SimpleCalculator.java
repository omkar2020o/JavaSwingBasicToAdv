import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Cal extends JFrame implements ActionListener{
   Container c;
   JLabel lable1,lable2, result;
   JTextField t1,t2,t3;

   JButton add,sub,mul,div;

    Cal()
    {
        setTitle("simple calculator");
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c=getContentPane();
        setLayout(null);

        lable1=new JLabel("Number 1");
        lable1.setBounds(10,20,100,20);
        c.add(lable1);

        t1=new JTextField();
        t1.setBounds(120,20,100,20);
        c.add(t1);


        lable2=new JLabel("Number 2");
        lable2.setBounds(10,50,100,20);
        c.add(lable2);

        t2=new JTextField();
        t2.setBounds(120,50,100,20);
        c.add(t2);

        add=new JButton("+");
        add.setBounds(10,90,70,30);
        c.add(add);

        sub=new JButton("-");
        sub.setBounds(90,90,70,30);
        c.add(sub);

        mul=new JButton("*");
        mul.setBounds(170,90,70,30);
        c.add(mul);

        div=new JButton("/");
        div.setBounds(90,130,70,30);
        c.add(div);

        result=new JLabel("Result : ");
        result.setBounds(10,200,100,20);
        c.add(result);

        t3=new JTextField();
        t3.setBounds(100,200,100,20);
        c.add(t3);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
     if(e.getSource()==add)
     {
         int a = Integer.parseInt(t1.getText());
         int b = Integer.parseInt(t2.getText());
         int c= a+b;
         t3.setText("Result: "+c);
     }
        if(e.getSource()==sub)
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c= a-b;
            t3.setText("Result: "+c);
        }
        if(e.getSource()==mul)
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c= a*b;
            t3.setText("Result: "+c);
        }
        if(e.getSource()==div)
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c= a/b;
            t3.setText("Result: "+c);
        }
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
       Cal f = new Cal();


    }
}

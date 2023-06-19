/*
iteam listner
IteamListner is a listner that listens IteamEvent.

iteamEvent fires on

>any iteam is selected in a combobox
>checkbox is clicked
>radiobutton is clicked
>choose a JCheckBoxMenuItem

how to write item listner
>iteamListner
>void iteamStateChanged()
>addIteamListner
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemListener;

class Myomkar1 extends JFrame implements ItemListener{
    JRadioButton male, female;
    JTextArea ta;

    Myomkar1()
    {
        Container c=getContentPane();
        c.setLayout(null);

        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        male.setBounds(50,50,100,20);
        female.setBounds(50,100,100,20);
        c.add(male);
        c.add(female);

        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);

        male.addItemListener(this);
        female.addItemListener(this);

        ta=new JTextArea();
        ta.setBounds(200,100,100,100);
        c.add(ta);
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==male)
        {
           ta.setText("male");
        }
        if(e.getSource()==female)
        {
            ta.setText("female");
        }
    }
}
public class Swing15aIteamListner {
    public static void main(String[] args) {
        Myomkar1 f = new Myomkar1();
        f.setTitle("iteam Event");
        f.setBounds(100,100,400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

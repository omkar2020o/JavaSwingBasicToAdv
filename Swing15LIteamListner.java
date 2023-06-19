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

class Myomkar extends JFrame implements ItemListener{
JComboBox combo;
JTextArea ta;

    Myomkar()
    {
        Container c=getContentPane();
        c.setLayout(null);
        String[] values={"a","b","c"};
        combo=new JComboBox(values);
        c.add(combo);
        combo.setBounds(150,50,100,30);

        ta=new JTextArea();
        ta.setBounds(200,100,100,100);
        c.add(ta);
        combo.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        String str= combo.getSelectedItem().toString();
        ta.setText(str);
    }
}
public class Swing15LIteamListner {
    public static void main(String[] args) {
        Myomkar f = new Myomkar();
        f.setTitle("iteam Event");
        f.setBounds(100,100,400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

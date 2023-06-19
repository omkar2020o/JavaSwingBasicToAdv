/*
JcheckboxMenuItem
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MynewFrame extends JFrame implements ItemListener
{
    JMenuBar menubar1;
    JMenu mymenu1;
    JCheckBoxMenuItem c1;
    JTextArea ta;
    MynewFrame()
    {
        Container c = getContentPane();
        c.setLayout(null);
        menubar1=new JMenuBar();
        mymenu1=new JMenu("file");

        c1=new JCheckBoxMenuItem("print");
        mymenu1.add(c1);
        menubar1.add(mymenu1);
       this.setJMenuBar(menubar1);


        ta=new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);
        c1.addItemListener(this);

    }
    @Override
    public  void itemStateChanged(ItemEvent e)
    {
          if(c1.isSelected())
          {
              ta.setText("print is on");
          }
          else
              ta.setText("print is off");
    }
}
public class Swing15cIteamListneroncheckbox{
    public static void main(String[] args) {
        MynewFrame f = new MynewFrame();
        f.setBounds(100,100,500,400);
        f.setTitle("menu bar");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}

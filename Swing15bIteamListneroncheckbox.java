import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class omkarS extends JFrame implements ItemListener {
    JCheckBox c1,c2,c3,c4;
    Container c;
    omkarS()
    {
      c=getContentPane();
      c.setLayout(null);
      c1=new JCheckBox("red");
      c2=new JCheckBox("orange");
      c3=new JCheckBox("pink");
      c4=new JCheckBox("black");
      c1.setBounds(50,50,100,30);
        c2.setBounds(50,100,100,30);
        c3.setBounds(50,150,100,30);
        c4.setBounds(50,200,100,30);
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        ButtonGroup btn=new ButtonGroup();
        btn.add(c1);
        btn.add(c2);
        btn.add(c3);
        btn.add(c4);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==c1)
        {
            c.setBackground(Color.red);
        }
        if(e.getSource()==c2)
        {
            c.setBackground(Color.ORANGE);
        }
        if(e.getSource()==c3)
        {
            c.setBackground(Color.PINK);
        }
        if(e.getSource()==c4)
        {
            c.setBackground(Color.black);
        }
    }
}

public class Swing15bIteamListneroncheckbox {
    public static void main(String[] args) {
        omkarS f=new omkarS();
        f.setBounds(100,100,500,400);
        f.setTitle("IteamListner on checkbox");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

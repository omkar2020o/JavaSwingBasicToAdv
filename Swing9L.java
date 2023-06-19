import javax.swing.*;
import java.awt.*;

/*
how to create checkbox
setFont()
srtEnabled(boolean)
setSelected(boolean)
 */
public class Swing9L {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("checbox");
        Container c=f.getContentPane();
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLayout(null);

        JCheckBox c1=new JCheckBox("omkar");
        JCheckBox c2=new JCheckBox("diksha");
        JCheckBox c3=new JCheckBox("vedant");
        JCheckBox c4= new JCheckBox("rio");

        c1.setFont(new Font("arial",Font.BOLD,30));

        c1.setBounds(100,50,120,20);
        c2.setBounds(100,100,120,20);
        c3.setBounds(100,150,120,20);
        c4.setBounds(100,200,120,20);

        c4.setSelected(true);
        c4.setEnabled(false);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);


        f.setVisible(true);
    }
}

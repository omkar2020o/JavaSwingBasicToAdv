import javax.swing.*;
import java.awt.*;

/*
JTabbedPane
 */
public class Swing34JTabbedPane {
    public static void main(String[] args) {
        JFrame frame=new JFrame("JTappedPane");
        frame.setLayout(null);

        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(50,50,250,250);

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();

        panel1.add(new JLabel("this is my first page"));
        panel2.add(new JLabel("this is my 2nd page"));
        panel3.add(new JLabel("this is my 3rd page"));

        tp.add("first",panel1);
        tp.add("second",panel2);
        tp.add("third",panel3);


        frame.add(tp);

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

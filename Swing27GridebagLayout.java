import javax.swing.*;
import java.awt.*;

public class Swing27GridebagLayout {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("flow layout example");
        f.setBounds(100,200,500,300);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=f.getContentPane();
        JButton btn1=new JButton("button 1");
        JButton btn2=new JButton("button 2");
        JButton btn3=new JButton("button 3");
        JButton btn4=new JButton("button 4");
        JButton btn5=new JButton("button 5");

        GridBagLayout g = new GridBagLayout();
        c.setLayout(g);
        GridBagConstraints gbc=new GridBagConstraints();

        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.weightx=0.5;
        gbc.gridx=0;
        gbc.gridy=0;
        c.add(btn1,gbc);

        gbc.gridx=1;
        gbc.gridy=0;
        c.add(btn2,gbc);

        gbc.gridx=2;
        gbc.gridy=0;
        c.add(btn3,gbc);

        gbc.gridwidth=3;
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.ipady=40;
        c.add(btn4,gbc);


        gbc.weighty=0.5;
        gbc.gridwidth=2;
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.ipady=40;
        gbc.anchor=GridBagConstraints.PAGE_END;
        c.add(btn5,gbc);





        f.pack();


        f.setVisible(true);
    }
}

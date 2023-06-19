import javax.swing.*;
import java.awt.*;

/*
JPanel
>introduction to JPanel
>How to use JPanel

Components
1.light-weight components
 >that can be added to some other components
 >eg: JButton, JRadioButton etc.
 >JButton---JFrame

2. heavy-weight components
 >that cannot be added to any other component.
  >eg: JFrame, JDialog etc
  > JFrame----X

  Container
  A container is a component, which may contain some other light- weight components. eg: JFrame
  JLabel-----JFrame
  JButton----JFrame

  X----JLabel
  X----JButton

  JPanel
  1. JPanel is a light weight component
  2. JPanel is a container also

 */
public class Swing28JPanel {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("flow layout example");
        f.setBounds(100,200,500,400);
        f.setTitle("JPanel Example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=f.getContentPane();
        c.setLayout(null);

        JPanel panel=new JPanel();
        panel.setBounds(0,0,300,300);
        panel.setBackground(Color.ORANGE);
        panel.setLayout(null);
        c.add(panel);



        JPanel panel1=new JPanel();
        panel1.setBounds(0,0,200,200);
        panel1.setBackground(Color.MAGENTA);

        c.add(panel1);
        panel.add(panel1);

        JButton b1=new JButton("Omkar");
        panel1.add(b1);

        f.setVisible(true);
    }
}

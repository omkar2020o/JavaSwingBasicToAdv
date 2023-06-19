import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Event handling using another class
 */
public class Swing6dL {
    public static Container c;

    public static void main(String[] args) {
        JFrame frame=new JFrame("Swing6dL");
        frame.setBounds(100,100,700,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=frame.getContentPane();

        JButton red=new JButton("RED");
        JButton yellow=new JButton("Yellow");
        JButton green= new JButton("Green");

        red.setBounds(100,100,100,50);
        yellow.setBounds(250,100,100,50);
        green.setBounds(400,100,100,50);

        c.add(red);
        c.add(yellow);
        c.add(green);

        red.addActionListener(new Redclass());
        yellow.addActionListener(new Yellowclass());
        green.addActionListener(new Greenclass());
    }
}


class Redclass implements ActionListener{
    public void actionPerformed(ActionEvent e)
    {
         Swing6dL.c.setBackground(Color.ORANGE);
    }
}

class Yellowclass implements ActionListener{
    public void actionPerformed(ActionEvent e)
    {
        Swing6dL.c.setBackground(Color.PINK);
    }
}

class Greenclass implements ActionListener{
    public void actionPerformed(ActionEvent e)
    {
        Swing6dL.c.setBackground(Color.magenta);
    }
}

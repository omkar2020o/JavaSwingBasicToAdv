import javax.swing.*;
import java.awt.*;

public class Swing1L {
    /*
    JFrame:-
    1)setVisible()
    2)setDefaultCloseOperation()
    3)setSize
    4)setLocation
    5)setBounds()
    6)setIconImage()
    7setTitle()
    8)setBackground()
    9)setResizable()
     */

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(300 , 300);
        //frame.setLocation(100, 50);
        frame.setBounds(100,100,1000,500);
        frame.setTitle("omkar suryawanshi");
        //ImageIcon icon = new ImageIcon("imagename")
        //frame.setIconImage(icon.getImage())

        Container c = frame.getContentPane();
        c.setBackground(Color.pink);
        frame.setResizable(false);
    }
}
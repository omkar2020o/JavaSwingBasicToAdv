import javax.swing.*;
import java.awt.*;

public class Swing3L {
    /*
    setText();
    setFont();
    setBackground();
    setForeground();
    setEditable();
     */

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,300);
        frame.setVisible(true);
        Container c = frame.getContentPane();

        JTextField t1= new JTextField();
        c.add(t1);
        t1.setBounds(100,50,200,30);
        t1.setText("Omkar suryawanshi");
        Font font = new Font("arial",Font.ITALIC,15);
        t1.setFont(font);
        t1.setForeground(Color.RED);
        t1.setBackground(Color.PINK);
        t1.setEditable(false);
    }
}

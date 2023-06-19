import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;

public class Swing5l {
    /*
    setFont();
    setText();
    setForeground();
    setBackground();
    setCursor();
    setEnabled;
    setVisible();
     */
    public static void main(String[] args) {
        JFrame frame=new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Button");
        frame.setBounds(100,100,1000,500);
        Container c= frame.getContentPane();
        c.setLayout(null);

        JButton b1 = new JButton("Click me");
        b1.setSize(200,30);
        b1.setLocation(100,100);
        c.add(b1);

        Font font = new Font("arial", Font.BOLD,15);
        b1.setFont(font);
        b1.setVisible(true);
        b1.setText("MY Button");
        b1.setForeground(Color.red);
        b1.setBackground(Color.ORANGE);
        Cursor c1 = new Cursor(Cursor.WAIT_CURSOR);
        b1.setCursor(c1);

        b1.setEnabled(true);

        frame.setVisible(true);
    }
}

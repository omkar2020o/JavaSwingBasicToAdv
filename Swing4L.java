import javax.swing.*;
import java.awt.*;

public class Swing4L {
    //setEchoChar();
    //how to hide password
    /*
    seetText();
    setFont();
    setBackground();
    setForeground();
    settEditable();
     */
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setBounds(100,30,500,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100,50,120,30);
        c.add(pass);
       pass.setText("123456");
       pass.setFont(new Font("arial",Font.BOLD,30));
       pass.setEchoChar('*');
       pass.setEchoChar((char)0);


        frame.setVisible(true);
    }
}

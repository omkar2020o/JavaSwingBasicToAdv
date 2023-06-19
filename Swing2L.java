import javax.swing.*;
import java.awt.*;

public class Swing2L {
    /*
    setText();
    setFont();
    how to use image in JLabel
    how to use both image and text in JLable
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        Container c = frame.getContentPane();
          c.setLayout(null);
//        JLabel lable=new JLabel("username");
//        lable.setBounds(100,50,200,30);
////        lable.setText("password");
//        Font font = new Font("arial", Font.BOLD,30);
//        lable.setFont(font);
//        c.add(lable);

        ImageIcon icon = new ImageIcon("icon.png");
        JLabel label= new JLabel("Text",icon,JLabel.LEFT);
        label.setBounds(0,100,500,100);
        c.add(label);


        frame.setVisible(true);
    }
}

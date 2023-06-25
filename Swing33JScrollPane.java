import javax.swing.*;
import java.awt.*;

/*
JScrollPane
 */
public class Swing33JScrollPane {
    public static void main(String[] args) {
        JFrame frame=new JFrame("JScrollPane");
        frame.setLayout(new FlowLayout());

        JTextArea ta=new JTextArea(10,15);



        JScrollPane sp=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        frame.add(sp);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

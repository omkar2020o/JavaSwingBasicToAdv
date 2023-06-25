import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
JOptionPane

JOptionPane.showConfirmDialog(
parent,message,title,optionType,messageType)
 */
public class Swing32CJOptionPane {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("Input Dialog");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1=new JButton("Button 1");
        f.add(b1);
        f.setLayout(new FlowLayout());
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               int sel=JOptionPane.showConfirmDialog(f,"Do you want to exit","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(sel==JOptionPane.YES_OPTION)
                {
                    System.out.println("Yes option is selected");
                    System.exit(0);
                }
                else
                {
                    System.out.println("no option is selected");
                }
            }
        });
        f.setVisible(true);
    }
}

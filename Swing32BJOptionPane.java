import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    JOptionPane
    >show A Message Dialog

    JOptionPane.showMessageDialog( parent,messagr,title,message type);

    Message type:
      JOptionPane.PLANE_MESSAGE
      JOptionPane.INFORMATION_MESSAGE
      JOptionPane.QUESTION_MESSAGE
      JOptionPane.ERROE_MESSAGE
      JOptionPane.WARNING_MESSAGE


 */
public class Swing32BJOptionPane {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Input Dialog");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        f.add(b2);
        f.add(b1);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setLayout(new FlowLayout());


        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b1) {
                    JOptionPane.showMessageDialog(f,
                            "hello this is plan message",
                            "Message",
                            JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                if (a.getSource() == b2) {
                    JOptionPane.showMessageDialog(f,
                            "hello this is QUESTION message",
                            "Message",
                            JOptionPane.QUESTION_MESSAGE);
                }
            }
        });


        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent b) {
                if (b.getSource() == b3) {
                    JOptionPane.showMessageDialog(f,
                            "hello this is INFORMATION message",
                            "Message",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });


        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent c) {
                if (c.getSource() == b4) {
                    JOptionPane.showMessageDialog(f,
                            "hello this is WARNING message",
                            "Message",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });


        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent d) {
                if (d.getSource() == b5) {
                    JOptionPane.showMessageDialog(f,
                            "hello this is ERROR message",
                            "Message",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        f.setVisible(true);
    }
}

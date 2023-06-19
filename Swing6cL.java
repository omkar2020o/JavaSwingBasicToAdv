import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing6cL {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing6cL");
        f.setBounds(100,100,700,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c =f.getContentPane();
        c.setLayout(null);

        JButton btn= new JButton("click me");
        btn.setBounds(100,100,100,50);
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.RED);
            }
        });
    }
}

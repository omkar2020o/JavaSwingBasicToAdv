/*
JComboBox
how to create
setEditable(boolean)
setSelectedIndex(index)
setSelectedItem(string)
setFont(font)
getSelectedIndex()
getSelectedItem()
addItem()
removeItem()
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing10L {
    public static void main(String[] args) {
        JFrame f= new JFrame("MycomboBox");
        f.setSize(700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        Container c=f.getContentPane();
        c.setLayout(null);
        String[] values={"a","b","c","d","a"};

        JComboBox c1=new JComboBox(values);
        c1.setBounds(100,100,100,30);
        c.add(c1);
        c1.setSelectedIndex(2);
        c1.addItem("omkar");
        c1.removeItem("a");
        c1.removeItem("a");

        c1.setEditable(true);

        JButton button=new JButton("ok");
        button.setBounds(300,100,100,30);
        c.add(button);

        JLabel label=new JLabel("");
        label.setBounds(100,300,100,30);
        c.add(label);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String item=(String) c1.getSelectedItem();
               label.setText(item);
            }
        });

        f.setVisible(true);
    }
}

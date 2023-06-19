import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
ActionListener
void actionPerformrd();
addActionListener();
 */

 class Myframe extends JFrame implements ActionListener {
    Container c;
    JButton btn;
     Myframe()
     {
      c=this.getContentPane();
      c.setLayout(null);
      btn=new JButton("click me");
      btn.setBounds(100,100,100,50);
      c.add(btn);
      btn.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e)
     {
         c.setBackground(Color.ORANGE);
     }

}
public class Swing6aL {
    public static void main(String[] args) {
        Myframe f = new Myframe();
        f.setTitle("Action demo");
        f.setSize(700,500);
        f.setLocation(100,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

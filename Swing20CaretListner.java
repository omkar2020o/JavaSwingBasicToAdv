/*
CaretListner

How to write  CaretListner
>CaretListner
>void caretUpdate()
addCaretListner()
 */
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;


class  newmotion11 extends JFrame implements CaretListener {
    JTextField t1;
    JTextArea ta;

    newmotion11() {
        Container c = getContentPane();
        c.setLayout(null);
        t1 = new JTextField();
        t1.setBounds(50, 100, 100, 30);
        t1.setFont(new Font("arial", Font.BOLD, 25));
        c.add(t1);
        t1.addCaretListener(this);

        ta = new JTextArea();
        ta.setBounds(200, 50, 300, 300);
        c.add(ta);
    }

    @Override
    public void caretUpdate(CaretEvent e) {
        ta.setText(ta.getText()+"\n"+"Caret updated"+e.getDot()+" "+e.getMark());
    }
}
public class Swing20CaretListner {
    public static void main(String[] args) {
        newmotion11 f=new newmotion11();
        f.setTitle("mouse motion");
        f.setBounds(100,100,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/*
JSlider

>A JSlider is an implementation of slider that allows the user to select a value by sliding the knob within the bounded value

parts of JSlider
1>Track
2>knob
3>major ticks
4>minor tick
5>labels

Important methods
>setMinimun(int n)
>setMaximum(int n)
>setOrientation(o)
>setValue(int n)

>setPaintTick(boolean b)
>setPaintTrack(boolean b)
>setPaintLabel(boolean b)

>setMajorTickSpacing(int n)
>setMinorTickSpacing(int n)

>addChangeListener(ChangeListener e)
 */
class Jslider extends JFrame implements ChangeListener {
    JSlider s;
    JLabel label;
    Jslider()
    {
        setLayout(new FlowLayout());
        s=new JSlider();
        add(s);

        s.setMinimum(0);
        s.setMaximum(200);
        s.setPaintTicks(true);
        s.setPaintLabels(true);

        s.setOrientation(SwingConstants.VERTICAL);
        s.setMajorTickSpacing(50);
        s.setMinorTickSpacing(5);
        s.addChangeListener(this);

        label=new JLabel();
        label.setText("the value of slider : "+s.getValue());
        add(label);

        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("the value of slider : "+s.getValue());
    }
}
public class Swing43JSlider {
    public static void main(String[] args) {
        new Jslider();
    }
}

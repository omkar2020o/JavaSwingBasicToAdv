import javax.swing.*;
import java.awt.*;

/*
BOx Layout
> how to use Box Layout
1. A BoxLayout arrange the components in a single row or a single column.
2. onluy one constructor is used by BoxLayout:
    BoxLayout(Container target, int axis)
3. Four differen axes could be chosen
    *X_AXIS
    *Y_AXIS
    *lINE_AXIS
    *PAGE_AXIS
4. BoxLayout is same as flowLayout but with more features
 */
public class Swing30BoxLayout {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(100,100,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Card layout");
        Container c=frame.getContentPane();

        BoxLayout box=new BoxLayout(c,BoxLayout.Y_AXIS);
        c.setLayout(box);

        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("button 2.....");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("button 4............");

        c.add(b1);
        c.add(Box.createRigidArea(new Dimension(0,80)));
        c.add(b2);
        c.add(b3);
        c.add(b4);

        b1.setAlignmentX(Component.RIGHT_ALIGNMENT);
        b2.setAlignmentX(Component.RIGHT_ALIGNMENT);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.LEFT_ALIGNMENT);


        frame.setVisible(true);
    }
}

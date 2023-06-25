import javax.swing.*;

/*
JSplitPane
>how to use JSplitPane

what is JSplitPane
1. JSplitPane is a component that is used to divide a container into two parts.
2. There is a divider line b\w both the part that can be moved to resize the parts
3. both the parts now works as a separate container
4.JSplitPane can beof two types, vertical and horizontal
 */
class omkhii extends JFrame{
    omkhii()
    {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JButton btn1=new JButton("left");
        JButton btn2=new JButton("right");

        JSplitPane split=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        split.setBottomComponent(btn2);
        split.setTopComponent(btn1);

        split.setDividerSize(10);
        split.setDividerLocation(100);
        split.setOneTouchExpandable(true);
        add(split);

        validate();
    }
}

public class Swing40JSplitPane {
    public static void main(String[] args) {
        new omkhii();
    }
}

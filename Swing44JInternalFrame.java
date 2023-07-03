import javax.swing.*;
import java.awt.*;

/*
JInternalFrame

>is a light-weiht component that has all the features of a JFrame
>As we know JFrame is a heavy-weight component that can not be added to a container that's why JINternalFrame comes
 into the picture that include all the features of a JFrame
 */
class internal extends JFrame {
   public internal()
    {
        setLayout(null);

        JInternalFrame iframe;
        iframe = new JInternalFrame("InternalFrame",true,true,true,true);
        initFrame(iframe);
        add(iframe);

        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
         new internal();
    }

    private void initFrame(JInternalFrame iframe)
    {
        iframe.setSize(300,200);
        iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        iframe.setLocation(50,50);
        iframe.setVisible(true);
        iframe.setLayout(new FlowLayout());
        iframe.add(new JButton("my button"));
    }
}

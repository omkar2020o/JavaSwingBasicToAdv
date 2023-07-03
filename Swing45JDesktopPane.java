import javax.swing.*;
import java.awt.*;

/*
JDesktopPane

A JDesktopPane can be used to create "multi-document" appplication
A multi-document application can have many windows included in it. for example: PhotoShop

A JDesktopPane is a component by which you can add multiple small windows instances to the main window
 */
public class Swing45JDesktopPane extends JFrame {
    JDesktopPane dp;
    public Swing45JDesktopPane()
       {
           dp=new JDesktopPane();

           disable(dp);

           add(dp, BorderLayout.CENTER);


           setSize(600,500);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setLocationRelativeTo(null);
           setVisible(true);
       }

    private void disable(JDesktopPane dp) {
        int numFrames=3;
        int x=30,y=30;

        for(int i=0;i<numFrames;i++)
        {
            JInternalFrame iframe=new JInternalFrame("InternalFrame"+(i+1),true,true,true,true);
            iframe.setBounds(x,y,250,100);
            iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            iframe.add(new JLabel("i love swing"));
            iframe.setVisible(true);

            dp.add(iframe);
            y+=100;
        }
    }

    public static void main(String[] args) {
        new Swing45JDesktopPane();
    }
}

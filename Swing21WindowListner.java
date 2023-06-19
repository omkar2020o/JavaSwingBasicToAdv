import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
WindowListner
how to write WindowListner
>void windowOpned()
>void windowClosing()
>void windowClosed()
>void windowIconified()
>void windowDeiconified()
>void windowActivated()
>void windowDeactivated()
>addWindowListner()
 */
class window extends JFrame implements WindowListener {
    window()
    {
        this.addWindowListener(this);
        Container c=getContentPane();
        c.setLayout(null);


    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("window closing ");
    }

    @Override
    public void windowClosed(WindowEvent e) {

        System.out.println("window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("window icon field");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window deiconi field");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("window activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("window Deactivated");
    }
}

public class Swing21WindowListner {
    public static void main(String[] args) {
        window f = new window();
        f.setBounds(100,100,500,500);
        f.setTitle("wiindow Event example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

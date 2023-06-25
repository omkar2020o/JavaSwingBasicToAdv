import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
JPopupMenu

>What is JPopupMenu?
>how to use JPopupMenu?

 */
class Popupmenu extends JFrame implements ActionListener {
    JPopupMenu pm;
    JMenuItem m1,m2,m3;
    Popupmenu()
    {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        pm=new JPopupMenu();
        m1=new JMenuItem("Item 1");
        m2=new JMenuItem("Item 2");
        m3=new JMenuItem("Item 3");
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);

        pm.add(m1);
        pm.add(m2);
        pm.add(m3);
        add(pm);
        pm.show(this,200,200);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON3)
                {
                    int x=e.getX();
                    int y=e.getY();
                    pm.show(Popupmenu.this,x,y);
                }
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==m1)
        {
            System.out.println("m1 is chose");
        }
        if(e.getSource()==m2)
        {
            System.out.println("m2 is chosen");
        }
        if(e.getSource()==m3)
        {
            System.out.println("m3 is chosen");
        }
    }
}

public class Swing37JPopupMenu {

    public static void main(String[] args)
    {
        Popupmenu frame=new Popupmenu();
    }
}

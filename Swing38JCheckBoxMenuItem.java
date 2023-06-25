import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
JCheckBoxMenuItem
>how to create JCheckBoxMenuItem
 */

class Jcheckboxmenu extends JFrame {
    JMenuItem newFile=new JMenuItem("New File");
    JMenuItem openFile=new JMenuItem("Open As");
    JMenuItem printFile=new JMenuItem("Print File");
    JMenuItem nundo=new JMenuItem("UNDO");

    JMenuItem redo=new JMenuItem("Redo");
    JCheckBoxMenuItem checkmenuitem=new JCheckBoxMenuItem("word wrap");

    JTextArea ta=new JTextArea();


    Jcheckboxmenu()
    {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JMenuBar menubar=new JMenuBar();
        add(menubar,BorderLayout.PAGE_START);
        JMenu file=new JMenu("File");
        JMenu edit=new JMenu("Edit");
        JMenu format=new JMenu("Format");
        menubar.add(file);
        menubar.add(edit);
        menubar.add(format);

        file.add(newFile);
        file.add(openFile);
        file.add(printFile);

        edit.add(redo);
        edit.add(nundo);

        format.add(checkmenuitem);
        checkmenuitem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkmenuitem.isSelected()){
                    ta.setLineWrap(true);
                    ta.setWrapStyleWord(true);
                }
                else
                {
                    ta.setLineWrap(false);
                    ta.setWrapStyleWord(false);
                }
            }
        });
        add(ta,BorderLayout.CENTER);
        validate();
    }
}

public class Swing38JCheckBoxMenuItem {
    public static void main(String[] args) {
        new Jcheckboxmenu();
    }
}

import javax.swing.*;
import java.awt.*;

/*
What is JSeparator?
>JSeparator is a component that is used to implement divider lines.
>it is used to draw a line to separator widgets in a layout
>it can be horizontal or vertical.

programs:
1:program to separate two components in grideLayout
2. program to separate menuitem in a menubar

 */
class SeparatorTest extends JFrame {
    JMenuItem newFile=new JMenuItem("New File");
    JMenuItem openFile=new JMenuItem("Open As");
    JMenuItem printFile=new JMenuItem("Print File");
    JMenuItem nundo=new JMenuItem("UNDO");
    JMenuItem redo=new JMenuItem("Redo");
    JCheckBoxMenuItem checkmenuitem=new JCheckBoxMenuItem("word wrap");
    SeparatorTest()
    {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(1,0));
        panel.add(new JLabel("My first Label"));
        JSeparator  sp=new JSeparator(SwingConstants.VERTICAL);
        panel.add(sp);
        panel.add(new JLabel("My second Label"));
        add(panel);

        JMenuBar menubar=new JMenuBar();
        add(menubar,BorderLayout.PAGE_START);

        JMenu file=new JMenu("File");
        JMenu edit=new JMenu("Edit");
        JMenu format=new JMenu("Format");
        menubar.add(file);
        menubar.add(edit);
        menubar.add(format);
        file.add(newFile);
        file.add(new JSeparator());
        file.add(openFile);
        file.add(printFile);

        edit.add(redo);
        edit.add(nundo);

        format.add(checkmenuitem);

        setVisible(true);
        validate();
    }
}
public class Swing39JSeparator {
    public static void main(String[] args) {
        new SeparatorTest();
    }
}

/*
parts of a member
how to create a menubar in JFrame
 */

import javax.swing.*;

/*
Steps to create menubar
1> create the object of
Jmenu bar
JMenu
JMenuItem

2>add menuitems to the related menu
3.add menu to the menubar
4.add menubar to the JFrame
 */
public class Swing12LJmenuBar {
    public static void main(String[] args) {
        JFrame f=new JFrame("menu bar");
        f.setSize(600,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menubar=new JMenuBar();

        JMenu file=new JMenu("file");
        JMenuItem i1=new JMenuItem("new");
        JMenuItem i2=new JMenuItem("open");
        JMenuItem i3=new JMenuItem("save");

        file.add(i1);
        file.add(i2);
        file.add(i3);

        menubar.add(file);



        JMenu edit = new JMenu("edit");
        JMenuItem i4=new JMenuItem("undo");
        JMenuItem i5=new JMenuItem("rndo");

        edit.add(i4);
        edit.add(i5);

        file.add(edit);

        f.setJMenuBar(menubar);



        f.setVisible(true);
    }
}

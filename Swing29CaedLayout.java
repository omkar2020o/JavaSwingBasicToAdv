/*
Card layout
>how to use caed layout
>important methods

1. a CardLayout object is a layout maneger for a container
2. It treats each components in the container as a card
3. only one card is visible at a time, and the container acts as a stack of card
4.the first components added to a CardLayout object is the visible component when the container is first displayed
5.card layout has some useful methods to flip the card
 /*
 important methods
 >frist()
 >last()
 >next()
 >previous
 >show()
 */

import javax.swing.*;
import java.awt.*;

public class Swing29CaedLayout {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(100,100,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Card layout");
        Container c=frame.getContentPane();

        CardLayout card=new CardLayout();
        c.setLayout(card);

        JButton b1=new JButton("Page 1");
        JButton b2=new JButton("page 2");
        JButton b3=new JButton("page 3");
        JButton b4=new JButton("page 4");

        c.add(b1,"1");
        c.add(b2,"2");
        c.add(b3,"3");
        c.add(b4,"4");

        frame.setVisible(true);
        card.next(c);
        card.first(c);
        card.previous(c);
        card.first(c);
        card.last(c);

        card.show(c,"3");
    }
}

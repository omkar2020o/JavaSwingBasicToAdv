import javax.swing.*;

/*
JToolTip
>What is a Tooltip?
>Types of Tooltip in java
>How to use JToolTip in java Swing?

A ToolTip is a message that appers when a cursor is positioned over an icon, image, hyperlink or other element in a GUI

how o create a:
>single line tooltip
>multi line tooltip
>formatted text tooltip(Customized tool tip)
 */
class omasdn extends JFrame{
    omasdn()
    {
        setLayout(null);

        JLabel label=new JLabel("password");
        label.setBounds(50,100,80,30);
        add(label);

        JPasswordField paa=new JPasswordField();
        paa.setBounds(140,100,100,30);
        add(paa);

        String str="<html>" +
                "<div bgcolor='#800080' color='#ffffff'>" +
                "<h1>" +
                "PLease enter your password</h1>" +
                "<br/>"
                +"Password should be atleasr 8 character long"
                +"</div>"
                +"</html>";
        paa.setToolTipText(str);


        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        validate();
    }
}

public class Swing42JToolTip {
    public static void main(String[] args) {
        new omasdn();
    }
}

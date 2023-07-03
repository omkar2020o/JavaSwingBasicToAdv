import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
A JEditorPane class is used to create a simple text editor window. it has two methods-
setContentType()
setText()

1.how to create a plan text editor
2.how to create a html code editor
 */
public class Swing46JEditorPane extends JFrame {

    JEditorPane pane;
    public Swing46JEditorPane()
    {
        pane=new JEditorPane();
        pane.setContentType("text/html");
//        pane.setText("bjjhggyu gyu gugyuyftyf uf uyuf hctfy fuyg tgctyfytfu guyfuy rcyftf tuy uy utuyyu  ytdyuygyu gufytytfu gf ytyh v fc56ytfyf t trdt dyfytfuguyfytfydrdr d");

        pane.setText("<html>" +
                "<h1 color='red'>Omkar suryawanshi</h>" +
                "<p>This is paragraph</p>" +
                "<hr>" +
                "<ol>" +
                "<li>item1</li>" +
                "<li>item2</li>" +
                "<li>item3</li>" +
                "</ol>" +
                "</html>");
        add(pane, BorderLayout.CENTER);

        JButton btn=new JButton("show code");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(" "+pane.getText());
            }
        });

        add(btn, BorderLayout.PAGE_END);


        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
      new Swing46JEditorPane();
    }

}

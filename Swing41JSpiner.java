import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
JSpiner
>how to use JSpinner

>Jspinner is a part of jajax.swing package
>JSpinner is a single line input field that allows the user to select a number or an object value from an ordered sequence
>the user can manually type in a leggal data into the text field of the spinner
>the spinner is sometimes preferred because they do not need a drop down list
>Spinner contains a upward and downward arrow to show the privious and the next element when it is pressed

/Constructor of JSpinner are:
JSpinner(): creates an empty spinner with intial value set to zero and no constraints
JSpinner(SpinnerModel model): creates a spinner with specified model passed as argument

Commonly used methods are:
.SpinnerListModel(List i)
.SpinnerNumberModel(int value,int max,int min,int step)
.setValue(Object v)
.getValue
.getPreviousValue()
.getNextValue()
 */
class omkhuh extends JFrame implements ChangeListener
{
    SpinnerModel m1,m2,m3;
    JSpinner s1,s2,s3;
    JLabel label=new JLabel();

    omkhuh()
    {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        SpinnerModel m1,m2,m3;
        JSpinner s1,s2,s3;

       String str=String.valueOf(java.time.Year.now());
       int y=Integer.parseInt(str);
        m1=new SpinnerNumberModel(1,1,31,1);
        m2=new SpinnerNumberModel(1,1,12,1);
        m3=new SpinnerNumberModel(y,y-100,y,1);

        s1=new JSpinner(m1);
        s2=new JSpinner(m2);
        s3=new JSpinner(m3);
        s1.setBounds(100,20,100,50);
        s2.setBounds(100,100,100,50);
        s3.setBounds(100,200,100,50);
        add(s1);
        add(s2);
        add(s3);
        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);
        int date=(Integer) s1.getValue();
        int year=(Integer)s3.getValue();
        int motnth=(Integer)s2.getValue();
//        JLabel label=new JLabel();
        label.setBounds(100,300,150,20);
        label.setText("DOB is: "+date+" "+year+" "+motnth);
        add(label);
        validate();

    }


    /**
     * Invoked when the target of the listener has changed its state.
     *
     * @param e a ChangeEvent object
     */
    @Override
    public void stateChanged(ChangeEvent e) {
        //reset dob in label
        int date=(Integer) s1.getValue();
        int year=(Integer)s3.getValue();
        int motnth=(Integer)s2.getValue();
    }
}
public class Swing41JSpiner {
    public static void main(String[] args) {
        new omkhuh();
    }
}

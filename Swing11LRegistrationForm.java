/*
Registration Form
>how to create
>how to fetch(read) the data
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe4 extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2;
    JRadioButton male,female;
    JComboBox day,month,year;

    JTextArea tal;
    JCheckBox terms;
    JButton submit;
    JLabel meg;

    JTextArea screen;
    Myframe4()
    {
        setTitle("Registration form");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.lightGray);

        l1=new JLabel("Name");
        l1.setBounds(20,50,100,20);
        c.add(l1);
        t1=new JTextField();
        t1.setBounds(130,50,100,20);
        c.add(t1);

        l2=new JLabel("Mobile:");
        l2.setBounds(20,100,100,20);
        c.add(l2);
        t2=new JTextField();
        t2.setBounds(130,100,100,20);
        c.add(t2);

        l3=new JLabel("Gender");
        l3.setBounds(20,150,100,20);
        c.add(l3);

        male=new JRadioButton("male");
        female=new JRadioButton("Female");
        male.setBounds(130,150,80,20);
        female.setBounds(220,150,80,20);
        male.setSelected(true);
        c.add(male);
        c.add(female);

        ButtonGroup gen=new ButtonGroup();
        gen.add(male);
        gen.add(female);

        l4=new JLabel("DOB");
        l4.setBounds(20,200,100,20);
        c.add(l4);

        String days[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24" +
                "25","26","27","28","29","30"};
        String months[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
        String years[]={"2000","2001","2002"};


        day=new JComboBox(days);
        month=new JComboBox(months);
        year=new JComboBox(years);

        day.setBounds(130,200,50,20);
        month.setBounds(190,200,50,20);
        year.setBounds(250,200,60,20);

        c.add(day);
        c.add(month);
        c.add(year);

        l5=new JLabel("Address");
        l5.setBounds(20,250,100,20);
        c.add(l5);

        tal=new JTextArea();
        tal.setBounds(130,240,200,50);
        c.add(tal);

        terms=new JCheckBox("please accept terms and conditions");
        terms.setBounds(50,300,250,20);
        c.add(terms);

        submit=new JButton("submit");
        submit.setBounds(150,350,80,20);
        c.add(submit);

        submit.addActionListener(this);

        screen=new JTextArea();
        screen.setBounds(350,50,300,300);
        c.add(screen);

        meg=new JLabel();
        meg.setBounds(20,400,250,20);
        c.add(meg);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(terms.isSelected())
        {
            meg.setText("registration successful");

            String name=t1.getName();
            String mobile=t2.getText();
            String gender="male";
            if(female.isSelected())
            {
                gender="female";
            }
            String dob=day.getSelectedItem()+"_"+month.getSelectedItem()+"_"+year.getSelectedItem();
            String addressa=tal.getText();

            screen.setText("Name: "+name+"\n"+"Mobile: "+mobile+"\n"+"Gender : "+gender+"\n"+"DOB"+dob+"\n"+"Address :"+addressa);

        }
        else {
            meg.setText("please accept terms and condations");
        }
    }
}

public class Swing11LRegistrationForm {
    public static void main(String[] args) {

        Myframe4 frame=new Myframe4();
    }
}

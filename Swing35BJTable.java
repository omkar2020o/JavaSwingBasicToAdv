import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.*;

/*
JTable: constructor
>there are two ways to create a table in java
1) JTable(data,columnNames);
2)JTable(tableModel);

JTable using TableModel
steps:
rowData[][]={{a1,a2},{b1,b2},...{n1,n2}};
columnName[]={col1,clo2,...coln};
DefaultTableModel tablemodel=new DefaultTableModel(rowData,coloumnName);
JTable table=new JTable(tableModel);
 */
public class Swing35BJTable {
    public static void main(String[] args) {
        new MyTable();
    }
}

class MyTable extends JFrame  {
    JTextField t1,t2,t3;
    JButton b1,b2,b3;
    MyTable()
    {
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        Object[][] data={{101,"ram",21},{102,"omkar",23},{103,"diksha",65}};
        String[] columnNames={"roll no","name","age"};

        DefaultTableModel model1=new DefaultTableModel(data,columnNames);
        JTable table=new JTable(model1);

       setLayout(new GridLayout(3,1));

       JPanel panel=new JPanel();
       add(new JScrollPane(table));
       add(new JPanel());
       add(panel);

       t1=new JTextField();
       t2=new JTextField();
       t3=new JTextField();

       b1=new JButton("add");
       b2=new JButton("update");
       b3=new JButton("delete");

       panel.setLayout(new GridLayout(3,3));
       panel.add(new JLabel("roll no"));
       panel.add(t1);
       panel.add(b1);

        panel.add(new JLabel("name"));
        panel.add(t2);
        panel.add(b2);

        panel.add(new JLabel("age"));
        panel.add(t3);
        panel.add(b3);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (t1.getText().toString().isEmpty() ||
                        t2.getText().toString().isEmpty() ||
                        t3.getText().toString().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "please enter all area",
                            "error",
                            JOptionPane.ERROR_MESSAGE);
                } else {

                    int rollno = Integer.parseInt(t1.getText().toString());
                    String name = t2.getText().toString();
                    int age = Integer.parseInt(t3.getText().toString());

                    Object[] newRow = {rollno, name, age};
                    model1.addRow(newRow);

                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);
                }
            }
        });

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowIndex=table.getSelectedRow();

                int rollno=(int)model1.getValueAt(rowIndex,0);
                String name=(String)model1.getValueAt(rowIndex,1);
                int age=(int)model1.getValueAt(rowIndex,2);

                t1.setText(String.valueOf(rollno));
                t2.setText(String.valueOf(name));
                t3.setText(String.valueOf(age));
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (t1.getText().toString().isEmpty() ||
                        t2.getText().toString().isEmpty() ||
                        t3.getText().toString().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "please enter all area",
                            "error",
                            JOptionPane.ERROR_MESSAGE);
                }
                else {

                    int rollno = Integer.parseInt(t1.getText().toString());
                    String name = t2.getText().toString();
                    int age = Integer.parseInt(t3.getText().toString());

                   int row=table.getSelectedRow();

                   model1.setValueAt(rollno,row,0);
                    model1.setValueAt(name,row,1);
                    model1.setValueAt(age,row,2);

                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(table.getSelectedRow()==-1) {
                    JOptionPane.showMessageDialog(null,
                            "please select row",
                            "error",
                            JOptionPane.ERROR_MESSAGE);
                }
                else {

                    int status = JOptionPane.showConfirmDialog(null,
                            "Do you want to deete this row",
                            "Confirm",
                            JOptionPane.YES_NO_CANCEL_OPTION);
                    if (status == JOptionPane.YES_OPTION) {
                        model1.removeRow(table.getSelectedRow());
                        t1.setText(null);
                        t2.setText(null);
                        t3.setText(null);
                    }
                }
            }
        });
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        validate();
        setVisible(true);
    }

}

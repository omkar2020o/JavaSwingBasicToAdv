/*
JTable is used to display the data into tabular form(Rows and columns)

JTable table=new JTable(data,columnNames);

JTable
>Create a table
>useful methods

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
import javax.swing.*;
import java.awt.*;

public class Swing35AJTable {
    public static void main(String[] args) {
        JFrame frame=new JFrame("JTable");
        String[][]  data={
                {"001","ram","21"},
                {"002","omkar","23"},
                {"003","diksha","65"}
        };
        String[] columnname={"Rollno","name","age"};

        JTable t1 = new JTable(data,columnname);
        frame.add(new JScrollPane(t1));


        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/**
 * Auto Generated Java Class.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.util.*;
public class AccountingPanel extends JFrame  {
  //rows in jtable
  static int rows=0;
  //Create a JTable
  JTable table;
  
  static Object rowData[][];
  JPanel accountingPanel = new JPanel();
  JLabel title = new JLabel ("Music Checkout Machine",SwingConstants.CENTER);
    public AccountingPanel(){ 
    //Set the title of the GUI
    setTitle("Music Dept. Resource Tracker");
    //Set the size of the frame and make sure the size can't be changed
    setSize(900, 900);
    setResizable(false);
    
    //Declare the layouts for the JPanels 
    FlowLayout layout1 = new FlowLayout();
    BorderLayout layout2 = new BorderLayout();
    
    //Set the layout to GridBagLayout
    setLayout(new GridBagLayout());
    rowData = new Object [20][4];
    
    
    //Set the name of the columns in the JTable
    Object columnNames[] = { "Item", "Debit", "Credit", "Date" };
    
    //Create the JTable and make it uneditable
    JTable table = new JTable(rowData, columnNames);
    
      /*
       * isCellEditable
       * @Description: Makes the information in the table uneditable by the user
       * @Author: Aziz, James, Jerry
       * @Param: row the row number of the table
       * @Param: column the number of the column
       * @Return: Whether or not the table can be edited by the user
       */
      
    
    }
    
    
}

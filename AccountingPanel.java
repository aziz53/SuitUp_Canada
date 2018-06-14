/*
 * AccountingPanel.java
 * This is the accounting panel where employees can add and remove accounting entries
 * Author: Aziz, James, Jerry
 */ 

//add nesscary imports
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.*;
import java.io.*;

//accounting panel class 
public class AccountingPanel extends JPanel implements ActionListener  {
  
  //buttons to go back to employee menu and to add/remove items
  JButton addItem;
  JButton removeItem;
  JButton backButton;
  
  //variables for the accounting menu table
  DefaultTableModel accountingModel;
  JScrollPane tableScroller;
  int rows=0;
  JTable table;
  Object rowData[][];
  
  //title for the accounting menu
  JLabel title;
  
  //textfields to get data from the user
  JTextField debit;
  JTextField credit;
  JTextField date;
  JTextField itemField;
  
  //labels to assist the user in using the accounting panel
  JLabel debitItem;
  JLabel creditItem;
  JLabel dateItem;
  JLabel item;
  
  //create constructor for the accounting panel
  AccountingPanel(){ 
    
    //create gridbaglayout
    setLayout(new GridBagLayout());
      
   //create gridbagconstraints
    GridBagConstraints gbc = new GridBagConstraints();
    
    //gridbagconstraints insets
    gbc.insets = new Insets(20,50,20,50);
    
    //initialize title 
    title = new JLabel ("Accounting Ledger");
    
    //initialize buttons
    addItem = new JButton("Add Entry");
    removeItem= new JButton("Remove Entry");
    backButton = new JButton("Go back");
    
    //set font of title
    title.setFont(new Font("Serif",Font.BOLD,50));
    
    //add the title to the panel
    gbc.gridx=0;
    gbc.gridy=0;
    this.add(title,gbc);
    
    //create textfields to get the data for accounting entries
    debit= new JTextField(20);
    credit= new JTextField(20);
    date= new JTextField(20);
    itemField = new JTextField(20);
    
    //create labels for the jtextfields
    debitItem = new JLabel("Debit Item: ");
    creditItem = new JLabel("Credit Item: ");
    dateItem = new JLabel ("Date Item:");
    item = new JLabel ("Service Item: ");
    
    //add action listeners to the buttons
    addItem.addActionListener(this);
    removeItem.addActionListener(this);
    backButton.addActionListener(this);
    
    //column names for the accounting panel
    String columnNames[] = { "Item", "Debit", "Credit", "Date" };
    
    //create accounting table
    accountingModel = new DefaultTableModel(columnNames,1);
    table = new JTable(accountingModel);
    
    //read in data from the accountingentries arraylist and add it to the accounting model
    for(int i=0; i<SuitUpCanada.accountingEntries.size(); i++){
      
      String debit1 = SuitUpCanada.accountingEntries.get(i).getDebit();
      String credit1 = SuitUpCanada.accountingEntries.get(i).getCredit();
      String date1 = SuitUpCanada.accountingEntries.get(i).getDate();
      String item1 = SuitUpCanada.accountingEntries.get(i).getService();
      System.out.println(debit1 + " " + credit1 + " " + date1 + " " + item1);
      Object[] data1 = {item1,debit1,credit1,date1};
      accountingModel.addRow(data1);
      
    }
    
    //make it so that the table can't be edited
    table.setEnabled(false);
    
    //add a scroller to the table
    tableScroller= new JScrollPane(table);
    
    //add the table to panel
    gbc.gridx=0;
    gbc.gridy=1;
    this.add(tableScroller,gbc);
    
    //add the add item button to the jpanel to the panel
    gbc.gridx=0;
    gbc.gridy=2;
    this.add(addItem,gbc);
    
    //add the remove item button to the jpanel
    gbc.gridx=0;
    gbc.gridy=3;
    this.add(removeItem,gbc);
    
    //add the previous button to the jpanel
    gbc.gridx=0;
    gbc.gridy=4;
    this.add(backButton,gbc);
    
    //Create the JTable
    table = new JTable(rowData, columnNames);
    
    //set the panel visibility to true
    this.setVisible(true);
  }
  
  //actionPerformed method 
  //listens to java swing items and overrides the action listener abstract class by providing unique responses
  //to this program
  //@param1 is the actionevent
  public void actionPerformed(ActionEvent event) {
    
    //create button pressed
    this.setVisible(true);
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      
      //cast the actionlistener event to a jbutton
      buttonPressed = (JButton)(event.getSource());
      
      //add new instance of addItem panel if addItem button is pressed
      if(buttonPressed.equals(addItem)){
        this.setVisible(false);
        this.add(new AddItem());
        SuitUpCanada.mainGame.add(new AddItem());
      }
      
      //add new instance of removeItem panel if removeItem button is pressed
      else if(buttonPressed.equals(removeItem)) {
        this.setVisible(false);
        this.add(new RemoveItem());
        SuitUpCanada.mainGame.add(new RemoveItem());
      }
      
      //add new instance of backButton if back button is pressed
      else if(buttonPressed.equals(backButton)) {
        this.setVisible(false);
        this.add(new EmployeeMenu());
        SuitUpCanada.mainGame.add(new EmployeeMenu());
      }
      
    }
    
  }
  
  
}

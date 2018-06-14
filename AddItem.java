/*
 * AddItem.java
 * This panel is where accounting entries are added to the accounting panel's table and the textfile output
 * Author: Aziz, James, Jerry
 */ 

//import nesscary jdk items
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//add item panel
public class AddItem extends JPanel implements ActionListener{
  
  //labels for the title of the jpanel and for the textfields
  JLabel title;
  JLabel debitItem;
  JLabel creditItem;
  JLabel dateItem;
  JLabel serviceItem;
  
  //textfields that will get the data to add items to the accountingpanel and textfiel
  JTextField debit;
  JTextField credit;
  JTextField date;
  JTextField service;
  
  //jlabel for instructions
  JLabel instructions;
  
  //buttons to add the entry and go back to the previous screen
  JButton addItem;
  JButton goBack;
  
  //printwriter to update the textfile
  PrintWriter output;
  
  //constructor for AddItem
  AddItem () {
    
    //add title to AddEntry panel and set the font
    title= new JLabel ("Add Entry");
    title.setFont(new Font("Serif",Font.BOLD, 50));
    
    //create labels for jtextfields by initializing them
    debitItem = new JLabel("Debit Item: ");
    creditItem = new JLabel ("Credit Item: ");
    dateItem = new JLabel ("Date Item: ");
    serviceItem = new JLabel("Service Item: ");
    
    //create instructions
    instructions = new JLabel("Entries in the debit/credit are formatted as Sales-500, dates are formatted as YYYY/MM/DD");
    
    //create textfields to get information
    debit = new JTextField(20);
    credit = new JTextField(20);
    date = new JTextField(20);
    service = new JTextField(20);
    
    //create buttons to add items and go back
    addItem = new JButton("Add Item: ");
    goBack = new JButton("Back");
    
    //add action listeners to the jtextfields
    debit.addActionListener(this);
    credit.addActionListener(this);
    date.addActionListener(this);
    service.addActionListener(this);
    
    //add action listener to the jbuttons
    addItem.addActionListener(this);
    goBack.addActionListener(this);
    
    //set the layout to gridbaglayout
    setLayout(new GridBagLayout());
    
    //create gridbagconstraints and set the insets
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(20,50,20,50);
    
    //add jlabel title
    gbc.gridx=0;
    gbc.gridy=0;
    this.add(title,gbc);
    
    //add the debit item jlabel
    gbc.gridx=0;
    gbc.gridy=1;
    this.add(debitItem,gbc);
    
    //add the the debit jtextfield
    gbc.gridx=1;
    gbc.gridy=1;
    this.add(debit,gbc);
    
    //add the credit item jlabel
    gbc.gridx=0;
    gbc.gridy=2;
    this.add(creditItem,gbc);
    
    //add the credit item textfield
    gbc.gridx=1;
    gbc.gridy=2;
    this.add(credit,gbc);
    
    //add the date item jlabel
    gbc.gridx=0;
    gbc.gridy=3;
    this.add(dateItem,gbc);
    
    //add the date item jtextfield
    gbc.gridx=1;
    gbc.gridy=3;
    this.add(date,gbc);
    
    //add the service item jlabel
    gbc.gridx=0;
    gbc.gridy=4;
    this.add(serviceItem,gbc);
    
    //add the service item jtextfield
    gbc.gridx=1;
    gbc.gridy=4;
    this.add(service,gbc);
    
    //add instructions to the additem jpanel
    gbc.gridx=1;
    gbc.gridy=0;
    this.add(instructions,gbc);
    
    //add the additem button
    gbc.gridx=0;
    gbc.gridy=5;
    this.add(addItem,gbc);
    
    //add the previous button
    gbc.gridx=1;
    gbc.gridy=5;
    this.add(goBack,gbc);
    
    //set the panel to visible 
    this.setVisible(true);
    
  }
  
  //actionPerformed method 
  //listens to java swing items and overrides the action listener abstract class by providing unique responses
  //to this program
  //@param1 is the actionevent
  public void actionPerformed (ActionEvent e) {
    this.setVisible(true);
    
    //if the add button is pressed
    if(e.getSource().equals(addItem)){
      
      //get the data from the textfields
      String debitEntry = debit.getText().trim();
      String creditEntry = credit.getText().trim();
      String dateEntry = date.getText().trim();
      String serviceEntry = service.getText().trim();
      System.out.println(debitEntry + " " + creditEntry + " " + dateEntry + " " + serviceEntry);
      
      //add the data to the accountingentries arraylist
      SuitUpCanada.accountingEntries.add(new Entry(debitEntry,creditEntry,dateEntry,serviceEntry));
      
      //output to accounting entries textfile
      try {
        output = new PrintWriter(new File("accountingEntries.txt"));
        for(int i=0; i<SuitUpCanada.accountingEntries.size(); i++) {
          output.println(SuitUpCanada.accountingEntries.get(i).toString1());
        }
        
        //close the output
        output.close();
      } catch(Exception exe) {
      }
      
      //go back button
    }else if(e.getSource().equals(goBack)){
      
      //set current panel to false
      this.setVisible(false);
      try{
        
        //add back accounting panel
        SuitUpCanada.mainGame.add(new AccountingPanel());
      }catch(Exception ex){};
    }
  }
  
}

/*
 * RemoveEmployee.java
 * This is the panel that runs the process to remove an employee
 * Author: Aziz, James, Jerry
 */ 

//import nessecary items
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//panel
public class RemoveItem extends JPanel implements ActionListener{
  
  //title for panel and for user knowledge
  JLabel title;
  JLabel debitItem;
  JLabel creditItem;
  JLabel dateItem;
  JLabel serviceItem;
  
  //textfields to get user data
  JTextField debit;
  JTextField credit;
  JTextField date;
  JTextField service;
  
  //jlabel for instructions
  JLabel instructions;
  
  //printwriter to textfile
  PrintWriter output;
  
  //go back and remove item button
  JButton removeItem;
  JButton goBack;
  
  //constructor
  RemoveItem () {
    
    //create and set title
    title= new JLabel ("Remove Entry");
    title.setFont(new Font("Serif",Font.BOLD, 50));
    
    //create jlabels for jtextfields
    debitItem = new JLabel("Debit Item: ");
    creditItem = new JLabel ("Credit Item: ");
    dateItem = new JLabel ("Date Item: ");
    serviceItem = new JLabel("Service Item: ");
    
    //create jlabel instructions
    instructions = new JLabel("Entries in the debit/credit are formatted as Sales-500, dates are formatted as YYYY/MM/DD");
    
    //create jtextfields
    debit = new JTextField(20);
    credit = new JTextField(20);
    date = new JTextField(20);
    service = new JTextField(20);
    removeItem = new JButton("Remove Item: ");
    goBack = new JButton("Back");
    
    //add action listeners to jtextfields
    debit.addActionListener(this);
    credit.addActionListener(this);
    date.addActionListener(this);
    
    //add action listeners to buttons
    removeItem.addActionListener(this);
    goBack.addActionListener(this);
    
    //set gridbaglayout
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    
    //set gbc insets
    gbc.insets = new Insets(20,50,20,50);
    
    //add title
    gbc.gridx=0;
    gbc.gridy=0;
    this.add(title,gbc);
    
    //add debit label
    gbc.gridx=0;
    gbc.gridy=1;
    this.add(debitItem,gbc);
    
    //add debit textfield
    gbc.gridx=1;
    gbc.gridy=1;
    this.add(debit,gbc);
    
    //add credit label
    gbc.gridx=0;
    gbc.gridy=2;
    this.add(creditItem,gbc);
    
    //add credit textfield
    gbc.gridx=1;
    gbc.gridy=2;
    this.add(credit,gbc);
    
    //add date label
    gbc.gridx=0;
    gbc.gridy=3;
    this.add(dateItem,gbc);
    
    //add date textfield
    gbc.gridx=1;
    gbc.gridy=3;
    this.add(date,gbc);
    
    //add service label
    gbc.gridx=0;
    gbc.gridy=4;
    this.add(serviceItem,gbc);
    
    //add service textfield
    gbc.gridx=1;
    gbc.gridy=4;
    this.add(service,gbc);
    
    //add instructions jlabel
    gbc.gridx=1;
    gbc.gridy=0;
    this.add(instructions,gbc);
    
    //add removeItem button
    gbc.gridx=0;
    gbc.gridy=5;
    this.add(removeItem,gbc);
    
    //add goback button
    gbc.gridx=1;
    gbc.gridy=5;
    this.add(goBack,gbc);
    this.setVisible(true);
    
  }
  
  /*
   * actionPerformed
   * This is the method that checks for button clicks and then responds to the click according to the if-statements
   * @author: Aziz, James, Jerry
   * @param: ActionEvent e, the actual button click
   */ 
  public void actionPerformed (ActionEvent e) {
    this.setVisible(true);
    
    //remove button optiohn
    if(e.getSource().equals(removeItem)){
      
      //get the data from jtextfields
      String debitEntry = debit.getText().trim();
      String creditEntry = credit.getText().trim();
      String dateEntry = date.getText().trim();
      String serviceEntry = service.getText().trim();
      
      //go through accountingEntries arraylist
      for(int i=0; i<SuitUpCanada.accountingEntries.size(); i++) {
        
        //create tempoary entry
        Entry temp = SuitUpCanada.accountingEntries.get(i);
        
        //remove entry if data matches
        if(debitEntry.equals(temp.getDebit()) && creditEntry.equals(temp.getCredit()) && dateEntry.equals(temp.getDate()) && serviceEntry.equals(temp.getService())) {
          SuitUpCanada.accountingEntries.remove(i);
          i=SuitUpCanada.accountingEntries.size();
        }
      }
      
      //reprint to textfile
      try {
        output = new PrintWriter(new File("accountingEntries.txt"));
        
        //go through accounting entries and print
        for(int i=0; i<SuitUpCanada.accountingEntries.size(); i++) {
          output.println(SuitUpCanada.accountingEntries.get(i).toString1());
          
        }
        
        //close output
        output.close();
      } catch(Exception exe) {
      }
      
      //go back button displays accounting panel
    }else if(e.getSource().equals(goBack)){
      this.setVisible(false);
      try{
        SuitUpCanada.mainGame.add(new AccountingPanel());
      }catch(Exception ex){};
    }
  }
  
}

/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RemoveItem extends JPanel implements ActionListener{
  
  JLabel title;
  JLabel debitItem;
  JLabel creditItem;
  JLabel dateItem;
  JLabel serviceItem;
  JTextField debit;
  JTextField credit;
  JTextField date;
  JTextField service;
  JLabel instructions;
  PrintWriter output;
  JButton removeItem;
  JButton goBack;
  
  RemoveItem () {
    
    title= new JLabel ("Remove Entry");
    title.setFont(new Font("Serif",Font.BOLD, 50));
    
    debitItem = new JLabel("Debit Item: ");
    creditItem = new JLabel ("Credit Item: ");
    dateItem = new JLabel ("Date Item: ");
    serviceItem = new JLabel("Service Item: ");
    
    instructions = new JLabel("Entries in the debit/credit are formatted as Sales-500, dates are formatted as YYYY/MM/DD");
    
    debit = new JTextField(20);
    credit = new JTextField(20);
    date = new JTextField(20);
    service = new JTextField(20);
    removeItem = new JButton("Remove Item: ");
    goBack = new JButton("Back");
    
    debit.addActionListener(this);
    credit.addActionListener(this);
    date.addActionListener(this);
    
    removeItem.addActionListener(this);
    goBack.addActionListener(this);
    
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(20,50,20,50);
    gbc.gridx=0;
    gbc.gridy=0;
    this.add(title,gbc);
    gbc.gridx=0;
    gbc.gridy=1;
    this.add(debitItem,gbc);
    gbc.gridx=1;
    gbc.gridy=1;
    this.add(debit,gbc);
    gbc.gridx=0;
    gbc.gridy=2;
    this.add(creditItem,gbc);
    gbc.gridx=1;
    gbc.gridy=2;
    this.add(credit,gbc);
    gbc.gridx=0;
    gbc.gridy=0;
    this.add(title,gbc);
    gbc.gridx=0;
    gbc.gridy=3;
    this.add(dateItem,gbc);
    gbc.gridx=1;
    gbc.gridy=3;
    this.add(date,gbc);
    gbc.gridx=0;
    gbc.gridy=4;
    this.add(serviceItem,gbc);
    gbc.gridx=1;
    gbc.gridy=4;
    this.add(service,gbc);
    gbc.gridx=1;
    gbc.gridy=0;
    this.add(instructions,gbc);
    gbc.gridx=0;
    gbc.gridy=5;
    this.add(removeItem,gbc);
    gbc.gridx=1;
    gbc.gridy=5;
    this.add(goBack,gbc);
        this.setVisible(true);
    
  }
  public void actionPerformed (ActionEvent e) {
    this.setVisible(true);
    if(e.getSource().equals(removeItem)){
     String debitEntry = debit.getText().trim();
     String creditEntry = credit.getText().trim();
     String dateEntry = date.getText().trim();
     String serviceEntry = service.getText().trim();
     for(int i=0; i<SuitUpCanada.accountingEntries.size(); i++) {
       Entry temp = SuitUpCanada.accountingEntries.get(i);
       if(debitEntry.equals(temp.getDebit()) && creditEntry.equals(temp.getCredit()) && dateEntry.equals(temp.getDate()) && serviceEntry.equals(temp.getService())) {
         SuitUpCanada.accountingEntries.remove(i);
         i=SuitUpCanada.accountingEntries.size();
       }
     }
     try {
    output = new PrintWriter(new File("accountingEntries.txt"));
    for(int i=0; i<SuitUpCanada.accountingEntries.size(); i++) {
    output.println(SuitUpCanada.accountingEntries.get(i).toString1());
                     }
    output.close();
    } catch(Exception exe) {
    }
  
    }else if(e.getSource().equals(goBack)){
      this.setVisible(false);
      try{
        SuitUpCanada.mainGame.add(new AccountingPanel());
      }catch(Exception ex){};
    }
  }
  
}

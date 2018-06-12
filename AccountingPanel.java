import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.*;
import java.io.*;
public class AccountingPanel extends JPanel implements ActionListener  {
  JButton addItem;
  JButton removeItem;
  JButton backButton;
  DefaultTableModel accountingModel;
  JScrollPane tableScroller;
  static int rows=0;
  JTable table;
  static Object rowData[][];
  JLabel title;
  
  JTextField debit;
  JTextField credit;
  JTextField date;
  JTextField itemField;
  
  JLabel debitItem;
  JLabel creditItem;
  JLabel dateItem;
  JLabel item;
  
  
     AccountingPanel(){ 
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(20,50,20,50);
    title = new JLabel ("Accounting Ledger");
    addItem = new JButton("Add Entry");
    removeItem= new JButton("Remove Entry");
    backButton = new JButton("Go back");
    title.setFont(new Font("Serif",Font.BOLD,50));
    gbc.gridx=0;
    gbc.gridy=0;
    this.add(title,gbc);
    
    debit= new JTextField(20);
    credit= new JTextField(20);
    date= new JTextField(20);
    itemField = new JTextField(20);
    
    debitItem = new JLabel("Debit Item: ");
    creditItem = new JLabel("Credit Item: ");
    dateItem = new JLabel ("Date Item:");
    item = new JLabel ("Service Item: ");
    
    addItem.addActionListener(this);
    removeItem.addActionListener(this);
    backButton.addActionListener(this);
    
   String columnNames[] = { "Item", "Debit", "Credit", "Date" };
   accountingModel = new DefaultTableModel(columnNames,1);
   table = new JTable(accountingModel);
   tableScroller= new JScrollPane(table);
   gbc.gridx=0;
    gbc.gridy=1;
    this.add(tableScroller,gbc);
    gbc.gridx=-1;
    gbc.gridy=2;
    this.add(debitItem,gbc);
    gbc.gridx=1;
    gbc.gridy=0;
    this.add(debit,gbc);
    gbc.gridx=2;
    gbc.gridy=0;
    this.add(creditItem,gbc);
    gbc.gridx=1;
    gbc.gridy=1;
    this.add(credit,gbc);
    gbc.gridx=2;
    gbc.gridy=1;
    this.add(dateItem,gbc);
    gbc.gridx=5;
    gbc.gridy=0;
    this.add(date,gbc);
    
    //Create the JTable and make it uneditable
 table = new JTable(rowData, columnNames);
    
      /*
       * isCellEditable
       * @Description: Makes the information in the table uneditable by the user
       * @Author: Aziz, James, Jerry
       * @Param: row the row number of the table
       * @Param: column the number of the column
       * @Return: Whether or not the table can be edited by the user
       */
      
    this.setVisible(true);
    }
      public void actionPerformed(ActionEvent event) {
        this.setVisible(true);
    JButton buttonPressed;
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      
      if(buttonPressed.equals(addItem)){
        this.setVisible(false);
        this.add(new AccountingPanel());
        SuitUpCanada.mainGame.add(new AccountingPanel());
      }
      else if(buttonPressed.equals(removeItem)) {
        this.setVisible(false);
        this.add(new HumanResources());
        SuitUpCanada.mainGame.add(new HumanResources());
      }
      else if(buttonPressed.equals(backButton)) {
        this.setVisible(false);
        this.add(new HumanResources());
        SuitUpCanada.mainGame.add(new HumanResources());
      }
     
    }
    
  }
    
    
}

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
  int rows=0;
  JTable table;
  Object rowData[][];
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
   for(int i=0; i<SuitUpCanada.accountingEntries.size(); i++){
      String debit1 = SuitUpCanada.accountingEntries.get(i).getDebit();
      String credit1 = SuitUpCanada.accountingEntries.get(i).getCredit();
      String date1 = SuitUpCanada.accountingEntries.get(i).getDate();
      String item1 = SuitUpCanada.accountingEntries.get(i).getService();
     System.out.println(debit1 + " " + credit1 + " " + date1 + " " + item1);
      Object[] data1 = {item1,debit1,credit1,date1};
      accountingModel.addRow(data1);
    }
       table.setEnabled(false);
   tableScroller= new JScrollPane(table);
   gbc.gridx=0;
    gbc.gridy=1;
    this.add(tableScroller,gbc);
    gbc.gridx=0;
    gbc.gridy=2;
    this.add(addItem,gbc);
    gbc.gridx=0;
    gbc.gridy=3;
    this.add(removeItem,gbc);
    gbc.gridx=0;
    gbc.gridy=4;
    this.add(backButton,gbc);
    
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
        this.add(new AddItem());
        SuitUpCanada.mainGame.add(new AddItem());
      }
      else if(buttonPressed.equals(removeItem)) {
        this.setVisible(false);
        this.add(new RemoveItem());
        SuitUpCanada.mainGame.add(new RemoveItem());
      }
      else if(buttonPressed.equals(backButton)) {
        this.setVisible(false);
        this.add(new EmployeeMenu());
        SuitUpCanada.mainGame.add(new EmployeeMenu());
      }
     
    }
    
  }
    
    
}

/*
 * Employee.java
 * This is the template for the Employee menu panel
 * Author: Aziz, James, Jerry
 */ 
//import nessecary items
import jdk.internal.util.xml.impl.Input;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmployeeMenu extends JPanel implements ActionListener {
  
  //initiate gbc constraints
  GridBagConstraints gbc = new GridBagConstraints();
  
  //create labels and jbutton for panel
  JLabel employeeMenu = new JLabel("Employee Menu");
  JButton hrButton = new JButton("HUMAN RESOURCES");
  JButton accountingButton = new JButton("ACCOUNTING");
  JButton bookAppointment = new JButton("BOOK APPOINTMENT");
  JButton quit = new JButton("QUIT");
  
  //constructor for employee menu
  public EmployeeMenu(){
    
    //set visiblity to true and create gridbaglayout
      this.setVisible(true);
    setLayout(new GridBagLayout());
    
    //add action listeners to swing componets
    hrButton.addActionListener(this);
    accountingButton.addActionListener(this);
    quit.addActionListener(this);
    bookAppointment.addActionListener(this);
    
    //set gbc insets
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    //set gbc weights
    gbc.weightx=0;
    gbc.weighty=0;

    //add human resource button
    gbc.gridx = 3;
    gbc.gridy = 1;
    add(hrButton,gbc);
    
    //add accounting button
    gbc.gridx = 3;
    gbc.gridy = 2;
    add(accountingButton,gbc);
    
    //add title
    gbc.gridx = 3;
    gbc.gridy = 0;
    employeeMenu.setFont(new Font("Serif", Font.BOLD, 20));
    add(employeeMenu, gbc);
    
    //add book appointment button
    gbc.gridx = 3;
    gbc.gridy=3;
    add(bookAppointment,gbc);
    
    //add quit button
    gbc.gridx = 3;
    gbc.gridy = 5;
    add(quit, gbc);
  }
  
    //actionPerformed method 
  //listens to java swing items and overrides the action listener abstract class by providing unique responses
  //to this program
  //@param1 is the actionevent
  public void actionPerformed(ActionEvent event) {
    
    //initiate tempoary button
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      
      //cast action event to button
      buttonPressed = (JButton)(event.getSource());
      
      //create accounting panel if accounting button is pressed
      if(buttonPressed.equals(accountingButton)){
        this.setVisible(false);
        this.add(new AccountingPanel());
        SuitUpCanada.mainGame.add(new AccountingPanel());
      }
       
      //create human resources panel if human resources button is pressed
      else if(buttonPressed.equals(hrButton)) {
        this.setVisible(false);
        this.add(new HumanResources());
        SuitUpCanada.mainGame.add(new HumanResources());
      }
      
      //create bookAppointment panel if bookAppointment button is pressed
       else if(buttonPressed.equals(bookAppointment)) {
        this.setVisible(false);
        this.add(new BookAppointment());
        SuitUpCanada.mainGame.add(new BookAppointment());
         
      }
       
       //quit button
      else if(buttonPressed.equals(quit)){
        System.exit(0);
      }
    }
  }
}

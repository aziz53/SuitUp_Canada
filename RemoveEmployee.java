/*
 * RemoveEmployee.java
 * This is the panel that runs the process to remove an employee
 * Author: Aziz, James, Jerry
 */ 

// Import statements
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

// Main class for the remove employee panel
class RemoveEmployee extends JPanel implements ActionListener{
  
  // Java graphics variables
  PrintWriter output;
  JLabel title;
  JLabel nameLabel;
  JLabel numLabel;
  JButton add;
  JButton back;
  JTextField name;
  JTextField number;
  
  // Constructor
  RemoveEmployee() throws Exception{
    
    // Declare print writer to output data to text file
    output = new PrintWriter(new FileWriter("Termination Log.txt",true));
    this.setVisible(true);
    
    // Create JLabels for titles and names
    title = new JLabel("Remove Employee");
    title.setFont(new Font("Serif",Font.BOLD,50));
    nameLabel = new JLabel("Employee Name: ");
    numLabel = new JLabel("Employee Number: ");
    
    // Create JTextFields for entering the data
    name = new JTextField(20);
    number = new JTextField(20);
    
    // Create JButtons
    add = new JButton("REMOVE EMPLOYEE");
    back = new JButton("Back");
    
    // Add the appropriate action listeners
    name.addActionListener(this);
    number.addActionListener(this);
    add.addActionListener(this);
    back.addActionListener(this);
    
    // Set layout of the screen
    setLayout(new GridBagLayout());
    
    // Initialize grid bag constraints
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(20,50,20,50);
    
    // Add the Java elements at their correct locations
    gbc.gridx = 0;
    gbc.gridy = 0;
    add(title,gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(nameLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    add(name,gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(numLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    add(number,gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;
    add(add,gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    add(back,gbc);
  }
  /*
   * actionPerformed
   * This method takes button clicks or text inputs from JTextFields and responds to the events according
   * @author: Aziz, James, Jerry
   * @param: ActionEvent e, the actual button click or the text input
   */ 
  public void actionPerformed(ActionEvent e){
    
    // Check which button the employee has clicked and if they have the status to add new employees
    if(e.getSource().equals(add)){
      if(SuitUpCanada.currentStatus < 3){
        boolean changed = false;
        
        // Loop through all the employees and then check if they exist in the records and also check their status
        for(int i=0; i<SuitUpCanada.employeeList.size(); i++){
          if(SuitUpCanada.employeeList.get(i).getName().equalsIgnoreCase(name.getText()) && SuitUpCanada.employeeList.get(i).getNumber().equalsIgnoreCase(number.getText())){
            if(SuitUpCanada.employeeList.get(i).getStatus() <= SuitUpCanada.currentStatus){
              
              // Do not allow employees to fire coworkers with equal or greater status
              JOptionPane.showMessageDialog(SuitUpCanada.mainGame,"You cannot fire employees with equal or greater status");
              return;
            }
            // Print termination to text file
            output.println("Employee: " + SuitUpCanada.employeeList.get(i).getName() + " Number: " + SuitUpCanada.employeeList.get(i).getNumber() + " was fired by " + "Employee: " + SuitUpCanada.currentName + " Number: " + SuitUpCanada.currentNum);
            SuitUpCanada.employeeList.remove(i);
            output.close();
            changed = true;
          }
        }
        if(changed == false){
          
          // If the employee entered is not an actual employee display a message
          JOptionPane.showMessageDialog(SuitUpCanada.mainGame,"No such employee exists in our records");
          return;
        }
        // Display message for successfully removed
        JOptionPane.showMessageDialog(SuitUpCanada.mainGame,"You have successfully removed an employee");
        this.setVisible(false);
        
        try{
          // Take the user back to the human resources screen
          SuitUpCanada.mainGame.add(new HumanResources());
        }catch(Exception exception){};
      }else{
        
        // Do not allow status 3 employees to fire employees
        JOptionPane.showMessageDialog(SuitUpCanada.mainGame,"You do not have authorization to remove employees");
      }
    }else if(e.getSource().equals(back)){
      this.setVisible(false);
      try{
        // Take the user back to the human resources panel
        SuitUpCanada.mainGame.add(new HumanResources());
      }catch(Exception exception){};
    }
  }
}

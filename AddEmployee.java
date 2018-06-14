/*
 * AddEmployee.java
 * This is the screen where the current signed in employee can hire new employees provided they have authorization to do so
 * Author: Aziz, James, Jerry
 */ 

// Import statements
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Class for adding employees to the database
class AddEmployee extends JPanel implements ActionListener{
  // Java graphics variable declarations
  JLabel title;
  JLabel nameLabel;
  JLabel numLabel;
  JLabel passwordLabel;
  JLabel positionLabel;
  JLabel salaryLabel;
  JLabel statusLabel;
  JButton add;
  JTextField name;
  JTextField number;
  JTextField password;
  JTextField position;
  JTextField salary;
  JTextField status;
  JButton back;
  
  // Constructor
  AddEmployee(){
    // Set screen visible
    this.setVisible(true);
    // Create the labels for the text fields
    title = new JLabel("Add Employee");
    title.setFont(new Font("Serif",Font.BOLD,50));
    nameLabel = new JLabel("Employee Name: ");
    numLabel = new JLabel("Employee Number: ");
    passwordLabel = new JLabel("Employee Password: ");
    positionLabel = new JLabel("Employee Position: ");
    salaryLabel = new JLabel("Employee Salary: ");
    statusLabel = new JLabel("Employee Status: ");
    
    // Create the text fields to take data for the new hire
    name = new JTextField(20);
    number = new JTextField(20);
    password = new JTextField(20);
    position = new JTextField(20);
    salary = new JTextField(20);
    status = new JTextField(20);
    
    // Create JButtons
    add = new JButton("ADD EMPLOYEE");
    back = new JButton("Back");
    
    // Add action listeners to buttons and text fields
    name.addActionListener(this);
    number.addActionListener(this);
    password.addActionListener(this);
    position.addActionListener(this);
    salary.addActionListener(this);
    status.addActionListener(this);
    add.addActionListener(this);
    back.addActionListener(this);
    
    // Set the layout to grid bag layout and initialize it
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(20,50,20,50);
    
    // Add title to appropriate location
    gbc.gridx = 0;
    gbc.gridy = 0;
    add(title,gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    // Add labels and their corresponding text fields to the correct locations
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
    add(passwordLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    add(password,gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    add(positionLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 4;
    add(position,gbc);
    gbc.gridx = 0;
    gbc.gridy = 5;
    add(positionLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 5;
    add(position,gbc);
    gbc.gridx = 0;
    gbc.gridy = 6;
    add(salaryLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 6;
    add(salary,gbc);
    gbc.gridx = 0;
    gbc.gridy = 7;
    add(statusLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 7;
    add(status,gbc);
    
    // Add JButtons to the correct locations
    gbc.gridx = 0;
    gbc.gridy = 8;
    add(add,gbc);
    gbc.gridx = 1;
    gbc.gridy = 8;
    add(back,gbc);
  }
  
  /*
   * actionPerformed
   * This method checks if the button to add employees or to go back has been clicked, if the user would like to add, their clearance will be checked and they can then add
   * If the user would like to go back, it will take them back to the HR page
   * @author: Aziz, James, Jerry
   * @param: ActionEvent e, the actual mouse click
   */ 
  public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(add)){
      if(SuitUpCanada.currentStatus < 3){
        // Check if add button is clicked and if the employee has clearance
        SuitUpCanada.employeeList.add(new Employee(name.getText(),number.getText(),password.getText(),position.getText(),salary.getText(),Integer.parseInt(status.getText())));
        for(int i=0; i< SuitUpCanada.employeeList.size(); i++){
          // Print all employees out for record keeping purposes once the employee has been added
          System.out.println(SuitUpCanada.employeeList.get(i).getName() + " " + SuitUpCanada.employeeList.get(i).getNumber() + " " + SuitUpCanada.employeeList.get(i).getPassword() + " " + SuitUpCanada.employeeList.get(i).getPosition() + " " + SuitUpCanada.employeeList.get(i).getSalary() + " " + SuitUpCanada.employeeList.get(i).getStatus()); 
        }
        // Display message
        JOptionPane.showMessageDialog(SuitUpCanada.mainGame,"You have successfully added an employee");
        this.setVisible(false);
        // Take the user back to the main HR page
        try{
        SuitUpCanada.mainGame.add(new HumanResources());
        }catch(Exception exception){};
      }else{
        // Display message
        JOptionPane.showMessageDialog(SuitUpCanada.mainGame,"You do not have authorization to add employees");
      }
    }else if(e.getSource().equals(back)){
      // Respond to back button click and take the user back to the correct page
      this.setVisible(false);
      try{
        SuitUpCanada.mainGame.add(new HumanResources());
      }catch(Exception exception){};
    }
  }
}

/*
 * HumanResources.java
 * This is the template for the human resources display screen, it shows all the current employees and the corresponding information
 * Author: Aziz, James, Jerry
 */ 

// Import statements
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.*;
import java.io.*;

// Main class code to create the JPanel for the human resources screen
class HumanResources extends JPanel implements ActionListener{
  
  // Variables
  PrintWriter output;
  JLabel title;
  JTable employeeInfo;
  DefaultTableModel model;
  JScrollPane tableHolder;
  JButton addEmployee;
  JButton removeEmployee;
  JButton back;
  
  // Constructor
  HumanResources() throws Exception{
    
    // Create a print writer to output employee information to text file
    output = new PrintWriter(new File("Employee Info.txt"));
    
    // Loop through employees and print their data to the text file
    for(int i=0; i<SuitUpCanada.employeeList.size(); i++){
      output.println(SuitUpCanada.employeeList.get(i).getName() + " " + SuitUpCanada.employeeList.get(i).getNumber() + " " + SuitUpCanada.employeeList.get(i).getPassword() + " " + SuitUpCanada.employeeList.get(i).getPosition() + " " + SuitUpCanada.employeeList.get(i).getSalary() + " " + SuitUpCanada.employeeList.get(i).getStatus());
    }
    output.close();
    System.out.println(SuitUpCanada.currentName);
    
    // Initialize all Java graphics variables
    title = new JLabel("Human Resources");
    title.setFont(new Font("Serif",Font.BOLD,50));
    addEmployee = new JButton("ADD EMPLOYEE");
    removeEmployee = new JButton("REMOVE EMPLOYEE");
    
    // Add action listeners
    addEmployee.addActionListener(this);
    removeEmployee.addActionListener(this);
    this.setVisible(true);
    
    // Create JTable with the following titles
    String column[] = {"Name","Number","Position","Salary","Status"};
    // Use the default status for the JTable
    model = new DefaultTableModel(column,0);
    employeeInfo = new JTable(model);
    
    // Loop through the array list of employees and print the employee info to the JTable
    for(int i=0; i<SuitUpCanada.employeeList.size(); i++){
      String name = SuitUpCanada.employeeList.get(i).getName();
      String number = SuitUpCanada.employeeList.get(i).getNumber();
      String position = SuitUpCanada.employeeList.get(i).getPosition();
      String salary = SuitUpCanada.employeeList.get(i).getSalary();
      String status = Integer.toString(SuitUpCanada.employeeList.get(i).getStatus());
      Object[] data = {name,number,position,salary,status};
      // Add data to the table model
      model.addRow(data);
    }
    
    // Do not allow the table to be edited
    employeeInfo.setEnabled(false);
    
    // Create the scroll pane to add the table
    tableHolder = new JScrollPane(employeeInfo);
    
    // Create back button
    back = new JButton("Back");
    back.addActionListener(this);
    
    // Create the layout and set up the grid bag constraints
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(20,50,20,50);
    gbc.gridx = 0;
    gbc.gridy = 0;
    this.add(title,gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    this.add(tableHolder,gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    this.add(addEmployee,gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;
    this.add(removeEmployee,gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    this.add(back,gbc);
  }
  /*
   * actionPerformed
   * This method checks for button clicks and responds to the action according to the if-statements
   * @author: Aziz, James, Jerry
   * @param: ActionEvent e, this is the actual mouse click on the button
   */ 
  public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(addEmployee)){
      this.setVisible(false);
      // Open add employee panel
      SuitUpCanada.mainGame.add(new AddEmployee());
    }else if(e.getSource().equals(removeEmployee)){
      this.setVisible(false);
      try{
      // Open remove employee panel
      SuitUpCanada.mainGame.add(new RemoveEmployee());
      }catch(Exception exception){};
    }else if(e.getSource().equals(back)){
      this.setVisible(false);
      // Open employee menu panel
      SuitUpCanada.mainGame.add(new EmployeeMenu());
    }
  }
}

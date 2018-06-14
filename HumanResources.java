/*
 * HumanResources.java
 * This is the template for the Human resources panel
 * Author: Aziz, James, Jerry
 */ 

//import nesscary items from jdk
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.*;
import java.io.*;
class HumanResources extends JPanel implements ActionListener{
  
  //declare printwriter
  PrintWriter output;
  
  //make labels, jbuttons, and table 
  JLabel title;
  JTable employeeInfo;
  DefaultTableModel model;
  JScrollPane tableHolder;
  JButton addEmployee;
  JButton removeEmployee;
  JButton back;
  
  //human resources constructor
  HumanResources() {
    
    //printwriter that has all the information to human resources
    try {
    output = new PrintWriter(new File("Employee Info.txt"));
    } catch(Exception e) {
    }
    
    //print the data from employee list
    for(int i=0; i<SuitUpCanada.employeeList.size(); i++){
      output.println(SuitUpCanada.employeeList.get(i).getName() + " " + SuitUpCanada.employeeList.get(i).getNumber() + " " + SuitUpCanada.employeeList.get(i).getPassword() + " " + SuitUpCanada.employeeList.get(i).getPosition() + " " + SuitUpCanada.employeeList.get(i).getSalary() + " " + SuitUpCanada.employeeList.get(i).getStatus());
    }
    
    //close the output
    output.close();
    System.out.println(SuitUpCanada.currentName);
    
    //initialize the data for the java swing componets
    title = new JLabel("Human Resources");
    title.setFont(new Font("Serif",Font.BOLD,50));
    addEmployee = new JButton("ADD EMPLOYEE");
    removeEmployee = new JButton("REMOVE EMPLOYEE");
    
    //add action listeners and set the panel visibility
    addEmployee.addActionListener(this);
    removeEmployee.addActionListener(this);
    this.setVisible(true);
    
    //declare column names
    String column[] = {"Name","Number","Position","Salary","Status"};
    
    //create the jtable
    model = new DefaultTableModel(column,0);
    employeeInfo = new JTable(model);
    
    //input the data into the jtable from employee list
    for(int i=0; i<SuitUpCanada.employeeList.size(); i++){
      String name = SuitUpCanada.employeeList.get(i).getName();
      String number = SuitUpCanada.employeeList.get(i).getNumber();
      String position = SuitUpCanada.employeeList.get(i).getPosition();
      String salary = SuitUpCanada.employeeList.get(i).getSalary();
      String status = Integer.toString(SuitUpCanada.employeeList.get(i).getStatus());
      Object[] data = {name,number,position,salary,status};
      model.addRow(data);
    }
    
    //make the jtable uneditable directly
    employeeInfo.setEnabled(false);
    tableHolder = new JScrollPane(employeeInfo);
    
    //add back button
    back = new JButton("Back");
    back.addActionListener(this);
    
    //create gridbaglayout
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    
    //set gridbag insets
    gbc.insets = new Insets(20,50,20,50);
    
    //add title
    gbc.gridx = 0;
    gbc.gridy = 0;
    this.add(title,gbc);
    
    //add table
    gbc.gridx = 0;
    gbc.gridy = 1;
    this.add(tableHolder,gbc);
    
    //add add employee button
    gbc.gridx = 0;
    gbc.gridy = 2;
    this.add(addEmployee,gbc);
    
    //add remove employee button
    gbc.gridx = 0;
    gbc.gridy = 3;
    this.add(removeEmployee,gbc);
    
    //add back button
    gbc.gridx = 0;
    gbc.gridy = 4;
    this.add(back,gbc);
    this.setVisible(true);
  }
 /*
   * actionPerformed
   * This is the method that checks for button clicks and then responds to the click according to the if-statements
   * @author: Aziz, James, Jerry
   * @param: ActionEvent e, the actual button click
   */ 
  public void actionPerformed(ActionEvent e){
    this.setVisible(true);
    
    //add employee button will open add employee panel
    if(e.getSource().equals(addEmployee)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new AddEmployee());
      
      //remove employee button will open remove employee panel
    }else if(e.getSource().equals(removeEmployee)){
      this.setVisible(false);
      try{
      SuitUpCanada.mainGame.add(new RemoveEmployee());
      }catch(Exception exception){};
      
      //back button will display employee menu
    }else if(e.getSource().equals(back)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new EmployeeMenu());
    }
  }
}

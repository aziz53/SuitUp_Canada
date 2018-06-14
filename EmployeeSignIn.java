/*
 * EmployeeSignIn.java
 * This is the main sign in page for employees
 * Author: Aziz, James, Jerry
 */ 

// Import statements
import jdk.internal.util.xml.impl.Input;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Class for employee sign in page
public class EmployeeSignIn extends JPanel implements ActionListener {
  
  // Set up grid bag constraints
  GridBagConstraints gbc = new GridBagConstraints();
  
  // Declare Java graphics variables
  JButton next = new JButton("NEXT");
  JButton quit = new JButton("BACK");
  JLabel employeeNameLabel = new JLabel("EMPLOYEE NAME:");
  JLabel employeeNumberLabel = new JLabel("EMPLOYEE NUMBER:");
  JLabel passwordLabel = new JLabel("PASSWORD:");
  JTextField employeeNameField = new JTextField(20);
  JTextField employeeNumberField = new JTextField(20);
  JTextField passwordField = new JTextField(20);
  
  // Constructor
  public EmployeeSignIn() {
    
    // Set the layout of the screen
    setLayout(new GridBagLayout());
    
    // Add action listeners to components
    next.addActionListener(this);
    quit.addActionListener(this);
    employeeNameField.addActionListener(this);
    employeeNumberField.addActionListener(this);
    passwordField.addActionListener(this);
    
    // Modify grid bag constraints
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);    
    gbc.weightx=0;
    gbc.weighty=0;
    
    // Add employee labels to correct location
    gbc.gridx = 1;
    gbc.gridy = 0;
    employeeNameLabel.setFont(new Font("Serif", Font.BOLD, 18));
    add(employeeNameLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    employeeNumberLabel.setFont(new Font("Serif", Font.BOLD, 18));
    add(employeeNumberLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    passwordLabel.setFont(new Font("Serif", Font.BOLD, 18));
    add(passwordLabel,gbc);
    
    // Add employee text fields to correct locations
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(employeeNameField,gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(employeeNumberField,gbc);
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(passwordField,gbc);
    
    // Add buttons to correct locations
    gbc.gridx = 2;
    gbc.gridy = 3;
    add(next, gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    add(quit, gbc);
  }
  
  /*
   * actionPerformed
   * This method checks for buttons clicks and text inputs and then uses that data to log on employees
   * @author: Aziz, James, Jerry
   * @param: ActionEvent event, the button click or text entering
   */ 
  public void actionPerformed(ActionEvent event){
    // Button
    JButton buttonPressed;
    
    // Text fields
    String name = employeeNameField.getText();
    String password = passwordField.getText();
    String number = employeeNumberField.getText();
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());    
      if(buttonPressed.equals(next)){
        boolean signedIn = false;
        // Check if the employee exists in the database
        for(int i=0; i< SuitUpCanada.employeeList.size(); i++){
          if(SuitUpCanada.employeeList.get(i).getName().equalsIgnoreCase(name) && SuitUpCanada.employeeList.get(i).getPassword().equals(password) && SuitUpCanada.employeeList.get(i).getNumber().equalsIgnoreCase(number)){
            System.out.println("match");
            // Set up current login with employee credentials
            SuitUpCanada.currentName = SuitUpCanada.employeeList.get(i).getName();
            SuitUpCanada.currentNum = SuitUpCanada.employeeList.get(i).getNumber();
            SuitUpCanada.currentPosition = SuitUpCanada.employeeList.get(i).getPosition();
            SuitUpCanada.currentStatus = SuitUpCanada.employeeList.get(i).getStatus();
            signedIn = true;
            this.setVisible(false);
            // Change page
            SuitUpCanada.mainGame.add(new EmployeeMenu());
          }
        }
        if(signedIn == false){
          // Error message for incorrect username/password
          JOptionPane.showMessageDialog(SuitUpCanada.mainGame,"Invalid log in");
        }
      }
      else if(buttonPressed.equals(quit)){
        this.setVisible(false);
        // Open the login page
        SuitUpCanada.mainGame.add(new Login());
      }
    }
  }
}

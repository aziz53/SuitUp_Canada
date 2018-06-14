/*
 * Login.java
 * This is the template for the Login panel in Employee Signin
 * Author: Aziz, James, Jerry
 */ 

//import nesscary jdk componets
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//panel
class Login extends JPanel implements ActionListener{
  
  //buttons to select type of login
  JButton userButton;
  JButton employeeButton;
  
  //title
  JLabel login;
  
    //previous button
  JButton backButton;
  
  //constructor
  Login(){
    
    //set visibility and size
    this.setVisible(true);
    this.setSize(1920,1080);
    
    //create data for swing componets
    login = new JLabel("Login Page", SwingConstants.CENTER);
    login.setFont(new Font("Serif",Font.BOLD,50));
    userButton = new JButton("USER SIGN IN");
    employeeButton = new JButton("EMPLOYEE SIGN IN");
    backButton = new JButton("BACK");
    
    //add action listeners to componets
    userButton.addActionListener(this);
    employeeButton.addActionListener(this);
    backButton.addActionListener(this);
    
    //set layout to gridbaglayout
    setLayout(new GridBagLayout());
    
    //create gbc and insets
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(50,100,50,100);
    
    //add title
    gbc.gridx = 0;
    gbc.gridy = 0;
    add(login,gbc);
    
    //add employee signin button
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(employeeButton,gbc);
    
    //add user signin button
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(userButton,gbc);
    
    //add back button
    gbc.gridx = 0;
    gbc.gridy = 3;
    add(backButton,gbc);
  }
   /*
   * actionPerformed
   * This is the method that checks for button clicks and then responds to the click according to the if-statements
   * @author: Aziz, James, Jerry
   * @param: ActionEvent e, the actual button click
   */ 
  public void actionPerformed(ActionEvent e){
    
    //back button goes back to beginning panel
    if(e.getSource().equals(backButton)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new EnterPanel());
      
      //customer menu button
    }else if(e.getSource().equals(userButton)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new CustomerMenu());
      
      //employee sign in button
    }else if(e.getSource().equals(employeeButton)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new EmployeeSignIn());
    }
  }
}

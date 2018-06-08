import jdk.internal.util.xml.impl.Input;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmployeeSignIn extends JPanel implements ActionListener {
  
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton next = new JButton("NEXT");
  JButton quit = new JButton("QUIT");
  JLabel employeeNameLabel = new JLabel("EMPLOYEE NAME:");
  JLabel employeeNumberLabel = new JLabel("EMPLOYEE NUMBER:");
  JLabel passwordLabel = new JLabel("PASSWORD:");
  JTextField employeeNameField = new JTextField(20);
  JTextField employeeNumberField = new JTextField(20);
  JTextField passwordField = new JTextField(20);
  
  public EmployeeSignIn() {
    
    setLayout(new GridBagLayout());
    
    next.addActionListener(this);
    quit.addActionListener(this);
    employeeNameField.addActionListener(this);
    employeeNumberField.addActionListener(this);
    passwordField.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    
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
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(employeeNameField,gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(employeeNumberField,gbc);
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(passwordField,gbc);
    gbc.gridx = 2;
    gbc.gridy = 3;
    add(next, gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    add(quit, gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    String name = employeeNameField.getText();
    String password = passwordField.getText();
    String number = employeeNumberField.getText();
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());    
      if(buttonPressed.equals(next)){
        for(int i=0; i< SuitUpCanada.employeeList.size(); i++){
          if(SuitUpCanada.employeeList.get(i).getName().equalsIgnoreCase(name) && SuitUpCanada.employeeList.get(i).getPassword().equals(password) && SuitUpCanada.employeeList.get(i).getNumber().equalsIgnoreCase(number)){
            System.out.println("match");
            this.setVisible(false);
            SuitUpCanada.mainGame.add(new EmployeeMenu());
          }
        }
      }
      else if(buttonPressed.equals(quit)){
        System.exit(0);
      }
    }
  }
}

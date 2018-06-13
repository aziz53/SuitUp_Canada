import jdk.internal.util.xml.impl.Input;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmployeeMenu extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JLabel employeeMenu = new JLabel("Employee Menu");
  JButton hrButton = new JButton("HUMAN RESOURCES");
  JButton accountingButton = new JButton("ACCOUNTING");
  JButton bookAppointment = new JButton("BOOK APPOINTMENT");
  JButton quit = new JButton("QUIT");
  
  public EmployeeMenu(){
      this.setVisible(true);
    setLayout(new GridBagLayout());
    
    hrButton.addActionListener(this);
    accountingButton.addActionListener(this);
    quit.addActionListener(this);
    bookAppointment.addActionListener(this);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;

    gbc.gridx = 3;
    gbc.gridy = 1;
    add(hrButton,gbc);
    gbc.gridx = 3;
    gbc.gridy = 2;
    add(accountingButton,gbc);
    gbc.gridx = 3;
    gbc.gridy = 0;
    employeeMenu.setFont(new Font("Serif", Font.BOLD, 20));
    add(employeeMenu, gbc);
    gbc.gridx = 3;
    gbc.gridy=3;
    add(bookAppointment,gbc);
    gbc.gridx = 3;
    gbc.gridy = 5;
    add(quit, gbc);
  }
  public void actionPerformed(ActionEvent event) {
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      
      if(buttonPressed.equals(accountingButton)){
        this.setVisible(false);
        this.add(new AccountingPanel());
        SuitUpCanada.mainGame.add(new AccountingPanel());
      }
      else if(buttonPressed.equals(hrButton)) {
        this.setVisible(false);
        this.add(new HumanResources());
        SuitUpCanada.mainGame.add(new HumanResources());
      }
       else if(buttonPressed.equals(bookAppointment)) {
        this.setVisible(false);
        this.add(new BookAppointment());
        SuitUpCanada.mainGame.add(new BookAppointment());
      }
      else if(buttonPressed.equals(quit)){
        System.exit(0);
      }
    }
  }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserSignIn extends JPanel implements ActionListener {
  
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton next = new JButton("NEXT");
  JButton quit = new JButton("QUIT");
  JLabel userNameLabel = new JLabel("USERNAME:");
  JLabel passwordLabel = new JLabel("PASSWORD:");
  JTextField userNameField = new JTextField();
  JTextField passwordField = new JTextField();
  
  public UserSignIn() {
    
    setLayout(new GridBagLayout());
    
    next.addActionListener(this);
    quit.addActionListener(this);
    userNameField.addActionListener(this);
    passwordField.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,50,20);
    
    gbc.weightx=1;
    gbc.weighty=1;
    gbc.ipady=0;
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(userNameLabel,gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(passwordLabel,gbc);
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(userNameField,gbc);
    gbc.gridx=2;
    gbc.gridy=9;
    add(passwordField,gbc);
    gbc.gridx = 3;
    gbc.gridy = 2;
    add(next, gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    add(quit, gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      if(buttonPressed.equals(next)){
        System.exit(0);
      }
      else if(buttonPressed.equals(quit)){
        System.exit(0);
      }
    }
  }
}

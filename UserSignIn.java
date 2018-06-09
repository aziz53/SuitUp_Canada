import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserSignIn extends JPanel implements ActionListener {
  
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton next = new JButton("NEXT");
  JButton quit = new JButton("QUIT");
  JLabel userNameLabel = new JLabel("USERNAME:");
  JLabel passwordLabel = new JLabel("PASSWORD:");
  JTextField userNameField = new JTextField(20);
  JTextField passwordField = new JTextField(20);
  
  public UserSignIn() {
    
    setLayout(new GridBagLayout());
    
    next.addActionListener(this);
    quit.addActionListener(this);
    userNameField.addActionListener(this);
    passwordField.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    
    gbc.gridx = 1;
    gbc.gridy = 0;
    userNameLabel.setFont(new Font("Serif", Font.BOLD, 18));
    add(userNameLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    passwordLabel.setFont(new Font("Serif", Font.BOLD, 18));
    add(passwordLabel,gbc);
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(userNameField,gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(passwordField,gbc);
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(next, gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    add(quit, gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    System.out.println(userNameField.getText());
    System.out.println(passwordField.getText());
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
    if(event.getSource().equals(next)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new CustomerMenu());
    }else if(buttonPressed.equals(quit)){
        System.exit(0);
      }
    }
  }
}

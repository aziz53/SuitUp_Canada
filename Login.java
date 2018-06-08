import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Login extends JPanel implements ActionListener{
  JButton userButton;
  JButton employeeButton;
  JLabel login;
  JButton backButton;
  Login(){
    this.setVisible(true);
    this.setSize(1920,1080);
    login = new JLabel("Login Page", SwingConstants.CENTER);
    login.setFont(new Font("Serif",Font.BOLD,50));
    userButton = new JButton("USER SIGN IN");
    employeeButton = new JButton("EMPLOYEE SIGN IN");
    backButton = new JButton("BACK");
    userButton.addActionListener(this);
    employeeButton.addActionListener(this);
    backButton.addActionListener(this);
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(50,100,50,100);
    gbc.gridx = 0;
    gbc.gridy = 0;
    add(login,gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(employeeButton,gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(userButton,gbc);
    gbc.gridx = 1;
    gbc.gridy = 0;
    add(backButton,gbc);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(backButton)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new EnterPanel());
    }else if(e.getSource().equals(userButton)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new UserSignIn());
    }else if(e.getSource().equals(employeeButton)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new EmployeeSignIn());
    }
  }
}
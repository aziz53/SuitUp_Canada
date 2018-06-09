import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Purchase extends JPanel implements ActionListener {
  
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton confirm = new JButton("CONFIRM");
  JButton quit = new JButton("QUIT");
  JLabel nameLabel = new JLabel("NAME:");
  JLabel creditCardLabel = new JLabel("CREDIT CARD NUMBER:");
  JLabel addressLabel = new JLabel ("ADDRESS:");
  JTextField nameField = new JTextField(20);
  JTextField creditCardField = new JTextField(20);
  JTextField addressField = new JTextField(20);
  
  public Purchase() {
    
    setLayout(new GridBagLayout());
    
    previous.addActionListener(this);
    confirm.addActionListener(this);
    quit.addActionListener(this);
    nameField.addActionListener(this);
    addressField.addActionListener(this);
    creditCardField.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    
    gbc.gridx = 0;
    gbc.gridy = 0;
    nameLabel.setFont(new Font("Serif", Font.BOLD, 18));
    add(nameLabel,gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    creditCardLabel.setFont(new Font("Serif", Font.BOLD, 18));
    add(creditCardLabel,gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    addressLabel.setFont(new Font("Serif", Font.BOLD, 18));
    add(addressLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 0;
    add(nameField,gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    add(creditCardField,gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    add(addressField,gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;
    add(confirm, gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    add(previous, gbc);
    gbc.gridx = 2;
    gbc.gridy = 3;
    add(quit, gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    System.out.println(nameField.getText());
    System.out.println(creditCardField.getText());
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      if(event.getSource().equals(confirm)){
        this.setVisible(false);
        SuitUpCanada.mainGame.add(new CustomerMenu());
      }
      else if(event.getSource().equals(previous)){
        this.setVisible(false);
        SuitUpCanada.mainGame.add(new CustomerMenu());
      }
      else if(buttonPressed.equals(quit)){
        System.exit(0);
      }
    }
  }
}

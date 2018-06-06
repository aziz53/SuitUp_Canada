import jdk.internal.util.xml.impl.Input;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CustomerMenu extends JPanel implements ActionListener {
  
  GridBagConstraints gbc = new GridBagConstraints();
  
  JLabel customerMenu = new JLabel("Customer Menu");
  JButton suits = new JButton("SUITS");
  JButton shoes = new JButton("SHOES");
  JButton dresses = new JButton("DRESSES");
  JButton accesories = new JButton("ACCESORIES");
  JButton quit = new JButton("QUIT");
  
  public CustomerMenu(){
    setLayout(new GridBagLayout());
    
    suits.addActionListener(this);
    shoes.addActionListener(this);
    dresses.addActionListener(this);
    accesories.addActionListener(this);
    quit.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    
    gbc.gridx = 3;
    gbc.gridy = 1;
    add(suits,gbc);
    gbc.gridx = 3;
    gbc.gridy = 2;
    add(shoes,gbc);
    gbc.gridx = 3;
    gbc.gridy = 3;
    add(dresses,gbc);
    gbc.gridx=3;
    gbc.gridy=4;
    add(accesories,gbc);
    gbc.gridx = 3;
    gbc.gridy = 0;
    customerMenu.setFont(new Font("Serif", Font.BOLD, 20));
    add(customerMenu, gbc);
    gbc.gridx = 3;
    gbc.gridy = 5;
    add(quit, gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      if(buttonPressed.equals(suits)){
        SuitUpCanada.setContent(new Suits());
      }
      else if(buttonPressed.equals(shoes)){
        SuitUpCanada.setContent(new Shoes());
      }
      if(buttonPressed.equals(dresses)){
        SuitUpCanada.setContent(new Dresses());
      }
      else if(buttonPressed.equals(accesories)){
        SuitUpCanada.setContent(new Accesories());
      }
      else if(buttonPressed.equals(quit)){
        System.exit(0);
      }
    }
  }
}

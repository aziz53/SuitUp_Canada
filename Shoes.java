import jdk.internal.util.xml.impl.Input;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Shoes extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
    JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  
  public Shoes(){
    setLayout(new GridBagLayout());
    
        purchase.addActionListener(this);
    quit.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;

    gbc.gridx = 2;
    gbc.gridy = 0;
    add(purchase,gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(quit,gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      if(buttonPressed.equals(purchase)){
        System.exit(0);
      }
      
      else if(buttonPressed.equals(quit)){
        System.exit(0);
      }
    }
  }
}

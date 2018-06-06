import jdk.internal.util.xml.impl.Input;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dresses extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton quit = new JButton("QUIT");
  
  public Dresses(){
    setLayout(new GridBagLayout());
    
    previous.addActionListener(this);
    quit.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(previous, gbc);
    gbc.gridx = 2;
    gbc.gridy = 3;
    add(quit,gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      if(buttonPressed.equals(quit)){
        System.exit(0);
      }
      else if(buttonPressed.equals(previous)){
        SuitUpCanada.setContent(new CustomerMenu());
      }
    }
  }
}

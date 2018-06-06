import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Suit4 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  ImageIcon suit4Pic = new ImageIcon(new ImageIcon("Suit4.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JLabel suit4 = new JLabel(suit4Pic);
  
  public Suit4(){
    setLayout(new GridBagLayout());
    
    previous.addActionListener(this);
    quit.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(suit4, gbc);
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(purchase, gbc);
    gbc.gridx = 2;
    gbc.gridy = 4;
    add(quit,gbc);
    gbc.gridx = 2;
    gbc.gridy = 3;
    add(previous, gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      if(buttonPressed.equals(quit)){
        System.exit(0);
      }
      else if(buttonPressed.equals(previous)){
        SuitUpCanada.setContent(new Suits());
      }
    }
  }
}
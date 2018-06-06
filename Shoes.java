import jdk.internal.util.xml.impl.Input;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Shoes extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton quit = new JButton("QUIT");
  ImageIcon shoes1Pic = new ImageIcon(new ImageIcon("shoes1.jpg").getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT));
  JButton shoes1 = new JButton(shoes1Pic);
  ImageIcon shoes2Pic = new ImageIcon(new ImageIcon("shoes2.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JButton shoes2 = new JButton(shoes2Pic);
  ImageIcon shoes3Pic = new ImageIcon(new ImageIcon("shoes3.jpg").getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT));
  JButton shoes3 = new JButton(shoes3Pic);
  ImageIcon shoes4Pic = new ImageIcon(new ImageIcon("shoes4.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JButton shoes4 = new JButton(shoes4Pic);
  
  public Shoes(){
    setLayout(new GridBagLayout());
    
    previous.addActionListener(this);
    quit.addActionListener(this);
    shoes1.addActionListener(this);
    shoes2.addActionListener(this);
    shoes3.addActionListener(this);
    shoes4.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(shoes1, gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    add(shoes2, gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(shoes3, gbc);
    gbc.gridx = 3;
    gbc.gridy = 1;
    add(shoes4, gbc);
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
      else if (buttonPressed.equals(shoes1)){
        SuitUpCanada.setContent(new Shoes1());
      }
      else if (buttonPressed.equals(shoes2)){
        SuitUpCanada.setContent(new Shoes2());
      }
      else if (buttonPressed.equals(shoes3)){
        SuitUpCanada.setContent(new Shoes3());
      }
      else if (buttonPressed.equals(shoes4)){
        SuitUpCanada.setContent(new Shoes4());
      }
      else if(buttonPressed.equals(previous)){
        SuitUpCanada.setContent(new CustomerMenu());
      }
    }
  }
}

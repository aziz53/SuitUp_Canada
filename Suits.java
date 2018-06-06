import jdk.internal.util.xml.impl.Input;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Suits extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton quit = new JButton("QUIT");
  ImageIcon suit1Pic = new ImageIcon(new ImageIcon("Suit1.jpg").getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT));
  JButton suit1 = new JButton(suit1Pic);
  ImageIcon suit2Pic = new ImageIcon(new ImageIcon("Suit2.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JButton suit2 = new JButton(suit2Pic);
  ImageIcon suit3Pic = new ImageIcon(new ImageIcon("Suit3.jpg").getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT));
  JButton suit3 = new JButton(suit3Pic);
  ImageIcon suit4Pic = new ImageIcon(new ImageIcon("Suit4.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JButton suit4 = new JButton(suit4Pic);
  ImageIcon suit5Pic = new ImageIcon(new ImageIcon("Suit5.jpg").getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT));
  JButton suit5 = new JButton(suit5Pic);
  
  public Suits(){
    setLayout(new GridBagLayout());
    
    previous.addActionListener(this);
    quit.addActionListener(this);
    suit1.addActionListener(this);
    suit2.addActionListener(this);
    suit3.addActionListener(this);
    suit4.addActionListener(this);
    suit5.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(suit1, gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    add(suit2, gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(suit3, gbc);
    gbc.gridx = 3;
    gbc.gridy = 1;
    add(suit4, gbc);
    gbc.gridx = 4;
    gbc.gridy = 1;
    add(suit5, gbc);
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
      else if (buttonPressed.equals(suit1)){
        SuitUpCanada.setContent(new Suit1());
      }
      else if (buttonPressed.equals(suit2)){
        SuitUpCanada.setContent(new Suit2());
      }
      else if (buttonPressed.equals(suit3)){
        SuitUpCanada.setContent(new Suit3());
      }
      else if (buttonPressed.equals(suit4)){
        SuitUpCanada.setContent(new Suit4());
      }
      else if (buttonPressed.equals(suit5)){
        SuitUpCanada.setContent(new Suit5());
      }
      else if(buttonPressed.equals(previous)){
        SuitUpCanada.setContent(new CustomerMenu());
      }
    }
  }
}

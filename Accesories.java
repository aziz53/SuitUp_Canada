import jdk.internal.util.xml.impl.Input;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Accesories extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton quit = new JButton("QUIT");
  ImageIcon watches1Pic = new ImageIcon(new ImageIcon("watches1.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JButton watches1 = new JButton(watches1Pic);
  ImageIcon watches2Pic = new ImageIcon(new ImageIcon("watches2.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JButton watches2 = new JButton(watches2Pic);
  ImageIcon watches3Pic = new ImageIcon(new ImageIcon("watches3.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JButton watches3 = new JButton(watches3Pic);
  ImageIcon belts1Pic = new ImageIcon(new ImageIcon("belts1.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JButton belts1 = new JButton(belts1Pic);
  ImageIcon belts2Pic = new ImageIcon(new ImageIcon("belts2.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JButton belts2 = new JButton(belts2Pic);
  
  public Accesories(){
    setLayout(new GridBagLayout());
    
    previous.addActionListener(this);
    quit.addActionListener(this);
    watches1.addActionListener(this);
    watches2.addActionListener(this);
    watches3.addActionListener(this);
    belts1.addActionListener(this);
    belts2.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(watches1, gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    add(watches2, gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(watches3, gbc);
    gbc.gridx = 3;
    gbc.gridy = 1;
    add(belts1, gbc);
    gbc.gridx = 4;
    gbc.gridy = 1;
    add(belts2, gbc);
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
      else if (buttonPressed.equals(watches1)){
        SuitUpCanada.setContent(new Accesories1());
      }
      else if (buttonPressed.equals(watches2)){
        SuitUpCanada.setContent(new Accesories2());
      }
      else if (buttonPressed.equals(watches3)){
        SuitUpCanada.setContent(new Accesories3());
      }
      else if (buttonPressed.equals(belts1)){
        SuitUpCanada.setContent(new Accesories4());
      }
      else if (buttonPressed.equals(belts2)){
        SuitUpCanada.setContent(new Accesories5());
      }
      else if(buttonPressed.equals(previous)){
        SuitUpCanada.setContent(new CustomerMenu());
      }
    }
  }
}

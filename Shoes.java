import jdk.internal.util.xml.impl.Input;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Shoes extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton quit = new JButton("QUIT");
  ImageIcon shoes1Pic = new ImageIcon(new ImageIcon("shoes1.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  JButton shoes1 = new JButton(shoes1Pic);
  ImageIcon shoes2Pic = new ImageIcon(new ImageIcon("shoes2.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  JButton shoes2 = new JButton(shoes2Pic);
  ImageIcon shoes3Pic = new ImageIcon(new ImageIcon("shoesPic3.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  JButton shoes3 = new JButton(shoes3Pic);
  ImageIcon shoes4Pic = new ImageIcon(new ImageIcon("shoes4.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
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
    gbc.gridy = 0;
    add(shoes1, gbc);
    gbc.gridx = 1;
    gbc.gridy = 0;
    add(shoes2, gbc);
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(shoes3, gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    add(shoes4, gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(previous, gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
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

class Shoes1 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  ImageIcon shoes1Pic = new ImageIcon(new ImageIcon("shoes1.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  JLabel shoes1 = new JLabel(shoes1Pic);
  JLabel title = new JLabel("Men's Cairo Dress Shoes");
  JLabel description = new JLabel("From ECCO, the Men's Cairo Apron Toe Oxfords feature Full-grain leather upper,"); 
  JLabel description2 = new JLabel("Leather lining, Rubber outsole."); 
  JLabel cost = new JLabel("$272.30");
  
  public Shoes1(){
    setLayout(new GridBagLayout());
    
    title.setFont(new Font("Helvetica",Font.BOLD,15));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,15));
    
    purchase.addActionListener(this);
    previous.addActionListener(this);
    quit.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(shoes1, gbc);
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(title, gbc);
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(description, gbc);
    gbc.gridx = 2;
    gbc.gridy = 3;
    add(description2, gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(cost, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(purchase, gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    add(quit,gbc);
    gbc.gridx = 0;
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
        SuitUpCanada.setContent(new Shoes());
      }
      else if(buttonPressed.equals(purchase)){
        SuitUpCanada.setContent(new Purchase());
      }
    }
  }
}

class Shoes2 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  ImageIcon shoes2Pic = new ImageIcon(new ImageIcon("shoes2.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  JLabel shoes2 = new JLabel(shoes2Pic);
  JLabel title = new JLabel("Men's Garrison Wing-Tip Oxford");
  JLabel description = new JLabel("Sophisticated style demands a pair of sleek wing-tip oxfords from Stacy Adams."); 
  JLabel cost = new JLabel("$116.42");
  
  public Shoes2(){
    setLayout(new GridBagLayout());
    
    title.setFont(new Font("Helvetica",Font.BOLD,15));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,15));
    
    purchase.addActionListener(this);
    previous.addActionListener(this);
    quit.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(shoes2, gbc);
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(title, gbc);
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(description, gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(cost, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(purchase, gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    add(quit,gbc);
    gbc.gridx = 0;
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
        SuitUpCanada.setContent(new Shoes());
      }
      else if(buttonPressed.equals(purchase)){
        SuitUpCanada.setContent(new Purchase());
      }
    }
  }
}

class Shoes3 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  ImageIcon shoes3Pic = new ImageIcon(new ImageIcon("shoesPic3.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  JLabel shoes3 = new JLabel(shoes3Pic);
  JLabel title = new JLabel("Alpine Swiss Zurich Mens Dress Shoes Lace Up Brogue Medallion Wing Tip Oxfords");
  JLabel description = new JLabel("Brogue style classic oxfords with a modern look. Must have item of the year."); 
  JLabel cost = new JLabel("$87.50");
  
  public Shoes3(){
    setLayout(new GridBagLayout());
    
    title.setFont(new Font("Helvetica",Font.BOLD,15));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,15));
    
    purchase.addActionListener(this);
    previous.addActionListener(this);
    quit.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(shoes3, gbc);
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(title, gbc);
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(description, gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(cost, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(purchase, gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    add(quit,gbc);
    gbc.gridx = 0;
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
        SuitUpCanada.setContent(new Shoes());
      }
      else if(buttonPressed.equals(purchase)){
        SuitUpCanada.setContent(new Purchase());
      }
    }
  }
}

class Shoes4 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  ImageIcon shoes4Pic = new ImageIcon(new ImageIcon("shoes4.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  JLabel shoes4 = new JLabel(shoes4Pic);
  JLabel title = new JLabel("JEAN YVES");
  JLabel description = new JLabel("JEAN YVES MEN DRESS SHOE JY03 OXFORD FORMAL TUXEDO FOR PROM & WEDDING SHOE"); 
  JLabel description2 = new JLabel("BLACK/WHITE PATENT TWO TONE - WIDE WIDTH AVAILABLE"); 
  JLabel cost = new JLabel("$90.53");
  
  public Shoes4(){
    setLayout(new GridBagLayout());
    
    title.setFont(new Font("Helvetica",Font.BOLD,15));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,15));
    
    purchase.addActionListener(this);
    previous.addActionListener(this);
    quit.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(shoes4, gbc);
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(title, gbc);
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(description, gbc);
    gbc.gridx = 2;
    gbc.gridy = 3;
    add(description2, gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(cost, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(purchase, gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    add(quit,gbc);
    gbc.gridx = 0;
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
        SuitUpCanada.setContent(new Shoes());
      }
      else if(buttonPressed.equals(purchase)){
        SuitUpCanada.setContent(new Purchase());
      }
    }
  }
}

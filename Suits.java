import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Suits extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton quit = new JButton("QUIT");
  ImageIcon suit1Pic = new ImageIcon(new ImageIcon("Suit1.jpg").getImage().getScaledInstance(250,400,Image.SCALE_DEFAULT));
  JButton suit1 = new JButton(suit1Pic);
  ImageIcon suit2Pic = new ImageIcon(new ImageIcon("Suit2.jpg").getImage().getScaledInstance(250,400,Image.SCALE_DEFAULT));
  JButton suit2 = new JButton(suit2Pic);
  ImageIcon suit3Pic = new ImageIcon(new ImageIcon("SuitPic3.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JButton suit3 = new JButton(suit3Pic);
  ImageIcon suit4Pic = new ImageIcon(new ImageIcon("Suit4.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JButton suit4 = new JButton(suit4Pic);
  ImageIcon suit5Pic = new ImageIcon(new ImageIcon("Suit5.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
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
  public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(previous)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new CustomerMenu());
    }else if(e.getSource().equals(quit)){
      System.exit(0);
    }else if(e.getSource().equals(suit1)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suit1());
    }else if(e.getSource().equals(suit2)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suit2());
    }else if(e.getSource().equals(suit3)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suit3());
    }else if(e.getSource().equals(suit4)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suit4());
    }else if(e.getSource().equals(suit5)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suit5());
    }
  }
}

class Suit1 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  ImageIcon suit1Pic = new ImageIcon(new ImageIcon("Suit1.jpg").getImage().getScaledInstance(250,400,Image.SCALE_DEFAULT));
  JLabel suit1 = new JLabel(suit1Pic);
  JLabel title = new JLabel("Bay Grey Prince of Wales Check 1-Button Skinny Fit Suit");
  JLabel description = new JLabel("The Bay Grey Prince of Wales suit is a contemporary take on a classic check."); 
  JLabel description2 = new JLabel("Woven from charcoal and black yarn, the check has an understated character from"); 
  JLabel description3 = new JLabel("afar that becomes more distinctive when viewed closer. The monochrome styling"); 
  JLabel description4 = new JLabel("carries through to the lining, which features a black and white spotted pattern."); 
  JLabel description5 = new JLabel("A sharp, skinny cut and one-button jacket give this business suit a decidedly modern slant.");
  JLabel cost = new JLabel("$275.95");
  
  public Suit1(){
    setLayout(new GridBagLayout());
    
    title.setFont(new Font("Helvetica",Font.BOLD,15));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    description3.setFont(new Font("Helvetica",Font.BOLD,15));
    description4.setFont(new Font("Helvetica",Font.BOLD,15));
    description5.setFont(new Font("Helvetica",Font.BOLD,15));
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
    add(suit1, gbc);
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
    gbc.gridy = 4;
    add(description3, gbc);
    gbc.gridx = 2;
    gbc.gridy = 5;
    add(description4, gbc);
    gbc.gridx = 2;
    gbc.gridy = 6;
    add(description5, gbc);
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
  public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(previous)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suits());
    }else if(e.getSource().equals(quit)){
      System.exit(0);
    }else if(e.getSource().equals(purchase)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Purchase());
    }
  }
}

class Suit2 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  ImageIcon suit2Pic = new ImageIcon(new ImageIcon("Suit2.jpg").getImage().getScaledInstance(250,400,Image.SCALE_DEFAULT));
  JLabel suit2 = new JLabel(suit2Pic);
  JLabel title = new JLabel("Woolwich Charcoal Slim Fit Infinity Suit");
  JLabel description = new JLabel("Combining the benefits of top quality fabric, durability and great fit, the"); 
  JLabel description2 = new JLabel("Woolwich Charcoal Slim Fit Infinity Suit is ideal for keeping up with the demands"); 
  JLabel description3 = new JLabel("of modern working life. Crafted from Super 120's Merino wool, the secret is the"); 
  JLabel description4 = new JLabel("innovative open weave cloth made from 4 yarns twisted together, this means not"); 
  JLabel description5 = new JLabel("only is it naturally anti-crease but moisture wicking so you'll stay cool,"); 
  JLabel description6 = new JLabel("comfortable and sharp all day long. Whether you're packing it for a business trip"); 
  JLabel description7 = new JLabel("or wearing it on a long journey, the high recovery rate and natural elasticity of"); 
  JLabel description8 = new JLabel("the merino wool ensures your suit will look as sharp as when you first put it on."); 
  JLabel description9 = new JLabel("Cut in our best selling slim fit, this suit is sure to become your new everyday option.");
  JLabel cost = new JLabel("$432.14");
  
  public Suit2(){
    setLayout(new GridBagLayout());
    
    title.setFont(new Font("Helvetica",Font.BOLD,15));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    description3.setFont(new Font("Helvetica",Font.BOLD,15));
    description4.setFont(new Font("Helvetica",Font.BOLD,15));
    description5.setFont(new Font("Helvetica",Font.BOLD,15));
    description6.setFont(new Font("Helvetica",Font.BOLD,15));
    description7.setFont(new Font("Helvetica",Font.BOLD,15));
    description8.setFont(new Font("Helvetica",Font.BOLD,15));
    description9.setFont(new Font("Helvetica",Font.BOLD,15));
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
    add(suit2, gbc);
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
    gbc.gridy = 4;
    add(description3, gbc);
    gbc.gridx = 2;
    gbc.gridy = 5;
    add(description4, gbc);
    gbc.gridx = 2;
    gbc.gridy = 6;
    add(description5, gbc);
    gbc.gridx = 2;
    gbc.gridy = 7;
    add(description6, gbc);
    gbc.gridx = 2;
    gbc.gridy = 8;
    add(description7, gbc);
    gbc.gridx = 2;
    gbc.gridy = 9;
    add(description8, gbc);
    gbc.gridx = 2;
    gbc.gridy = 10;
    add(description9, gbc);
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
  public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(previous)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suits());
    }else if(e.getSource().equals(quit)){
      System.exit(0);
    }else if(e.getSource().equals(purchase)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Purchase());
    }
  }
}

class Suit3 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  ImageIcon suit3Pic = new ImageIcon(new ImageIcon("SuitPic3.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JLabel suit3 = new JLabel(suit3Pic);
  JLabel title = new JLabel("HEMSWORTH MIDNIGHT SUIT");
  JLabel description = new JLabel("Classic, versatile and reliable—the Hemsworth is your tried-and-true"); 
  JLabel description2 = new JLabel("midnight blue suit. This solid-colored number in pure premium wool stands"); 
  JLabel description3 = new JLabel("up to whatever the daily hustle throws at you."); 
  JLabel cost = new JLabel("$999.99");
  
  public Suit3(){
    setLayout(new GridBagLayout());
    
    title.setFont(new Font("Helvetica",Font.BOLD,15));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    description3.setFont(new Font("Helvetica",Font.BOLD,15));
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
    add(suit3, gbc);
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
    gbc.gridy = 4;
    add(description3, gbc);
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
  public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(previous)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suits());
    }else if(e.getSource().equals(quit)){
      System.exit(0);
    }else if(e.getSource().equals(purchase)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Purchase());
    }
  }
}

class Suit4 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  ImageIcon suit4Pic = new ImageIcon(new ImageIcon("Suit4.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JLabel suit4 = new JLabel(suit4Pic);
  JLabel title = new JLabel("Black Custom Suit");
  JLabel description = new JLabel("The old adage holds true: black is beautiful. The ideal option for formal and"); 
  JLabel description2 = new JLabel("social occasions, the Solid Black Suit is the definition of sleek."); 
  JLabel description3 = new JLabel("Go traditional or go new age rock star...this suit is a simple must have for every man."); 
  JLabel cost = new JLabel("$499.99");
  
  public Suit4(){
    setLayout(new GridBagLayout());
    
    title.setFont(new Font("Helvetica",Font.BOLD,15));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    description3.setFont(new Font("Helvetica",Font.BOLD,15));
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
    add(suit4, gbc);
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
    gbc.gridy = 4;
    add(description3, gbc);
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
  public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(previous)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suits());
    }else if(e.getSource().equals(quit)){
      System.exit(0);
    }else if(e.getSource().equals(purchase)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Purchase());
    }
  }
}

class Suit5 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  JButton previous = new JButton("PREVIOUS");
  ImageIcon suit5Pic = new ImageIcon(new ImageIcon("Suit5.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  JLabel suit5 = new JLabel(suit5Pic);
  JLabel title = new JLabel("ALTON GRAY SUIT");
  JLabel description = new JLabel("The Alton's visible basketweave elevates your everyday gray suit with its"); 
  JLabel description2 = new JLabel("depth and rich texture. Time to step up, and step into the Alton."); 
  JLabel cost = new JLabel("$999.99");
  
  public Suit5(){
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
    add(suit5, gbc);
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
  public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(previous)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suits());
    }else if(e.getSource().equals(quit)){
      System.exit(0);
    }else if(e.getSource().equals(purchase)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Purchase());
    }
  }
}

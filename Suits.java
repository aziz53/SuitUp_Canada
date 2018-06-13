/**
 * Suits.java
 * By Aziz, James, Jerry
 * Suits class which contains the menu for selecting which suit they want to view.
 * Also contains the classes for each suit the user can view.
 * June 14, 2018
 */

//Import statement
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import jdk.internal.util.xml.impl.Input;

public class Suits extends JPanel implements ActionListener {
  //Declare grid bag layout
  GridBagConstraints gbc = new GridBagConstraints();
  
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton quit = new JButton("QUIT");
  //Declare images to place onto buttons for the shoes menu
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
  //Suits constructor
  public Suits(){
    //set the layout
    setLayout(new GridBagLayout());
    //Add action listener
    previous.addActionListener(this);
    quit.addActionListener(this);
    suit1.addActionListener(this);
    suit2.addActionListener(this);
    suit3.addActionListener(this);
    suit4.addActionListener(this);
    suit5.addActionListener(this);
    //Set the gbc insets and x, y weights
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //set the placement of suit1
    gbc.gridx = 0;
    gbc.gridy = 1;
    //add suit1
    add(suit1, gbc);
    //set placement of suit2
    gbc.gridx = 1;
    gbc.gridy = 1;
    //add suit2
    add(suit2, gbc);
    //set placement of suit3
    gbc.gridx = 2;
    gbc.gridy = 1;
    //add suit3
    add(suit3, gbc);
    //set placement of suit4
    gbc.gridx = 3;
    gbc.gridy = 1;
    //add suit4
    add(suit4, gbc);
    //set placement of suit5
    gbc.gridx = 4;
    gbc.gridy = 1;
    //add suit5
    add(suit5, gbc);
    //set placement of previous
    gbc.gridx = 2;
    gbc.gridy = 2;
    //add previous
    add(previous, gbc);
    //set placement of quit
    gbc.gridx = 2;
    gbc.gridy = 3;
    //add quit
    add(quit,gbc);
  }//end constructor
  
  /**
   * actionPerformed 
   * Checks if the user has performed an action
   * @author Aziz, James, Jerry
   * @param ActionEvent event, the action performed by the user
   */
  public void actionPerformed(ActionEvent e){
    //if previous is pressed
    if(e.getSource().equals(previous)){
      //set panel to customer menu
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new CustomerMenu());
    }//end if
    //else if quit is pressed
    else if(e.getSource().equals(quit)){
      //close the program
      System.exit(0);
    }//end else if
    //else if suit1 is pressed
    else if(e.getSource().equals(suit1)){
      //change panel to Suit1
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suit1());
    }//end else if
    //else if suit2 is pressed
    else if(e.getSource().equals(suit2)){
      //change to suit 2
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suit2());
    }//end else if
    //else if suit3 is pressed
    else if(e.getSource().equals(suit3)){
      //change to suit 3
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suit3());
    }//end else if
    //else if suit4 is pressed
    else if(e.getSource().equals(suit4)){
      //change panel to suit 4
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suit4());
    }//end else if
    //else if suit5 is pressed
    else if(e.getSource().equals(suit5)){
      //change the panel to suit 5
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suit5());
    }//end else if
  }//end actionPerformed
}//end suits

/**
 * Suit1
 * By Aziz, James, Jerry
 * Contains the image, title, cost, and description of the product and
 * gives the user the option to purchase the product if they choose
 * June 14, 2018
 */
class Suit1 extends JPanel implements ActionListener {
  //Declare grid bag layout
  GridBagConstraints gbc = new GridBagConstraints();
  
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  //Declare image icon
  ImageIcon suit1Pic = new ImageIcon(new ImageIcon("Suit1.jpg").getImage().getScaledInstance(250,400,Image.SCALE_DEFAULT));
  //Declare JLabel
  JLabel suit1 = new JLabel(suit1Pic);
  JLabel title = new JLabel("Bay Grey Prince of Wales Check 1-Button Skinny Fit Suit");
  JLabel description = new JLabel("The Bay Grey Prince of Wales suit is a contemporary take on a classic check."); 
  JLabel description2 = new JLabel("Woven from charcoal and black yarn, the check has an understated character from"); 
  JLabel description3 = new JLabel("afar that becomes more distinctive when viewed closer. The monochrome styling"); 
  JLabel description4 = new JLabel("carries through to the lining, which features a black and white spotted pattern."); 
  JLabel description5 = new JLabel("A sharp, skinny cut and one-button jacket give this business suit a decidedly modern slant.");
  JLabel cost = new JLabel("$275.95");
  
  //Suit1 constructor
  public Suit1(){
    //set the background to white
    this.setBackground(new Color(255,255,255));
    //set the layout
    setLayout(new GridBagLayout());
    //Set the font of the JLabels
    title.setFont(new Font("Helvetica",Font.BOLD,25));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    description3.setFont(new Font("Helvetica",Font.BOLD,15));
    description4.setFont(new Font("Helvetica",Font.BOLD,15));
    description5.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,25));
    //Add action listener
    purchase.addActionListener(this);
    previous.addActionListener(this);
    quit.addActionListener(this);
    //Set the gbc insets and x, y weights
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //set placement of suit1
    gbc.gridx = 0;
    gbc.gridy = 1;
    //add suit1
    add(suit1, gbc);
    //set placement of title
    gbc.gridx = 2;
    gbc.gridy = 0;
    //add title
    add(title, gbc);
    //set placement of descriptions and add descriptions
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
    //set placement of cost
    gbc.gridx = 2;
    gbc.gridy = 1;
    //add cost
    add(cost, gbc);
    //set placement of purchase
    gbc.gridx = 0;
    gbc.gridy = 2;
    //add purchase
    add(purchase, gbc);
    //set placement of quit
    gbc.gridx = 0;
    gbc.gridy = 4;
    //add quit
    add(quit,gbc);
    //set the placement of previous
    gbc.gridx = 0;
    gbc.gridy = 3;
    //add previous
    add(previous, gbc);
  }//end constructor
  
  /**
   * actionPerformed 
   * Checks if the user has performed an action
   * @author Aziz, James, Jerry
   * @param ActionEvent event, the action performed by the user
   */
  public void actionPerformed(ActionEvent e){
    //if previous is pressed
    if(e.getSource().equals(previous)){
      //change the panel to accesories
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Accesories());
    }//end if
    //else if quit is pressed
    else if(e.getSource().equals(quit)){
      //close the program
      System.exit(0);
    }//end else if
    //else if purchase is pressed
    else if(e.getSource().equals(purchase)){
      //change panel to purchase
      this.setVisible(false);
      try{
        SuitUpCanada.mainGame.add(new Purchase());
      }catch(Exception exception){};
    }//end else if
  }//end actionPerformed
}//end Suit1

/**
 * Suit2
 * By Aziz, James, Jerry
 * Contains the image, title, cost, and description of the product and
 * gives the user the option to purchase the product if they choose
 * June 14, 2018
 */
class Suit2 extends JPanel implements ActionListener {
  //Declare grid bag layout
  GridBagConstraints gbc = new GridBagConstraints();
  
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  //Declare image icon
  ImageIcon suit2Pic = new ImageIcon(new ImageIcon("Suit2.jpg").getImage().getScaledInstance(250,400,Image.SCALE_DEFAULT));
  //Declare JLabel
  JLabel suit2 = new JLabel(suit2Pic);
  JLabel title = new JLabel("Woolwich Charcoal Slim Fit Infinity Suit");
  JLabel description = new JLabel("Combining the benefits of top quality fabric, durability and great fit, the"); 
  JLabel description2 = new JLabel("Woolwich Charcoal Slim Fit Infinity Suit is ideal for keeping up with the demands"); 
  JLabel description3 = new JLabel("of modern working life. Whether you're packing it for a business trip"); 
  JLabel description4 = new JLabel("or wearing it on a long journey, the high recovery rate and natural elasticity of"); 
  JLabel description5 = new JLabel("the merino wool ensures your suit will look as sharp as when you first put it on."); 
  JLabel description6 = new JLabel("Cut in our best selling slim fit, this suit is sure to become your new everyday option.");
  JLabel cost = new JLabel("$432.14");
  
  //Suit2 constructor
  public Suit2(){
    //set the background to white
    this.setBackground(new Color(255,255,255));
    //set the layout
    setLayout(new GridBagLayout());
    //Set the font of the JLabels
    title.setFont(new Font("Helvetica",Font.BOLD,25));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    description3.setFont(new Font("Helvetica",Font.BOLD,15));
    description4.setFont(new Font("Helvetica",Font.BOLD,15));
    description5.setFont(new Font("Helvetica",Font.BOLD,15));
    description6.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,25));
    //Add action listener
    purchase.addActionListener(this);
    previous.addActionListener(this);
    quit.addActionListener(this);
    //Set the gbc insets and x, y weights
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //set placement of suit2
    gbc.gridx = 0;
    gbc.gridy = 1;
    //add suit2
    add(suit2, gbc);
    //set placement of title
    gbc.gridx = 2;
    gbc.gridy = 0;
    //add title
    add(title, gbc);
    //set placement and add descriptions
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
    //set placement of cost
    gbc.gridx = 2;
    gbc.gridy = 1;
    //add cost
    add(cost, gbc);
    //set placement of purchase
    gbc.gridx = 0;
    gbc.gridy = 2;
    //add purchase
    add(purchase, gbc);
    //set placement of quit
    gbc.gridx = 0;
    gbc.gridy = 4;
    //add quit
    add(quit,gbc);
    //set placement of previous
    gbc.gridx = 0;
    gbc.gridy = 3;
    //add previous
    add(previous, gbc);
  }//end constructor
  
  /**
   * actionPerformed 
   * Checks if the user has performed an action
   * @author Aziz, James, Jerry
   * @param ActionEvent event, the action performed by the user
   */
  public void actionPerformed(ActionEvent e){
    //if previous is pressed
    if(e.getSource().equals(previous)){
      //change the panel to accesories
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Accesories());
    }//end if
    //else if quit is pressed
    else if(e.getSource().equals(quit)){
      //close the program
      System.exit(0);
    }//end else if
    //else if purchase is pressed
    else if(e.getSource().equals(purchase)){
      //change panel to purchase
      this.setVisible(false);
      try{
        SuitUpCanada.mainGame.add(new Purchase());
      }catch(Exception exception){};
    }//end else if
  }//end actionPerformed
}//end Suit2

/**
 * Suit3
 * By Aziz, James, Jerry
 * Contains the image, title, cost, and description of the product and
 * gives the user the option to purchase the product if they choose
 * June 14, 2018
 */
class Suit3 extends JPanel implements ActionListener {
  //Declare grid bag layout
  GridBagConstraints gbc = new GridBagConstraints();
  
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  //Declare image icon
  ImageIcon suit3Pic = new ImageIcon(new ImageIcon("SuitPic3.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  //Declare JLabel
  JLabel suit3 = new JLabel(suit3Pic);
  JLabel title = new JLabel("HEMSWORTH MIDNIGHT SUIT");
  JLabel description = new JLabel("Classic, versatile and reliable—the Hemsworth is your tried-and-true"); 
  JLabel description2 = new JLabel("midnight blue suit. This solid-colored number in pure premium wool stands"); 
  JLabel description3 = new JLabel("up to whatever the daily hustle throws at you."); 
  JLabel cost = new JLabel("$999.99");
  
  //Suit3 constructor
  public Suit3(){
    //set the background to white
    this.setBackground(new Color(255,255,255));
    //set the layout
    setLayout(new GridBagLayout());
    //Set the font of the JLabels
    title.setFont(new Font("Helvetica",Font.BOLD,25));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    description3.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,25));
    //Add action listener
    purchase.addActionListener(this);
    previous.addActionListener(this);
    quit.addActionListener(this);
    //Set the gbc insets and x, y weights
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set the placement of suit3
    gbc.gridx = 0;
    gbc.gridy = 1;
    //add suit3
    add(suit3, gbc);
    //set placement of title
    gbc.gridx = 2;
    gbc.gridy = 0;
    //add title
    add(title, gbc);
    //set placement and add descriptions
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(description, gbc);
    gbc.gridx = 2;
    gbc.gridy = 3;
    add(description2, gbc);
    gbc.gridx = 2;
    gbc.gridy = 4;
    add(description3, gbc);
    //set the placement of cost
    gbc.gridx = 2;
    gbc.gridy = 1;
    //add cost
    add(cost, gbc);
    //set placement of purchase
    gbc.gridx = 0;
    gbc.gridy = 2;
    //add purchase
    add(purchase, gbc);
    //set placement of quit
    gbc.gridx = 0;
    gbc.gridy = 4;
    //add quit
    add(quit,gbc);
    //set placement of previous
    gbc.gridx = 0;
    gbc.gridy = 3;
    //add previous
    add(previous, gbc);
  }//end constructor
  
  /**
   * actionPerformed 
   * Checks if the user has performed an action
   * @author Aziz, James, Jerry
   * @param ActionEvent event, the action performed by the user
   */
  public void actionPerformed(ActionEvent e){
    //if previous is pressed
    if(e.getSource().equals(previous)){
      //change the panel to accesories
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Accesories());
    }//end if
    //else if quit is pressed
    else if(e.getSource().equals(quit)){
      //close the program
      System.exit(0);
    }//end else if
    //else if purchase is pressed
    else if(e.getSource().equals(purchase)){
      //change panel to purchase
      this.setVisible(false);
      try{
        SuitUpCanada.mainGame.add(new Purchase());
      }catch(Exception exception){};
    }//end else if
  }//end actionPerformed
}//end Suit3

/**
 * Suit4
 * By Aziz, James, Jerry
 * Contains the image, title, cost, and description of the product and
 * gives the user the option to purchase the product if they choose
 * June 14, 2018
 */
class Suit4 extends JPanel implements ActionListener {
  //Declare grid bag layout
  GridBagConstraints gbc = new GridBagConstraints();
  
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  //Declare image icon
  ImageIcon suit4Pic = new ImageIcon(new ImageIcon("Suit4.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  //Declare JLabel
  JLabel suit4 = new JLabel(suit4Pic);
  JLabel title = new JLabel("Black Custom Suit");
  JLabel description = new JLabel("The old adage holds true: black is beautiful. The ideal option for formal and"); 
  JLabel description2 = new JLabel("social occasions, the Solid Black Suit is the definition of sleek."); 
  JLabel description3 = new JLabel("Go traditional or go new age rock star...this suit is a simple must have for every man."); 
  JLabel cost = new JLabel("$499.99");
  
  //Suit4 constructor
  public Suit4(){
    //set the background to white
    this.setBackground(new Color(255,255,255));
    //set the layout
    setLayout(new GridBagLayout());
    //Set the font of the JLabels
    title.setFont(new Font("Helvetica",Font.BOLD,25));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    description3.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,25));
    //Add action listener
    purchase.addActionListener(this);
    previous.addActionListener(this);
    quit.addActionListener(this);
    //Set the gbc insets and x, y weights
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set the placement of suit4
    gbc.gridx = 0;
    gbc.gridy = 1;
    //add suit4
    add(suit4, gbc);
    //set placement of title
    gbc.gridx = 2;
    gbc.gridy = 0;
    //add title
    add(title, gbc);
    //set placement and add descriptions
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(description, gbc);
    gbc.gridx = 2;
    gbc.gridy = 3;
    add(description2, gbc);
    gbc.gridx = 2;
    gbc.gridy = 4;
    add(description3, gbc);
    //set placement of cost
    gbc.gridx = 2;
    gbc.gridy = 1;
    //add cost
    add(cost, gbc);
    //set placement of purchase
    gbc.gridx = 0;
    gbc.gridy = 2;
    //add purchase
    add(purchase, gbc);
    //set placement of quit
    gbc.gridx = 0;
    gbc.gridy = 4;
    //add quit
    add(quit,gbc);
    //set placement of previous
    gbc.gridx = 0;
    gbc.gridy = 3;
    //add previous
    add(previous, gbc);
  }//end constructor
  
  /**
   * actionPerformed 
   * Checks if the user has performed an action
   * @author Aziz, James, Jerry
   * @param ActionEvent event, the action performed by the user
   */
  public void actionPerformed(ActionEvent e){
    //if previous is pressed
    if(e.getSource().equals(previous)){
      //change the panel to accesories
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Accesories());
    }//end if
    //else if quit is pressed
    else if(e.getSource().equals(quit)){
      //close the program
      System.exit(0);
    }//end else if
    //else if purchase is pressed
    else if(e.getSource().equals(purchase)){
      //change panel to purchase
      this.setVisible(false);
      try{
        SuitUpCanada.mainGame.add(new Purchase());
      }catch(Exception exception){};
    }//end else if
  }//end actionPerformed
}//end Suit4

/**
 * Suit5
 * By Aziz, James, Jerry
 * Contains the image, title, cost, and description of the product and
 * gives the user the option to purchase the product if they choose
 * June 14, 2018
 */
class Suit5 extends JPanel implements ActionListener {
  //Declare grid bag layout
  GridBagConstraints gbc = new GridBagConstraints();
  
  //Declare JButtons
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  JButton previous = new JButton("PREVIOUS");
  //Declare image icon
  ImageIcon suit5Pic = new ImageIcon(new ImageIcon("Suit5.jpg").getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT));
  //Declare JLabel
  JLabel suit5 = new JLabel(suit5Pic);
  JLabel title = new JLabel("ALTON GRAY SUIT");
  JLabel description = new JLabel("The Alton's visible basketweave elevates your everyday gray suit with its"); 
  JLabel description2 = new JLabel("depth and rich texture. Time to step up, and step into the Alton."); 
  JLabel cost = new JLabel("$999.99");
  
  //Suit5 constructor
  public Suit5(){
    //set the background to white
    this.setBackground(new Color(255,255,255));
    //set the layout
    setLayout(new GridBagLayout());
    //Set the font of the JLabels
    title.setFont(new Font("Helvetica",Font.BOLD,25));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,25));
    //Add action listener
    purchase.addActionListener(this);
    previous.addActionListener(this);
    quit.addActionListener(this);
    //Set the gbc insets and x, y weights
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set placement of suit5
    gbc.gridx = 0;
    gbc.gridy = 1;
    //add suit5
    add(suit5, gbc);
    //set placement of title
    gbc.gridx = 2;
    gbc.gridy = 0;
    //add title
    add(title, gbc);
    //set placement and add descriptions
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(description, gbc);
    gbc.gridx = 2;
    gbc.gridy = 3;
    add(description2, gbc);
    //set placement of cost
    gbc.gridx = 2;
    gbc.gridy = 1;
    //add cost
    add(cost, gbc);
    //set placement of purchase
    gbc.gridx = 0;
    gbc.gridy = 2;
    //add purchase
    add(purchase, gbc);
    //set placement of quit
    gbc.gridx = 0;
    gbc.gridy = 4;
    //add quit
    add(quit,gbc);
    //set placement of previous
    gbc.gridx = 0;
    gbc.gridy = 3;
    //add previous
    add(previous, gbc);
  }//end constructor
  
  /**
   * actionPerformed 
   * Checks if the user has performed an action
   * @author Aziz, James, Jerry
   * @param ActionEvent event, the action performed by the user
   */
  public void actionPerformed(ActionEvent e){
    //if previous is pressed
    if(e.getSource().equals(previous)){
      //change the panel to accesories
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Accesories());
    }//end if
    //else if quit is pressed
    else if(e.getSource().equals(quit)){
      //close the program
      System.exit(0);
    }//end else if
    //else if purchase is pressed
    else if(e.getSource().equals(purchase)){
      //change panel to purchase
      this.setVisible(false);
      try{
        SuitUpCanada.mainGame.add(new Purchase());
      }catch(Exception exception){};
    }//end else if
  }//end actionPerformed
}//end Suit5

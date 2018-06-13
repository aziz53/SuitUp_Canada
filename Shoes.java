/**
 * Shoes.java
 * By Aziz, James, Jerry
 * Shoes class which contains the menu for selecting which shoes they want to view.
 * Also contains the classes for each shoe the user can view.
 * June 14, 2018
 */

//Import statements
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Shoes extends JPanel implements ActionListener {
  //Declare grid bag layout
  GridBagConstraints gbc = new GridBagConstraints();
  
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton quit = new JButton("QUIT");
  //Declare images to place onto buttons for the shoes menu
  ImageIcon shoes1Pic = new ImageIcon(new ImageIcon("shoes1.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  JButton shoes1 = new JButton(shoes1Pic);
  ImageIcon shoes2Pic = new ImageIcon(new ImageIcon("shoes2.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  JButton shoes2 = new JButton(shoes2Pic);
  ImageIcon shoes3Pic = new ImageIcon(new ImageIcon("shoesPic3.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  JButton shoes3 = new JButton(shoes3Pic);
  ImageIcon shoes4Pic = new ImageIcon(new ImageIcon("shoes4.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  JButton shoes4 = new JButton(shoes4Pic);
  
  //Shoes constructor
  public Shoes(){
    //Set the layout to grid bag layout
    setLayout(new GridBagLayout());
    
    //Add action listener
    previous.addActionListener(this);
    quit.addActionListener(this);
    shoes1.addActionListener(this);
    shoes2.addActionListener(this);
    shoes3.addActionListener(this);
    shoes4.addActionListener(this);
    
    //Set the gbc insets and x, y weights
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set the placement of shoes1 button
    gbc.gridx = 0;
    gbc.gridy = 0;
    //Add shoes1 button
    add(shoes1, gbc);
    //Set the placement of shoes2 button
    gbc.gridx = 1;
    gbc.gridy = 0;
    //Add shoes2 button
    add(shoes2, gbc);
    //Set the placement of shoes3 button
    gbc.gridx = 2;
    gbc.gridy = 0;
    //Add the shoes3 button
    add(shoes3, gbc);
    //Set the placement of the shoes4 button
    gbc.gridx = 1;
    gbc.gridy = 1;
    //Add the shoes4 button
    add(shoes4, gbc);
    //Set the placement of previous button
    gbc.gridx = 0;
    gbc.gridy = 1;
    //Add the previous button
    add(previous, gbc);
    //Set the placement of the quit button
    gbc.gridx = 2;
    gbc.gridy = 1;
    //Add the quit button
    add(quit,gbc);
  }//end constructor
  
  /**
   * actionPerformed 
   * Checks if the user has performed an action
   * @author Aziz, James, Jerry
   * @param ActionEvent e, the action performed by the user
   */
  public void actionPerformed(ActionEvent e){
    //If the button pressed is previous
    if(e.getSource().equals(previous)){
      //Change the panel to CustomerMenu
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new CustomerMenu());
    }//end if
    //Else if the button pressed is the quit button
    else if(e.getSource().equals(quit)){
      //Close the program
      System.exit(0);
    }//end else if
    //Else if the button pressed is shoes1
    else if(e.getSource().equals(shoes1)){
      //Change the panel to shoes1
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Shoes1());
    }//end else if
    //Else if the shoes2 button is pressed
    else if(e.getSource().equals(shoes2)){
      //Change the panel to shoes2
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Shoes2());
    }//end else if
    //Else if the button pressed is shoes3
    else if(e.getSource().equals(shoes3)){
      //Change the panel to shoes3
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Shoes3());
    }//end else if
    //Else if the button pressed is shoes4
    else if(e.getSource().equals(shoes4)){
      //Change the panel to shoes4
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Shoes4());
    }//end else if
  }//end actionPerformed
}//end Shoes

/**
 * Shoes1
 * By Aziz, James, Jerry
 * Contains the image, title, cost, and description of the product and
 * gives the user the option to purchase the product if they choose
 * June 14, 2018
 */
class Shoes1 extends JPanel implements ActionListener {
  //Declare gbc
  GridBagConstraints gbc = new GridBagConstraints();
  
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  //Declare ImageIcon
  ImageIcon shoes1Pic = new ImageIcon(new ImageIcon("shoes1.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  //Declare Jlabels
  JLabel shoes1 = new JLabel(shoes1Pic);
  JLabel title = new JLabel("Men's Cairo Dress Shoes");
  JLabel description = new JLabel("From ECCO, the Men's Cairo Apron Toe Oxfords feature Full-grain leather upper,"); 
  JLabel description2 = new JLabel("Leather lining, Rubber outsole."); 
  JLabel cost = new JLabel("$272.30");
  
  //Shoes1 constructor
  public Shoes1(){
    //Set the background to white
    this.setBackground(new Color(255,255,255));
    //Set the layout
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
    //set gbc insets and weight of x, y
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set the placement of the image
    gbc.gridx = 0;
    gbc.gridy = 1;
    //Add the image
    add(shoes1, gbc);
    //Set the placement of the title label
    gbc.gridx = 2;
    gbc.gridy = 0;
    //Add the title label
    add(title, gbc);
    //Set the placement of the descriptions and add the descriptions
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(description, gbc);
    gbc.gridx = 2;
    gbc.gridy = 3;
    add(description2, gbc);
    //Set the placement of the cost
    gbc.gridx = 2;
    gbc.gridy = 1;
    //Add the cost
    add(cost, gbc);
    //Set the placement of the purchase button
    gbc.gridx = 0;
    gbc.gridy = 2;
    //Add the purchase button
    add(purchase, gbc);
    //Set the placement of quit
    gbc.gridx = 0;
    gbc.gridy = 4;
    //Add quit button
    add(quit,gbc);
    //Set the placement of the previous button
    gbc.gridx = 0;
    gbc.gridy = 3;
    //Add the previous button
    add(previous, gbc);
  }//end the constructor
  
  /**
   * actionPerformed 
   * Checks if the user has performed an action
   * @author Aziz, James, Jerry
   * @param ActionEvent e, the action performed by the user
   */
  public void actionPerformed(ActionEvent e){
    //If previous button is pressed 
    if(e.getSource().equals(previous)){
      //Change panel back to shoes
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Shoes());
    }//end if
    //Else if the quit button is pressed
    else if(e.getSource().equals(quit)){
      //Close the program
      System.exit(0);
    }//end else if
    //Else if the purchase button is pressed
    else if(e.getSource().equals(purchase)){
      //Change the panel to Purchase
      this.setVisible(false);
      try{
        SuitUpCanada.mainGame.add(new Purchase());
      }catch(Exception exception){};
    }//end else if
  }//end action performed
}//end Shoes1

/**
 * Shoes2
 * By Aziz, James, Jerry
 * Contains the image, title, cost, and description of the product and
 * gives the user the option to purchase the product if they choose
 * June 14, 2018
 */
class Shoes2 extends JPanel implements ActionListener {
  //Declare gbc
  GridBagConstraints gbc = new GridBagConstraints();
  //Declare JButton
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  //Declare image icon
  ImageIcon shoes2Pic = new ImageIcon(new ImageIcon("shoes2.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  //Declare JLabels
  JLabel shoes2 = new JLabel(shoes2Pic);
  JLabel title = new JLabel("Men's Garrison Wing-Tip Oxford");
  JLabel description = new JLabel("Sophisticated style demands a pair of sleek wing-tip oxfords from Stacy Adams."); 
  JLabel cost = new JLabel("$116.42");
  
  //Shoes 2 constructor
  public Shoes2(){
    //Set the background to white
    this.setBackground(new Color(255,255,255));
    //Set the layout
    setLayout(new GridBagLayout());
    //Set the font of the JLabels
    title.setFont(new Font("Helvetica",Font.BOLD,25));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,25));
    //Add action listeners
    purchase.addActionListener(this);
    previous.addActionListener(this);
    quit.addActionListener(this);
    //Set the gbc insets and the x, y weight
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set placement of the image
    gbc.gridx = 0;
    gbc.gridy = 1;
    //Add the image
    add(shoes2, gbc);
    //Set the placement of the title
    gbc.gridx = 2;
    gbc.gridy = 0;
    //Add the title
    add(title, gbc);
    //Set the placement of the description
    gbc.gridx = 2;
    gbc.gridy = 2;
    //Add the description
    add(description, gbc);
    //Set the placement of the cost
    gbc.gridx = 2;
    gbc.gridy = 1;
    //Add the cost
    add(cost, gbc);
    //Set the placement of purchase
    gbc.gridx = 0;
    gbc.gridy = 2;
    //Add purchase button
    add(purchase, gbc);
    //Set placement of the quit button
    gbc.gridx = 0;
    gbc.gridy = 4;
    //Add quit button
    add(quit,gbc);
    //Set the placement of the previous button
    gbc.gridx = 0;
    gbc.gridy = 3;
    //Add the previous button
    add(previous, gbc);
  }//end constructor
  
  /**
   * actionPerformed 
   * Checks if the user has performed an action
   * @author Aziz, James, Jerry
   * @param ActionEvent e, the action performed by the user
   */
  public void actionPerformed(ActionEvent e){
    //If the button pressed is previous
    if(e.getSource().equals(previous)){
      //Set the panel to Shoes
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Shoes());
    }//end if
    //Else if the button pressed is quit then close the program
    else if(e.getSource().equals(quit)){
      System.exit(0);
    }//end else if
    //Else if the purchase button is pressed
    else if(e.getSource().equals(purchase)){
      //Change the panel to Purchase
      this.setVisible(false);
      try{
        SuitUpCanada.mainGame.add(new Purchase());
      }catch(Exception exception){};
    }//end else if
  }//end actionPerformed
}//end Shoes2

/**
 * Shoes3
 * By Aziz, James, Jerry
 * Contains the image, title, cost, and description of the product and
 * gives the user the option to purchase the product if they choose
 * June 14, 2018
 */
class Shoes3 extends JPanel implements ActionListener {
  //Declare gbc
  GridBagConstraints gbc = new GridBagConstraints();
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  //Declare image icon
  ImageIcon shoes3Pic = new ImageIcon(new ImageIcon("shoesPic3.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  //Declare JLabels
  JLabel shoes3 = new JLabel(shoes3Pic);
  JLabel title = new JLabel("Alpine Swiss Zurich Mens Dress Shoes Lace Up Brogue Medallion Wing Tip Oxfords");
  JLabel description = new JLabel("Brogue style classic oxfords with a modern look. Must have item of the year."); 
  JLabel cost = new JLabel("$87.50");
  
  //Shoes3 constructor
  public Shoes3(){
    //Set the background to white
    this.setBackground(new Color(255,255,255));
    //Set the layout to grid bag layout
    setLayout(new GridBagLayout());
    //Set the font of the labels
    title.setFont(new Font("Helvetica",Font.BOLD,25));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,25));
    //Add action listener
    purchase.addActionListener(this);
    previous.addActionListener(this);
    quit.addActionListener(this);
    //Set the gbc insets and the weightx, and weighty
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set the placement of the image
    gbc.gridx = 0;
    gbc.gridy = 1;
    //Add the image
    add(shoes3, gbc);
    //Set the placement of title
    gbc.gridx = 2;
    gbc.gridy = 0;
    //Add title
    add(title, gbc);
    //Set the placement of the description
    gbc.gridx = 2;
    gbc.gridy = 2;
    //Add the description
    add(description, gbc);
    //Set the placement of the cost
    gbc.gridx = 2;
    gbc.gridy = 1;
    //Add the cost
    add(cost, gbc);
    //Set the placement of the purchase button
    gbc.gridx = 0;
    gbc.gridy = 2;
    //Add the purchase button
    add(purchase, gbc);
    //Set the placement of the quit button
    gbc.gridx = 0;
    gbc.gridy = 4;
    //Add the quit button
    add(quit,gbc);
    //Set the placement of the previous button
    gbc.gridx = 0;
    gbc.gridy = 3;
    //Add the previous button
    add(previous, gbc);
  }//end constructor
  
  /**
   * actionPerformed 
   * Checks if the user has performed an action
   * @author Aziz, James, Jerry
   * @param ActionEvent e, the action performed by the user
   */
  public void actionPerformed(ActionEvent e){
    //If previous is pressed
    if(e.getSource().equals(previous)){
      //Change panel to Shoes
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Shoes());
    }//end if
    //Else if the quit button is pressed
    else if(e.getSource().equals(quit)){
      //Close the program
      System.exit(0);
    }//end else if
    //Else if button pressed is purchase
    else if(e.getSource().equals(purchase)){
      //Change the panel to Purchase
      this.setVisible(false);
      try{
        SuitUpCanada.mainGame.add(new Purchase());
      }catch(Exception exception){};
    }//end else if
  }//end actionPerformed
}//end Shoes3

/**
 * Shoes4
 * By Aziz, James, Jerry
 * Contains the image, title, cost, and description of the product and
 * gives the user the option to purchase the product if they choose
 * June 14, 2018
 */
class Shoes4 extends JPanel implements ActionListener {
  //Declare gbc
  GridBagConstraints gbc = new GridBagConstraints();
  //Declare JButton
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  //Declare image
  ImageIcon shoes4Pic = new ImageIcon(new ImageIcon("shoes4.jpg").getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT));
  //Declare JLabels
  JLabel shoes4 = new JLabel(shoes4Pic);
  JLabel title = new JLabel("JEAN YVES");
  JLabel description = new JLabel("JEAN YVES MEN DRESS SHOE JY03 OXFORD FORMAL TUXEDO FOR PROM & WEDDING SHOE"); 
  JLabel description2 = new JLabel("BLACK/WHITE PATENT TWO TONE - WIDE WIDTH AVAILABLE"); 
  JLabel cost = new JLabel("$90.53");
  
  //Shoes4 constructor
  public Shoes4(){
    //Set the background colour to white
    this.setBackground(new Color(255,255,255));
    //Set the layout
    setLayout(new GridBagLayout());
    //Set the font of the JLabels
    title.setFont(new Font("Helvetica",Font.BOLD,25));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,25));
    //Add action listeners
    purchase.addActionListener(this);
    previous.addActionListener(this);
    quit.addActionListener(this);
    //Set the gbc weightx, and weighty and the gbc insets
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set the placement of the image
    gbc.gridx = 0;
    gbc.gridy = 1;
    //Add the image
    add(shoes4, gbc);
    //Set placement of the title
    gbc.gridx = 2;
    gbc.gridy = 0;
    //Add the title
    add(title, gbc);
    //Set the placement of the descriptions and add the descriptions
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(description, gbc);
    gbc.gridx = 2;
    gbc.gridy = 3;
    add(description2, gbc);
    //Set the placement of cost
    gbc.gridx = 2;
    gbc.gridy = 1;
    //Add cost
    add(cost, gbc);
    //Set the placement of purchase button
    gbc.gridx = 0;
    gbc.gridy = 2;
    //Add purchase button
    add(purchase, gbc);
    //Set the placement of the quit button
    gbc.gridx = 0;
    gbc.gridy = 4;
    //Add quit button
    add(quit,gbc);
    //Set the placement of previous button
    gbc.gridx = 0;
    gbc.gridy = 3;
    //Add previous button
    add(previous, gbc);
  }//end constructor
  
  /**
   * actionPerformed 
   * Checks if the user has performed an action
   * @author Aziz, James, Jerry
   * @param ActionEvent e, the action performed by the user
   */
  public void actionPerformed(ActionEvent e){
    //If previous is pressed
    if(e.getSource().equals(previous)){
      //Change the panel Shoes
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Shoes());
    }//end if
    //Else if quit is pressed
    else if(e.getSource().equals(quit)){
      //Close the program
      System.exit(0);
    }//end else if
    //Else if purchase is pressed
    else if(e.getSource().equals(purchase)){
      //Change the panel to Purchase
      this.setVisible(false);
      try{
        SuitUpCanada.mainGame.add(new Purchase());
      }catch(Exception exception){};
    }//end else if
  }//end actionPerformed
}//end Shoes4

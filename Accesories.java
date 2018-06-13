/**
 * Accesories.java
 * By Aziz, James, Jerry
 * Accesories class which contains the menu for selecting which accesories they want to view.
 * Also contains the classes for each accesorie the user can view.
 * June 14, 2018
 */

//Import statement
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Accesories extends JPanel implements ActionListener {
  //Declare grid bag layout
  GridBagConstraints gbc = new GridBagConstraints();
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton quit = new JButton("QUIT");
  //Declare images to place onto buttons for the shoes menu
  ImageIcon watches1Pic = new ImageIcon(new ImageIcon("watches1.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  JButton watches1 = new JButton(watches1Pic);
  ImageIcon watches2Pic = new ImageIcon(new ImageIcon("watches2.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  JButton watches2 = new JButton(watches2Pic);
  ImageIcon watches3Pic = new ImageIcon(new ImageIcon("watches3.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  JButton watches3 = new JButton(watches3Pic);
  ImageIcon belts1Pic = new ImageIcon(new ImageIcon("belts1.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  JButton belts1 = new JButton(belts1Pic);
  ImageIcon belts2Pic = new ImageIcon(new ImageIcon("belts2.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  JButton belts2 = new JButton(belts2Pic);
  
  //Accesories constructor
  public Accesories(){
    //Set the layout to grid bag layout
    setLayout(new GridBagLayout());
    
    //Add action listener
    previous.addActionListener(this);
    quit.addActionListener(this);
    watches1.addActionListener(this);
    watches2.addActionListener(this);
    watches3.addActionListener(this);
    belts1.addActionListener(this);
    belts2.addActionListener(this);
    //Set the gbc insets and x, y weights
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set the placement of watches1
    gbc.gridx = 0;
    gbc.gridy = 0;
    //add watches1
    add(watches1, gbc);
    //set the placement of watches2
    gbc.gridx = 1;
    gbc.gridy = 0;
    //add watches2
    add(watches2, gbc);
    //set the placement of watches3
    gbc.gridx = 2;
    gbc.gridy = 0;
    //add watches3
    add(watches3, gbc);
    //set the placement of belts1
    gbc.gridx = 0;
    gbc.gridy = 1;
    //add belts1
    add(belts1, gbc);
    //set the placement of belts2
    gbc.gridx = 2;
    gbc.gridy = 1;
    //add belts2
    add(belts2, gbc);
    //set the placement of previous
    gbc.gridx = 1;
    gbc.gridy = 2;
    //add previous
    add(previous, gbc);
    //set the placement of quit
    gbc.gridx = 1;
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
      //change panel to customer menu
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new CustomerMenu());
    }//end if
    //else if the quit is pressed
    else if(e.getSource().equals(quit)){
      //close the program
      System.exit(0);
    }//end else if
    //else if watches1 is pressed
    else if(e.getSource().equals(watches1)){
      //change the panel to Accesories1
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Accesories1());
    }//end else if
    //else if watches2 is pressed
    else if(e.getSource().equals(watches2)){
      //set the panel to Accesories2
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Accesories2());
    }//end else if
    //else if watches3 is pressed
    else if(e.getSource().equals(watches3)){
      //set the panel to Accesories3
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Accesories3());
    }//end else if
    //else if belts1 is pressed
    else if(e.getSource().equals(belts1)){
      //set panel to Accesories4
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Accesories4());
    }//end else if
    //else if belts2 is pressed
    else if(e.getSource().equals(belts2)){
      //Change the panel to Accesories5
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Accesories5());
    }//end else if
  }//end actionPerformed
}//end Accesories

/**
 * Accesories1
 * By Aziz, James, Jerry
 * Contains the image, title, cost, and description of the product and
 * gives the user the option to purchase the product if they choose
 * June 14, 2018
 */
class Accesories1 extends JPanel implements ActionListener {
  //Declare grid bag layout
  GridBagConstraints gbc = new GridBagConstraints();
  
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  //Declare image icon
  ImageIcon watches1Pic = new ImageIcon(new ImageIcon("watches1.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  //Declare JLabel
  JLabel watches1 = new JLabel(watches1Pic);
  JLabel title = new JLabel("SAVVY SKELETON WATCH");
  JLabel description = new JLabel("Be on time while looking your best with alloy skeleton watches for men."); 
  JLabel description2 = new JLabel("This glow in the dark mens watch makes it easy to tell time no matter where you are.");
  JLabel description3 = new JLabel("The glass backing on this battery powered watch is sure to turn heads."); 
  JLabel description4 = new JLabel("Choose between black, brown or blue synthetic leather bands for a look fit for a gentleman.");
  JLabel cost = new JLabel("$37.99");
  
  //Accesories1 constructor
  public Accesories1(){
    //set the background to white
    this.setBackground(new Color(255,255,255));
    //set the layout
    setLayout(new GridBagLayout());
    //set the font for the label
    title.setFont(new Font("Helvetica",Font.BOLD,25));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    description3.setFont(new Font("Helvetica",Font.BOLD,15));
    description4.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,25));
    
    //Add action listener
    previous.addActionListener(this);
    quit.addActionListener(this);
    purchase.addActionListener(this);
    //Set the gbc insets and x, y weights
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set the placement of watches1 image
    gbc.gridx = 0;
    gbc.gridy = 1;
    //add watches1 
    add(watches1, gbc);
    //set the placement of title
    gbc.gridx = 2;
    gbc.gridy = 0;
    //add title
    add(title, gbc);
    //set placement for description
    gbc.gridx = 2;
    gbc.gridy = 2;
    //add description
    add(description, gbc);
    //set the placement of description2
    gbc.gridx = 2;
    gbc.gridy = 3;
    //add description2
    add(description2, gbc);
    //set the placement of description3
    gbc.gridx = 2;
    gbc.gridy = 4;
    //add description3
    add(description3, gbc);
    //set the placement of description4
    gbc.gridx = 2;
    gbc.gridy = 5;
    //add description4
    add(description4, gbc);
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
      //change panel to accesories
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
}//end Accesories1

/**
 * Accesories2
 * By Aziz, James, Jerry
 * Contains the image, title, cost, and description of the product and
 * gives the user the option to purchase the product if they choose
 * June 14, 2018
 */
class Accesories2 extends JPanel implements ActionListener {
  //Declare grid bag layout
  GridBagConstraints gbc = new GridBagConstraints();
  
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  //Declare image icon
  ImageIcon watches2Pic = new ImageIcon(new ImageIcon("watches2.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  //Declare JLabel
  JLabel watches2 = new JLabel(watches2Pic);
  JLabel title = new JLabel("TAG HEUER CARRERA CALIBRE 5 MENS 41MM AUTOMATIC DAY-DATE WATCH");
  JLabel description = new JLabel("The perfect choice for the style conscious gent who values quality, performance,"); 
  JLabel description2 = new JLabel("innate style, and accuracy, this TAG Heuer Carrera Mens Watch brings together refined"); 
  JLabel description3 = new JLabel("simple lines and classic design to create a timepiece that is styled to perfection."); 
  JLabel description4 = new JLabel("Featuring a striking blue dial, a stainless steel case, a blue leather strap, and a"); 
  JLabel description5 = new JLabel("handy date and day window, this high performance timepiece is sure to complement"); 
  JLabel description6 = new JLabel("and enhance your on and off duty looks with effortless, unrivalled ease.");
  JLabel cost = new JLabel("$3820.22");
  
  //Accesories2 constructor
  public Accesories2(){
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
    previous.addActionListener(this);
    quit.addActionListener(this);
    purchase.addActionListener(this);
    //Set the gbc insets and x, y weights
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set the placement of watches2 image
    gbc.gridx = 0;
    gbc.gridy = 1;
    //add watches2
    add(watches2, gbc);
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
}//end Accesories2

/**
 * Accesories3
 * By Aziz, James, Jerry
 * Contains the image, title, cost, and description of the product and
 * gives the user the option to purchase the product if they choose
 * June 14, 2018
 */
class Accesories3 extends JPanel implements ActionListener {
  //Declare grid bag layout
  GridBagConstraints gbc = new GridBagConstraints();
  
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  //Declare image icon
  ImageIcon watches3Pic = new ImageIcon(new ImageIcon("watches3.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  //Declare JLabel
  JLabel watches3 = new JLabel(watches3Pic);
  JLabel title = new JLabel("SUPER SEA WOLF 53 COMPRESSION"); 
  JLabel description = new JLabel("ZODIAC's most celebrated timepiece is back. Featuring a stainless-steel case");
  JLabel description2 = new JLabel("and uni-directional mineral crystal topring, black sunray dial, five-link"); 
  JLabel description3 = new JLabel("stainless-steel bracelet and C3 SuperLuminova hands and indexes,"); 
  JLabel description4 = new JLabel("Sea Wolf conveys the brand's commitment to definitive style with timeless"); 
  JLabel description5 = new JLabel("roots. The STP 1-11 automatic movement and sapphire crystal with"); 
  JLabel description6 = new JLabel("anti-reflective coating stay true to the quality and style of ZODIAC.");
  JLabel cost = new JLabel("$1,295.00");
  
  //Accesories3 constructor
  public Accesories3(){
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
    previous.addActionListener(this);
    quit.addActionListener(this);
    purchase.addActionListener(this);
    //Set the gbc insets and x, y weights
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set the placement of watches3 image
    gbc.gridx = 0;
    gbc.gridy = 1;
    //add watches3
    add(watches3, gbc);
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
}//end Accesories3

/**
 * Accesories4
 * By Aziz, James, Jerry
 * Contains the image, title, cost, and description of the product and
 * gives the user the option to purchase the product if they choose
 * June 14, 2018
 */
class Accesories4 extends JPanel implements ActionListener {
  //Declare grid bag layout
  GridBagConstraints gbc = new GridBagConstraints();
  
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  //Declare image icon
  ImageIcon belts1Pic = new ImageIcon(new ImageIcon("belts1.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  //Declare JLabel
  JLabel belts1 = new JLabel(belts1Pic);
  JLabel title = new JLabel("CLASSY PRONG BUCKLE BELT");
  JLabel description = new JLabel("Mio Marino dress belt is made with high-quality genuine leather concealed with");
  JLabel description2 = new JLabel("fortifying polyurethane. They are crafted with fine leathers that breathe, repel"); 
  JLabel description3 = new JLabel("moisture, and age gracefully. Give your trousers and chinos a finished look and"); 
  JLabel description4 = new JLabel("comfortable fit with our brimful variety of assorted colors. This classic belt"); 
  JLabel description5 = new JLabel("will rapidly make its way to accord your everyday wardrobe.");
  JLabel cost = new JLabel("$20.00");
  
  //Accesories4 constructor
  public Accesories4(){
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
    previous.addActionListener(this);
    quit.addActionListener(this);
    purchase.addActionListener(this);
    //Set the gbc insets and x, y weights
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set the placement of belts1 image
    gbc.gridx = 0;
    gbc.gridy = 1;
    //add belts1
    add(belts1, gbc);
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
}//end Accesories4

/**
 * Accesories5
 * By Aziz, James, Jerry
 * Contains the image, title, cost, and description of the product and
 * gives the user the option to purchase the product if they choose
 * June 14, 2018
 */
class Accesories5 extends JPanel implements ActionListener{
  //Declare grid bag layout
  GridBagConstraints gbc = new GridBagConstraints();
  
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  //Declare image icon
  ImageIcon belts2Pic = new ImageIcon(new ImageIcon("belts2.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  //Declare JLabel
  JLabel belts2 = new JLabel(belts2Pic);
  JLabel title = new JLabel("Men's Leather Reversible Feather Edge Soft Touch Cowhide Belt");
  JLabel description = new JLabel("This soft, smooth leather belt from Perry Ellis provides smart style and"); 
  JLabel description2 = new JLabel("understated elegance to any wardrobe.");
  JLabel cost = new JLabel("$58.26");
  
  //Accesories5 constructor
  public Accesories5(){
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
    previous.addActionListener(this);
    quit.addActionListener(this);
    purchase.addActionListener(this);
    //Set the gbc insets and x, y weights
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set placement of belts2
    gbc.gridx = 0;
    gbc.gridy = 1;
    //add belts2
    add(belts2, gbc);
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
}//end Accesories5

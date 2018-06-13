/**
 * CustomerMenu.java
 * By Aziz, James, Jerry
 * GUI for when the user wants to select what products they want to view
 * June 14, 2018
 */

//Import statements
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CustomerMenu extends JPanel implements ActionListener {
  
  //Declare grid bag layout 
  GridBagConstraints gbc = new GridBagConstraints();
  //Declare JLabels
  JLabel customerMenu = new JLabel("Customer Menu");
  //Declare JButtons
  JButton suits = new JButton("SUITS");
  JButton shoes = new JButton("SHOES");
  JButton accesories = new JButton("ACCESORIES");
  JButton quit = new JButton("QUIT");
  JButton previous = new JButton("PREVIOUS");
  
  //CustomerMenu constructor
  public CustomerMenu(){
    //Set the layout to GBC
    setLayout(new GridBagLayout());
    
    //Add action listeners
    suits.addActionListener(this);
    shoes.addActionListener(this);
    accesories.addActionListener(this);
    quit.addActionListener(this);
    previous.addActionListener(this);
    
    //Set the GBC insets and the GBC weight of x and y
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set the placement of suits button
    gbc.gridx = 3;
    gbc.gridy = 1;
    //Add suits button
    add(suits,gbc);
    //Set the placement of shoes button
    gbc.gridx = 3;
    gbc.gridy = 2;
    //Add shoes button
    add(shoes,gbc);
    //Set the placement of accesories button
    gbc.gridx=3;
    gbc.gridy=4;
    //Add accesories button
    add(accesories,gbc);
    //Set the placement of customer menu label
    gbc.gridx = 3;
    gbc.gridy = 0;
    //Set font of customer menu
    customerMenu.setFont(new Font("Serif", Font.BOLD, 20));
    //Add the customer menu
    add(customerMenu, gbc);
    //Set placment of previous button
    gbc.gridx = 3;
    gbc.gridy = 5;
    //Add the previous button
    add(previous, gbc);
    //Set the placement of quit button
    gbc.gridx = 3;
    gbc.gridy = 6;
    //Add quit button
    add(quit, gbc);
  }//end constructor
  
  /**
   * actionPerformed 
   * Checks if the user has performed an action
   * @author Aziz, James, Jerry
   * @param ActionEvent e, the action performed by the user
   */
  public void actionPerformed(ActionEvent e){
    //If the previous button is pressed
    if(e.getSource().equals(previous)){
      //Change the panel to Login panel
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Login());
    }//end if
    //else if suits button is pressed 
    else if(e.getSource().equals(suits)){
      //Change the panel to Suits
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suits());
    }//end else if
    //Else if shoes is pressed
    else if(e.getSource().equals(shoes)){
      //Change the panel to shoes
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Shoes());
    }//end else if
    //Else if the accesories button is pressed
    else if(e.getSource().equals(accesories)){
      //Change the panel to accesories
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Accesories());
    }//end else if
    //Else if quit is pressed
    else if(e.getSource().equals(quit)){
      //Close the program
      System.exit(0);
    }//end else if
  }//end actionPerformed
}//end CustomerMenu class

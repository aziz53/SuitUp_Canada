/*
 * EnterPanel.java
 * This is the main menu screen for the for both the employees and the customers
 * Author: Aziz, James, Jerry
 */ 

// Import statements
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Class to display the enter screen
public class EnterPanel extends JPanel implements ActionListener{
  // Variables for Java graphics
  JLabel menuTitle;
  JButton login;
  JButton aboutUs;
  ImageIcon menuPic;
  ImageIcon menuPic2;
  ImageIcon menuPic3;
  JLabel menuLabel;
  JLabel menuLabel2;
  JLabel menuLabel3;
  
  // Constructor
  EnterPanel(){
    
    // Initialize the labels
    menuTitle = new JLabel("Suit Up Canada", SwingConstants.CENTER);
    menuTitle.setFont(new Font("Monotype Corsiva",Font.BOLD,80));
    
    // Create JButtons
    login = new JButton("Login/Register");
    aboutUs = new JButton("About Us");
    
    // Create images for the suits and scale them to the correct proportion
    menuPic = new ImageIcon(new ImageIcon("SuitPicture.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
    menuPic2 = new ImageIcon(new ImageIcon("SuitPicture2.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
    menuPic3 = new ImageIcon(new ImageIcon("SuitPicture3.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
    
    // Create the label by adding the image
    menuLabel = new JLabel(menuPic);
    menuLabel2 = new JLabel(menuPic2);
    menuLabel3 = new JLabel(menuPic3);
    
    // Set up the background layout
    setLayout(new GridBagLayout());
    
    // Add action listeners to the buttons
    login.addActionListener(this);
    aboutUs.addActionListener(this);
    
    // Initialize grid bag constraints
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(20,50,20,50);
    
    // Add the labels and buttons to the correct locations
    gbc.gridx = 1;
    gbc.gridy = 0;
    add(menuTitle,gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(menuLabel,gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(menuLabel2,gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    add(menuLabel3,gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    add(aboutUs,gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    add(login,gbc);
  }
  
  /*
   * actionPerformed
   * This is the method that checks for button clicks and then responds to the click according to the if-statements
   * @author: Aziz, James, Jerry
   * @param: ActionEvent e, the actual button click
   */ 
  public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(login)){
      this.setVisible(false);
      // Add login screen if the login button is clicked
      SuitUpCanada.mainGame.add(new Login());
    }else if(e.getSource().equals(aboutUs)){
      this.setVisible(false);
      // Add the about us screen if the about us button is clicked
      SuitUpCanada.mainGame.add(new AboutUs());
    }
  }
}

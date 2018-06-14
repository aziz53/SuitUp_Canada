/*
 * AboutUs.java
 * This class displays the about us panel and gives the customer or employee insight into our company
 * Author: Aziz, James, Jerry
 */ 

// Import statements
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Class for the about us panel
class AboutUs extends JPanel implements ActionListener{
  // JButton to go back
  JButton backButton;
  
  // Constructor
  AboutUs(){
    // Set color to beige
    this.setBackground(new Color(245,245,200));
    // Create title for the page
    JLabel title = new JLabel("About Us", SwingConstants.CENTER);
    title.setFont(new Font("Lucida Sans Unicode",Font.BOLD,50));
    backButton = new JButton("BACK");
    backButton.addActionListener(this);
    // Set up screen parameters
    this.setVisible(true);
    this.setSize(1920,1080);
    
    // Use image of famous celebrity since he is our CEO (for the sake of this project)
    ImageIcon menuPic = new ImageIcon(new ImageIcon("AboutUsPic.png").getImage().getScaledInstance(450,700,Image.SCALE_DEFAULT));
    JLabel menuLabel = new JLabel(menuPic, SwingConstants.LEFT);
    // Text to be displayed on the about us page
    JLabel infoText = new JLabel("Influential, innovative and progressive, Suit Up Canada is reinventing a wholly modern approach to fashion.");
    JLabel infoText2 = new JLabel("Under the new vision of creative director Shah Rukh Khan, Suit Up Canada has redefined luxury for");
    JLabel infoText3 = new JLabel("the 21st century, further reinforcing its position as one of the world's most desirable fashion houses.");
    JLabel infoText4 = new JLabel("Eclectic, contemporary, romantic - Suit Up Canada products represent the pinnacle of Canadian craftsmanship");
    JLabel infoText5 = new JLabel("and are unsurpassed for their quality and attention to detail.");
    
    // Set the layout to grid bag layout
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    // Set up insets and fonts
    gbc.insets = new Insets(0,0,0,0);
    infoText.setFont(new Font("Monotype Corsiva", Font.BOLD + Font.ITALIC, 30));
    infoText2.setFont(new Font("Book Antiqua", Font.BOLD, 25));
    infoText3.setFont(new Font("Book Antiqua", Font.BOLD, 25));
    infoText4.setFont(new Font("Book Antiqua", Font.BOLD, 25));
    infoText5.setFont(new Font("Book Antiqua", Font.BOLD, 25));
    
    // Add title to appropriate location
    gbc.gridx = 1;
    gbc.gridy = 0;
    add(title,gbc);
    // Add menu label to appropraite location
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(menuLabel,gbc);
    // Add text to the appropriate locations
    gbc.gridx = 1;
    gbc.gridy = 1;
    add(infoText,gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    add(infoText2,gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    add(infoText3,gbc);
    gbc.gridx = 1;
    gbc.gridy = 4;
    add(infoText4,gbc);
    gbc.gridx = 1;
    gbc.gridy = 5;
    add(infoText5,gbc);
    // Add the back button to the appropriate location
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(backButton,gbc);
  }
  
  /*
   * actionPerformed
   * Java built in interface method to check for events occuring, in this particular case, the mouse click to go back
   * @author: Aziz, James, Jerry
   * @param: ActionEvent e, the actual event (e.g. mouse click)
   */ 
  public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(backButton)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new EnterPanel());
    }
  }
}

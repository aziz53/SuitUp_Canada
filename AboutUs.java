import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AboutUs extends JPanel{
  AboutUs(){
    JLabel title = new JLabel("About Us", SwingConstants.CENTER);
    title.setFont(new Font("Helvetica",Font.BOLD,50));
    this.setVisible(true);
    this.setSize(1920,1080);
    ImageIcon menuPic = new ImageIcon(new ImageIcon("SuitPicture.jpg").getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT));
    JLabel menuLabel = new JLabel(menuPic);
    JLabel infoText = new JLabel("Influential, innovative and progressive, Suit Up Canada is reinventing a wholly modern approach to fashion.");
    JLabel infoText2 = new JLabel("Under the new vision of creative director Shah Rukh Khan, Suit Up Canada has redefined luxury for");
    JLabel infoText3 = new JLabel("the 21st century, further reinforcing its position as one of the worldís most desirable fashion houses.");
    JLabel infoText4 = new JLabel("Eclectic, contemporary, romanticóSuit Up Canada products represent the pinnacle of Canadian craftsmanship");
    JLabel infoText5 = new JLabel("and are unsurpassed for their quality and attention to detail.");
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(100,100,100,100);
    infoText.setFont(new Font("Helvetica",Font.BOLD,20));
    infoText2.setFont(new Font("Helvetica",Font.BOLD,20));
    infoText3.setFont(new Font("Helvetica",Font.BOLD,20));
    infoText4.setFont(new Font("Helvetica",Font.BOLD,20));
    infoText5.setFont(new Font("Helvetica",Font.BOLD,20));
    gbc.gridx = 1;
    gbc.gridy = 0;
    add(title,gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(menuLabel,gbc);
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
  }
}

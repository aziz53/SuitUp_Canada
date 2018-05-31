import java.util.*;
import java.awt.*;
import javax.swing.*;
class SuitUpCanada extends JFrame{
  SuitUpCanada(){
    this.setVisible(true);
    this.setSize(1000,1000);
    this.add(new EnterPanel());
  }
  class EnterPanel extends JPanel{
    EnterPanel(){
      JLabel menuTitle = new JLabel("Suit Up Canada");
      JButton login = new JButton("Login/Register");
      JButton aboutUs = new JButton("About Us");
      ImageIcon menuPic = new ImageIcon(new ImageIcon("SuitPicture.jpg").getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT));
      JLabel menuLabel = new JLabel(menuPic);
      setLayout(new GridBagLayout());
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.insets = new Insets(20,50,50,20);
      gbc.gridx = 0;
      gbc.gridy = 0;
      menuTitle.setFont(new Font("Serif", Font.BOLD, 24));
      this.add(menuTitle,gbc);
      gbc.gridx=3;
      gbc.gridy=0;
      this.add(menuLabel,gbc);
      gbc.gridx=0;
      gbc.gridy=1;
      this.add(login,gbc);
      gbc.gridx=0;
      gbc.gridy=2;
      this.add(aboutUs,gbc);
      this.setSize(1000,1000);
      this.setVisible(true);
    }
  }
  public static void main(String args[]){
    SuitUpCanada mainGame = new SuitUpCanada();
  }
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EnterPanel extends JPanel implements ActionListener{
  JLabel menuTitle;
  JButton login;
  JButton aboutUs;
  ImageIcon menuPic;
  ImageIcon menuPic2;
  ImageIcon menuPic3;
  JLabel menuLabel;
  JLabel menuLabel2;
  JLabel menuLabel3;
  EnterPanel(){
    //this.setBackground(new Color(245,245,200));
    menuTitle = new JLabel("Suit Up Canada", SwingConstants.CENTER);
    menuTitle.setFont(new Font("Monotype Corsiva",Font.BOLD,80));
    login = new JButton("Login/Register");
    aboutUs = new JButton("About Us");
    menuPic = new ImageIcon(new ImageIcon("SuitPicture.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
    menuPic2 = new ImageIcon(new ImageIcon("SuitPicture2.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
    menuPic3 = new ImageIcon(new ImageIcon("SuitPicture3.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
    menuLabel = new JLabel(menuPic);
    menuLabel2 = new JLabel(menuPic2);
    menuLabel3 = new JLabel(menuPic3);
    setLayout(new GridBagLayout());
    login.addActionListener(this);
    aboutUs.addActionListener(this);
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(20,50,20,50);
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
  public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(login)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Login());
    }else if(e.getSource().equals(aboutUs)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new AboutUs());
    }
  }
}
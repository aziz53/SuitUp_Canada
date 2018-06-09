import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CustomerMenu extends JPanel implements ActionListener {
  
  GridBagConstraints gbc = new GridBagConstraints();
  
  JLabel customerMenu = new JLabel("Customer Menu");
  JButton suits = new JButton("SUITS");
  JButton shoes = new JButton("SHOES");
  JButton dresses = new JButton("DRESSES");
  JButton accesories = new JButton("ACCESORIES");
  JButton quit = new JButton("QUIT");
  JButton previous = new JButton("PREVIOUS");
  public CustomerMenu(){
    this.setVisible(true);
    this.setSize(1920, 1080);
    
    setLayout(new GridBagLayout());
    
    suits.addActionListener(this);
    shoes.addActionListener(this);
    dresses.addActionListener(this);
    accesories.addActionListener(this);
    quit.addActionListener(this);
    previous.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    
    gbc.gridx = 3;
    gbc.gridy = 1;
    add(suits,gbc);
    gbc.gridx = 3;
    gbc.gridy = 2;
    add(shoes,gbc);
    gbc.gridx = 3;
    gbc.gridy = 3;
    add(dresses,gbc);
    gbc.gridx=3;
    gbc.gridy=4;
    add(accesories,gbc);
    gbc.gridx = 3;
    gbc.gridy = 0;
    customerMenu.setFont(new Font("Serif", Font.BOLD, 20));
    add(customerMenu, gbc);
    gbc.gridx = 3;
    gbc.gridy = 5;
    add(previous, gbc);
    gbc.gridx = 3;
    gbc.gridy = 6;
    add(quit, gbc);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(previous)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new EnterPanel());
    }else if(e.getSource().equals(suits)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Suits());
    }else if(e.getSource().equals(shoes)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Shoes());
    }else if(e.getSource().equals(accesories)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new Accesories());
    }
  }
}

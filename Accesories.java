import jdk.internal.util.xml.impl.Input;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Accesories extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton quit = new JButton("QUIT");
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
  
  public Accesories(){
    setLayout(new GridBagLayout());
    
    previous.addActionListener(this);
    quit.addActionListener(this);
    watches1.addActionListener(this);
    watches2.addActionListener(this);
    watches3.addActionListener(this);
    belts1.addActionListener(this);
    belts2.addActionListener(this);
    
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 0;
    gbc.gridy = 0;
    add(watches1, gbc);
    gbc.gridx = 1;
    gbc.gridy = 0;
    add(watches2, gbc);
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(watches3, gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(belts1, gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(belts2, gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    add(previous, gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    add(quit,gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      if(buttonPressed.equals(quit)){
        System.exit(0);
      }
      else if (buttonPressed.equals(watches1)){
        SuitUpCanada.setContent(new Accesories1());
      }
      else if (buttonPressed.equals(watches2)){
        SuitUpCanada.setContent(new Accesories2());
      }
      else if (buttonPressed.equals(watches3)){
        SuitUpCanada.setContent(new Accesories3());
      }
      else if (buttonPressed.equals(belts1)){
        SuitUpCanada.setContent(new Accesories4());
      }
      else if (buttonPressed.equals(belts2)){
        SuitUpCanada.setContent(new Accesories5());
      }
      else if(buttonPressed.equals(previous)){
        SuitUpCanada.setContent(new CustomerMenu());
      }
    }
  }
}

class Accesories1 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  ImageIcon watches1Pic = new ImageIcon(new ImageIcon("watches1.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  JLabel watches1 = new JLabel(watches1Pic);
  JLabel title = new JLabel("SAVVY SKELETON WATCH");
  JLabel description = new JLabel("Be on time while looking your best with alloy skeleton watches for men."); 
  JLabel description2 = new JLabel("This glow in the dark mens watch makes it easy to tell time no matter where you are.");
  JLabel description3 = new JLabel("The glass backing on this battery powered watch is sure to turn heads."); 
  JLabel description4 = new JLabel("Choose between black, brown or blue synthetic leather bands for a look fit for a gentleman.");
  JLabel cost = new JLabel("$37.99");
  
  public Accesories1(){
    setLayout(new GridBagLayout());
    
    title.setFont(new Font("Helvetica",Font.BOLD,15));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    description3.setFont(new Font("Helvetica",Font.BOLD,15));
    description4.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,15));
    
    previous.addActionListener(this);
    quit.addActionListener(this);
    
    purchase.addActionListener(this);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(watches1, gbc);
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(title, gbc);
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
    gbc.gridy = 1;
    add(cost, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(purchase, gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    add(quit,gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;
    add(previous, gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      if(buttonPressed.equals(quit)){
        System.exit(0);
      }
      else if(buttonPressed.equals(previous)){
        SuitUpCanada.setContent(new Accesories());
      }
      else if(buttonPressed.equals(purchase)){
        SuitUpCanada.setContent(new Purchase());
      }
    }
  }
}

class Accesories2 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  ImageIcon watches2Pic = new ImageIcon(new ImageIcon("watches2.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  JLabel watches2 = new JLabel(watches2Pic);
  JLabel title = new JLabel("TAG HEUER CARRERA CALIBRE 5 MENS 41MM AUTOMATIC DAY-DATE WATCH");
  JLabel description = new JLabel("The perfect choice for the style conscious gent who values quality, performance,"); 
  JLabel description2 = new JLabel("innate style, and accuracy, this TAG Heuer Carrera Mens Watch brings together refined"); 
  JLabel description3 = new JLabel("simple lines and classic design to create a timepiece that is styled to perfection."); 
  JLabel description4 = new JLabel("Featuring a striking blue dial, a stainless steel case, a blue leather strap, and a"); 
  JLabel description5 = new JLabel("handy date and day window, this high performance timepiece is sure to complement"); 
  JLabel description6 = new JLabel("and enhance your on and off duty looks with effortless, unrivalled ease.");
  JLabel cost = new JLabel("$3820.22");
  
  public Accesories2(){
    setLayout(new GridBagLayout());
    
    title.setFont(new Font("Helvetica",Font.BOLD,15));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    description3.setFont(new Font("Helvetica",Font.BOLD,15));
    description4.setFont(new Font("Helvetica",Font.BOLD,15));
    description5.setFont(new Font("Helvetica",Font.BOLD,15));
    description6.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,15));
    
    previous.addActionListener(this);
    quit.addActionListener(this);
    
    purchase.addActionListener(this);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(watches2, gbc);
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(title, gbc);
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
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(cost, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(purchase, gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    add(quit,gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;
    add(previous, gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      if(buttonPressed.equals(quit)){
        System.exit(0);
      }
      else if(buttonPressed.equals(previous)){
        SuitUpCanada.setContent(new Accesories());
      }
      else if(buttonPressed.equals(purchase)){
        SuitUpCanada.setContent(new Purchase());
      }
    }
  }
}

class Accesories3 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  ImageIcon watches3Pic = new ImageIcon(new ImageIcon("watches3.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  JLabel watches3 = new JLabel(watches3Pic);
  JLabel title = new JLabel("SUPER SEA WOLF 53 COMPRESSION"); 
  JLabel description = new JLabel("ZODIAC's most celebrated timepiece is back. Featuring a stainless-steel case");
  JLabel description2 = new JLabel("and uni-directional mineral crystal topring, black sunray dial, five-link"); 
  JLabel description3 = new JLabel("stainless-steel bracelet and C3 SuperLuminova hands and indexes,"); 
  JLabel description4 = new JLabel("Sea Wolf conveys the brand's commitment to definitive style with timeless"); 
  JLabel description5 = new JLabel("roots. The STP 1-11 automatic movement and sapphire crystal with"); 
  JLabel description6 = new JLabel("anti-reflective coating stay true to the quality and style of ZODIAC.");
  JLabel cost = new JLabel("$1,295.00");
  
  public Accesories3(){
    setLayout(new GridBagLayout());
    
    title.setFont(new Font("Helvetica",Font.BOLD,15));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    description3.setFont(new Font("Helvetica",Font.BOLD,15));
    description4.setFont(new Font("Helvetica",Font.BOLD,15));
    description5.setFont(new Font("Helvetica",Font.BOLD,15));
    description6.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,15));
    
    previous.addActionListener(this);
    quit.addActionListener(this);
    
    purchase.addActionListener(this);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(watches3, gbc);
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(title, gbc);
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
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(cost, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(purchase, gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    add(quit,gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;
    add(previous, gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      if(buttonPressed.equals(quit)){
        System.exit(0);
      }
      else if(buttonPressed.equals(previous)){
        SuitUpCanada.setContent(new Accesories());
      }
      else if(buttonPressed.equals(purchase)){
        SuitUpCanada.setContent(new Purchase());
      }
    }
  }
}

class Accesories4 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  ImageIcon belts1Pic = new ImageIcon(new ImageIcon("belts1.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  JLabel belts1 = new JLabel(belts1Pic);
  JLabel title = new JLabel("CLASSY PRONG BUCKLE BELT");
  JLabel description = new JLabel("Mio Marino dress belt is made with high-quality genuine leather concealed with");
  JLabel description2 = new JLabel("fortifying polyurethane. They are crafted with fine leathers that breathe, repel"); 
  JLabel description3 = new JLabel("moisture, and age gracefully. Give your trousers and chinos a finished look and"); 
  JLabel description4 = new JLabel("comfortable fit with our brimful variety of assorted colors. This classic belt"); 
  JLabel description5 = new JLabel("will rapidly make its way to accord your everyday wardrobe.");
  JLabel cost = new JLabel("$20.00");
  
  public Accesories4(){
    setLayout(new GridBagLayout());
    
    title.setFont(new Font("Helvetica",Font.BOLD,15));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    description3.setFont(new Font("Helvetica",Font.BOLD,15));
    description4.setFont(new Font("Helvetica",Font.BOLD,15));
    description5.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,15));
    
    previous.addActionListener(this);
    quit.addActionListener(this);
    
    purchase.addActionListener(this);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(belts1, gbc);
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(title, gbc);
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
    gbc.gridy = 1;
    add(cost, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(purchase, gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    add(quit,gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;
    add(previous, gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      if(buttonPressed.equals(quit)){
        System.exit(0);
      }
      else if(buttonPressed.equals(previous)){
        SuitUpCanada.setContent(new Accesories());
      }
      else if(buttonPressed.equals(purchase)){
        SuitUpCanada.setContent(new Purchase());
      }
    }
  }
}

class Accesories5 extends JPanel implements ActionListener {
  GridBagConstraints gbc = new GridBagConstraints();
  
  JButton previous = new JButton("PREVIOUS");
  JButton purchase = new JButton("PURCHASE");
  JButton quit = new JButton("QUIT");
  ImageIcon belts2Pic = new ImageIcon(new ImageIcon("belts2.jpg").getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT));
  JLabel belts2 = new JLabel(belts2Pic);
  JLabel title = new JLabel("Men's Leather Reversible Feather Edge Soft Touch Cowhide Belt");
  JLabel description = new JLabel("This soft, smooth leather belt from Perry Ellis provides smart style and"); 
  JLabel description2 = new JLabel("understated elegance to any wardrobe.");
  JLabel cost = new JLabel("$58.26");
  
  public Accesories5(){
    setLayout(new GridBagLayout());
    
    title.setFont(new Font("Helvetica",Font.BOLD,15));
    description.setFont(new Font("Helvetica",Font.BOLD,15));
    description2.setFont(new Font("Helvetica",Font.BOLD,15));
    cost.setFont(new Font("Helvetica",Font.BOLD,15));
    
    previous.addActionListener(this);
    quit.addActionListener(this);
    
    purchase.addActionListener(this);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    
    gbc.weightx=0;
    gbc.weighty=0;
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(belts2, gbc);
    gbc.gridx = 2;
    gbc.gridy = 0;
    add(title, gbc);
    gbc.gridx = 2;
    gbc.gridy = 2;
    add(description, gbc);
    gbc.gridx = 2;
    gbc.gridy = 3;
    add(description2, gbc);
    gbc.gridx = 2;
    gbc.gridy = 1;
    add(cost, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(purchase, gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    add(quit,gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;
    add(previous, gbc);
  }
  public void actionPerformed(ActionEvent event){
    JButton buttonPressed;
    
    if(event.getSource() instanceof JButton){
      buttonPressed = (JButton)(event.getSource());
      
      if(buttonPressed.equals(quit)){
        System.exit(0);
      }
      else if(buttonPressed.equals(previous)){
        SuitUpCanada.setContent(new Accesories());
      }
      else if(buttonPressed.equals(purchase)){
        SuitUpCanada.setContent(new Purchase());
      }
    }
  }
}

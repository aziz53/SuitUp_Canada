/**
 * Purchase.java
 * By Aziz, James, Jerry
 * GUI for when the user wants to complete a purchase and outputs to
 * a text file the information of the user making the purchase
 */

//Import Statements
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Purchase extends JPanel implements ActionListener {
  
  //Declare grid bag layout 
  GridBagConstraints gbc = new GridBagConstraints();
  //Declare PrintWriter
  PrintWriter output;
  //Declare JButtons
  JButton previous = new JButton("PREVIOUS");
  JButton confirm = new JButton("CONFIRM");
  JButton quit = new JButton("QUIT");
  //Declare JLabels
  JLabel nameLabel = new JLabel("NAME:");
  JLabel creditCardLabel = new JLabel("CREDIT CARD NUMBER:");
  JLabel addressLabel = new JLabel ("ADDRESS:");
  //Declare JTextFields
  JTextField nameField = new JTextField(20);
  JTextField creditCardField = new JTextField(20);
  JTextField addressField = new JTextField(20);
  
  //Purchase constructor
  public Purchase()throws Exception {
    //Delcare the PrintWriter output to the file Receipt.txt
    output = new PrintWriter(new FileWriter("Receipt.txt",true));
    //Set the layout to grid bag layout
    setLayout(new GridBagLayout());
    
    //Add action listener
    previous.addActionListener(this);
    confirm.addActionListener(this);
    quit.addActionListener(this);
    nameField.addActionListener(this);
    addressField.addActionListener(this);
    creditCardField.addActionListener(this);
    
    //Set the GBC insets and the GBC weight of x and y
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(20,50,20,50);
    gbc.weightx=0;
    gbc.weighty=0;
    
    //Set placement and font for the name JLabel
    gbc.gridx = 0;
    gbc.gridy = 0;
    nameLabel.setFont(new Font("Serif", Font.BOLD, 18));
    //Add name label
    add(nameLabel,gbc);
    //Set the placement and font for the credit card label
    gbc.gridx = 0;
    gbc.gridy = 2;
    creditCardLabel.setFont(new Font("Serif", Font.BOLD, 18));
    //Add credit card label 
    add(creditCardLabel,gbc);
    //Set the placement and font for the address label
    gbc.gridx = 0;
    gbc.gridy = 1;
    addressLabel.setFont(new Font("Serif", Font.BOLD, 18));
    //Add the address label
    add(addressLabel,gbc);
    //Set the placement of the name field
    gbc.gridx = 1;
    gbc.gridy = 0;
    //Add the name field
    add(nameField,gbc);
    //Set the placement of credit card field
    gbc.gridx = 1;
    gbc.gridy = 2;
    //Add credit card field
    add(creditCardField,gbc);
    //Set the placement of the address field
    gbc.gridx = 1;
    gbc.gridy = 1;
    //Add address field
    add(addressField,gbc);
    //Set the placement of confirm button
    gbc.gridx = 0;
    gbc.gridy = 3;
    //Add the confirm button
    add(confirm, gbc);
    //Set placement of previous button
    gbc.gridx = 1;
    gbc.gridy = 3;
    //Add previous button
    add(previous, gbc);
    //Set placement of quit button
    gbc.gridx = 2;
    gbc.gridy = 3;
    //Add quit button
    add(quit, gbc);
  }//end constructor
  
  /**
   * actionPerformed 
   * Checks if the user has performed an action
   * @author Aziz, James, Jerry
   * @param ActionEvent event, the action performed by the user
   */
  public void actionPerformed(ActionEvent event){
    //Declare JButton
    JButton buttonPressed;
    //Declare name, credit card, and address which takes the input from the TextFields
    String name = nameField.getText();
    String creditCard = creditCardField.getText();
    String address = addressField.getText();
    
    //If a button is pressed
    if(event.getSource() instanceof JButton){
      //Declare buttonPressed to the button that was clicked
      buttonPressed = (JButton)(event.getSource());
      
      //If the button pressed is confirm
      if(event.getSource().equals(confirm)){
        //Declare a boolean purchased as false
        boolean purchased = false;
        //If there is text in the name field, the text in creditCardField is equal to 16
        //and the text in address field is more then 0
        if(0 < name.length() && creditCard.length() == 16 && 0 < address.length()){
          //Set purchased to true
          purchased = true;
          //Output a message to confirm the purchase in a JOptionPane
          JOptionPane.showMessageDialog(SuitUpCanada.mainGame, "Succesfully Purchased");
          //Output to the text file the name of the person who purchased the product,
          //their address, and their credit card number
          output.println("Item Purchased by: " + name + " Address: " + address + " Credit Card Number: " + creditCard);
          //Close the PrintWriter
          output.close();
          //Change the panel to customer menu
          this.setVisible(false);
          SuitUpCanada.mainGame.add(new CustomerMenu());
        }//end if
        //If purchased is false
        if(purchased == false){
          //Output and error message to the user in a JOptionPane
          JOptionPane.showMessageDialog(SuitUpCanada.mainGame,"Invalid Information");
        }//end if
      }//end if
      //Else if the button pressed is the previous button 
      else if(event.getSource().equals(previous)){
        //Change the panel to the customer menu
        this.setVisible(false);
        SuitUpCanada.mainGame.add(new CustomerMenu());
      }//end else if
      //Else if the button pressed is quit
      else if(buttonPressed.equals(quit)){
        //Close the program
        System.exit(0);
      }//end else if
    }//end if
  }//end actionPerformed
}//end Purchase class

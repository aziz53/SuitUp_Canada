/*
 * BookAppointment.java
 * This is the panel in which employees will book services and dates for customers
 * Author: Aziz, James, Jerry
 */ 

//import nesscary items
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.*;
import java.io.*;

//create class and extend with JPanel
public class BookAppointment extends JPanel implements ActionListener
{ 
  
  //combobox for services
  JComboBox services;
  
  //output writers for adding and removing items to text file
  PrintWriter output;
  PrintWriter output2;
  
  
  //buttons, labels and textfield for user input and use
  public JTextField txtDate;
  public JLabel title;
  JButton addDate;
  JButton removeDate;
  JButton previous;
  
  //variables for the calendar and the table for services
  DefaultTableModel serviceModel;
  JScrollPane tableScroller;
  int rows=0;
  JTable table;
  Object rowData[][];
  /**
   * Launch the application.
   */
  public static void main(String[] args)// main method
  { // it will call the run method on that object
    EventQueue.invokeLater(new Runnable()
                             { 
      public void run()
      {
        try // try block 
        {
          //create frame object
          BookAppointment frame = new BookAppointment();
          frame.setVisible(true);//set visible true
        }
        catch (Exception e) //catch the exception
        {
          e.printStackTrace();
        }
      }          
    });
  }
  //create constructor of class
  public BookAppointment() 
  {
    
    //create gridbaglayout
    setLayout(new GridBagLayout());
    
    //create gridbagconstraints and set insets
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(20,50,20,50);
    
    //create and set title
    title=new JLabel("Service Booking");
    title.setFont(new Font("Serif",Font.BOLD,50));
    
    //create buttons
    addDate = new JButton("Add date");
    removeDate = new JButton("Remove date");
    previous = new JButton("Previous");
    
    //create services and items to the jcombobox
    services= new JComboBox();
    services.addItem("Pant Crease");
    services.addItem("Tapering");
    services.addItem("Measuring");
    services.addItem("Shirt Stays");
    services.addItem("Pickup");
    
    //column names for the jtable
    String columnNames[] = { "Date", "Service" };
    
    //default table model initiaited
    serviceModel = new DefaultTableModel(columnNames,1);
    
    //incorporate the table model into a table
    table = new JTable(serviceModel);
    
    //read the data from the service entries list and add it as data into the jtable
    for(int i=0; i<SuitUpCanada.serviceEntries.size(); i++){
      
      String date = SuitUpCanada.serviceEntries.get(i).getDate();
      String service = SuitUpCanada.serviceEntries.get(i).getService();
      System.out.println(date + " " + service);
      Object[] data1 = {date,service};
      serviceModel.addRow(data1);
      
    }
    
    //make it so that table can not be edited directly through mouse click
    table.setEnabled(false);
    
    //add table scroller for the table
    tableScroller= new JScrollPane(table);
    
    //create text field which get the date data from the table
    txtDate = new JTextField();
    
    //set bounds of text field
    txtDate.setBounds(101, 107, 86, 20);
    
    //add text field to panel
    gbc.gridx=0;
    gbc.gridy=0;
    this.add(title,gbc);
    
    //add table to panel
    gbc.gridy=1;
    txtDate.setColumns(10);
    gbc.gridx=0;
    this.add(tableScroller,gbc);
    
    //create buttons that will display calendar 
    JButton btnNewButton = new JButton("Select Date");
    
    //perform action listener
    btnNewButton.addActionListener(new ActionListener() 
                                     { 
      //performed action
      public void actionPerformed(ActionEvent arg0) 
      {
        //create frame new object  f
        final JFrame f = new JFrame();
        //set text which is collected by date picker i.e. set date 
        txtDate.setText(new DatePicker(f).setPickedDate());
      }
    });
    
    //add action listeners to the buttons and textfield
    addDate.addActionListener(this);
    removeDate.addActionListener(this);
    previous.addActionListener(this);
    txtDate.addActionListener(this);
    
    //add select date button toe panel
    gbc.gridy=2;
    this.add(btnNewButton,gbc);
    
    //add jtextfield that stores date from calendar to jpanel
    gbc.gridy=3;
    this.add(txtDate,gbc);
    
    //add jcombobox that stores services to the jpanel
    gbc.gridy=4;
    this.add(services,gbc);
    
    //add button that allows you to add the current date to the jtable
    gbc.gridy=5;
    this.add(addDate,gbc);
    
    //remove buttons that allows you to remove the date and service from the jtable
    gbc.gridy=6;
    this.add(removeDate,gbc);
    
    //add previous button to jpanel
    gbc.gridy=7;
    this.add(previous,gbc);
  }
  
  //actionPerformed method
  //method that overrides the actionlistener abstract class by implmeenting actionlisteners to the buttons
  //@param1 is the actionevent
  public void actionPerformed(ActionEvent event) 
  {
    //temporay button that will store data on which button was pressed
    JButton buttonPressed;
    if(event.getSource() instanceof JButton) {
      
      //get which button was pressed
      buttonPressed = (JButton) (event.getSource()); 
      
      //if button is add date
      if(buttonPressed.equals(addDate)){
        
        //get date and item from textfield and jcombobox 
        String selectedDate=txtDate.getText().trim();
        String selectedItem=services.getSelectedItem().toString().trim();
        
        //add it to the serviceentries arraylist
        SuitUpCanada.serviceEntries.add(new ServiceEntry(selectedDate,selectedItem));
        
        //add it to the table
        Object[] data2 = {selectedDate,selectedItem};
        serviceModel.addRow(data2);
        System.out.println(selectedDate + " " + selectedItem);
        
        //update the textfile
        try {
          
          output = new PrintWriter(new File("serviceEntries.txt"));
          for(int i=0; i<SuitUpCanada.serviceEntries.size(); i++) {
            output.println(SuitUpCanada.serviceEntries.get(i).toString1());
          }
          
          output.close();
        } catch(Exception exe) {
        }
        
        //update the jpanel
        this.revalidate();
        this.repaint();
        
      }
      
      //if button is removing date
      else if(buttonPressed.equals(removeDate)) {
        
        //get the data from the jcombobox and the jtextfield that stores thte date
        String selectedDate1=txtDate.getText().trim();
        String selectedItem1=services.getSelectedItem().toString().trim();
        
        //find the item data in the arraylist if it exists
        for(int i=0; i<SuitUpCanada.serviceEntries.size(); i++) {
          ServiceEntry temp=SuitUpCanada.serviceEntries.get(i);
          
          //if the data is found, remove it from the arraylist
          if(selectedDate1.equals(temp.getDate()) && selectedItem1.equals(temp.getService())) {
            SuitUpCanada.serviceEntries.remove(i);
            i=SuitUpCanada.serviceEntries.size();
          }
        }
        
        //clear the entire table
        serviceModel.setRowCount(1);
        
        //reprint the table based on the newly updated service entries
        for(int i=0; i<SuitUpCanada.serviceEntries.size(); i++){
          
          String date = SuitUpCanada.serviceEntries.get(i).getDate();
          String service = SuitUpCanada.serviceEntries.get(i).getService();
          System.out.println(date + " " + service);
          Object[] data1 = {date,service};
          serviceModel.addRow(data1);
          
        }
        
        //reprint to the service entries textfile
        try {
          
          output2 = new PrintWriter(new File("serviceEntries.txt"));
          for(int i=0; i<SuitUpCanada.serviceEntries.size(); i++) {
            output2.println(SuitUpCanada.serviceEntries.get(i).toString1());
          }
          
          //close output printwriter
          output2.close();
        } catch(Exception exe) {
        }
        
        //reprint the jpanel
        this.revalidate();
        this.repaint();
      }
      
      //previous button
      else if(buttonPressed.equals(previous)) {
        
        //set the current panel to false
        this.setVisible(false);
        
        //add new employee menu
        this.add(new EmployeeMenu());
        SuitUpCanada.mainGame.add(new EmployeeMenu());
      }
    }  
  }
}
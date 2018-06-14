import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.*;
import java.io.*;

//create class and extend with JFrame
public class BookAppointment extends JPanel implements ActionListener
{ 
  JComboBox services;
  PrintWriter output;
  PrintWriter output2;
  //add JPanel to the contentPane
  public JPanel contentPane;
  //declare variable
  public JTextField txtDate;
  public JLabel title;
  JButton addDate;
  JButton removeDate;
  JButton previous;
  
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

 /**
  * Create the frame.
  */
 //create constructor of class
 public BookAppointment() 
 {
 setLayout(new GridBagLayout());
 GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(20,50,20,50);
  
  title=new JLabel("Service Booking");
   title.setFont(new Font("Serif",Font.BOLD,50));
  //set contentPane 
  addDate = new JButton("Add date");
  removeDate = new JButton("Remove date");
  previous = new JButton("Previous");
  //set layout null
  services= new JComboBox();
  services.addItem("Pant Crease");
  services.addItem("Tapering");
  services.addItem("Measuring");
  services.addItem("Shirt Stays");
  services.addItem("Pickup");
  
   String columnNames[] = { "Date", "Service" };
   serviceModel = new DefaultTableModel(columnNames,1);
   table = new JTable(serviceModel);
   for(int i=0; i<SuitUpCanada.serviceEntries.size(); i++){
      String date = SuitUpCanada.serviceEntries.get(i).getDate();
      String service = SuitUpCanada.serviceEntries.get(i).getService();
      
     System.out.println(date + " " + service);
      Object[] data1 = {date,service};
      serviceModel.addRow(data1);
    }
   table.setEnabled(false);
   tableScroller= new JScrollPane(table);
  //create text field
  txtDate = new JTextField();
  //set bounds of text field
  txtDate.setBounds(101, 107, 86, 20);
  //add text field to contentPane
  gbc.gridx=0;
  gbc.gridy=0;
  this.add(title,gbc);
   gbc.gridy=1;
 
  txtDate.setColumns(10);
  gbc.gridx=0;
  
  this.add(tableScroller,gbc);

  //create button and there object
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
  //set button bound
   addDate.addActionListener(this);
  removeDate.addActionListener(this);
  previous.addActionListener(this);
  txtDate.addActionListener(this);
  //add button in contentPane
  gbc.gridy=2;
  this.add(btnNewButton,gbc);
  gbc.gridy=3;
  this.add(txtDate,gbc);
  gbc.gridy=4;
  this.add(services,gbc);
  gbc.gridy=5;
  this.add(addDate,gbc);
  gbc.gridy=6;
  this.add(removeDate,gbc);
  gbc.gridy=7;
  this.add(previous,gbc);
 }
  public void actionPerformed(ActionEvent event) 
   {
    JButton buttonPressed;
    if(event.getSource() instanceof JButton) {
     buttonPressed = (JButton) (event.getSource()); 
     if(buttonPressed.equals(addDate)){
        String selectedDate=txtDate.getText().trim();
        String selectedItem=services.getSelectedItem().toString().trim();
        SuitUpCanada.serviceEntries.add(new ServiceEntry(selectedDate,selectedItem));
        Object[] data2 = {selectedDate,selectedItem};
      serviceModel.addRow(data2);
        System.out.println(selectedDate + " " + selectedItem);
        try {
    output = new PrintWriter(new File("serviceEntries.txt"));
    for(int i=0; i<SuitUpCanada.serviceEntries.size(); i++) {
    output.println(SuitUpCanada.serviceEntries.get(i).toString1());
                     }
    output.close();
    } catch(Exception exe) {
    }
      this.revalidate();
     this.repaint();
     
      }
   
      else if(buttonPressed.equals(removeDate)) {
        String selectedDate1=txtDate.getText().trim();
        String selectedItem1=services.getSelectedItem().toString().trim();
        for(int i=0; i<SuitUpCanada.serviceEntries.size(); i++) {
         ServiceEntry temp=SuitUpCanada.serviceEntries.get(i);
         if(selectedDate1.equals(temp.getDate()) && selectedItem1.equals(temp.getService())) {
          SuitUpCanada.serviceEntries.remove(i);
          i=SuitUpCanada.serviceEntries.size();
         }
        }
        serviceModel.setRowCount(1);
         for(int i=0; i<SuitUpCanada.serviceEntries.size(); i++){
      String date = SuitUpCanada.serviceEntries.get(i).getDate();
      String service = SuitUpCanada.serviceEntries.get(i).getService();
      
     System.out.println(date + " " + service);
      Object[] data1 = {date,service};
      serviceModel.addRow(data1);
    }
        
        System.out.println(selectedDate1 + " " + selectedItem1);
          try {
    output2 = new PrintWriter(new File("serviceEntries.txt"));
    for(int i=0; i<SuitUpCanada.serviceEntries.size(); i++) {
    output2.println(SuitUpCanada.serviceEntries.get(i).toString1());
                     }
    output2.close();
    } catch(Exception exe) {
    }
      this.revalidate();
     this.repaint();
      }
       else if(buttonPressed.equals(previous)) {
        this.setVisible(false);
        this.add(new EmployeeMenu());
        SuitUpCanada.mainGame.add(new EmployeeMenu());
      }
    }
     //create frame new object  f
    
   }
}
/*
 * SuitUpCanada.java
 * The start up screen of the game which displays the abous us and is the precursor to the login page
 * Author: Aziz, James, Jerry
 */ 
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
//nesscary important statements
//main jframe
public class SuitUpCanada extends JFrame{
  
  //create one constant jframe
  public static SuitUpCanada mainGame;
  
  //arraylists of various objects to store data
  public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
  public static ArrayList<Entry> accountingEntries = new ArrayList<Entry>();
  public static ArrayList<ServiceEntry> serviceEntries = new ArrayList<ServiceEntry>();
  
  //variables to store employee data
  public static String currentName;
  public static String currentNum;
  public static String currentPosition;
  public static int currentStatus;
  
  //scanners to get info from textfile
  Scanner input;
  Scanner input2;
  Scanner input3;
  SuitUpCanada() throws Exception{
    
    //read in input for human resources
    input = new Scanner(new File("Employee Info.txt"));
    while(input.hasNext()){
      
      //get data from lines
      String total = input.nextLine();
      
      //get first name data
      String name = total.substring(0,total.indexOf(" "));
      total = total.substring(total.indexOf(" ") + 1);
      
      //get last name and create final name
      String lastName = total.substring(0,total.indexOf(" "));
      name += " " + lastName;
      System.out.println(name);
      total = total.substring(total.indexOf(" ") + 1);
      
      //get employee number
      String number = total.substring(0,total.indexOf(" "));
      total = total.substring(total.indexOf(" ") + 1);
      
      //get employee password
      String password = total.substring(0,total.indexOf(" "));
      total = total.substring(total.indexOf(" ") + 1);
      
      //get employee position
      String position = total.substring(0,total.indexOf(" "));
      total = total.substring(total.indexOf(" ") + 1);
      System.out.println(position);
      
      //get employee salary
      String salary = total.substring(0,total.indexOf(" "));
      System.out.println(salary);
      total = total.substring(total.indexOf(" ") + 1);
      
      //get status of employee
      int status = Integer.parseInt(total);
      
      //add it to employee list (arraylist)
      employeeList.add(new Employee(name,number,password,position,salary,status));
      System.out.println(number + " ");
    }
    
    //the input scanner for the accounting entries
    input2 = new Scanner(new File("accountingEntries.txt"));
    while(input2.hasNext()){
      
      //get the type of accounting entry
      String total = input2.nextLine();
      String item = total.substring(0,total.indexOf("|"));
      total = total.substring(total.indexOf("|") + 1);
      
      //get the debit entry
      String debit = total.substring(0,total.indexOf("|"));
      total = total.substring(total.indexOf("|") + 1);
      
      //get the credit entry
      String credit = total.substring(0,total.indexOf("|"));
      String date = total.substring(total.indexOf("|") + 1);
      
      //add it to the accounting entry list
      accountingEntries.add(new Entry(debit,credit,date,item));
      
    }
    
    //scanner input for the service entries
    input3 = new Scanner(new File("serviceEntries.txt"));
    while(input3.hasNext()){
      String total = input3.nextLine();
      
      //date for the service
      String date = total.substring(0,total.indexOf("|"));
      
      //service type at that date
      total = total.substring(total.indexOf("|") + 1);
      
      //add it to the service entries
      serviceEntries.add(new ServiceEntry(date,total));
      
    }
    
    //close inputs
    input.close();
    input2.close();
    input3.close();
    
    //set frame dimensions and set it to be visible
    this.setVisible(true);
    this.setSize(1920,1080);
    this.setResizable(true);
    
    //add the beginning panel
    this.add(new EnterPanel());
  }
  
  //main method
  public static void main(String args[]) throws Exception{
    
    //start instance of suitupcanada
    mainGame = new SuitUpCanada();
    
  }
}

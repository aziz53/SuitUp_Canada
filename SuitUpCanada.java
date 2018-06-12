import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
 public class SuitUpCanada extends JFrame{
  public static SuitUpCanada mainGame;
  public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
   public static ArrayList<Entry> accountingEntries = new ArrayList<Entry>();
  public static String currentName;
  public static String currentNum;
  public static String currentPosition;
  public static int currentStatus;
  Scanner input;
  Scanner input2;
  SuitUpCanada() throws Exception{
    input = new Scanner(new File("Employee Info.txt"));
    while(input.hasNext()){
      String total = input.nextLine();
      String name = total.substring(0,total.indexOf(" "));
      total = total.substring(total.indexOf(" ") + 1);
      String lastName = total.substring(0,total.indexOf(" "));
      name += " " + lastName;
      System.out.println(name);
      total = total.substring(total.indexOf(" ") + 1);
      String number = total.substring(0,total.indexOf(" "));
      total = total.substring(total.indexOf(" ") + 1);
      String password = total.substring(0,total.indexOf(" "));
      total = total.substring(total.indexOf(" ") + 1);
      String position = total.substring(0,total.indexOf(" "));
      total = total.substring(total.indexOf(" ") + 1);
      System.out.println(position);
      String salary = total.substring(0,total.indexOf(" "));
      System.out.println(salary);
      total = total.substring(total.indexOf(" ") + 1);
      int status = Integer.parseInt(total);
      employeeList.add(new Employee(name,number,password,position,salary,status));
      System.out.println(number + " ");
    }
    input2 = new Scanner(new File("accountingEntries.txt"));
    while(input2.hasNext()){
      String total = input2.nextLine();
      String item = total.substring(0,total.indexOf("|"));
      total = total.substring(total.indexOf("|") + 1);
      String debit = total.substring(0,total.indexOf("|"));
      total = total.substring(total.indexOf("|") + 1);
      String credit = total.substring(0,total.indexOf("|"));
      String date = total.substring(total.indexOf("|") + 1);
      
     
      accountingEntries.add(new Entry(debit,credit,date,item));
  
    }
    input.close();
    input2.close();
    this.setVisible(true);
    this.setSize(1920,1080);
    this.setResizable(true);
    this.add(new EnterPanel());
  }
  public static void main(String args[]) throws Exception{
    mainGame = new SuitUpCanada();
  }
}

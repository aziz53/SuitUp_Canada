import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 public class SuitUpCanada extends JFrame{
  public static SuitUpCanada mainGame;
  public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
  SuitUpCanada(){
    employeeList.add(new Employee("Jerry's Dad", "1", "theBoss", "The Boss"));
    this.setVisible(true);
    this.setSize(1920,1080);
    this.setResizable(true);
    this.add(new EnterPanel());
  }
  public static void main(String args[]){
    mainGame = new SuitUpCanada();
  }
}

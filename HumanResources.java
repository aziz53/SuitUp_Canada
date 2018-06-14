import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.*;
import java.io.*;
class HumanResources extends JPanel implements ActionListener{
  PrintWriter output;
  JLabel title;
  JTable employeeInfo;
  DefaultTableModel model;
  JScrollPane tableHolder;
  JButton addEmployee;
  JButton removeEmployee;
  JButton back;
  HumanResources() {
    try {
    output = new PrintWriter(new File("Employee Info.txt"));
    } catch(Exception e) {
    }
    for(int i=0; i<SuitUpCanada.employeeList.size(); i++){
      output.println(SuitUpCanada.employeeList.get(i).getName() + " " + SuitUpCanada.employeeList.get(i).getNumber() + " " + SuitUpCanada.employeeList.get(i).getPassword() + " " + SuitUpCanada.employeeList.get(i).getPosition() + " " + SuitUpCanada.employeeList.get(i).getSalary() + " " + SuitUpCanada.employeeList.get(i).getStatus());
    }
    output.close();
    System.out.println(SuitUpCanada.currentName);
    title = new JLabel("Human Resources");
    title.setFont(new Font("Serif",Font.BOLD,50));
    addEmployee = new JButton("ADD EMPLOYEE");
    removeEmployee = new JButton("REMOVE EMPLOYEE");
    addEmployee.addActionListener(this);
    removeEmployee.addActionListener(this);
    this.setVisible(true);
    String column[] = {"Name","Number","Position","Salary","Status"};
    model = new DefaultTableModel(column,0);
    employeeInfo = new JTable(model);
    for(int i=0; i<SuitUpCanada.employeeList.size(); i++){
      String name = SuitUpCanada.employeeList.get(i).getName();
      String number = SuitUpCanada.employeeList.get(i).getNumber();
      String position = SuitUpCanada.employeeList.get(i).getPosition();
      String salary = SuitUpCanada.employeeList.get(i).getSalary();
      String status = Integer.toString(SuitUpCanada.employeeList.get(i).getStatus());
      Object[] data = {name,number,position,salary,status};
      model.addRow(data);
    }
    employeeInfo.setEnabled(false);
    tableHolder = new JScrollPane(employeeInfo);
    back = new JButton("Back");
    back.addActionListener(this);
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(20,50,20,50);
    gbc.gridx = 0;
    gbc.gridy = 0;
    this.add(title,gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    this.add(tableHolder,gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    this.add(addEmployee,gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;
    this.add(removeEmployee,gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    this.add(back,gbc);
    this.setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
    this.setVisible(true);
    if(e.getSource().equals(addEmployee)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new AddEmployee());
    }else if(e.getSource().equals(removeEmployee)){
      this.setVisible(false);
      try{
      SuitUpCanada.mainGame.add(new RemoveEmployee());
      }catch(Exception exception){};
    }else if(e.getSource().equals(back)){
      this.setVisible(false);
      SuitUpCanada.mainGame.add(new EmployeeMenu());
    }
  }
}

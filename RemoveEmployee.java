import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class RemoveEmployee extends JPanel implements ActionListener{
  PrintWriter output;
  JLabel title;
  JLabel nameLabel;
  JLabel numLabel;
  JLabel passwordLabel;
  JLabel positionLabel;
  JLabel salaryLabel;
  JLabel statusLabel;
  JButton add;
  JButton back;
  JTextField name;
  JTextField number;
  JTextField password;
  JTextField position;
  JTextField salary;
  JTextField status;
  RemoveEmployee() throws Exception{
    output = new PrintWriter(new FileWriter("Termination Log.txt",true));
    this.setVisible(true);
    title = new JLabel("Remove Employee");
    title.setFont(new Font("Serif",Font.BOLD,50));
    nameLabel = new JLabel("Employee Name: ");
    numLabel = new JLabel("Employee Number: ");
    passwordLabel = new JLabel("Employee Password: ");
    positionLabel = new JLabel("Employee Position: ");
    salaryLabel = new JLabel("Employee Salary: ");
    statusLabel = new JLabel("Employee Status: ");
    name = new JTextField(20);
    number = new JTextField(20);
    password = new JTextField(20);
    position = new JTextField(20);
    salary = new JTextField(20);
    status = new JTextField(20);
    add = new JButton("REMOVE EMPLOYEE");
    back = new JButton("Back");
    name.addActionListener(this);
    number.addActionListener(this);
    password.addActionListener(this);
    position.addActionListener(this);
    salary.addActionListener(this);
    status.addActionListener(this);
    add.addActionListener(this);
    back.addActionListener(this);
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(20,50,20,50);
    gbc.gridx = 0;
    gbc.gridy = 0;
    add(title,gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    add(nameLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    add(name,gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    add(numLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    add(number,gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;
    add(passwordLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    add(password,gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    add(positionLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 4;
    add(position,gbc);
    gbc.gridx = 0;
    gbc.gridy = 5;
    add(positionLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 5;
    add(position,gbc);
    gbc.gridx = 0;
    gbc.gridy = 6;
    add(salaryLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 6;
    add(salary,gbc);
    gbc.gridx = 0;
    gbc.gridy = 7;
    add(statusLabel,gbc);
    gbc.gridx = 1;
    gbc.gridy = 7;
    add(status,gbc);
    gbc.gridx = 0;
    gbc.gridy = 8;
    add(add,gbc);
    gbc.gridx = 1;
    gbc.gridy = 8;
    add(back,gbc);
  }
    public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(add)){
      if(SuitUpCanada.currentStatus < 3){
        for(int i=0; i<SuitUpCanada.employeeList.size(); i++){
          if(SuitUpCanada.employeeList.get(i).getName().equalsIgnoreCase(name.getText()) && SuitUpCanada.employeeList.get(i).getNumber().equalsIgnoreCase(number.getText()) && SuitUpCanada.employeeList.get(i).getPassword().equals(password.getText()) && SuitUpCanada.employeeList.get(i).getPosition().equalsIgnoreCase(position.getText()) && SuitUpCanada.employeeList.get(i).getSalary().equalsIgnoreCase(salary.getText()) && SuitUpCanada.employeeList.get(i).getStatus() == Integer.parseInt(status.getText())){
            output.println("Employee: " + SuitUpCanada.employeeList.get(i).getName() + " Number: " + SuitUpCanada.employeeList.get(i).getNumber() + " was fired by " + "Employee: " + SuitUpCanada.currentName + " Number: " + SuitUpCanada.currentNum);
            SuitUpCanada.employeeList.remove(i);
            output.close();
          }
        }
        this.setVisible(false);
        try{
        SuitUpCanada.mainGame.add(new HumanResources());
        }catch(Exception exception){};
      }else{
        JOptionPane.showMessageDialog(SuitUpCanada.mainGame,"You do not have authorization to remove employees");
      }
    }else if(e.getSource().equals(back)){
      this.setVisible(false);
      try{
        SuitUpCanada.mainGame.add(new HumanResources());
      }catch(Exception exception){};
    }
  }
}
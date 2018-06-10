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
  JButton add;
  JButton back;
  JTextField name;
  JTextField number;
  RemoveEmployee() throws Exception{
    output = new PrintWriter(new FileWriter("Termination Log.txt",true));
    this.setVisible(true);
    title = new JLabel("Remove Employee");
    title.setFont(new Font("Serif",Font.BOLD,50));
    nameLabel = new JLabel("Employee Name: ");
    numLabel = new JLabel("Employee Number: ");
    name = new JTextField(20);
    number = new JTextField(20);
    add = new JButton("REMOVE EMPLOYEE");
    back = new JButton("Back");
    name.addActionListener(this);
    number.addActionListener(this);
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
    add(add,gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    add(back,gbc);
  }
    public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(add)){
      if(SuitUpCanada.currentStatus < 3){
        boolean changed = false;
        for(int i=0; i<SuitUpCanada.employeeList.size(); i++){
          if(SuitUpCanada.employeeList.get(i).getName().equalsIgnoreCase(name.getText()) && SuitUpCanada.employeeList.get(i).getNumber().equalsIgnoreCase(number.getText())){
            if(SuitUpCanada.employeeList.get(i).getStatus() <= SuitUpCanada.currentStatus){
              JOptionPane.showMessageDialog(SuitUpCanada.mainGame,"You cannot fire employees with equal or greater status");
              return;
            }
            output.println("Employee: " + SuitUpCanada.employeeList.get(i).getName() + " Number: " + SuitUpCanada.employeeList.get(i).getNumber() + " was fired by " + "Employee: " + SuitUpCanada.currentName + " Number: " + SuitUpCanada.currentNum);
            SuitUpCanada.employeeList.remove(i);
            output.close();
            changed = true;
          }
        }
        if(changed == false){
          JOptionPane.showMessageDialog(SuitUpCanada.mainGame,"No such employee exists in our records");
          return;
        }
        JOptionPane.showMessageDialog(SuitUpCanada.mainGame,"You have successfully removed an employee");
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

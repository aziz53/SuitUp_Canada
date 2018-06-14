/*
 * Employee.java
 * This is the template for the employee object that will be stored in our database
 * Author: Aziz, James, Jerry
 */ 

class Employee{
  
  // Variable names
  String name;
  String number;
  String password;
  String position;
  String salary;
  int status; // Employees have a status of 1-3, if they have a status of 3, they cannot hire or fire, employees with status 2 cannot fire employees of status 1
  
  // Constructor
  Employee(String name, String number, String password, String position, String salary, int status){
    // Initialize the variables
    this.name = name;
    this.number = number;
    this.password = password;
    this.position = position;
    this.salary = salary;
    this.status = status;
  }
  
  /*
   * getName
   * This method returns the name of the employee
   * @author: Aziz, James, Jerry
   * @return: String this.name, name of employee
   */ 
  String getName(){
    return this.name;
  }
  
  /*
   * getNumber
   * This method returns the number of the employee
   * @author: Aziz, James, Jerry
   * @return: String this.number, number of employee
   */ 
  String getNumber(){
    return this.number;
  }
  
  /*
   * getPassword
   * This method returns the password of the employee
   * @author: Aziz, James, Jerry
   * @return: String this.password, password of employee
   */ 
  String getPassword(){
    return this.password;
  }
  
  /*
   * getSalary
   * This method returns the salary of the employee
   * @author: Aziz, James, Jerry
   * @return: String this.salary, salary of employee
   */ 
  String getSalary(){
    return this.salary;
  }
  /*
   * getPosition
   * This method returns the position of the employee
   * @author: Aziz, James, Jerry
   * @return: String this.position, position of employee
   */ 
  String getPosition(){
    return this.position;
  }
  /*
   * getStatus
   * This method returns the status of the employee
   * @author: Aziz, James, Jerry
   * @return: int this.status, status of employee
   */ 
  int getStatus(){
    return this.status;
  }
}

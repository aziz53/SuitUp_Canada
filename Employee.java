class Employee{
  String name;
  String number;
  String password;
  String position;
  String salary;
  int status;
  Employee(String name, String number, String password, String position, String salary, int status){
    this.name = name;
    this.number = number;
    this.password = password;
    this.position = position;
    this.salary = salary;
    this.status = status;
  }
  String getName(){
    return this.name;
  }
  String getNumber(){
    return this.number;
  }
  String getPassword(){
    return this.password;
  }
  String getSalary(){
    return this.salary;
  }
  String getPosition(){
    return this.position;
  }
  int getStatus(){
    return this.status;
  }
}

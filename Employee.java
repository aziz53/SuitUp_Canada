class Employee{
  String name;
  String number;
  String password;
  String position;
  Employee(String name, String number, String password, String position){
    this.name = name;
    this.number = number;
    this.password = password;
    this.position = position;
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
}
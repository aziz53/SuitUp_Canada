/*
 * ServicceEntry.java
 * This is the template for the service entry booking object
 * Author: Aziz, James, Jerry
 */ 
 class ServiceEntry {
  
   //data the service entry has
 private String date;
 private String service;
 
 //constructor
 ServiceEntry(String date, String service) {
  this.date=date;
  this.service=service;
 }
 
 //getDate method
 //@returns the date of the ServiceEntry object
 String getDate() {
  return this.date; 
 }
 
 //getService method
 //@returns the type of service of the ServiceEntry object
 String getService() {
  return this.service; 
 }
 
 //toString1 method
 //@returns a custom toString method that displays all the data of the object 
 String toString1() {
  return this.date+"|"+this.service; 
 }
  
}

/*
 * Entry.java
 * This is the template for the accounting entry object
 * Author: Aziz, James, Jerry
 */ 
class Entry {
  
  //private variables for accounting entry details
  private String debitEntry;
  private String creditEntry;
  private String dateEntry;
  private String serviceEntry;
  
  //constructor
  Entry(String debit,String credit,String date,String item) {
   this.debitEntry=debit;
   this.creditEntry=credit;
   this.dateEntry=date;
   this.serviceEntry=item;
  }
  
  //getDebit method
  //@returns the debit entry of the object
  String getDebit() {
   return this.debitEntry; 
  }
  
  //getCredit method
  //@returns the credit entry of the object
  String getCredit() {
   return this.creditEntry; 
  }
  
  //getDate method
  //@returns the date of the entry
  String getDate() {
   return this.dateEntry; 
  }
  
  //getService method
  //@returns the type of service for the accounting entry
  String getService() {
   return this.serviceEntry; 
  }
  
  //toString1 method
  //@returns a custom toString that does not override the Object class
  String toString1() {
   return this.serviceEntry+"|"+this.debitEntry+"|"+this.creditEntry+"|"+this.dateEntry;
  }
  
  
}

/**
 * Auto Generated Java Class.
 */
class Entry {
  
  private String debitEntry;
  private String creditEntry;
  private String dateEntry;
  private String serviceEntry;
  
  Entry(String debit,String credit,String date,String item) {
   this.debitEntry=debit;
   this.creditEntry=credit;
   this.dateEntry=date;
   this.serviceEntry=item;
  }
  
  String getDebit() {
   return this.debitEntry; 
  }
  
  String getCredit() {
   return this.creditEntry; 
  }
  
  String getDate() {
   return this.dateEntry; 
  }
  
  String getService() {
   return this.serviceEntry; 
  }
  
  String toString1() {
   return this.serviceEntry+"|"+this.debitEntry+"|"+this.creditEntry+"|"+this.dateEntry;
  }
  
  
}

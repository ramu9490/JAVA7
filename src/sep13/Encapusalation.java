package sep13;
//Encapsullation means wrap the data and action in single unit as per our requriment
public class Encapusalation {
  private int balance;
  private String accoutHolder;
  private long accountNumber;
//  public Encapusalation(){
//	  this.balance=8000;
//	  this.accountNumber=897489394L;
//  }
public void setBalance(int balance) {
	this.balance = balance;
}
public void getBalance() {
	System.out.println("my balance " +balance);
}
public void  getAccoutHolder() {
	System.out.println("Account holder name "+accoutHolder);
}
public void setAccoutHolder(String accoutHolder) {
	this.accoutHolder = accoutHolder;
}
public void getAccountNumber() {
	System.out.println("account number is " +accountNumber);
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
  
  
}

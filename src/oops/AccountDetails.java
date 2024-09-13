package oops;
import sep12.Pratice;

//account details
public class AccountDetails {
   
	private long accountNumber;
	private String accountHolder ;
	private int balance ;



public String getName(String name) {
	if(this.accountHolder == null)
		this.accountHolder = name;
	else 
		return "alredy exist";
	
return this.accountHolder;
}	
public int getBalance() {
	balance= 10000;
	return balance;
	
}
public long getAccountNumber() {
	accountNumber=6474839937l;
	return accountNumber;
}

public int getDeposit(int deposit) {
	balance=balance+deposit;
	return balance;
	
}
public int withdrawlMoney (int withdrawl) {
	balance=balance-withdrawl;
	return balance;
}

}



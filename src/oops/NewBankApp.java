package oops;

public class NewBankApp {

	public static void main(String[] args) {
		AccountDetails objName =new AccountDetails();
		System.out.println(objName.getName("ram"));
	
		//System.out.println(objName.getAccName());
		System.out.println(objName.getName("Akash"));
System.out.println( "current balance is  " + objName.getBalance());
System.out.println( "your account number is "+objName.getAccountNumber());
System.out.println("Total a/c balance is " + objName.getDeposit(890));
System.out.println("After Withdrawal money have " + objName.withdrawlMoney(200));
		}
}

package oops;

public class Encapsulation {

	private double balance=10000; 
	//Getter Method 
	public double getBalance( int pin) {
		
		//Validations
		if(pin == 8365)
		{
			return balance;
		}
		else
		{
			return 0.0;
		}
	}
	
	//Setter Method
	public double setBalance(int deposit) {
		balance = balance+deposit;
		return balance;
		
	}
}

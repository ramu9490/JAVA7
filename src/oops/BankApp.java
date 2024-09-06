package oops;

public class BankApp {

	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		
		double vaule =obj.getBalance(8365);
		System.out.println(vaule);
		
        double newBalance = obj.setBalance(490);
        System.out.println(newBalance);
		
		         
         
	}

}

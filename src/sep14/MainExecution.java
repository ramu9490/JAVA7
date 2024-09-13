package sep14;

public class MainExecution {

	public static void main(String[] args) {
		ConstructorOverLoading obj=new ConstructorOverLoading(1999,"BMW");
		obj.getDisplay();
		ConstructorOverLoading obj1=new ConstructorOverLoading(1998,"Suzuki","dzire");
		obj1.getDisplay();
	}

}

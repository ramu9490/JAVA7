package methods;

public class ExecutionLogic {

	public static void main(String[] args) {
		Templet obj1 = new Templet();
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.mobileNumber);
		obj1.greet();
          obj1.name= "ram";
          obj1.age=32;
          obj1.mobileNumber=967875367788L;
          System.out.println(obj1.name);
  		System.out.println(obj1.age);
  		System.out.println(obj1.mobileNumber);
  		obj1.greet();
	}

}

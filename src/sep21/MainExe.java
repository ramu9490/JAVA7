package sep21;

public class MainExe {

	public static void main(String[] args) {
//		Child	obj=new Child();
//		System.out.println(obj.name);
//		System.out.println(obj.sum);
//		obj.methodName1(56, 90);
//		obj.methodName2();
//        Child.methodName5();
//       System.out.println(Child.school);
       
//		Overriding obj= new Overriding();
//		obj.methodName1(6, 9);
//when refer the parent class refernce but create object to child class		
//during runtime,the overriden method from child class will be executed 		
		Overriding obj = new Child();
		obj.methodName1(6,90);
		obj.methodName2();
        System.out.println(obj.name);
        System.out.println(obj.sum);
        Child.methodName5();
        Child.methodName3();
        System.out.println(Child.school);
      
		

	}

}

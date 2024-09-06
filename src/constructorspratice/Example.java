package constructorspratice;

public class Example {
 int salary;
 String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example obj2= new Example();//default values
System.out.println(obj2.name);
System.out.println(obj2.salary);

Example obj3 =new Example(3000,"hi");//custom values
System.out.println(obj3.name);
System.out.println(obj3.salary);

	}
	//default constructor
Example(){
	this.salary=1000;
	this.name="hjdj";
}
//Parameterized constructor
Example(int salary,String name){
	this .salary=salary;
	this.name=name;
}
}

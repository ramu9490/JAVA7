package constructorspratice;

public class Example {
 int salary;
 String name;
	public static void main(String[] args) {

		
//Example obj2= new Example();//default values
//System.out.println(obj2.name);
//System.out.println(obj2.salary);


Example obj4= new Example(566,"hj");//default values
System.out.println(obj4.name);
System.out.println(obj4.salary);

Example obj3 =new Example(3000,"hi");//custom values
System.out.println(obj3.name);
System.out.println(obj3.salary);

	}
	//default constructor
//public Example(){
//	this.salary=1000;
//	this.name="HIIIII";
//}
//Parameterized constructor
public Example(int salary,String name){
	this .salary=salary;
	this.name=name;
}
}

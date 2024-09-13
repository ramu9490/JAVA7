package thisconcept;

public class MainArea {
//here i assigned local variables 10,20 but not initilized because
	//10 assigned 10 ,20=20 as local variables and method executed and garbage collector taken the
	//values after execution of method
	public static void main(String[] args) {
		HeapStack objectName= new HeapStack();
	objectName.setX(10);
	objectName.setY(20);
	System.out.println(objectName.getX());
	System.out.println(objectName.getY());

	}

}

package allconcepts;

public class Main {

	public static void main(String[] args) {
		//when create a object ,the constructor called automatically
		Constructor objName= new Constructor(4000,"villa",78.9);
		System.out.println(objName.area);
		Encapsulation obj2 = new Encapsulation("asrith",90000,30);
		System.out.println(obj2.getPersonName());
		System.out.println(obj2.getSalary());
		System.out.println(obj2.getWorkingDays());

	}

}

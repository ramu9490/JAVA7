package methodoveriding;

public class Child extends Parent {
	String x="childx";
	String y ="childy";
	static String  z="oopschild";
	public void sum() {
	int x=80;
	int y=20;
		System.out.println("Child differnce of numbers is " +(x-y));
	}
	public static void sample() {
		System.out.println("helojavachild");
	}
}

package methods;
//static method with the no return type
public class StaticMethod {

	public static void main(String[] args) {
		evenNumber(10);

	}
public static void evenNumber(int n) {
	int result = n*(n+1);
	System.out.println( "sum of first n even numbers are " + result);
}
}

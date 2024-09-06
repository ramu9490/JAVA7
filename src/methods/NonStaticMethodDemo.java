package methods;
//Non static method have return type
public class NonStaticMethodDemo {

	public static void main(String[] args) {
		NonStaticMethodDemo obj = new NonStaticMethodDemo();
		int value = obj.sumOfFirstNnumbers(5);
		System.out.println( "Sum of n Natural Numbers is " + value);
	}
public int sumOfFirstNnumbers(int n) {
	int result = n*(n+1)/2;
	return result;
}
}

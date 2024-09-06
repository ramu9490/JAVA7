package methods;
//static method with return type
public class StaticMethodDemo {

	public static void main(String[] args) {
		int value =StaticMethodDemo.sumOfOddNumbers(10);
		System.out.println("sum of first n odd numbers " + value);
		
	}
	public static int sumOfOddNumbers(int n) {
		int result = n*(n+2);
		return result;
	}

}

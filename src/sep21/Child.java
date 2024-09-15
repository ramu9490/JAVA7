package sep21;

public class Child extends Overriding{
	
	@Override
	public void methodName1(int x,int y) {
		int multi=x*y;
		System.out.println(multi);
	}
	public void methodName2() {
		System.out.println("method 2");
	}
	public static void methodName5() {
		System.out.println("method 5");
	}
}

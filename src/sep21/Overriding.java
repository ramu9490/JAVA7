package sep21;

public class Overriding {
int sum;
String name;
static String school;

Overriding(){
	this.sum=23;
	this.name="Hiiiijava";
	
}
public void methodName1(int x,int y) {
	int total=x+y;
	System.out.println(total);
}
public void methodName2() {
	System.out.println("hi");
}
public static void methodName3() {
	System.out.println("method 3");
}

}

package polymorphism;

public class Example {

public void setSum(int x,int y) {
	System.out.println(x*y);
}
public void setSum(double x,double y) {
	System.out.println(x+y);
}
public void setSum(String a,int b ) {
	System.out.println(a+b);
}
}

package methods;
//Non static method no return type
public class NonStaticMethod {

public static void main(String[] args) {
	NonStaticMethod obj = new NonStaticMethod();
	obj.simpleIntersset(1000,2,10);
	}
   public void simpleIntersset(int p,int t,int r) {
	   int result = p*t*r/100;
	   System.out.println("simple interset "+t+ " days is "+ result  );
   }
}

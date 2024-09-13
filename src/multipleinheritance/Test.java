package multipleinheritance;

public class Test {

	public static void main(String[] args) {
		//child3 obj = new child3's child
		Three obj =new Four();
		obj.m1();
       obj.m2();
       obj.m3();
	}

}

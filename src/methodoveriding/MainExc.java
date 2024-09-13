package methodoveriding;

public class MainExc {

	public static void main(String[] args) {
		
//		Child obj=new Child();
//		obj.sum();
//    System.out.println(obj.x);
  
    
    Parent objP =new Child();
    System.out.println(objP.x);
    objP.sum();
   // objP.ram();
   // System.out.println(objP.z);
    //objP.sample();
		
		
		

	}

}

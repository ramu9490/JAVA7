package constructorspratice;

public class Mian {

	public static void main(String[] args) {
		ConsOverLoad	obj=new ConsOverLoad();
              obj.getClock();
              ConsOverLoad obj2 =new ConsOverLoad(10,12);    
              obj2.getClock();
           ConsOverLoad obj3 =new ConsOverLoad(10,23,12);    
              obj3.getClock();

	}

}

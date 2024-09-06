package allconcepts;
//Variables are memory location identify with name and it holds data
public class VariblesExample {
	//instance variables
     int value;
     String accountNum;
     //static variables
      static String bankName;
     
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariblesExample objName= new VariblesExample();
		objName.varibleExperession();
		System.out.println(objName.value);
		System.out.println(objName.value=90);
		System.out.println(VariblesExample.bankName);
		System.out.println(VariblesExample.bankName="vip");
		
	}
	public  void varibleExperession() {
		//local variables
		int salary=1000;
		String name="hi";
		System.out.println(salary);
		System.out.println(name);
		
	}

}

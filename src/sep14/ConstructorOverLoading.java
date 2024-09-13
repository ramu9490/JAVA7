package sep14;
//Constructor is the specical method to intlize the objects value
//this is key word refernce to current object with in class
public class ConstructorOverLoading {
int year;
String model;
String comapany;
public ConstructorOverLoading(int year,String model,String comapany) {
this.year=year;
this.comapany= comapany;
this.model= model;
}

public ConstructorOverLoading(int year,String model) {
	this.year=year;
	this.model=model;
}

public ConstructorOverLoading(String comapany ) {
	this.comapany=comapany;
}


	public void getDisplay() {
	    System.out.printf("%4d, %s, %s%n", year, model,comapany);
	}

}





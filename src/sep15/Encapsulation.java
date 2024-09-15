package sep15;
//encapsulation means wrap the data and methods(actions) in single unit as per requirment
public class Encapsulation {
private String nameOfOrg;
private String firstName;
private String secondName;
public void getNameOfOrg() {
	System.out.println("Name of org is " + nameOfOrg);
}
public void setNameOfOrg(String nameOfOrg) {
	this.nameOfOrg = nameOfOrg;
}
public void getFirstName() {
	System.out.println("my first name is "+firstName);
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void getSecondName() {
	System.out.println("my second name "+secondName);
}
public void setSecondName(String secondName) {
	this.secondName = secondName;
}

}

package allconcepts;
//Encapsulation means  warping data and actions in single unit.
//add getter and setter to access and modify the private .
public class Encapsulation {
private String personName;
private  int salary;
private int workingDays;

public Encapsulation(String personName,int salary,int workingDays) {
	this.personName =personName;
	this.salary=salary;
	this.workingDays=workingDays;
}

public String getPersonName() {
	return personName;
}

public void setPersonName(String personName) {
	this.personName = personName;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public int getWorkingDays() {
	return workingDays;
}

public void setWorkingDays(int workingDays) {
	this.workingDays = workingDays;
}

}

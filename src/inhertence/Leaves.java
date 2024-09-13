package inhertence;

public class Leaves extends MarkAvg {
int casualLeaves;
int medicalLeaves;

public void leavesStaus(int casualLeaves, int medicalLeaves ) {
	this.casualLeaves=casualLeaves;
	this.medicalLeaves=medicalLeaves;
	}
public void dispalyLeaves() {
	System.out.println("total earned leaves is " +(casualLeaves)+(medicalLeaves));
}
}

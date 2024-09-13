package inhertence;

public class MarkAvg extends StudentDetails {
	 int sub1;
	 int sub2;
	 int sub3;
public void setAvg(int sub1,int sub2,int sub3) {
	this.sub1=sub1;
	this.sub2=sub2;
	this.sub3=sub3;
}

public void getAvg() {
	System.out.println("student Avg is " + (sub1+sub2+sub3)/3);
}

}

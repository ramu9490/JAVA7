package thisconcept;

public class Example {
int hr,min,sec;

public void setTime(int hr,int min,int sec) {
	this.hr=hr ;
	this.min=min;
	this.sec=sec;
}
public void getTime() {
	System.out.println("hour" +hr+"min"+min+"sec"+sec);
}

}

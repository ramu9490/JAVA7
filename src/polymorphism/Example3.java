package polymorphism;

public class Example3 {
int hr,min,sec;



public void setTime(int hr) {
	this.hr = hr;
}

public void getTime() {

	System.out.printf("%2d,%2d.%2d",hr,min,sec);
	System.out.println();
}


public void setTime(int hr,int min) {
	this.min = min;
}




public void setTime(int hr,int min,int sec) {
	this.sec = sec;
}

}

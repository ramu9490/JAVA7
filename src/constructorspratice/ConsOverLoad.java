package constructorspratice;

public class ConsOverLoad {

	int hr;
	int min;
	int sec;
	
	public ConsOverLoad() {
		hr=10;
		min=10;
		sec=10;
	}
	
	public ConsOverLoad(int hr,int min) {
		this.hr=hr;
		this.min=min;
	}
	
	public ConsOverLoad(int hr,int min,int sec) {
		this.hr=hr;
		this.min=min;
		this.sec=sec;
		
	}
	public void getClock() {
		System.out.printf("%2d,%2d,%2d" ,hr,min,sec);
		System.out.println();
	}
}

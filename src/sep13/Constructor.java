package sep13;
//Constructor is special method to intilize the object values 
public class Constructor {
int x;
int y;
int z;

public Constructor(int x,int y) {
	this.x=x;
	this.y=y;
}
public Constructor(int x,int y,int z) {
	this.x=x;
	this.y=y;
	this.z=z;
	
}
public void getDisplay() {
	System.out.printf("display time %2d ,%2d ,%2d ", x,y,z);
}
}

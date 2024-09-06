package pratice;

 public class CarFunction {
   private int wheels;
 private  int lights;
 private   String carName;
  private  String metal ;
  
  //  Object Initialization:
  public CarFunction(int wheels,int lights,String carName, String metal) {
	  this.wheels=wheels;
	  this.lights=lights;
	  this.carName=carName;
	  this.metal=metal;
  }

public int getWheels() {
	return wheels;
}

public void setWheels(int wheels) {
	this.wheels = wheels;
}

public int getLights() {
	return lights;
}

public void setLights(int lights) {
	this.lights = lights;
}

public String getCarName() {
	return carName;
}

public void setCarName(String carName) {
	this.carName = carName;
}

public String getMetal() {
	return metal;
}

public void setMetal(String metal) {
	this.metal = metal;
}
  
  
}

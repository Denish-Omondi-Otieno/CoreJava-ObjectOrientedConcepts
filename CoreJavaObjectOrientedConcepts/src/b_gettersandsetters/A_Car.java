package b_gettersandsetters;

public class A_Car {
	
	// The car properties 
	private String doors;
	private String engine;
	private String driver;
	private int speed;	
	
	// set method
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	
	// get method
	public int getSpeed() {
		return speed;
	}

}

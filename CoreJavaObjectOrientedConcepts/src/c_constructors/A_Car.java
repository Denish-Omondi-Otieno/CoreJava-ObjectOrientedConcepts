package c_constructors;

public class A_Car {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	// The constructor is a method
	// It has the same name as the class name
	// It does not return a type
	// The constructor method is called automatically
	public A_Car() {
		doors = "closed";
		engine = "on";
		driver = "seated";
		speed = 15;		
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed>0) {
			return "running";
		} else {
			return "not running";
		}
		
	}

}

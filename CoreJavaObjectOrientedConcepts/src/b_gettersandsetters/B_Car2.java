package b_gettersandsetters;

public class B_Car2 {
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	// Getters and setters are basically methods
	// Set is void in this case and get has a return type
	// Right click go to source
	// Select getters and setters
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// A method to check if the car is running
	public String run() {
		if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed>0) {
			return "running";
		} else {
			return "not running";
		} 
		
			
				
	}

}

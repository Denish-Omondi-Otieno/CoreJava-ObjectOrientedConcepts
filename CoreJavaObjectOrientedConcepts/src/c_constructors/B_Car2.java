package c_constructors;

public class B_Car2 {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	// Parametrised constructor
	public B_Car2(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}

	public String run() {
		if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed>0) {
			return "running";
		} else {
			return "not running";
		}
		
	}

}

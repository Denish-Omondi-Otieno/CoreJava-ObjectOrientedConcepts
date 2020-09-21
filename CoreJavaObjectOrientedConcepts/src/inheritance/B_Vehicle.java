package inheritance;

public class B_Vehicle {
	
	// The properties in (A_Vehicle) were declared public just for the sake of explanations
	// In set B_Vehicle we change the access modifier to private 
	// Vehicle is the parent class and now the properties are not visible to the child classes
	// We employ the help of constructors getters and setters to make them visible.
	private String engine;
	private int wheels;
	private int seats;
	private int fuelTank;
	private String lights;
	
	// Default Constructor
	// We initialise it with default values
	public B_Vehicle () {
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fuelTank = 35;
		this.lights = "LED";		
	}
	
	public B_Vehicle(String engine, int wheels, int seats, int fuelTank, String lights ) {
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;
		
	}
	
	// We are generating getters so that we may call them directly from the child class
	// We are using the B_Demo class for this demonstration
	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public String getLights() {
		return lights;
	}
	
	
	

}

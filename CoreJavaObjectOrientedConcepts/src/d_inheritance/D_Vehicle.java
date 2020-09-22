package d_inheritance;

public class D_Vehicle {

	private String engine;
	private int wheels;
	private int seats;
	private int fuelTank;
	private String lights;

	// Default Constructor
	// We initialise it with default values
	public D_Vehicle() {
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fuelTank = 35;
		this.lights = "LED";
	}

	public D_Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;

	}

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

package inheritance;

public class B_Bike extends B_Vehicle {
	  private String handle;

	  // The super method makes a call to the default constructor of the parent class
	  // We are setting the value directly using the constructor
	public B_Bike() {
		super();
		this.handle = "short";
		}

	//Parameterised constructor
	public B_Bike(String handle) {
		super();
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

		  
	   

}

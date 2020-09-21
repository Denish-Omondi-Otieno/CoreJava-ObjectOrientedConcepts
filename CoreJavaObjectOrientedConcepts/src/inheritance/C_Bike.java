package inheritance;

public class C_Bike extends C_Vehicle {
	  private String handle;

	  // The super method makes a call to the default constructor in the parent class
	  // We are setting the value directly using the constructor(this.handle = "short")
	public C_Bike() {
		super();
		this.handle = "short";
		}

	//Parameterised constructor
	public C_Bike(String handle) {
		super();
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

		  
	   

}

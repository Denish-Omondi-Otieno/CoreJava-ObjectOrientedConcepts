package inheritance;

public class C_Demo {
	public static void main(String [] args) {
		
		// Overriding the default value of handle
		// We are making a call to the parametrised constructor		
		// We then pass a value long for the handle
		C_Bike c_bike = new C_Bike("long");
		System.out.println(c_bike.getHandle());
		
		// Engine maintains the default value
		// Because we are simple calling the get method from the bike class
		System.out.println(c_bike.getEngine());
		
				
			}

}

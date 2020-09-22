package e_arrays;

public class E_Arrays {

	public static void main(String[] args) {
		// String Array
		String[] StringArray = { "English", "Mathematics", "Science", "Spanish", "Computer" };
		
		// For loop where we don't know the size of the array
		// We loop through all the elements
		// We strictly have to use the less than symbol or use the minus one
		// To avoid out of bonds exception
		for(int i=0; i<=StringArray.length-1; i++) {
			System.out.println(StringArray[i]);
		}

	}

}

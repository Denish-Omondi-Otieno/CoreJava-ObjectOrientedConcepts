package e_arrays;

public class F_Arrays {

	public static void main(String[] args) {
		// String Array
		String[] StringArray = { "English", "Mathematics", "Science", "Spanish", "Computer" };
		
		// For each loop introduced post java 8
		// we create a temporary variable of type String and name subjects
		// The variable will contain the value of each iterations
		for(String subjects: StringArray) {
			System.out.println(subjects);
		}

	}

}

package a_methods;

public class A1IntroductionToMethods {

	public static void main(String[] args) {

		// Calling a method
		loop1();

		System.out.println("*************************");
		
		// Calling a method
		loop2();

	}

	// A method which can be reused
	// A method is a block of code which only runs when it is called
	// In general a method has six components
	// 1.Modifier, 2.The return type, 3.Method Name, 4.Parameter List, 5.Exception list, 6.Method body.
	
	public static void loop1() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;

		}
	}

	public static void loop2() {
		int j = 20;
		while (j <= 40) {
			System.out.println(j);
			j++;
		}
	}
}

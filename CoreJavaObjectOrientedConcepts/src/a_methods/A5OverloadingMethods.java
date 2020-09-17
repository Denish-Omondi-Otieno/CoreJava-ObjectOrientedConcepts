package a_methods;

public class A5OverloadingMethods {

	public static void main(String[] args) {
		System.out.println(sum(1, 2));
		System.out.println(sum(1, 3.5f));
		System.out.println(sum(1.6, 2.2, 4.2));
	}

	// Check on the parameters when overloading
	// In declaring the numbers use the correct format ie adding f or d.
	public static int sum(int x, int y) {
		System.out.println("Adding 2 int entities");
		return x + y;
	}

	public static float sum(int x, float y) {
		System.out.println("Adding 1 int and 1 float entity");
		return x + y;
	}

	public static double sum(double x, double y, double z) {
		System.out.println("Adding 3 double entities");
		return x + y + z;
	}
}

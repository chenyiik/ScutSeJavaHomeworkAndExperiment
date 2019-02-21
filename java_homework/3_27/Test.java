import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		System.out.print("The point is ");
		if (x <= 0 || y <= 0 || x + y * 2 >= 200)
			System.out.print("not ");
		System.out.println("in the triangle.");
	}
}

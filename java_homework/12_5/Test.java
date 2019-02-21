import java.util.Scanner;

public class Test {
	public static void main(String[] arvs) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
		try {
			Triangle t = new Triangle(a, b, c);
		}
		catch (IllegalTriangleException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		if (a + b > c && a + c > b && b + c > a)
			System.out.println(a + b + c);
		else
			System.out.println("Input is invaild!");
	}
}

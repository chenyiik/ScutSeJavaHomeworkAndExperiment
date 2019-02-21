import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int a = input.nextInt();
		int ans = a % 10;
		a /= 10;
		ans += a % 10;
		ans += a / 10;
		System.out.println(ans);
	}
}

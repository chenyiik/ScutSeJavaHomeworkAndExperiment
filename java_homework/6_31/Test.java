import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number as a long integer: ");
		long number = input.nextLong();
		if (isValid(number))
			System.out.println(number + " is valid.");
		else
			System.out.println(number + " is invalid.");
	}

	public static boolean isValid(long number) {
		int ans = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		return ans % 10 == 0;
	}

	public static int sumOfDoubleEvenPlace(long number) {
		int ans = 0;
		while (number > 0)
		{
			ans += getDigit((int)(number % 100 / 10 * 2));
			number = getPrefix(number, getSize(number) - 2);
		}
		return ans;
	}

	public static int getDigit(int number) {
		return number > 9 ? number / 10 + number % 10 : number;
	}

	public static int sumOfOddPlace(long number) {
		int ans = 0;
		while (number > 0)
		{
			ans += number % 10;
			number = getPrefix(number, getSize(number) - 2);
		}
		return ans;
	}

	public static boolean prefixMatched(long number, int d) {
		while (number > 9)
			number /= 10;
		return number == d;
	}

	public static int getSize(long d) {
		int ans = 0;
		do
		{
			d /= 10;
			ans++;
		} while (d > 0);
		return ans;
	}

	public static long getPrefix(long number, int k) {
		long lim = 1;
		for ( ; k > 0; k--)
			lim *= 10;
		while (number >= lim)
			number /= 10;
		return number;
	}
}

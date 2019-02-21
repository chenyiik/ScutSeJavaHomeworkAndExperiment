import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String s = input.next();
		if (s.length() != 12)
			System.out.println(s + " is an invalid input.");
		else
		{
			int d = 0;
			for (int i = 0; i < 12; i++)
			{
				int x = (int)s.charAt(i) - (int)'0';
				if (i % 2 == 1)
					d += 3 * x;
				else
					d += x;
			}
			d %= 10;
			d = 10 - d;
			if (d == 10)
				d = 0;
			System.out.println("The ISBN-13 number is " + s + d);
		}
	}
}

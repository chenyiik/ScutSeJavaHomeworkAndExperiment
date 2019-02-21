import java.util.*;

public class Test {
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterstRate, int years) {
		return investmentAmount * Math.pow((1.0 + monthlyInterstRate / 100.0), years * 12);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("The amount invested: ");
		double money = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double rate = input.nextDouble();
		System.out.println("Years\tFuture Value");
		for (int i = 1; i <= 30; i++)
			System.out.printf("%d\t%12.2f\n", i, futureInvestmentValue(money, rate / 12, i));
	}
}

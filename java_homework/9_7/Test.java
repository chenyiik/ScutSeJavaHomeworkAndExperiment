import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account.setAnnualInterestRate(4.5);
		Account test = new Account(1122, 20000);
		test.withDraw(2500);
		test.deposit(3000);
		System.out.println("Balance is " + test.getBalance());
		System.out.println("MonthlyInterest is " + test.getMonthlyInterest());
		System.out.println("Kaihu date is " + test.getDate());
	}
}

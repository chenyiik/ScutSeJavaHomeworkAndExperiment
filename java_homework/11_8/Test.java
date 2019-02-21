import java.util.Scanner;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NewAccount.setAnnualInterestRate(1.5);
		NewAccount test = new NewAccount("George", 1122, 1000);
		test.deposit(30);
		test.deposit(40);
		test.deposit(50);
		test.withDraw(5);
		test.withDraw(4);
		test.withDraw(2);
		System.out.println(test.getName());
		System.out.println(NewAccount.getAnnualInterestRate());
		System.out.println(test.getBalance());
		ArrayList<Transaction> alist = test.getTransactions();
		for (Transaction i : alist) {
			System.out.println();
			System.out.println(i.getDate().toString());
			System.out.println(i.getType());
			System.out.println(i.getAmount());
			System.out.println(i.getBalance());
			System.out.println(i.getDescription());
		}
	}
}

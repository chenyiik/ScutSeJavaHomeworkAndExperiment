import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated = new Date();

	public Account() {}
	public Account(int idNumber, double initBalance) {
		id = idNumber;
		balance = initBalance;
	}

	public int getId() { return id; }
	public void setId(int newId) { id = newId; }
	public double getBalance() { return balance; }
	public void setBalance(double newBalance) { balance = newBalance; }
	public static double getAnnualInterestRate() { return annualInterestRate; }
	public static void setAnnualInterestRate(double newAnnualInterestRate) { annualInterestRate = newAnnualInterestRate; }
	public String getDate() { return dateCreated.toString(); }

	public double getMonthlyInterestRate() { return annualInterestRate / 12; }
	public double getMonthlyInterest() { return balance * getMonthlyInterestRate() / 100; }

	public void withDraw(double money) { balance = balance < money ? 0.0 : balance - money; }
	public void deposit(double money) { balance += money; }
}

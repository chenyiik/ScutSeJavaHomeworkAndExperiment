package banking;

public class CheckingAccount extends Account {
	private double overdraftProtection;

	public CheckingAccount(double balance) {
		super(balance);
		overdraftProtection = 0;
	}

	public CheckingAccount(double balance, double protect) {
		super(balance);
		overdraftProtection = protect;
	}

	public boolean withdraw(double amt) {
		if (balance >= amt) {
			balance -= amt;
			return true;
		}
		else if (balance + overdraftProtection >= amt) {
			balance = 0;
			return true;
		}
		else
			return false;
	}

	public double getOverdraftProtection() {
		return overdraftProtection;
	}
}

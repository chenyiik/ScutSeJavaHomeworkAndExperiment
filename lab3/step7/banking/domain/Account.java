package banking.domain;

public class Account {
	protected double balance;

	public Account(double init_balance) {
		balance = init_balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) {
		balance += amt;
	}

	public void withdraw(double amt) throws OverdraftException {
		if (amt <= balance)
			balance -= amt;
		else
			throw new OverdraftException("Insufficient funds", amt - balance);
	}
}

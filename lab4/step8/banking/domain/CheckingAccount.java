package banking.domain;

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

	public void withdraw(double amt) throws OverdraftException {
		if (balance >= amt)
			balance -= amt;
		else if (balance + overdraftProtection >= amt) {
			overdraftProtection -= amt - balance;
			balance = 0;
		}
		else if (overdraftProtection != 0)
			throw new OverdraftException("Insufficient funds for overdraft protection", amt - balance);
		else
			throw new OverdraftException("No overdraftProtection", amt - balance);
	}

	public double getOverdraftProtection() {
		return overdraftProtection;
	}
}

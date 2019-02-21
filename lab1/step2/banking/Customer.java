package banking;

public class Customer {
	private String firstName;
	private String lastName;
	private Account acc;

	public Customer(String f, String l) {
		firstName = f;
		lastName = l;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Account getAccount() {
		return acc;
	}

	public void setAccount(Account acct) {
		acc = acct;
	}
}

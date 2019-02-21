package banking.domain;

public class Bank {
	private static Bank bank = null;
	private Customer[] customers;
	private int numOfCustomers;

	private Bank() {
		customers = new Customer[1000];
		numOfCustomers = 0;
	}

	public void addCustomer(String f, String l) {
		customers[numOfCustomers++] = new Customer(f, l);
	}

	public int getNumOfCustomers() {
		return numOfCustomers;
	}

	public Customer getCustomer(int index) {
		return customers[index];
	}

	public static Bank getBank() {
		if (bank == null)
			bank = new Bank();
		return bank;
	}
}

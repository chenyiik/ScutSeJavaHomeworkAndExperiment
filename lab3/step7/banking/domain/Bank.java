package banking.domain;

public class Bank {
	private static Bank bank = null;
	private Customer[] customers;
	private int numOfCustomers;

	private Bank() {
		customers = new Customer[1000];
		numOfCustomers = 0;
	}

	public void sortCustomers() {
		for (int i = 1; i < numOfCustomers; i++) {
			for (int j = 0; j < numOfCustomers - i; j++) {
				if (customers[j].compareTo(customers[j + 1]) >= 0) {
					Customer t = customers[j];
					customers[j] = customers[j + 1];
					customers[j + 1] = t;
				}
			}
		}
	}

	public Customer serchCustomers(Customer cus) {
		for (int i = 0; i < numOfCustomers; i++) {
			if (customers[i].compareTo(cus) == 0)
				return customers[i];
		}
		return null;
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

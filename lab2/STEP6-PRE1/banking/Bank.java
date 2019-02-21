package banking;

public class Bank {
	private Customer[] customers;
	private int numOfCustomers;

	public Bank() {
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
}

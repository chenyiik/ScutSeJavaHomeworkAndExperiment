package banking;

import java.util.*;

public class Customer {
	private String firstName;
	private String lastName;
	//private Account acc;
	private ArrayList<Account> acc = new ArrayList<Account>();

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

	//public Account getAccount() {
		//return acc;
	//}

	//public void setAccount(Account acct) {
		//acc = acct;
	//}

	public void addAccount(Account acct) {
		acc.add(acct);
	}

	public Account getAccount(int i) {
		return acc.get(i);
	}

	public int getNumOfAccounts() {
		return acc.size();
	}
}

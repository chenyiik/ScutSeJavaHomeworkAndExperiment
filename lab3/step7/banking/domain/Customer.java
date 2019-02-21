package banking.domain;

import java.util.*;

public class Customer implements Comparable<Customer> {
	private String firstName;
	private String lastName;
	//private Account acc;
	private ArrayList<Account> acc = new ArrayList<Account>();

	public Customer(String f, String l) {
		firstName = f;
		lastName = l;
	}

	public int compareTo(Customer o) {
		String s1 = new String(lastName + firstName);
		String s2 = new String(o.lastName + o.firstName);
		//String s1 = new String(firstName + lastName);
		//String s2 = new String(o.firstName + o.lastName);
		return s1.compareTo(s2);
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

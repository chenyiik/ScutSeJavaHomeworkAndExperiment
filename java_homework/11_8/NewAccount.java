import java.util.ArrayList;

public class NewAccount extends Account {
	private String name;
	private ArrayList<Transaction> transactions;

	public NewAccount() {}
	public NewAccount(String name, int id, double balance) {
		super(id, balance);
		this.name = new String(name);
		transactions = new ArrayList<>();
	}

	public String getName() { return name; }
	public ArrayList<Transaction> getTransactions() { return transactions; }

	public void withDraw(double money) {
		super.withDraw(money);
		transactions.add(new Transaction('W', money, getBalance(), "xxx"));
	}

	public void deposit(double money) {
		super.deposit(money);
		transactions.add(new Transaction('D', money, getBalance(), "yyy"));
	}
}

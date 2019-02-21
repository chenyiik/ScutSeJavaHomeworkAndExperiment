import java.util.Date;

public class Transaction {
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;

	Transaction(char type, double amount, double balance, String description) {
		date = new Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = new String(description);
	}

	public Date getDate() { return date; }
	public char getType() { return type; }
	public double getAmount() { return amount; }
	public double getBalance() { return balance; }
	public String getDescription() { return description; }

	public void setDate(Date newDate) { date = newDate; }
	public void setType(char newType) { type = newType; }
	public void setAmount(double newAmount) { amount = newAmount; }
	public void setBalance(double newBalance) { balance = newBalance; }
	public void setDescription(String newDescription) { description = new String(newDescription); }
}

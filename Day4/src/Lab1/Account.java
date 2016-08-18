package Lab1;

public abstract class Account {
	
	private long balance;
	private String holderName;
	
	public Account(long balance, String holderName) {
		super();
		this.balance = balance;
		this.holderName = holderName;
	}

	public final void executeTransaction(String message, long amount) {
		System.out.println("Holder: " + holderName + " is performing operation: " + message + " on Amount: " + amount);
		if(message.equals("Checking Withdrawal"))
			balance = this.balance - amount;
		else if(message.equals("Checking Deposit"))
			balance = this.balance + amount;
		this.balance = balance;
	}

	public long getBalance() {
		return this.balance;
	}

	public abstract boolean deposit(long amount);

	public abstract boolean withdraw(long amount);

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	
	
}

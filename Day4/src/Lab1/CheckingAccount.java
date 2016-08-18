package Lab1;

public class CheckingAccount extends Account{

	private long balance;
	private String holderName;
	
	public CheckingAccount(long balance, String holderName) {
		super(balance, holderName);
		this.balance = balance;
		this.holderName = holderName;
	}

	@Override
	public boolean deposit(long amount) {
		super.executeTransaction("Checking Deposit", amount);
		return true;
	}

	@Override
	public boolean withdraw(long amount) {
		long availableBalance = super.getBalance() - amount;
		if (availableBalance < balance) {
			super.executeTransaction("Checking Withdrawal", (amount));
			return true;
		} else {
			System.out.println("Insufficiant funds");
			return false;
		}
	}
}

package Lab1;

public class MortgageAccount extends Account{

	private long borrowedAmount;
	
	public MortgageAccount(long balance, String holderName) {
		super(balance, holderName);
		this.setBorrowedAmount(balance);
        //super.executeTransaction("Initial Borrowed Amount" , balance);
    }

    @Override
    public boolean deposit(long amount) {
        super.executeTransaction("Mortgage Payment", amount);
        return true;
    }

    @Override
    public boolean withdraw(long amount) {
        System.out.println("You can't withdraw with Mortgage Account");
        return false;
    }

	public long getBorrowedAmount() {
		return borrowedAmount;
	}

	public void setBorrowedAmount(long borrowedAmount) {
		this.borrowedAmount = borrowedAmount;
	}
}

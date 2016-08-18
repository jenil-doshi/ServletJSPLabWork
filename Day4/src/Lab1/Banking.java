package Lab1;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Banking {

	public static void main(String[] args) {
		Account[] accounts = new Account[3];
		accounts[0] = new MortgageAccount(34000, "Jenil");
		accounts[1] = new CheckingAccount(3400, "Keval");
		accounts[2] = new CheckingAccount(3000, "Sam");
		for (Account account : accounts) {
			System.out.println("Transactions for: "+account.getHolderName());

			System.out.println("Deposit 100: " + account.deposit(100));
			System.out.println("Balance: " + account.getBalance());
			System.out.println();
			
			System.out.println("Withdraw 500: " + account.withdraw(500));
			System.out.println("Balance: " + account.getBalance());
			System.out.println();

			System.out.println("Withdraw 1000: " + account.withdraw(1000));
			System.out.println("Balance: " + account.getBalance());
			System.out.println();

			System.out.println("Withdraw 2000: " + account.withdraw(2000));
			System.out.println("Balance: " + account.getBalance());
			System.out.println();
			
		}

	}

}

package hw4;

public class Deposit implements Runnable {
	
	BankAccount account;
	double amount;
	int count;
	final int DELAY = 1;
	
	public Deposit(BankAccount myAccount, double myAmount, int myCount) {
		this.account = myAccount;
		this.amount = myAmount;
		this.count =  myCount;
	}

	public void run() {
		try {
			for(int i = 0; i < count;i++) {
				account.depositToBalance(amount);
				Thread.sleep(DELAY);
			}
			
		}
		catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
}

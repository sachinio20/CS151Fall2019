package hw4;

import java.util.concurrent.*;


public class Withdraw implements Runnable {
	
	BankAccount account;
	double amount;
	int count;
	final int DELAY = 1;
	
	public Withdraw(BankAccount myAccount, double myAmount, int myCount) {
		this.account = myAccount;
		this.amount = myAmount;
		this.count =  myCount;
	}
	
	public void run() {
		try {
			for(int i = 0; i < count;i++) {
				account.withdrawFromBalance(amount);
				Thread.sleep(DELAY);
			}
			
		}
		catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	/**
	 * The bank account can be corrupted because when two threads are trying to withdraw and deposit on the same account at the same time, t
	 * the shared bank account object does not know whether to withdraw or deposit the amount, this is shown in the out, when sometimes two withdrawals 
	 * happen in a row or two deposits happen, even though the program tries to coordinate the threads using the delay method
	 */
	
}

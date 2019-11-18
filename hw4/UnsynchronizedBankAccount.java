

public class UnsynchronizedBankAccount {
	
	/**
	 * Class to model a bank account that has one thread for inserting values into the account and another thread for making withdrawals
	 * This class does not take advantage of synchronized methods 
	 * the way that the bank account can be corrupted is if the deposit run method and the withdraw  run method are trying to access the same
	 * bank account at the same time, leading to incorrect values in the bank account balance 
	 * The main difference is that we do not use the "synchronized" keyword in this instance
	 * 
	 */
	
	public double currentBalance;
	
	public UnsynchronizedBankAccount() {
		this.currentBalance = 0.0;
	}
	
	public int depositToBalance(double amountToAdd) {
		
		System.out.println("Currently depositing: " + amountToAdd);
		double newBalance = this.currentBalance + amountToAdd;
		this.currentBalance = newBalance;
		
		System.out.println("The new current balance after the deposit is: " + this.currentBalance);
		
		return 0;
	}
	
	public int withdrawFromBalance(double amountToWithdraw) {
		
		System.out.println("Currently withdrawing: "+ amountToWithdraw);
		double newBalance = this.currentBalance - amountToWithdraw;
		this.currentBalance = newBalance;
		
		System.out.println("The new current balance after the withdrawal is: " + this.currentBalance);
		return 0;
	}
	
	public double getBalance() {
		return this.currentBalance;
	}

}

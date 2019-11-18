package hw4;

import java.util.concurrent.*;

import java.util.*;
import java.lang.*;

public class BankAccount {
	
	/**
	 * Class to model a bank account that has one thread for inserting values into the account and another thread for making withdrawals
	 * 
	 */
	
	public double currentBalance;
	
	public BankAccount() {
		this.currentBalance = 0.0;
	}
	
	public synchronized int depositToBalance(double amountToAdd) {
		
		System.out.println("Currently depositing: " + amountToAdd);
		double newBalance = this.currentBalance + amountToAdd;
		this.currentBalance = newBalance;
		
		System.out.println("The new current balance after the deposit is: " + this.currentBalance);
		
		return 0;
	}
	
	public synchronized int withdrawFromBalance(double amountToWithdraw) {
		
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
	
	
	
	


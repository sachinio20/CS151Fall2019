package hw4;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class hw4part1 {
	
	public static void main(String [] args) {
		
		 final int COUNT = 10;
		ExecutorService myexecutor = Executors.newCachedThreadPool();
		BankAccount myAccount = new BankAccount();
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter amount to withdraw/deposit: ");
		double enteredAmount = userInput.nextDouble();
		Deposit deposit = new Deposit(myAccount, enteredAmount, COUNT );
		Withdraw withdraw = new Withdraw(myAccount,enteredAmount, COUNT);
		
		Thread d = new Thread(deposit);
		Thread w = new Thread(withdraw);
		
		d.start();
		w.start();
		
		
		
		//Using the join statement ensures that the thread that is withdrawing money from the bank account 
		
	}
	

}

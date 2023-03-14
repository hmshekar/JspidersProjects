package com;

public class BankImpl implements Bank {
	int balance;
	BankImpl(int balance){
		this.balance=balance;
	}
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance+=amount;
		System.out.println("Amount deposited Successfully");
	}
	@Override
	public void withdraw(int amount) {
		if(balance>amount) {
			System.out.println("Withdrawing Rs."+amount);
			balance-=amount;
			System.out.println("Amount Withdrawn Successfully");
		}
		else {
			try {
				throw new InsufficientBalanceException("Insufficeint balance");
			}
			catch(InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public int getBalance() {
		return balance;
	}
	
}

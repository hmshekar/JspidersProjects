package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Bank b=new BankImpl(1000); 
		while(true) {
			System.out.println("1.Deposit\n2.Withdraw\n3.CheckBal\n4.Exit");
			System.out.println("Enter choice");
		int choice=scan.nextInt();
		if(choice>=1&&choice<=4) {
				switch(choice){
				case 1:
					System.out.println("enter amount to be deposited");
					//int amount=scan.nextInt();
					b.deposit(scan.nextInt());//b.deposit(amount)
					break;
				case 2:
					System.out.println("Enter the amount to be withdrawn");
					//amount =scan.nextInt();//b.withdraw(amount);
					b.withdraw(scan.nextInt());
					break;
				case 3 :
					System.out.println("Avalable Balance:"+b.getBalance());
					break;
				case 4:
					System.out.println("Thank you!! Visit Again!!");
					System.exit(0);
					default:
						try {
							throw new InvalidChoiceException("Invalid choice");
						}
						catch(InvalidChoiceException e) {
						System.out.println(e.getMessage());	
						}
						
				}
				System.out.println("--------------");
			}
		else
		System.out.println("Invalid choice");
		}
	}
}

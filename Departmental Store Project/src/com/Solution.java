package com;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		DepartmentalStore d=new DepartmentalStoreImpl();
		
		d.addProduct();
		int choice=1;
		while(choice==1){
			d.displayProduct();
			d.buyProduct();
			System.out.println("=================");
			System.out.println("Press 1 to Continue or Any other number to Checkout");
			choice=scan.nextInt();
		}
		d.checkout();
	}
}

package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStoreImpl implements DepartmentalStore{
	Scanner scan=new Scanner(System.in);
	//Key ->Product Id->Integer & value->Product Instance ->Product
	Map<Integer,Product> db=new LinkedHashMap<Integer,Product>();
	int totalBill=0;

	@Override
	public void addProduct() {
		db.put(1, new Product("Chocolates", 10, 10));
		db.put(2, new Product("Biscutes", 20, 20));
		db.put(3, new Product("IceCream", 30, 50));
		db.put(4, new Product("Buns", 30, 5));
		db.put(5, new Product("Rice", 30, 80));
	}

	@Override
	public void displayProduct() {
		Set<Integer> keys=db.keySet();
		for(int key: keys) {
			Product p=db.get(key);
			System.out.println("Enter "+key+" to order "+p.getName());
			System.out.println("Available Quantity "+p.getQuantity());
			System.out.println("Cost: Rs:"+ p.getCost());
			System.out.println("---------------------------");
		}
	}

	@Override
	public void buyProduct() {
		System.out.println("Enter Choice");
		int choice=scan.nextInt();// choice -> Key

		Product p=db.get(choice);//1 2 3 ->null

		if(p!=null) {
			System.out.println("Enter the Quantity");
			int quantity =scan.nextInt();  //getting quantity from user

			if(quantity<=p.getQuantity()) {
				int productCost=quantity*p.getCost();
				
				//Adding Product cost to total bill
				totalBill+=productCost;//totalBill=totalBill+productCost;
				
				//updating new Quantity 
				p.setQuantity(p.getQuantity()-quantity);
				
				System.out.println("Orderded "+quantity+" "+ p.getName());
				System.out.println("Product Cost: "+productCost );
				System.out.println("Total Bill as of now "+totalBill);
			}

			else {
				try {
					throw new InvalidQuantityException("Invalid Quantity "+p.getQuantity()+" id not Available");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		else{
			try {
				throw new InvalidChoiceException("Invalid choice, kindly try again");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void checkout() {
		System.out.println("Total bill: rs. "+totalBill);
		System.out.println("Thanks for shopping");

	}

}

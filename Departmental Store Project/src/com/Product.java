package com;

public class Product {
	
	private String name;
	private int quantity;
	private int cost;
	
	public Product (String name,int quantity,int cost) {
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
	}
	
	@Override 
	public String toString() {
		return "Name: "+name+"  Quantity: "+quantity+"   Cost: "+cost;
	}

	//Getter and  Setter
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setCost(int cost) {
		this.cost=cost;
	}
	
	public int getCost() {
		return cost;
	}
}

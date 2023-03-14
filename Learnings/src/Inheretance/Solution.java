package Inheretance;

abstract class Person{
	abstract void eat();
}
class Jerry extends Person{
	@Override  //Annotation
	void eat() {
		System.out.println("Eating banana!");
	}
}


public class Solution {
	public static void main(String[] args) {
		Jerry jerry=new Jerry();
		jerry.eat();
	}
}

//Contract of abstract ->Rules
//1. make the class as abstract
//2. override the abstract method
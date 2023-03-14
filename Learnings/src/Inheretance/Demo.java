package Inheretance;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.println("Enter Number");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("hii");
					break;
				case 2:
					System.out.println("bye");
					break;
				case 3:
					System.out.println("thank you");
					System.exit(0);
				default:
					System.out.println("Invalid");
				}
			}
		}
	}
}

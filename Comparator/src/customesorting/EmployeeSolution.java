package customesorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeSolution {
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Shekar", 100000); 
		Employee e2=new Employee(103,"RamaChari", 20000); 
		Employee e3=new Employee(102,"Darshan", 3000000); 
		SortEmployeeById id=new SortEmployeeById();
		SortEmployeeByName name=new SortEmployeeByName();
		SortEmployeeBySal sal=new SortEmployeeBySal();
		List<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e3);
		list.add(e2);
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println("-----------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("1.ID sort\n2.Name sort\n3.Sal sort\n4.exit");
		while(true) {
			System.out.println("-----------------");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				Collections.sort(list,id);
				for(Employee e: list)
					System.out.println(e);
				break;
			case 2:
				Collections.sort(list,name);
				for(Employee e: list)
					System.out.println(e);
				break;
			case 3:
				Collections.sort(list,sal);
				for(Employee e: list)
					System.out.println(e);
				break;
			case 4:
				System.out.println("Thank you");
				System.exit(0);
				
				default:
					System.out.println("Invalid");	
			}
		}
	}
}

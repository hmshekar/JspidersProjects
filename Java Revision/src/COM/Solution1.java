package COM;

class Car{
	int cost;
	String brand;
	public Car(int cost,String brand) {
		this.brand=brand;
		this.cost=cost;
	}
	@Override
	public boolean equals(Object obj) {
		Car c=(Car)obj;
		return this.brand.equals(c.brand) && this.cost==c.cost;
	}
}
public class Solution1 {
	public static void main(String[] args) {
		Car c1= new Car(10,"Maruthi");
		Car c2= new Car(10,"Maruthi");
		if(c1.equals(c2)) {
			System.out.println(c1.equals(c2));
			System.out.println("Car objects are same");
		}
		else {
			System.out.println("Car not equals");
		}
	}
}

package defaultsorting;

public class Car implements Comparable<Car>{
	int cost;
	Car (int cost){
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "Cost:"+cost;
	}
	@Override
	public int compareTo(Car c) {
		return this.cost-c.cost;
	}
}
/**
 this ->object to be inserted (Current Object) c -> already existing Object
      <<Comparable>> -> pre defined interface, java.lang package
 1.class should implements Comparable Interface
 2. Specify Generics;
 3. Override compareTo() -> public int compareTO(Element e);
 * */

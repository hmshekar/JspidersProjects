package lambdaexpression;
@FunctionalInterface
interface Person{
	String display(int age);
}
public class Test {

	public static void main(String[] args) {
		//lambda Expration
		Person p=(age) ->{
			return "Age is "+age;
		};
		System.out.println(p.display(10));
	}
	
}

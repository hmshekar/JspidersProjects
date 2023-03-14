package lambdaexpression;
@FunctionalInterface
interface Student{
	void study(String name,String subject);
}

public class MainStudent {
	public static void main(String[] args) {
		Student std=(name,subject)->{
			System.out.println(name+" Is studying "+subject);
		};
		std.study("shekar", "Java");
	}
}

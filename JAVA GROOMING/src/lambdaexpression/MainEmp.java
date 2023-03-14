package lambdaexpression;
@FunctionalInterface
interface Employee{
	void work();
}
public class MainEmp {
	public static void main(String[] args) {
		Employee emp=()->{
			System.out.println("WOrking");
		};
		emp.work();
	}
}

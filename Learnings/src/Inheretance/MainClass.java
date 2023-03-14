package Inheretance;

interface Paytm
{
	int id=100;	//public static final int id=100;
	void payment(); 	//public abstract void payment();
}
class Amazon implements Paytm
{
	public void payment() {
		System.out.println("payment made througt paytm");
	}
}


public class MainClass {
	public static void main(String[] args) {
		Amazon amazon =new Amazon();
		amazon.payment();
		System.out.println("id:"+Paytm.id);
	}
}

//interface rules
//1.by default variables will be public static final
//2.method will be public abstract
//3.while overriding a method ,access specifier should be same or higher visibility

//explain interface
//1.interface is a blue print of an class and class is a blue print of an object
//2.interface is a java type defanation ,declared with a keyword interface
//3.interface is a mediator between client and object with services
//
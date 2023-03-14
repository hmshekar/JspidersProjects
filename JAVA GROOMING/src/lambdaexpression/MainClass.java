package lambdaexpression;
	
interface Amazon{
	void purchase(String product);
}
class Customer implements Amazon{
	@Override
	public void purchase(String product) {
		System.out.println("Purchased :"+product);
	}
}
public class MainClass {
	public static void main(String[] args) {
		//by using Subclass
		Customer c=new Customer();
		c.purchase("Laptop");
		
		//using Anonomays inner class
		Amazon a=new Amazon() {
			
			@Override
			public void purchase(String product) {
				System.out.println("Product Purchased : "+product);
			}
		};
		a.purchase("bag");
		
		//using lambda Expression
		Amazon x=(product)->{
			System.out.println("Product purchased : "+product);
		};
		x.purchase("Soap");
		//without referance variable
		new Amazon() {
			@Override
			public void purchase(String product) {
				System.out.println("Product p:"+product);
			}
		}.purchase("Bun");;
		
	}
}

package Oops;

public class AccessingBlocks extends dummy{
	
	public AccessingBlocks(){
		System.out.println("AccessingBlocks");
	}
	
	 public static void main(String[] args) {
		 AccessingBlocks a=new AccessingBlocks();
		
	}
}
class dummy  {
	
	public dummy() {
		System.out.println("dummy");
	}
}